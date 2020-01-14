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

		if (strValue != null && strValue != "") {
			int len = strValue.length();
			String reverseString = "";

			for (int i = len - 1; i >= 0; i--)
				reverseString = reverseString + strValue.charAt(i);

			return response.successResponse(reverseString);
		} else
			return response.errorResponse(CONST.INVALID_STRING_MSG);
	}
}
