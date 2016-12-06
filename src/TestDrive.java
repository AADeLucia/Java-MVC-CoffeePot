public class TestDrive {
	public static void main(String[] args) {
		CoffeePotModel model = new CoffeePotModel(new Bank(), new BeverageFactory());
		CoffeePotController controller = new CoffeePotController(model);
	}
}
