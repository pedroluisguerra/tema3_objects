package io.keepcoding.college;

public class Employee extends Person{
	private String idEmployee;

	public Employee(String name, String dni, String idEmployee) {
		super(name, dni);
		this.idEmployee = idEmployee;
		
	}
	
	@Override
	public String toString() {
				
		return super.toString() + idEmployee;
		
	}
	
}
