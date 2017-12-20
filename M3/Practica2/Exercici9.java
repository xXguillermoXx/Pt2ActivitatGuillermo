import java.io.*; 
// Calculadora
public class Exercici9 {
    public static void main(String[] args) throws IOException {
		float operando1;
		float operando2;
		String linia;
		String operador;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce el primer operando=");
        linia = reader.readLine();
        operando1 = Float.parseFloat(linia);
        System.out.print("Introduce el operador=");
        operador = reader.readLine();
		System.out.print("Introduce el segundo operando=");
        linia = reader.readLine();
        operando2 = Float.parseFloat(linia);
		switch (operador){
			case "+":
				System.out.println(operando1+operador+operando2+"="+(operando1+operando2));
			break;
			case "-":
				System.out.println(operando1+operador+operando2+"="+(operando1-operando2));
			break;
			case "*":
				System.out.println(operando1+operador+operando2+"="+(operando1*operando2));
			break;
			case "/":
				System.out.println(operando1+operador+operando2+"="+(operando1/operando2));
			break;
			default:
				System.out.println("Operand incorrecte");
		}
	}
}
