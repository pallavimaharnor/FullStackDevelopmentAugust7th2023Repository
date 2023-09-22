package com.gentech.ParameterizedDemo;


class Desktop {
    Desktop(String brand,String model,int ramSizeGB, String isSSDSupported)
    {
		System.out.println("Brand:"+brand);
		System.out.println("model no.:"+model);
		System.out.println("ramSize:"+ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+isSSDSupported);
		System.out.println("-----------------------------------------------------------------------------------------	");	
    }

}
class LaptopClassDemo {
    LaptopClassDemo(String brand,String model,double screenSizeInches,int batteryCapacity)
    {
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Screen Size:"+screenSizeInches+" inches");
		System.out.println("Battery capacity:"+batteryCapacity);
		System.out.println("-----------------------------------------------------------------------------------------	");	
    }

}
class MobileDeviceClassDemo {
    MobileDeviceClassDemo(String brand,String model,String operatingSystem,String isMobileDataEnabled)
    {
		System.out.println("Brand:"+brand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("Is the MobileData enabled:"+isMobileDataEnabled);
    }

}

public class ElectronicDecices {

	public static void main(String[] args) {
		Desktop D=new Desktop("lenovo","S320",128,"yes");
		
		LaptopClassDemo L=new LaptopClassDemo("dell","S20",14.5,8000);
			
		MobileDeviceClassDemo M=new MobileDeviceClassDemo("samsung","galaxyS30","android","no");
		
	}


}
