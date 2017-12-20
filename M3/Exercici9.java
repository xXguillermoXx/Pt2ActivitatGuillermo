import java.io.*; 
public class Exercici9 {
    public static void main(String[] args) throws IOException {
		double pi = 3.1416;
		System.out.print("Introduce el radio de la circunferencia=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        float radio = Float.parseFloat(valor1);
        float area = (float)pi * radio * radio;
        float perimetro = 2 * (float)pi * radio;
        System.out.println("El area de la circunferencia es= " + area + ". El perimetro de la circunferencia es=" + perimetro);
    }
}
