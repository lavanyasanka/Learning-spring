package springcore;

public class Cat implements Animal{
	private String animal;
   
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	@Override
	public void showAnimal() {
		System.out.println("This animal is" + animal);
		
	}

	

}
