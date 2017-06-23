package springcore;



import java.util.List;

public class EmpCollections {

	private List<Employee> emplist;

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	public void diplayemp(){
		emplist.forEach(emp-> System.out.println(emp));

	}
	public Employee findemp(int emp_id){
		
			System.out.println("find emp called");
			for(Employee emp:emplist){
				if(emp.getEmp_id()== emp_id)
			System.out.println("found emp" +emp);		
					return emp;
			}	
			return null;	
		}


}
