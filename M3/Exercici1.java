import java.io.*;
public class Exercici1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Introduce el valor de A=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String AA = valor.readLine();
        int A = Integer.parseInt(AA);
        System.out.print("Introduce el valor de B=");
        String BB = valor.readLine();
        int B = Integer.parseInt(BB);
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("Valores intercambiados: A = "  +A+  "   B = "  +B);
    }
}
