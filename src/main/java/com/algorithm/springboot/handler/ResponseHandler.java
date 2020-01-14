package com.algorithm.springboot.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseHandler {

	public ResponseEntity<ResultEntity> successResponse(String response) {
		return ResponseEntity.ok(new ResultEntity(2000, response));
	}

	public ResponseEntity<ResultEntity> errorResponse(String error) {
		return ResponseEntity.badRequest().body(new ResultEntity(4000, error));
	}
}
