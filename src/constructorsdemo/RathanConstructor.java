package constructorsdemo;

public class RathanConstructor {
	
	int eid;
	String ename;
	float esal;
	
	RathanConstructor(int eid,String ename, float esal) {
		//conversion of local values to instance values
		this.eid = eid;
		this.ename= ename;
		this.esal= esal;
		
	}
	
	public void display(){
		System.out.println("Employee Id is " +eid);
		System.out.println("Employee Name is " +ename);
		System.out.println("Employe Salary is " +esal);
	}
	
	
	public static void main(String[] args) {
		RathanConstructor obj = new RathanConstructor(1, "Yogi", 95000.54f);
		obj.display();
	}

}
