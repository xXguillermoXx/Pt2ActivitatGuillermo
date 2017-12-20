import java.io.*; 
// Programa que te dice si falta o sobran €
public class Exercici10 {
    public static void main(String[] args) throws IOException {
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el precio=");
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        System.out.print("Introduce el pago=");
        String valor2 = valor.readLine();
        int B = Integer.parseInt(valor2);
        if (A==B){
			System.out.println("Has pagado la cantidad exacta del producto. Precio="+A+"€"+". Pago="+B+"€.");
		}
		else if (A<B){
			System.out.println("Te sobran="+(B-A)+"€. Precio="+A+"€. Pago="+B+"€.");
		}
        else if (A>B){
			System.out.println("Te faltan="+(A-B)+"€. Precio="+A+"€. Pago="+B+"€.");
		}
        
    }
}
