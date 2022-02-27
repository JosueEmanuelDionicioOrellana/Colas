package Colas;

import java.util.Scanner;

public class Main {
	
	public static void espacio() {
		System.out.println(" ");
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		
		ArrayBasedQueue colas = new ArrayBasedQueue(10);
		
		LinkedListBasedQueue listas = new LinkedListBasedQueue();
		String dato;
		int num= 0;
		int num2= 0;
		Scanner entrada = new Scanner(System.in);
		
		while(num!=3) {

			System.out.println("Bienvenido a colas");
			System.out.println("[1]. Basada en Arrays");
			System.out.println("[2]. Basada en Listas");
			System.out.println("[3]. Salir");
			num=entrada.nextInt();
			entrada.nextLine();
			espacio();
			
			switch(num) {
			case 1:{

				while(num2!=5) {
					System.out.println("Bienvenido a colas basadas en Arrays");
					System.out.println("[1]. Encolar");
					System.out.println("[2]. Desencolar");
					System.out.println("[3]. Cima");
					System.out.println("[4]. Tamaño");
					System.out.println("[5]. Regresar");			
					num2=entrada.nextInt();
					entrada.nextLine();
					espacio(); 
					
					switch(num2) {
					case 1:{
						System.out.println("Escriba el dato que quiere encolar");
						dato = entrada.nextLine();
						colas.enqueue(dato);
						espacio();
						break;
					}
					case 2:{
						System.out.println("Escriba el dato que quiera desencolar");
						System.out.println( colas.dequeue());
						espacio();
						break;
					}
					case 3:{
						System.out.println("El siguiente dato es: ");
						System.out.println( colas.peek());
						espacio();
						break;
					}
					case 4:{
						System.out.println( (colas.size() +1)+ " datos");
						espacio();
						break;
					}
					case 5:{
						System.out.println("good bye");
						espacio();
						break;
					}
					default:
						System.out.println("Escoja uno de los datos del menu...");
						espacio();

					}
				break;
			}
				}
			case 2:{
				while(num2!=5) {
					System.out.println("Bienvenido a colas basadas en Listas ");
					System.out.println("[1]. Encolar");
					System.out.println("[2]. Desencolar");
					System.out.println("[3]. Cima");
					System.out.println("[4]. Tamaño");
					System.out.println("[5]. Regresar");
					num2=entrada.nextInt();
					entrada.nextLine();
					espacio();
					switch(num2) {
					case 1:{
						System.out.println("Escriba el dato que quiere encolar");
						dato = entrada.nextLine();
						listas.enqueue(dato);
						espacio();
						break;
					}
					case 2:{
						System.out.println("Se acaba de desencolar el dato");
						System.out.println(listas.dequeue());
						espacio();
						break;
					}
					case 3:{
						System.out.println("El siguiente dato es: ");
						System.out.println(listas.peek());
						espacio();
						break;
					}
					case 4:{
						System.out.println("El tamaño es de");
						System.out.println((listas.size()+1) + " datos");
						espacio();
						break;
					}
					case 5:{
						System.out.println("Goodbye");
						espacio();
						break;
					}
					default:
						System.out.println("Escoja uno de los datos del menu...");
						espacio();
					}
				}
			}
			
			
			
			case 3:{
				System.out.println("l");
				break;
			}
			default:
				System.out.println("Escoja uno de los datos del menu...");
				espacio();
			}
		}
	}
}
