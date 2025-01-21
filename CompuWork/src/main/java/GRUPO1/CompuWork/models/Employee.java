package GRUPO1.CompuWork.models;

public abstract class Employee {
    
  private int id;
  private String name;
  private String department;
  private String apellido;
  
  public Employee(int id, String name, String department, String string) 
  {
    this.id = id;
    this.name = name;
    this.department = department;
    this.apellido = string;
  }


  public int getId() 
  {
    return id;
  }
  public String getName() 
  {
    return name;
  }
  public String getDepartment() 
  {
    return department;
  }

  
  public void setId(int id) 
  {
	 this.id = id;
  }


  public void setName(String name) 
  {
	 this.name = name;
  }


  public void setDepartment(String department) 
  {
	 this.department = department;
  }

  public String getApellido() {
      return apellido;
  }

  public void setApellido(String apellido) {
      this.apellido = apellido;
  }


 public abstract void updateEmployeeRecord(String newName, String newDepartment);
 
}
