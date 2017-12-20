import java.io.*; 
public class Exercici3 {
    public static void main(String[] args) throws IOException {
        int nx;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el primer numero=");
        String numero1 = reader.readLine();
        int n1 = Integer.parseInt(numero1);
        System.out.print("Introduce el segundo numero=");
        String numero2 = reader.readLine();
        int n2 = Integer.parseInt(numero2);
        if(n1<n2){
			for(nx=n2;nx>n1;nx--){
				System.out.println(nx);
			}
		}
		else if(n1>n2){
			for(nx=n1;nx>n2;nx--){
				System.out.println(nx);
			}
		}
		else if(n1==n2){
			System.out.println("Los numeros son iguales="+n1+","+n2);
		}
    }
}
