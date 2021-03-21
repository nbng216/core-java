package anstractClass;

public class Bike extends Vehicles {

	@Override
	public void start() { // implementing abstract mehhods
		System.out.println("Bike started");

	}

	@Override
	public void run() {
		System.out.println("Bike running");

	}

	@Override
	public void stop() {
		System.out.println("Bike stopped");

	}

}
