import java.io.*; 
public class Exercici8 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce el primer valor=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        System.out.print("Introduce el segundo valor=");
        String valor2 = valor.readLine();
        int B = Integer.parseInt(valor2);
        int suma = A + B;
        int resta = A - B;
        int mult = A * B;
        int div = A / B;
        int mod = A % B;
        System.out.println("La suma es= " + suma + " La resta es= " + resta + " La multiplicacion es= " + mult + " La division es= " + div + " El modulo es= " + mod);
    }
}
