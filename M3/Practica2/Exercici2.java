import java.io.*; 
// Programa que ordena de menor a mayor
public class Exercici2 {
    public static void main(String[] args) throws IOException {
		int mayor,menor;
		System.out.print("Introduce el primer numero=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        System.out.print("Introduce el segundo numero=");
        String valor2 = valor.readLine();
        int B = Integer.parseInt(valor2);
        if (A>B){
			mayor=A;
		}
		else {
			mayor=B;
		}
		if (A<B){
			menor=A;
		}
		else {
			menor=B;
		}
		
        System.out.println("El orden de menor a mayor es= " + menor + " " + mayor);
        // Cuando los dos numeros son igual se muestran por pantalla los 2 numeors igualmente
    }
}
