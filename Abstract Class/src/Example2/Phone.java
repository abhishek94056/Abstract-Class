package Example2;

public class Phone implements Machine {

	@Override
	public void charging() {
		System.out.println("Phone can charge");
	}

	@Override
	public void wifi() {
		System.out.println("Phone connects to wifi");
	}

}