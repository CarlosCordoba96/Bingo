import java.util.Random;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		int [][] carton1= new int[3][5];
		int [][] carton2= new int[3][5];
		String jugador1="Pepe"; //args[0];
		String jugador2="Juan";// args[1];
		int [] bombo=new int[90];
		boolean ganador=false;
		int n=-1;
		Scanner sc=new Scanner(System.in);
		boolean iniciar=false;

		System.out.println("Bienvenidos al bingo "+jugador1+" y "+jugador2);

		do{
			System.out.println("Seleccione una de estas opciones:");
			System.out.println("1.Iniciar partida. \n 2.Sacar una bola. \n 3.Imprimir cartones. \n 4.Imprimir el bombo. \n 5.Salir.");
			n=sc.nextInt();

			while(n<0 || n>=5){
				System.out.println("Introduce un numero valido.");
				n=sc.nextInt();

			}
			if(n==1)
				iniciar=true;
			while(iniciar==false){
				System.out.println("Introduce primero la opcion 1.");
				n=sc.nextInt();
				if(n==1){
					iniciar=true;
				}
			}

			switch(n){
			case 1:
				carton1=generarcarton();
				carton2=generarcarton();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			}


		}while(ganador==false);

	}
	public static int [][] generarcarton(){
		int [][] carton=new int[9][9];
		Random rnd=new Random();
		
		for(int i=0;i<carton.length;i++){
			for(int j=0;j<carton[i].length;j++){
				carton[i][j]=rnd.nextInt(89)+1;
				
				
			}
		} 


		return carton;
	}




	public static void printarray(int [][]a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
