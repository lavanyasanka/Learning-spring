package springcore;

public class Doctor {
private String patient_name;




public String getPatient_name() {
	return patient_name;
}




public void setPatient_name(String patient_name) {
	this.patient_name = patient_name;
}




public Doctor() {
	super();
}




public Doctor(String patient_name) {
	super();
	this.patient_name = patient_name;
}




@Override
public String toString() {
	return "Doctor [patient_name=" + patient_name + "]";
}




public void Check(){
	System.out.println("Doctor is checking ");
}

}
