package com.study.state;

public class Service {
    public static boolean Add = true;
    public static boolean Mul = false;
    private boolean state = true;
    
    public Service() {
    	state = Add;
    }

    public void setState(boolean state) {
    	this.state = state;
    }
    
    public int proc(int inVal1, int inVal2) {

    	if ( state == true) {
    		setState(Mul);
    		return inVal1 + inVal2;
    	} else {
    		setState(Add);
    		return inVal1 * inVal2;
    	}
    }
    
    

}
