package anstractClass;


	
	/*
	 * Abstract class is used when we don't want to create
	 * object of the class. It is used as a super class when we 
	 * have idea about what specific properties the subclass will
	 * have. Eg: A vehicle class can have car and truck as sup class
	 * which specifically extends vehicle class method.
	 * 
	 * --Difference between Abstract class and Interface.
	 * -Interface only contains abstract methods which are generic 
	 * in nature while Abstract class will contain at least one 
	 * abstract methods and other general method.
	 */

public abstract class Vehicles {
	
	public abstract void start();//abstract methods.
	
	public abstract void run();
	
	public abstract void stop();
	
	
	public void MadeYear() {		//generic method
		System.out.println("Made year :2020");
	}
	
}
