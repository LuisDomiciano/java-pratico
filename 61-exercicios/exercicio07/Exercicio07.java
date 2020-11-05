import javax.swing.JOptionPane;
public class Exercicio07 {

    public static void main (String []args) {
        int remainder, number1, number2;
        String message = "";

        number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero: "));

        remainder = numberRemainder(number1, number2);

        switch(remainder){
            case 1:
                message += sumRemainder(number1, number2);
                break;
            case 2:
                if (isEven(number1)) {
                    message = number1 + " eh par";
                } else {
                    message = number1 + " eh impar";
                }
                if (isEven(number2)) {
                    message += "\n"+ number2 + " eh par";
                } else {
                    message += "\n"+ number2 + " eh impar";
                }
                break;
            case 3:
                message += productSum(number1, number2);
                break;
            case 4:
                message += divisionSum(number1, number2);
                break;
            default:
                message = squareNumber(number1) + "\n" + squareNumber(number2);
        }
        JOptionPane.showMessageDialog(null, message);
    }
    static int numberRemainder (int number1, int number2) {
        return number1 % number2;
    }
    static int sumRemainder (int number1, int number2) {
        return number1 + number2 + numberRemainder(number1, number2);
    }
    static boolean isEven (int number) {
        return number % 2 == 0;
    }
    static int productSum (int number1, int number2) {
        return (number1 + number2) * number1;
    }
    static int divisionSum (int number1, int number2) {
        return (number1 + number2) / number2;
    }
    static int squareNumber (int number) {
        return number * number;
    }
}