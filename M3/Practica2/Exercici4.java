import java.io.*; 
// Programa que representa un digito
public class Exercici4 {
    public static void main(String[] args) throws IOException {
		BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un simbolo=");
        String valor1 = valor.readLine();
		if (valor1.equals("0")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("1")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("2")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("3")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("4")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("5")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("6")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("7")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("8")){
			System.out.println("Es un numero");
		}
		else if(valor1.equals("9")){
			System.out.println("Es un numero");
		}
		else{
			System.out.println("No es un numero");
		}
    }
}
