package calculadora;
import java.util.Scanner;
public class Calculadora {
	/**
	 * Calculadora basica
	 * @author profe talento digital comentario pa git hub
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero1;
		int numero2;
		int resultado=0;
		String accionUsuario="";
		String operador;
		System.out.println("Bienvenido a la calculadora de terminal");
		
		do {
			try {
				
				System.out.println("Ingrese el primer numero: ");
				numero1=sc.nextInt();
				System.out.println("Ingrese el segundo numero numero: ");
				numero2=sc.nextInt();
				System.out.println("Ingrese el operador matematico: (+ , - , * , /)  ");
				operador=sc.next();
				
				switch(operador) {
				case "+":
					resultado=Calculadora.sumar(numero1,numero2);
				break;
				case "-":
					resultado=Calculadora.restar(numero1,numero2);
				break;
				case "*":
					resultado=Calculadora.multiplicar(numero1,numero2);
				break;
				case "/":
					resultado=Calculadora.dividir(numero1,numero2);
				break;
				}
				
				if (operador.equals("+")||operador.equals("-")||operador.equals("*")||operador.equals("/")) {
					System.out.println("El resultado es: "+resultado);
				}	
				//explicar catch
			} catch(Exception e) {
				System.out.println("Error "+e.getMessage());
			}finally {
				System.out.println("-------------------");
				System.out.println("Stop para detener la app, 's' para seguir");
				accionUsuario=sc.next();
			}
		
		} while(!accionUsuario.toLowerCase().equals("stop"));
		System.out.println("Calculadora finalizada");
		sc.close();
		
	}
	/**
	 * Funciones que van fuera del Main pero dentro de la clase
	 * @param a parametros que van a usarse ne la calculadora
	 * @param b
	 * @return
	 */

	public static int sumar(int a, int b){
		return a+b;
	}
	public static int restar(int a, int b){
		return a-b;
	}
	public static int dividir(int a, int b) throws ArithmeticException{
		return a/b;
	}
	public static int multiplicar(int a, int b){
		return a*b;
	}
}
