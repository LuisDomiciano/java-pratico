import javax.swing.JOptionPane;
public class Exercicio10 {
    
    public static void main (String []args) {

        int dividend, divisor, quotient, remainder;
        String message = "";

        dividend = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do dividendo: "));
        divisor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do divisor"));
        
        quotient = division(dividend, divisor);
        remainder = remainder(dividend, divisor);
        message += dividend + "/" + divisor + " = " + quotient + "," + remainder;
        JOptionPane.showMessageDialog(null, message);
    }

    static boolean isPositive (int divisor) {
        return divisor > 0;
    }
    static int division (int dividend, int divisor) {
        int quotient = 0;
        if (isPositive(divisor)){
            while (dividend > 0){
                dividend -= divisor;
                quotient++;
            }
        }
        return quotient;
    }
    static int remainder (int dividend, int divisor) {
        return dividend % divisor;
    }
}