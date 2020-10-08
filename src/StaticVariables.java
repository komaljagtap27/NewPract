
public class StaticVariables {

	
	static String varnum= "the static variable";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariables sv=new StaticVariables();
		StaticVariables sv1=new StaticVariables();
		StaticVariables sv2=new StaticVariables();
		
		System.out.println(sv.varnum);
		System.out.println(sv1.varnum);
		System.out.println(sv2.varnum);
		
		sv.varnum ="changed the value";
		
		System.out.println(sv.varnum);
		System.out.println(sv1.varnum);
		System.out.println(sv2.varnum);
		
		
	}

}
