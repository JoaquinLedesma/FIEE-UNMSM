import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese la dimension del vector: ");
		int n =teclado.nextInt();
		
		if (n>=4) {
			int[] A=new int[n];   //int[] A={2,3,4,0,4,1,50,8,7,12,5};
			int[] B={0,0,0,0};
			int producto=0;
			int productomaximo=0;
			
			for(int j=0;j<A.length;j++) {
				if(j==0) {
					System.out.println("Ingrese terminos");	
				}
				A[j]=teclado.nextInt();	
			}
			
			
			for(int i=0;i<=A.length-4;i++) {
				producto = A[i]*A[i+1]*A[i+2]*A[i+3];
				if(producto>=productomaximo) {
					productomaximo=producto;
					B[0]=A[i];
					B[1]=A[i+1];
					B[2]=A[i+2];
					B[3]=A[i+3];
				}
			}
			System.out.println("");
			System.out.println("El mayor producto es generado por "+B[0]+" "+B[1]+" "+B[2]+" "+B[3]);
			
		}else {
			System.out.println("");
			System.out.println("CANTIDAD INVALIDA");
		}
		
		
		

	}

}
