import javax.swing.JOptionPane;
public class Exercicio09 {

    public static void main (String[] args) {
        int number1, number2, product;

        number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero inteiro: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero inteiro: "));

        product = productNumber(number1, number2);

        JOptionPane.showMessageDialog(null, number1 + " x " + number2 + " = " + product);
    }

    static int productNumber (int number1, int number2) {
        int product = 0;
        while (number2 > 0){
            product += number1;
            number2--;
        }
        return product;
    }
}