package web.advice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import backed.exception.BaseException;
import web.annotation.ResponseWrapper;
import web.to.RestResponse;



@Component
@ControllerAdvice(annotations = { ResponseWrapper.class })
public class ExceptionHandlerAdvice {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

	@ExceptionHandler({ BaseException.class })
	public @ResponseBody Object processAndWrapException(HttpServletRequest request, BaseException ex) {
		LOGGER.error("error handling request from " + request.getRequestURI(), ex);
		return new RestResponse(ex.getErrorCode(), ex.getMessage());
	}

	@ExceptionHandler({ Exception.class })
	public @ResponseBody Object processAndWrapUnknownException(HttpServletRequest request, Exception ex) {
		LOGGER.error("meet unknown excpetion", ex);
		Throwable cause = ex;
		String message = "服务器开小差啦,请稍后重试";
		String errorCode = Integer.toString(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		while (cause.getCause() != null) {
			if (cause instanceof BaseException) {
				break;
			} else {
				cause = cause.getCause();
			}
		}
		if (cause != null && cause instanceof BaseException) {
			errorCode = ((BaseException) cause).getErrorCode();
			message = ((BaseException) cause).getMessage();
		}
		return new RestResponse(errorCode, message);
	}

}
