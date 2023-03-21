package com.klinnovations.bean;

public class Car {
	
	IEngine eng;
	
	public Car() {
		// TODO Auto-generated constructor stub
          System.out.println("Zero Param Constructor");
	}
	
	public Car(IEngine eng) {
		this.eng = eng;
	}
  public void drive() {
	  int status= eng.start();
	  if(status>=1) {
		  System.out.println("Jurney Started...");
	  }
	  else {
		  System.out.println("Engine Troubled..");
	  }
  }
}
