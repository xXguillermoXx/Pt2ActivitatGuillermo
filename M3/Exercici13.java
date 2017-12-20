import java.io.*; 
public class Exercici13 {
    public static void main(String[] args) throws IOException {
		System.out.print("Introduce las ventas de coca-cola=");
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        System.out.print("Introduce las ventas de fanta=");
        String valor2 = valor.readLine();
        int B = Integer.parseInt(valor2);
        System.out.print("Introduce las ventas de limonada=");
        String valor3 = valor.readLine();
        int C = Integer.parseInt(valor3);
        float precioA = A * (float)1.20;
        float precioB = B * (float)0.80;
        float precioC = C * (float)0.50;
        float total = precioA + precioB + precioC;
        System.out.println("Producto\tVentas\tPrecio\tTotal");
        System.out.println("Coca-cola\t" + A + "\t1.20 €\t" + precioA + "€");
        System.out.println("Fanta\t\t" + A + "\t0.80 €\t" + precioB + "€");
        System.out.println("Limonada\t" + A + "\t0.50 €\t" + precioC + "€");
        System.out.println("Total\t\t\t\t" + total + "€");
    }
}
