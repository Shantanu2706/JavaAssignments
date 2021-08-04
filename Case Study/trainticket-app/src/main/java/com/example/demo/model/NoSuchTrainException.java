package com.example.demo.model;

public class NoSuchTrainException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Train with given train number does not exist";
	}
	

}
