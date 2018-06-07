//package com.decode.demo.controller;
//
//import org.apache.commons.codec.binary.Base64;
//
//import java.io.Console;
//import java.nio.charset.Charset;
//import java.nio.charset.StandardCharsets;
//

//public class Decode {
//	
//
//
//    private static final Charset UTF_8 = StandardCharsets.UTF_8;
//    
//   
//
//
//    public String encode(String input){
//
//    String input1 = document.getElementById("userInput").value;
//       byte[] encodedBytes = Base64.encodeBase64(input1.getBytes(UTF_8));
//        return("encodedBytes: " + new String(encodedBytes, UTF_8));
//       
//    }
//    
//    public String decode(String input) {
//        byte[] decodedBytes = Base64.decodeBase64(input);
//        return("decodedBytes: " + new String(decodedBytes, UTF_8));
//    }
//
//}