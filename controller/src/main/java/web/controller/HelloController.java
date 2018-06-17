package web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import backed.constant.ErrorCodes;
import backed.exception.BusinessException;
import web.annotation.ResponseWrapper;



@RestController
@RequestMapping("/hello")
@ResponseWrapper
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@PermitAll
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/list")
	@PermitAll
	public List<String> list() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		return list;
	}

	@RequestMapping("/map")
	@PermitAll
	public Map<String, String> map() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "asd");
		map.put("2", "ban");
		return map;
	}

	@RequestMapping("/error")
	@PermitAll
	public void exception() {
		throw new BusinessException(ErrorCodes.BUSINESS_EXCEPTION);
	}
}
