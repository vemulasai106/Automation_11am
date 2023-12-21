package Selenium;

public class Arrays {

	public static void main(String[] args) {
		
		  //single dimensional array
 		/*int[] a=new int[4];

 		 a[0]=10;
 		 a[1]=20;  
         a[2]=30;  
         a[3]=40;
 		System.out.println("One dimensional array elements are :");    
        System.out.println(a[0]);    
        System.out.println(a[1]);    
        System.out.println(a[2]);
        System.out.println(a[3]);*/
         
 		//multi dimensional array
         int[][] a = new int[3][5];
         a[0][0] = 10;
         a[0][1] = 20;
         a[1][0] = 30;
         a[1][1] = 40;
         a[2][0] = 50;
         System.out.println(a[0][0]);
         System.out.println(a[0][1]);
         System.out.println(a[1][0]);
         System.out.println(a[1][1]);
         System.out.println(a[2][0]);

	}

}
