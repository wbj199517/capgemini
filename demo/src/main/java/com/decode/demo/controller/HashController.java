package com.decode.demo.controller;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hash")
public class HashController {
	
	private static final Charset UTF_8 = StandardCharsets.UTF_8;
	
	@GetMapping("/encode/{content}")
	public encodeJson showEncode(@PathVariable String content) {
		
	        byte[] encodedBytes = Base64.encodeBase64(content.getBytes(UTF_8));
	        String convertString = new String(encodedBytes, UTF_8);
	        return (new encodeJson(convertString));

	}
	
	
	@GetMapping("/decode/{content}")
	public encodeJson showDecode(@PathVariable String content) {
		
	        byte[] encodedBytes = Base64.decodeBase64(content);
	        String convertString = new String(encodedBytes, UTF_8);
	        return (new encodeJson(convertString));

	}
	
	
	
	
}
