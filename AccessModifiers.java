//Using public Access modifier

package com.sample;

public class AccessModifiers {
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("sum is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers obj = new AccessModifiers();
		obj.add(6, 4);

	}
}

//----------------------------------------------------------------------------------


//Using private Access modifier

/*package com.sample;

class Addition {
	
	private void add(int a, int b) {
		int c = a+b;
		System.out.println("sum is "+c);
	}

}

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition obj = new Addition();
		
		obj.add(6, 4); // It will display the error, the scope of add method is within the class.

	}
}*/


//-------------------------------------------------------------------------------------------


//Using protected access modifiers

/*package com.sample;
class modifiers{
	
	protected void add(int a, int b) {
		int c = a+b;
		System.out.println("sum is "+c);
	}
}

public class AccessModifiers extends modifiers{
	
	public static void main(String[] args) {
		
		modifiers obj = new modifiers();
		obj.add(6,4);
		
	}
	
}*/


//---------------------------------------------------------------------

//Using Default Access modifier

/*package com.sample;

class AccessModifiers {
	
	 void add(int a, int b) {
		int c = a+b;
		System.out.println("sum is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers obj = new AccessModifiers();
		obj.add(6, 4);

	}
}*/































































