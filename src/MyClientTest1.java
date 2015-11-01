import java.util.Scanner;

public class MyClientTest1 {
	
	private static final bag Ba = null;

	public static void main(String[] args) {

	String fc = "exit";
	Scanner sc = new Scanner(System.in); 

	System.out.println("Set size for Stack A:");
	int sa = sc.nextInt();
    stack A = new stack(sa);
    
    System.out.println("The size of Stack A:"+ A.getSize());
    System.out.println("Push items in Stack A:(Enter exit to finish pushing)");
    
    while(true){
    	Object t = sc.next();
    	if(t.equals(fc)){
    		System.out.println("Push finished.");
    		break;
    	}
    	else
    	A.put(t);
    	System.out.println("You pushed:"+ t);
    }
    System.out.println("The number of objects in Stack A:"+ A.getCount());
    
    testClone(A);
    
    System.out.println("\nCreate another Stack:");
    System.out.println("Set size for Stack B:");
    int sb = sc.nextInt();
    stack B = new stack(sb);
    
    System.out.println("The size of Stack B:"+ B.getSize());
    System.out.println("Push items in Stack B:");
    
    while(true){
    	Object t = sc.next();
    	if(t.equals(fc)){
    		System.out.println("Push finished.");
    		break;
    	}
    	else
    	B.put(t);
    	System.out.println("You pushed:"+ t);
    }
    
    System.out.println("The number of objects in Stack B:"+ B.getCount());
    
    System.out.println("\n-----Test equals function-----");
    
    while(A.equals(B)){
    System.out.println("They are equal");
    break;
    }
    System.out.println("hashcode of Stack A:"+A.hashCode());
    System.out.println("hashcode of Stack B:"+B.hashCode());

  	//Start to test Bag class  
    System.out.println("\n-----Start to test Bag class-----");
    System.out.println("Set size for Bag A:");
  		int ba = sc.nextInt();
  	    bag Ba = new bag(ba);
  	    
  	    System.out.println("The size of Bag A:"+ Ba.size());
  	    System.out.println("Add items in Bag A:(Enter exit to finish adding)");
  	    
  	    while(true){
  	    	Object t = sc.next();
  	    	if(t.equals(fc)){
  	    		System.out.println("Adding finished.");
  	    		break;
  	    	}
  	    	else
  	    	Ba.put(t);
  	    	System.out.println("You added:"+ t);
  	    }
  	    System.out.println("The number of objects in the Bag A:"+ Ba.count());
  	    
  	  //grab random item
  	  for(int i=0;i<=Ba.size;i++){
  	  System.out.println("Randomly grab a item from the Bag A:"+ Ba.take());
  	  }
  	  
  	  //find specific item
  	  Object c = sc.next();
  	  if(Ba.contains(c)){
  		System.out.println("It has:"+ c);
  	  }else
  	    System.out.println("It doesn't has:"+ c);
  	  
  	  //Test Clone
  	  System.out.println("\n-----Test clone function-----");
      bag Bc = Ba.clone();
      while(Ba.equals(Bc)){
        System.out.println("Bag C are equal to A as its clone");
        break;
      }
      System.out.println("hashcode of Bag A:"+Ba.hashCode());
      System.out.println("hashcode of Bag C:"+Bc.hashCode());	    
   
  	  //Create another Bag
  	  System.out.println("\nSet size for Bag B:");
		int bb = sc.nextInt();
	    bag Bb = new bag(bb);
	    
	    System.out.println("The size of Bag B:"+ Bb.size());
	    System.out.println("Add items in Bag B:");
	    
	    while(true){
	    	Object t = sc.next();
	    	if(t.equals(fc)){
	    		System.out.println("Adding finished.");
	    		break;
	    	}
	    	else
	    	Bb.put(t);
	    	System.out.println("You added:"+ t);
	    }
	    System.out.println("The number of objects in the Bag:"+ Bb.count());
  	  //Test equals function in bag class
	  System.out.println("\n-----Test equals function-----");
	    if(Ba.equals(Bb)){
	    System.out.println("They are equal");
	    }else
	    {System.out.println("They are not equal");}
	    System.out.println("hashcode of Bag A:"+Ba.hashCode());
	    System.out.println("hashcode of Bag B:"+Bb.hashCode());
	   
  }
	
  public static void testClone(stack A){
	  
	  System.out.println("\n-----Test clone function-----");
	   
	    stack C = A.clone();
	    while(A.equals(C)){
	        System.out.println("C are equal to A as its clone");
	        break;
	    }
	    System.out.println("hashcode of Stack A:"+A.hashCode());
	    System.out.println("hashcode of Stack C:"+C.hashCode());	    
  }
  
}
