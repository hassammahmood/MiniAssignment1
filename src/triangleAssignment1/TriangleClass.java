package triangleAssignment1;

public class TriangleClass {
	int classifyTriangle(float a, float b, float c) {

	     if(a<(b+c) && b < (a+c) && c< (a+b)) { 
	    	 System.out.println("\nIt is a Triangle."); 

	          if (a==b && b==c && c==a)  
	        	  System.out.println("\nIt is an Equiletaral Triangle");
 
	          if(a==b || c==a || b==c)
	        	  System.out.println("\nIt is an Isoceles Triangle."); 

	          else
	        	  System.out.println("\nIt is a Scalene Triangle.");
	          
	          return 1;
	     }
	     
	     else {
	    	 System.out.println("\nThis Triangle is not possiable.");
	    	 
	    	 return 2;
	     }
	}
}
