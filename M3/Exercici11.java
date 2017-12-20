import java.io.*; 
public class Exercici11 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce la cantidad del producto=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        System.out.print("Introduce el precio del producto=");
        String valorb = valor.readLine();
        float B = Float.parseFloat(valorb);
        float totalsin = A * B;
        float iva = totalsin * (float)0.21;
        float totalcon = totalsin + iva;
        System.out.println("El precio total sin iva es= " + totalsin + " El precio total con iva es= " + totalcon);
    }
}
