import java.io.*; 
public class Exercici1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce las veces que quieres que se repita el triangulo=");
        String numero = reader.readLine();
        int num = Integer.parseInt(numero);
        triangulo(num);
    }
    
	public static void triangulo(int x){
		int i;
		for(i=0;i<x;i++){
			System.out.println(".........9.........");
			System.out.println("........898........");
			System.out.println(".......78987.......");
			System.out.println("......6789876......");
			System.out.println(".....567898765.....");
			System.out.println("....45678987654....");
			System.out.println("...3456789876543...");
			System.out.println("..234567898765432..");
			System.out.println(".12345678987654321.");
			System.out.println("0123456789876543210");
		}	
	}	
}

