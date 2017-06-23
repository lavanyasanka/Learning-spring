package springcore;

public class Employee {
	
private int emp_id;	
private String emp_name;
private int emp_sal;

//getter and setter methods 
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

public int getEmp_sal() {
	return emp_sal;
}
public void setEmp_sal(int emp_sal) {
	this.emp_sal = emp_sal;
}

public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + "]";
}


}
