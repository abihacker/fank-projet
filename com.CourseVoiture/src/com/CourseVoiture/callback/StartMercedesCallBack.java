package com.CourseVoiture.callback;

import java.awt.Color;

import com.CourseVoiture.Car;
import com.CourseVoiture.CarRunner;

public class StartMercedesCallBack implements Callback {
	@Override
	public void execute() {
		// start mercedes's thread

		Car mercedes = new Car();
		mercedes.setColor(Color.black.toString());
		mercedes.setName("Mercedes Model S");
		mercedes.setPower(500);
		Callback noop = new NopCallBack();
		CarRunner mercedesRunner = new CarRunner(mercedes, noop);
		Thread mercedesRunnerTrd = new Thread(mercedesRunner);
		mercedesRunnerTrd.start();
	}
	

}
