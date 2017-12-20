import java.io.*; 
public class Exercici10 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce x=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valorx = valor.readLine();
        int X = Integer.parseInt(valorx);
        System.out.print("Introduce a=");
        String valora = valor.readLine();
        int A = Integer.parseInt(valora);
        System.out.print("Introduce b=");
        String valorb = valor.readLine();
        int B = Integer.parseInt(valorb);
        System.out.print("Introduce c=");
        String valorc = valor.readLine();
        int C = Integer.parseInt(valorc);
        System.out.print("Introduce d=");
        String valord = valor.readLine();
        int D = Integer.parseInt(valord);
        int total = A * (X * X * X) + B * (X * X) + C * (X) + D;
        System.out.println("La ecuacion de tercer grado es= " + total);
    }
}
