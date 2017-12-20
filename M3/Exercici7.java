import java.io.*; 
public class Exercici7 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce tu nombre=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String nombre = valor.readLine();
        System.out.print("Introduce tu edad=");
        String valor2 = valor.readLine();
        int edad = Integer.parseInt(valor2);
        System.out.println("Hola " + nombre + " , tienes " + edad + " años ");
    }
}
