/**
 * 
 */
package com.infosys.extservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.extservice.dto.AadharDTO;
import com.infosys.extservice.exception.ExternalServiceException;
import com.infosys.extservice.service.AadharService;

/**
 * The Class AadharController.
 */
@RestController
public class AadharController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AadharService aadharService;

	// http://localhost:5555/aadhar?aadharId=123456789010&firstName=Robert&lastName=Smith

	@GetMapping(value = "/aadhar", produces = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseStatus(value=HttpStatus.OK)
	public ResponseEntity<Boolean> validateAadharId(@RequestParam("aadharId") String aadharId,
			@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
			throws ExternalServiceException {

		boolean valid = aadharService.isAadharValid(aadharId, firstName, lastName);
		logger.debug("AadharId: {}, firstName: {}, lastName: {}", aadharId, firstName, lastName);
		return new ResponseEntity<>(valid, HttpStatus.OK);
	}

	@GetMapping(value = "/aadhar/{phoneNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AadharDTO> getCustomer(@PathVariable("phoneNo") String phoneNo) {

		AadharDTO dto = aadharService.getAadharDetails(phoneNo);
		logger.debug("phoneNo: {}", phoneNo);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@PutMapping(value = "/aadhar/{aadharId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AadharDTO> updateAddress(@PathVariable String aadharId, @RequestBody AadharDTO address) {
		AadharDTO dto = aadharService.updateAddress(aadharId, address);
		logger.debug("Aadhar info from database: {}", dto);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

}
