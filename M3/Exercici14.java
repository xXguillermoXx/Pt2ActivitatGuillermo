import java.io.*; 
public class Exercici14 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce un numero entero=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
		int B = A % 10;
        System.out.println("El ultimo digito del numero es= " + B);
    }
}
