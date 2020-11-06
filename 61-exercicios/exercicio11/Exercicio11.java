import javax.swing.JOptionPane;
public class Exercicio11 {

    public static void main (String []args) {

        float a, b, r1, r2, c;

        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o numero do coeficiente a:"));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o numero do coeficiente b:"));
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o numero do coeficiente c:"));

        if (a != 0) {
            r1 = root1(a, b, delta(a,b,c));
            r2 = root2(a, b, delta(a,b,c));
            JOptionPane.showMessageDialog(null, "x1 = " + r1 + "\nx2 = " + r2);
        }

    }
    static float delta (float a, float b, float c) {
        return (b * b) - 4 * a * c;
    }
    static float root1 (float a, float b, float x) {
        return (float)(-b + Math.sqrt(x) ) / (2 * a);
    }
    static float root2 (float a, float b, float x) {
        return (float)(-b - Math.sqrt(x) )/ (2 * a);
    }
}