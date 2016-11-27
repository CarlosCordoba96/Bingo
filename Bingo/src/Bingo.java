import java.util.Random;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random a=new Random();
		int arr [] = new int[15];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=a.nextInt(10);
		}
		System.out.println(arr.length);
		int four=recorrer(arr);
		System.out.println("The number 4 is repeated : "+four+" times");
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
