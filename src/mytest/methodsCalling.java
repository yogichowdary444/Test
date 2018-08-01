package mytest;

public class methodsCalling {
	
	public void  s1() {
		System.out.println("S1 Method");
		s2();
		}
	public void s2() {
	System.out.println("S2 Method");
	s3();
	}
	public void s3() {
		
		
		System.out.println("S3 Method");
		
		
	}
	
	public  static void ifcondtion(){
		int ram=50;
		int yogi=100;
		if(yogi<ram){
			System.out.println("Fuck me");
		} else{
			System.out.println("Fuck you");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsCalling m = new methodsCalling();
		m.s1();
		methodsCalling.ifcondtion();

	}

}
