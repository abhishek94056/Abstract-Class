package Example2;

public abstract class SolarCooker implements Machine {

	@Override
	public void charging() {
		System.out.println("Solar cooker can charge.");
	}

	public abstract void wifi();

}