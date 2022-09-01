package inheritanceGetterSetter;

public class LaptopMain {

	public static void main(String[] args) {
		
		Laptop l=new Laptop();
		l.setNoOfUSBport(3);
		l.setProcessorSpeed(2);
		
		System.out.println("USB Port : "+l.getNoOfUSBport()+" "+"ProcessorSpeed : "+l.getProcessorSpeed()+" GHz");

	}

}
