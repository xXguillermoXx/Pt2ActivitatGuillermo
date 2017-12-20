import java.io.*; 
public class Exercici4 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce un valor=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        int total = A * A * A * A;
        System.out.println("El valor elevado a cuatro es=" + total);
    }
}
