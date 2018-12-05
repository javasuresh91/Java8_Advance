package com.demo;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class ExampleOne {

	public static void main(String[] args) throws UnsupportedEncodingException {

		// Basic Encoding
		final String text = "java8 based , encodeing!!!!";
		String encode = Base64.getEncoder().encodeToString(text.getBytes("UTF-8"));
		System.out.println(encode);

		String decode = new String(Base64.getDecoder().decode(encode), "UTF-8");
		System.out.println(decode);

		System.out.println("====================\n");
		// URL Encoding
		final String textURL = "java8 based , encodeing!!!!";
		String encodeURL = Base64.getUrlEncoder().encodeToString(textURL.getBytes("UTF-8"));
		System.out.println(encodeURL);

		String decodeURL = new String(Base64.getUrlDecoder().decode(encodeURL), "UTF-8");
		System.out.println(decode);

	}

}
