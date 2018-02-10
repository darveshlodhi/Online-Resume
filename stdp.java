// find the shortest way of city to moving!!! 
import java.util.Scanner;
 class stdp{
public static void main(String arg[]){

System.out.println("Enter the 7 cities name & distace");
String [] C= new String[7];
int[] D = new int[7];
int temp,t=0;
//multD[0] = new int[10];
Scanner a = new Scanner(System.in);
System.out.println(" city is :");
for(int i=0; i<7;i++){
	C[i]=a.nextLine();}
	System.out.println(" distance is :");
	for(int j=0; j<7;j++){
	
		D[j]=a.nextInt();
		}
		for(int i1=0; i1 < (7-1); i1++){  
                 for(int j1=0; j1<(7-i1-1);  j1++){  
                          if(D[j1] > D[j1+1]){  
                                 //swap elements  
                                 temp = D[j1];  
                                  D[j1]= D[j1+1];  
                                 D[j1+1] = temp;  
                        	 }  
                        	 t = j1;
                           }  
         }  
	 // for(int i=0; i <D.length; i++){  
         //               System.out.print(D[i] + " ");  
         //
         System.out.println(" after " ) ;        
             for(int u = 0; u <7; u++){  
                        System.out.println(D[u] ); 
                         } 
                         
                System.out.println(" Shortest Distance is : " +D[t] );
                System.out.println(" Shortest City is : " +C[t] );
                	
	
}

}
