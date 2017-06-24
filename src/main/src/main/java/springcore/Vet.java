package springcore;

public class Vet extends Doctor {
	private Animal animal;
	


	public Vet() {
		super();
	}



	public Vet(Animal animal) {
		super();
		this.animal = animal;
	}



	@Override
	public String toString() {
		return "Vet [animal=" + animal + "]";
	}



	public void check(){
		super.Check();
		System.out.println("he is a vetDoc ");
		animal.showAnimal();
	}

}
