import javax.swing.JOptionPane;
public class Exercicio06 {

    public static void main (String []args) {

        double celsius, convert;

        celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em celsius: "));

        convert = celsiusToFahrenheit(celsius);

        JOptionPane.showMessageDialog(null, celsius + "°C equivalem a " + convert + "°F ");
    }

    static double celsiusToFahrenheit (double temperature) {
        return temperature * 1.8 + 32;
    }

}