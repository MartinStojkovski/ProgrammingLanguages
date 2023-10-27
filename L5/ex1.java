package verificationTest;



public class classVExercise1 {



	static class Engine {

		public void start() {

			System.out.println(" The engine is turned ON ");

		}



		public void drive()

		{

		System.out.println(" The engine is working and the car is driving ");

		}



		public void stop() {

			System.out.println(" The engine is turned OFF ");

		}

	}



	static class Wheel {

		int diameter;

		int pressure;



		public Wheel() {

			pressure = 2;

		}



		public void precnik(int psi) {

		diameter=psi;

		System.out.println("this wheele has diameter of "+ psi + "inches");

		}



		public void inflate() {

		System.out.println("The wheel is inflated. Inflate it");

		}



		public void inflate(int BAR) {

			pressure = BAR;

			System.out.println("The inflate pressure is " + BAR + " bars.");

		}

	}

	

	static class Car_Window {

		String car_window;



		Car_Window(String cw) {

			car_window = cw;

		}



		public void OpenWindow() {

			System.out.println("The " + car_window + " car window is opened.");

		}



		public void CloseWindow() {

			System.out.println("The " + car_window + " car window is closed");

		}

	}



	static class Door {

		String door;

		public Car_Window car_win;



		public Door(String v) {

			door = v;

			car_win = new Car_Window(door);

		}



		public void OpenDoor() {

			System.out.println("the " + door + " door is opened");

		}



		public void CloseDoor() {

			System.out.println("the " + door + " door is closed");

		}

	}

	

	public static class Car {

		String CarColor;

		public Engine eng = new Engine();

		public Wheel[] wheel = new Wheel[4];

		public Door frontLeft = new Door("Front left"),

		frontRight= new Door("Front right"),

		trunk = new Door("trunk"); // 3 doors

		public Car(String CarColor) {

		for(int i = 0; i < 4; i++)

		wheel[i] = new Wheel();

		this.CarColor=CarColor;

		}

		public String model;

		public String color;

		

		public Car(String model, String color){

			this.model = "";

			this.color = "";

		}

public Car() {

			

		}

	}

	public static void main(String[] args) {

		

		Car Car = new Car("city gray","golf 4");

		

		Car Car2 = new Car("green","kia picanto");

		

		Car Car3 = Car;

		

		System.out.println("Car == Car2");

		System.out.println(Car == Car2);

		System.out.println("Car2 == Car3");

		System.out.println(Car2 == Car3);

		System.out.println("Car3 == Car" );

		System.out.println(Car3 == Car );

		

		

		Car3.model = "fiat";

		Car3.color = "blue";

		

		System.out.println(Car3.model);

		

		

		

	}



}
