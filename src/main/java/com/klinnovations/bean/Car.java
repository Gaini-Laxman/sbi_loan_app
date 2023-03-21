package com.klinnovations.bean;

public class Car {
	
	IEngine eng;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(IEngine eng) {
		this.eng = eng;
	}
  public void drive() {
	  int status= eng.start();
	  if(status>=1) {
		  int a = 20;
		  System.out.println("Jurney Started...");
	  }
	  else {
		  System.out.println("Engine Troubled..");
	  }
  }
}
