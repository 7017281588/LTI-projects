package com.lti.practise;
@AuthorOfTheCode(name="srishti",id=123,email="srish123")

public class Emp implements Comparable {
private int id;
private String name;
private float salary;




@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.id+ this.name;
}
public Emp(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@AuthorOfTheCode(name="uttu",id=199,email="uttu.gunjan@gmail.com")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}


/*public int compareTo(Emp e2) {
	
	if (this.salary== e2.salary)
		return 0 ;
	else if (this.salary>e2.salary)
			return 1;
	else
		return -1;}*/

public int compareTo(Emp e2) {

	if (this.salary== e2.salary)
		return 0 ;
	else if (this.salary>e2.salary)
			return 1;
	else
		return -1;
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}


}
