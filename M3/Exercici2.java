import java.io.*;
public class Exercici2 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce el primer valor=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        System.out.print("Introduce el segundo valor=");
        String valor2 = valor.readLine();
        int B = Integer.parseInt(valor2);
        int total = A + B;
        System.out.println("La suma de los dos valores es=" + total);
    }
}
