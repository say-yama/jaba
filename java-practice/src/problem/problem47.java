package problem;

public class problem47 {

	public static void main(String[] args) {
		int[] n= new int[5];
		String s ="";
		String m ="";
		String l ="";
		
		for(int i=0; i<5;i++) {
			n[i]= (int)(Math.random()*100)+1;
			System.out.print(n[i]);
			
			if(n[i]>=80) {
				l += String.valueOf(n[i]+" ");
			} else if(n[i]>=60){
				m += String.valueOf(n[i]+" ");
			}else {
				s += String.valueOf(n[i]+" ");
			}
		}
		System.out.println();
		System.out.println("\n"+ s);
		System.out.println(m);
		System.out.println(l);
		
	}
}
