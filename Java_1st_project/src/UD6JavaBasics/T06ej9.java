package UD6JavaBasics;
import java.util.Iterator;
import java.util.Scanner;
public class T06ej9 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce un tamaño de array: ");
		int size=scanner.nextInt();
		int array9[]=new int[size];
		int sumaTotal=0;
		
		for (int i = 0; i < array9.length; i++) {
			array9[i]=(int) (Math.random()*10);
		}
		
		for (int i = 0; i < array9.length; i++) {
			if (i==0) {
				System.out.print("{"+array9[i]+",");
			} else if(i < array9.length-1){
				System.out.print(array9[i]+",");
			} else
			System.out.print((array9[i])+"}");
			sumaTotal+=array9[i];
		}
		scanner.close();
		System.out.println("\nLa suma total es: "+sumaTotal);
	}

}
