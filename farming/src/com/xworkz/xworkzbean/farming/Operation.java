package com.xworkz.xworkzbean.farming;

public class Operation {
	public FarmDTO[] farmDTOs; // instance variable so we can access by using object only

	public int index;

	public Operation(int size) {
		farmDTOs = new FarmDTO[size]; // array object created
	}

	public void addFarmDetails(FarmDTO dto)// adding functionality
	{
		System.out.println("adding farm details");
		farmDTOs[index++] = dto; // farm will go & store inside farmDTOs of differnt index
		System.out.println("added all details");
	}

	public void showAllFarmDetails() {
		for (FarmDTO farmDTO : farmDTOs) // we get a data based on index so we use for each loop
		{
			if (farmDTO != null) // null check //to check array element really have data element r not
			{
				System.out.println(farmDTO.getTypeOfSoil() + " " + farmDTO.getArea() + " " + farmDTO.getTypeOfCrop());
			}

			else {
				System.out.println("please add the farm details");
			}
		}
	}

	public void accessingValuebyCrop() {
		for (FarmDTO farmDTO : farmDTOs) {
			if (farmDTO != null)

			{
				if (farmDTO.getTypeOfCrop() == "maize") {
					System.out.println("expected crop is present");
				} else {
					System.out.println("maize is not present");
				}
			}

			{
				System.out.println(farmDTO.getTypeOfSoil() + " " + farmDTO.getArea() + " " + farmDTO.getTypeOfCrop());
			}

		}

	}
}

//new keyword returns memory location
// if we use local variable we have to initialise before using it so simply memory waste so we go for instance var throught prgrm