package com.startproject.Applications;

class Car{
	public void start() {}
	public void accelerate() {}
	public void stop() {}
}

class Swift extends Car{
	@Override
	public void start() {
		System.out.println("Key Start");
	}
	@Override
	public void accelerate() {
		System.out.println("Half Culth Accelerate");
	}
	@Override
	public void stop() {
		System.out.println("Key Stop");
	}
	public void bluetooth() {
		System.out.println("Sony bluetooth for Swift");
	}
}

class Audi extends Car{
	@Override
	public void start() {
		System.out.println("Button Start");
	}
	@Override
	public void accelerate() {
		System.out.println("Full Culth Accelerate");
	}
	@Override
	public void stop() {
		System.out.println("Button Stop");
	}
	public void bluetooth() {
		System.out.println("Dolby bluetooth for Audi");
	}
}

class Bmw extends Car{
	@Override
	public void start() {
		System.out.println("Touch Start");
	}
	@Override
	public void accelerate() {
		System.out.println("Automatic Drive");
	}
	@Override
	public void stop() {
		System.out.println("Button Stop");
	}
	public void bluetooth() {
		System.out.println("Atoms bluetooth for BMW");
	}
}


class Driver{
	public void drive(Car car) {
		car.start();
		car.accelerate();
		car.stop();
	}
	public void bluetoothAccess(Car car) {
		
		if(car instanceof Swift) {
			Swift swift = (Swift)car;
			swift.bluetooth();
		}
		
		if(car instanceof Audi) {
			Audi audi = (Audi)car;
			audi.bluetooth();
		}
		
		if(car instanceof Bmw) {
			Bmw bmw = (Bmw)car;
			bmw.bluetooth();
		}
	}
}



public class CarApplication {

	public static void main(String[] args) {
		Driver driver1 = new Driver();
		
		driver1.drive(new Swift());
		driver1.bluetoothAccess(new Swift());
		System.out.println("-----------------------------");
		driver1.drive(new Audi());
		driver1.bluetoothAccess(new Audi());
		System.out.println("-----------------------------");
		driver1.drive(new Bmw());
		driver1.bluetoothAccess(new Bmw());		
	}

}
