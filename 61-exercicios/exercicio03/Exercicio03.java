import javax.swing.JOptionPane;
public class Exercicio03 {

    public static void main (String []args) {

        int number;
        String message = "";
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro"));

        if (isEven(number)) {
            message = number + " eh par";
        } else {
            message = number + " eh impar";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    static boolean isEven (int number) {
        return number % 2 == 0;
    }
}