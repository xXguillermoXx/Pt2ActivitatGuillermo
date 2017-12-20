import java.io.*; 
public class Exercici5 {
    public static void main(String[] args) throws IOException {
		System.out.println("Calculadora de euros a pesetas");
		System.out.print("Introduce los euros=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        float A = Integer.parseInt(valor1);
        double total = A * 166.386;
        System.out.println(A + " euros son " + total + " pesetas ");
    }
}
