package edu.monmouth.problemSet1;

import edu.monmouth.campusvehicle.CampusVehicle;

public class ProblemSet1 {

	public static void main(String[] args) 
	{
		CampusVehicle campusVehicle1 = new CampusVehicle("1", "Parking Lot", true);
		
		
		System.out.println("Campus Vehicle 1 ID: " + campusVehicle1.getId());
		System.out.println("Campus Vehicle 1 Location: " + campusVehicle1.getLocation());
		System.out.println("Campus Vehicle 1 Availability: " + campusVehicle1.isAvailable());

		
		
		CampusVehicle campusVehicle2 = new CampusVehicle();
		CampusVehicle campusVehicle3 = new CampusVehicle();
		CampusVehicle campusVehicle4 = new CampusVehicle();

		
		
		System.out.println();
		
		
		
		System.out.println("Campus Vehicle 2 ID: " + campusVehicle2.getId());
		System.out.println("Campus Vehicle 2 Location: " + campusVehicle2.getLocation());
		System.out.println("Campus Vehicle 2 Availability: " + campusVehicle2.isAvailable());


		
		System.out.println();
		
		
		
		System.out.println("Campus Vehicle 3 ID: " + campusVehicle3.getId());
		System.out.println("Campus Vehicle 3 Location: " + campusVehicle3.getLocation());
		System.out.println("Campus Vehicle 3 Availability: " + campusVehicle3.isAvailable());
		
		
		
		System.out.println();
		
		
		
		System.out.println("Campus Vehicle 4 ID: " + campusVehicle4.getId());
		System.out.println("Campus Vehicle 4 Location: " + campusVehicle4.getLocation());
		System.out.println("Campus Vehicle 4 Availability: " + campusVehicle4.isAvailable());
		
		
		
		campusVehicle2.setId("2");
		campusVehicle2.setLocation("Library");
		campusVehicle2.setAvailable(false);
		
		
		campusVehicle3.setId("3");
		campusVehicle3.setLocation("Spruce Hall");
		campusVehicle3.setAvailable(true);

		
		campusVehicle4.setId("4");
		campusVehicle4.setLocation("Laurel Hall");
		campusVehicle4.setAvailable(false);
		
		
		System.out.println();
		
		
		
		System.out.println("Campus Vehicle 1 ID: " + campusVehicle1.getId());
		System.out.println("Campus Vehicle 1 Location: " + campusVehicle1.getLocation());
		System.out.println("Campus Vehicle 1 Availability: " + campusVehicle1.isAvailable());
		
		
		
		System.out.println();
		
		
		
		System.out.println("Campus Vehicle 2 ID: " + campusVehicle2.getId());
		System.out.println("Campus Vehicle 2 Location: " + campusVehicle2.getLocation());
		System.out.println("Campus Vehicle 2 Availability: " + campusVehicle2.isAvailable());

		
		
		System.out.println();
		
		
		
		System.out.println("Campus Vehicle 3 ID: " + campusVehicle3.getId());
		System.out.println("Campus Vehicle 3 Location: " + campusVehicle3.getLocation());
		System.out.println("Campus Vehicle 3 Availability: " + campusVehicle3.isAvailable());
		
		
		
		System.out.println();
		
		
		
		System.out.println("Campus Vehicle 4 ID: " + campusVehicle4.getId());
		System.out.println("Campus Vehicle 4 Location: " + campusVehicle4.getLocation());
		System.out.println("Campus Vehicle 4 Availability: " + campusVehicle4.isAvailable());
		
		
		
	}

}
