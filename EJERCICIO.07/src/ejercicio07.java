
public class ejercicio07 {

	public static void main(String[] args) {
		int i,x=4,w=9,q;
		for (i=-1;i<20;i++) {
			x++;
			for(q=4;q<11;q++) {
				do {
					i=+3;
					if (i%1==0) {
						w=4;
					}else {
						w=8;
					}
					i=x+w;
					x=w+i;
					
				}while (x<15);
				
				
			}
			
		}
		System.out.println("x: "+x+" i: "+i);
	
		
	}

}
