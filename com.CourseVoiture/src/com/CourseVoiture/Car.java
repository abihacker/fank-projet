package com.CourseVoiture;
import java.util.Date;

public class Car implements Start,Run,Stop{
	private String color;
	private String name;
	private int power;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public void stop() {
		System.out.println("");
		System.out.println(name+"Arrived ! - "+new Date().getTime());
		System.out.println("");
	}
	public void startRunning() {
		start();
		int miles = 0;
		while (Constant.DISTANCE > miles) {
			miles += power;
			System.out.println(name+" ran : "+ miles+" m");
			  try {
			        Thread.sleep(2000);
			    } catch (InterruptedException e) {
			        // We've been interrupted: no more messages.
			        return;
			    }
		}
		stop();
	}
	@Override
	public void start() {
		System.out.println("");
		System.out.println("Starting "+name);
		System.out.println("");
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", name=" + name + ", power=" + power
				+ "]";
	}
	@Override
	public void startrunning() {
		// TODO Auto-generated method stub
		
	}
	
}