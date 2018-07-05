public class BusTracker {
	private static String[] names = {
		"Amy", "Bob", "Cindy", "Dave", "Earl",
		"Faye", "Ginger", "Hank", "Irwin"
	};

	private static int[] moneys = {
		220, 400, 510, 250, 450, 100, 800, 150, 60
	};

	public static void main(String[] args){
		Bus bus1 = new Bus(2);
		Bus bus2 = new Bus(4);
		bus1.setCar(111, 6.0);
		bus1.addGas(60);
		bus2.setCar(222, 9.5);
		bus2.addGas(80);

		Person person[] = new Person[9];
		for (int i = 0; i < names.length; i++) {
			switch (i % 3) {
			case 0:
				person[i] = new Adult(names[i], moneys[i]);
				break;
			case 1:
				person[i] = new Child(names[i], moneys[i]);
				break;
			case 2:
				person[i] = new Senior(names[i], moneys[i]);
				break;
			}
		}

		System.out.println();
		bus1.getOn(person[0]);
		bus1.getOn(person[1]);
		bus2.getOn(person[2]);
		bus2.getOn(person[3]);
		bus2.getOn(person[4]);

		System.out.println();
		System.out.println("Bus (Num: " + bus1.getBusNum() + ") current status");
		bus1.printAllPassengers();
		bus1.printTotalFee();

		System.out.println();
		System.out.println("Bus (Num: " + bus2.getBusNum() + ") current status");
		bus2.printAllPassengers();
		bus2.printTotalFee();

		System.out.println();
		bus1.getOn(person[5]);
		bus1.getOn(person[6]);
		bus2.getOn(person[7]);
		bus2.getOn(person[8]);

		System.out.println();
		System.out.println("Bus (Num: " + bus1.getBusNum() + ") current status");
		bus1.printAllPassengers();
		bus1.printTotalFee();

		System.out.println();
		System.out.println("Bus (Num: " + bus2.getBusNum() + ") current status");
		bus2.printAllPassengers();
		bus2.printTotalFee();

		System.out.println();
		bus1.getOff(person[0]);
		bus1.getOff(person[1]);

		System.out.println();
		System.out.println("Bus (Num: " + bus1.getBusNum() + ") current status");
		bus1.printAllPassengers();
		bus1.printTotalFee();
	}
}
