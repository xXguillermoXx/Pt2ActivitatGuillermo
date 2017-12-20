import java.io.*; 
// Programa que ordena de menor a mayor
public class Exercici8 {
    public static void main(String[] args) throws IOException {
		int mayor,medio,menor;
        BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el primer numero=");
        String valor1 = valor.readLine();
        int A = Integer.parseInt(valor1);
        System.out.print("Introduce el segundo numero=");
        String valor2 = valor.readLine();
        int B = Integer.parseInt(valor2);
        System.out.print("Introduce el tercer numero=");
        String valor3 = valor.readLine();
        int C = Integer.parseInt(valor3);
        if (A>B&&A>C){
			mayor=A;
		}
		else if(B>A&&B>C){
			mayor=B;
		}
		else {
			mayor=C;
		}
		if (A<B&&A<C){
			menor=A;
		}
		else if(B<A&&B<C){
			menor=B;
		}
		else {
			menor=C;
		}
		medio=(A+B+C)-(mayor+menor);
        System.out.println("El orden de menor a mayor es= "+menor+"<"+medio+"<"+mayor);
        
    }
}
