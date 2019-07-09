package com.visa.training.test1;

public class Time {

	private int hours;
	private int min;

	public Time(int hours, int min) {
		this.hours = hours;
		this.min = min;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public Time addTime(Time t2) {
		Time newObject = new Time((this.hours + t2.hours) + (this.min + t2.min) / 60, (this.min + t2.min) % 60);
		return newObject;
	}

	public static Time addTime(Time t1, Time t2) {
		Time newObject = new Time((t2.hours + t1.hours) + (t2.min + t1.min) / 60, (t2.min + t1.min) % 60);
		return newObject;
	}

}
