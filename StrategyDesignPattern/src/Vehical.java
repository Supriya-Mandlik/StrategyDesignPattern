
public class Vehical {
	
	DriveStrategy driveobject;
	
	public Vehical(DriveStrategy obj) {
		this.driveobject=obj;
	}
	
	public void drive() {
		driveobject.drive();
	}

}
