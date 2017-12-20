import java.io.*; 
// Programa que te dice cuando pasar en un semaforo
public class Exercici2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Indica de que color esta el semaforo(rojo,verde,amarillo)=");
        String color = reader.readLine();
        while (!"rojo".equals(color)&&!"verde".equals(color)&&!"amarillo".equals(color)){
			System.out.println("Error no has indicado ningun color=");
			System.out.print("Indica de que color esta el semaforo(rojo,verde,amarillo)=");
			String color2 = reader.readLine();
			color=color2;
		}
        if (color.equals("rojo")){
			System.out.println("Esperar");
		}
        else if(color.equals("verde")){
			System.out.println("Pasar");
		}
		else if(color.equals("amarillo")){
			System.out.println("Correr");
		}
    }
}
