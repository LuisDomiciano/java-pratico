import javax.swing.JOptionPane;

public class Exercicio01 {
	
	public static void main (String []args) {
		
		int lado[] = new int [3];
		
		for (int i = 0; i < lado.length; i++) {
			lado[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado " + (i+1)));
		}
		if (existTriangle(lado)) {
		    if (equilateralTriangle(lado)) {
				JOptionPane.showMessageDialog(null, "Triangulo Equilatero!");
			}
			else if (scaleneTriangle(lado)) {
				JOptionPane.showMessageDialog(null, "Triangulo Escaleno");
			}
			else if (isoscelesTriangle(lado)) {
				JOptionPane.showMessageDialog(null, "Triangulo Isosceles");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Nao eh um triangulo!");
		}
		
	}
	
	static boolean existTriangle (int lado[]) {
		return ( (lado[0]<lado[1]+lado[2]) && (lado[1] < lado[2]+lado[0]) && (lado[2] < lado[0]+lado[1]));
	}
	static boolean equilateralTriangle (int lado[]) {
		return lado[0] == lado[1] && lado[1] == lado[2];
	}
	static boolean scaleneTriangle (int lado[]) {
		return lado[0] != lado[1] && lado[0] != lado[2] && lado[2] != lado[0];
	}
	static boolean isoscelesTriangle (int lado[]) {
		return lado[0] == lado[1] || lado[0] == lado[2] || lado[1] == lado[2];
	}
}
