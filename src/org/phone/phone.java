package org.phone;

public class phone {
	public void phoneName() {
		System.out.println("Phone name is Oneplus");
	}
	
	public void phoneimeiNum() {
		System.out.println("Phone IMEI number is 989874511311661615");
	}
	
	public void Camera() {
		System.out.println("Camera model is Nikon");
	}

public void storage(){
	System.out.println("Phone storage is 128 GB");
	}
public void osName() {
	System.out.println("OS is mars mellow");
}

	public static void main(String[] args) {
		phone p = new phone();
		p.phoneName();
		p.phoneimeiNum();
		p.Camera();
		p.storage();
		p.osName();
	}
}