package com.CourseVoiture.callback;

public class ThrowExceptionCallBack implements Callback {
	   
	public void execute() {
		 throw new RuntimeException();
	}

}
