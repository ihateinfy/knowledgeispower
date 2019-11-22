create database ext_service;
use ext_service;
CREATE TABLE aadhar_master (
  aadharId            VARCHAR(50)     NOT NULL,
  firstName           VARCHAR(50)     NOT NULL,
  lastName            VARCHAR(50)     NOT NULL,
  phoneNo             VARCHAR(10)     NOT NULL,
  address             VARCHAR(100)    NOT NULL,
  PRIMARY KEY (aadharId)
);

insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789010','Robert','Smith','#25, Millers Road, Bangalore','8756565987');,
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789011','Jack','Williams','25/31, Cunningham Road , Bangalore','9663525543');
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789012','Jane','Miller','Twin Bungalow, Hinjewadi, Pune','9865311466');
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789013','Thomas','Lewis','F-10, Jubilee Hills, Hyderabad','9086542321');
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789014','Richard','Thompson','764,  GachchiBowli, Hyderabad','9086543227' );
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789015','Steve','Phillip','11, Dollars Colony, Bangalsore','8765407633');
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789016','Frank','Taylor','543, JP Nagar, Mysore','8509782211');
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789017','Christopher','Brown','679, Bandra, Mumbai ','7654322093');
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789018','John','Wilson','345, Andheri Mumbai','9765094321');
insert into aadhar_master (aadharId,firstName,lastName,address,phoneNo) values ('123456789019','Sophia','Jones','76/R, Pimple, Pune','9062176549');
commit;
