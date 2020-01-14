package com.algorithm.springboot.string;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.algorithm.springboot.handler.ResponseHandler;
import com.algorithm.springboot.handler.ResultEntity;
import com.algorithm.springboot.util.Constants;

@Service
public class StringService {

	@Autowired
	private ResponseHandler response;

	@Autowired
	private Constants CONST;

	public ResponseEntity<ResultEntity> reverseString(String strValue) {

		if (strValue != null && strValue != "")
			return response.successResponse(reverseValue(strValue));
		else
			return response.errorResponse(CONST.INVALID_STRING_MSG);
	}

	public ResponseEntity<ResultEntity> stringPalindrome(String strValue) {
		if (strValue != null && strValue != "")
			if (strValue.equalsIgnoreCase(reverseValue(strValue)))
				return response.successResponse(strValue);
			else
				return response.errorResponse(CONST.NOT_PALINDROME);
		else
			return response.errorResponse(CONST.INVALID_STRING_MSG);
	}

	private String reverseValue(String strValue) {
		int len = strValue.length();
		String reverseString = "";

		for (int i = len - 1; i >= 0; i--)
			reverseString = reverseString + strValue.charAt(i);
		return reverseString;
	}
}
