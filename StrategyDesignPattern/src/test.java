
public class test {
	
	 public static void main(String[] args) {
		
		 Vehical v1 = new bus(new NormalDriveStrategy());
		 v1.drive();
		 
		 Vehical v2 = new sportcar(new SmartDriveStrategy());
		 v2.drive();
		 
		 Vehical v3 = new lamborgini(new SmartDriveStrategy());
		 v3.drive();
		 
	}

}
