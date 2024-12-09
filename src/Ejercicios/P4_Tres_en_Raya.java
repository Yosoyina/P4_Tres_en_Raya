package Ejercicios;
import java.util.Scanner;
import java.util.Random;
public class P4_Tres_en_Raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Random numAl = new Random ();
		
		// Apartado de los Jugadores
		
		String Jugador1;
		String Jugador2;
		
		// Apartado de los contadores de los jugadores 
		
		int contJ1 = 0;
		int contJ2 = 0;
		
		// Apartado de la moneda
		
		int moneda = 0;
		
		moneda = numAl.nextInt(2)+1;
			
		// Apartado del Tablero del Tres en raya
		
		String [][] Tabla = {{"-", "-", "-"},
				             {"-", "-", "-"},
				             {"-", "-", "-"}};
		
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|         Bienvenido al Juego de Tres en Raya          |");
		System.out.println("|______________________________________________________|");
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|          Introducce el nombre al Jugador 1           |");
		System.out.println("|______________________________________________________|");
		
		Jugador1 = teclado.next(); // El jugador 1 introuducce su nombre
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|          Introducce el nombre al Jugador 2           |");
		System.out.println("|______________________________________________________|");
		
		Jugador2 = teclado.next(); // El jugador 2 introuducce su nombre
		
		// Aparatado de la Condicion ( Cara ) que es igual a 1
		
		moneda = numAl.nextInt(2)+1; //para el numero aleatorio
		
		if(moneda == 1) {
			
			System.out.println(" ______________________");
			System.out.println("|                      |");
			System.out.println("|    Ha salido Cara    |");
			System.out.println("|______________________|");
			
		}
		
		// Aparatado de la Condicion ( Cruz ) que es igual a 2
		
		else if (moneda == 2) {
			
			System.out.println(" ______________________");
			System.out.println("|                      |");
			System.out.println("|    Ha salido Cruz    |");
			System.out.println("|______________________|");
			
		}
		
		
		
		
	}

}
