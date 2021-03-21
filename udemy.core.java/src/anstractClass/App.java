package anstractClass;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car Honda = new Car();//creating new car object.
		
		Bike FZ = new Bike();
		
		Honda.start(); //Calling abstract method;
		
		FZ.stop();
		
		FZ.MadeYear(); // Calling general method

	}

}
