import java.io.*; 
public class Exercici12 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce la cantidad del producto=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        System.out.print("Introduce el precio del producto=");
        String valor2 = valor.readLine();
        float B = Float.parseFloat(valor2);
        System.out.print("Introduce el iva=");
        String valor3 = valor.readLine();
        int C = Integer.parseInt(valor3);
        float totalsin = A * B;
        float iva = totalsin * C / 100;
        float totalcon = totalsin + iva;
        System.out.println("El precio total sin iva es= " + totalsin + " El precio total con iva es= " + totalcon);
    }
}
