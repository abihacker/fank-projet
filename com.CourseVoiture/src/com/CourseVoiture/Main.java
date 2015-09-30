/**
 * 
 */
package com.CourseVoiture;

import java.awt.Color;

import com.CourseVoiture.callback.Callback;
import com.CourseVoiture.callback.MainProgramStopCallBack;
import com.CourseVoiture.callback.NopCallBack;
import com.CourseVoiture.callback.StartMercedesCallBack;
import com.CourseVoiture.callback.ThrowExceptionCallBack;

/**
 * @author bwa
 *
 */
public class Main {

	public static void main(String[] args) {
		
		int compteur = 0 ;
		
		Car toyota = new Car();
		toyota.setColor(Color.black.toString());
		toyota.setName("Toyota yarris");
		toyota.setPower(100);
		
		Callback noop = new NopCallBack();
		
		Callback startMercedesCallBack = new StartMercedesCallBack();
		CarRunner toyotaRunner = new CarRunner(toyota,startMercedesCallBack);
		

		Car tesla = new Car();
		tesla.setColor(Color.black.toString());
		tesla.setName("Tesla");
		tesla.setPower(200);
		Callback stopCallBack = new MainProgramStopCallBack();
		Callback throwExceptionCallBack = new ThrowExceptionCallBack();
		CarRunner teslaRunner = new CarRunner(tesla,throwExceptionCallBack);
		
		Thread toyotaRunnerTrd = new Thread(toyotaRunner);
		toyotaRunnerTrd.start();
		
		Thread teslaRunnerTrd = new Thread(teslaRunner);
		teslaRunnerTrd.start();
		
		
		
	}
	
}