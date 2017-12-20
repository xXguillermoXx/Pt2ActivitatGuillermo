import java.io.*; 
public class Exercici6 {
    public static void main(String[] args) throws IOException {
		System.out.println("Calculo del area de un rectangulo");
		System.out.print("Introduce la base=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        float A = Float.parseFloat(valor1);
        System.out.print("Introduce la altura=");
        String valor2 = valor.readLine();
        float B = Float.parseFloat(valor2);
        float total = A * B;
        System.out.println("El area del rectangulo es=" + total);
    }
}
