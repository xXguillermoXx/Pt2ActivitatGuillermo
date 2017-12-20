import java.io.*;
public class Exercici3 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce tu edad=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int edad = Integer.parseInt(valor1);
        int total = edad + 25;
        System.out.println("Tu edad dentro de un cuarto de siglo es=" + total);
    }
}
