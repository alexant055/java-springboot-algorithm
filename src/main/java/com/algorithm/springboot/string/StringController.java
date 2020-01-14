package com.algorithm.springboot.string;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algorithm.springboot.handler.ResultEntity;

@RestController
@RequestMapping(value = "/string")
public class StringController {

	@Autowired
	private StringService stringService;

	@GetMapping(value = "/reverse")
	public ResponseEntity<ResultEntity> reverseString(
			@RequestParam(name = "value") String strValue) {
		return stringService.reverseString(strValue);
	}

	@GetMapping(value = "/palindrome")
	public ResponseEntity<ResultEntity> stringPalindrome(
			@RequestParam(name = "value") String strValue) {
		return stringService.stringPalindrome(strValue);
	}
}
