package com.infosys.extservice.utilities;
 
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * The Class LoggingAspect.
 */
@Aspect
@Component
public class LoggingAspect {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * Log around all methods.
	 *
	 * @param joinPoint
	 *            the join point
	 * @return the object
	 * @throws Throwable
	 *             the throwable
	 */
	@Around("execution(* com.infosys.extservice..*..*(..))")
	public Object logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		String className = joinPoint.getSignature().getDeclaringTypeName();
		String methodName = joinPoint.getSignature().getName();
		logger.info(className + "----" + methodName + "---" + "Entering in to " + methodName + " with param "
				+ Arrays.toString(joinPoint.getArgs()));

		Object result = joinPoint.proceed();

		long endTime = System.currentTimeMillis();
		logger.info(className + "----" + methodName + "---" + "Exiting " + methodName + " with result " + result
				+ "--- execution completed in " + (endTime - startTime) + " ms ");

		return result;
	}

}