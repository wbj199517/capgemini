package com.decode.demo.controller;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hash")
public class HashController {
	
	private static final Charset UTF_8 = StandardCharsets.UTF_8;
	
	@PostMapping("/encode")
	public encodeJson showEncode(@RequestBody String userInput) {
		
	        byte[] encodedBytes = Base64.encodeBase64(userInput.getBytes(UTF_8));
	        String convertString = new String(encodedBytes, UTF_8);
	        return (new encodeJson(convertString));

	}
	
	
	@PostMapping("/decode")
	public encodeJson showDecode(@RequestBody String userInput) {
		
	        byte[] encodedBytes = Base64.decodeBase64(userInput);
	        String convertString = new String(encodedBytes, UTF_8);
	        return (new encodeJson(convertString));

	}
	
	
	
	
}
