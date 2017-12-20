import java.io.*; 
// Programa que te dice cuando pasar en un semaforo
public class Exercici12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Indica de que color esta el semaforo(rojo,verde,amarillo)=");
        String color = reader.readLine();
        if (color.equals("rojo")){
			System.out.println("Esperar");
		}
        else if(color.equals("verde")){
			System.out.println("Pasar");
		}
		else if(color.equals("amarillo")){
			System.out.println("Correr");
		}
		else{
			System.out.println("No has puesto un color correcto");
		}
    }
}
