package ro.ciprian.parking;

import java.util.ArrayList;

public class Car {
	
	private String regNum;
	
	Car(){
	}
	
	Car(String regNum){
		if (regNum.length() == 6 || regNum.length() == 7 ) {
			this.regNum = regNum;
		}
		else this.regNum = null;
	}
	
	public String getCar() {
		return this.regNum;
	}
	
	public void setCar(String regNum) {
		
		if (regNum.length() == 6 || regNum.length() == 7 ) {
			this.regNum = regNum;
		}
		else this.regNum = null;
		
	}

}
