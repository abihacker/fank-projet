package com.CourseVoiture;

import com.CourseVoiture.callback.Callback;

public class CarRunner implements Runnable {

	private Car car;
	
	private Callback callback;
	
	public CarRunner(Car car) {
		this(car,null);
	}
	

	public CarRunner(Car car, Callback callback) {
		super();
		this.car = car;
		this.callback = callback;
	}


	@Override
	public void run() {
		this.car.startRunning();
		callback.execute();
	}

}