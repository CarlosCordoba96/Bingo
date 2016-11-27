import java.util.Random;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = creavector(15);
		
		
		System.out.println(arr.length);
		int four=recorrer(arr);
		System.out.println("The number 4 is repeated : "+four+" times");
	}
	private static int [] creavector(int longitud){
		
		Random a=new Random();
		int [] nuevovector=new int[longitud];
		for(int i=0;i<nuevovector.length;i++){
			nuevovector[i]=a.nextInt(10);
		}
		
		return nuevovector;
	}
	
	private static int recorrer(int [] a){
		int four=0;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] +" ");
			
		}
		System.out.println();
		return four;
	}

}
