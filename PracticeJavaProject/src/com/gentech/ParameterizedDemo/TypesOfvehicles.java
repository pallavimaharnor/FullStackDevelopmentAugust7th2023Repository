package com.gentech.ParameterizedDemo;

class TwoWheelers {
    TwoWheelers(String type,int engineCapacity,String hasStorage,String fuelType)
    {
		System.out.println("Two wheeler type:"+type);
		System.out.println("Engine capacity:"+engineCapacity);
		System.out.println("Does it have storage space:"+hasStorage);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("-----------------------------------------------------------------");
    }

}


class FourWheeler {
    FourWheeler(String type,int seatingCapacity,String isSUV,String fuelType)
    {
		System.out.println("Four wheeler type:"+type);
		System.out.println("Seating capacity:"+seatingCapacity);
		System.out.println("Is this an SUV:"+isSUV);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("-----------------------------------------------------------------");
    }

}


class HeavyVehicle {
    HeavyVehicle(String type,double maxPayload,String fuelType,int numAxles)
    {
		System.out.println("Heavy vehicle type:"+type);
		System.out.println("Maximum Payload: "+maxPayload+"tons");
		System.out.println("Fuel type:"+fuelType);
		System.out.println("Number of axels:"+numAxles);
    }

}


public class TypesOfvehicles {

	public static void main(String[] args) {
		TwoWheelers tw = new TwoWheelers("scooter",125,"yes","petrol");
		
		FourWheeler fw = new FourWheeler("SUV",6,"yes","diesel");
		
		HeavyVehicle hv=new HeavyVehicle("truck",4.5,"petrol",2);
		
	}

}

