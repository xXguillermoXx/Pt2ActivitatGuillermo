import java.io.*; 
// Programa que calcula la raiz quadrada
public class Exercici1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un numero positivo=");
        String numero = reader.readLine();
        float A = Float.parseFloat(numero);
        while (A<0){
			System.out.println("Error no puede ser un numero negativo");
			System.out.print("Introduce un numero positivo=");
			String numero2 = reader.readLine();
			float C = Float.parseFloat(numero2);
			A=C;	
		}
		float B=(float) Math.sqrt(A);
		System.out.println("La raiz cuadrada es="+B);		
    }
}
