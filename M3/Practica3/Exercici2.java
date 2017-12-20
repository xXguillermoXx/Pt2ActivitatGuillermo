import java.io.*; 
// Programa que te dice el descuento
public class Exercici2 {
    public static void main(String[] args) throws IOException {
        float C,D;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el precio original=");
        String po = reader.readLine();
        float A = Float.parseFloat(po);
        System.out.print("Introduce el precio pagado=");
        String pp = reader.readLine();
        float B = Float.parseFloat(pp);
        while (A<0){
			System.out.println("Error no puede haber un precio negativo");
			System.out.print("Introduce el precio original=");
			String po2 = reader.readLine();
			float F = Float.parseFloat(po2);
			A=F;
		}
		while (B<0){
			System.out.println("Error no puedes haber pagado menos de 0");
			System.out.print("Introduce el precio pagado=");
			String pp2 = reader.readLine();
			float G = Float.parseFloat(pp2);
			B=G;
		}
        C=A-B;
		D=C*100/A;
        if (A==B){
			System.out.println("No ha habido descuento");
		}
        else {
			System.out.println("El descuento en euros ha sido="+C+"€ El descuento en porcentaje ha sido="+D+"%");
		}
    }
}
