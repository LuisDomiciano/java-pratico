import javax.swing.JOptionPane;
public class Exercicio08 {

    public static void main (String[] args) {
        float weight, height;
        String gender;

        height = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura: "));
        gender = JOptionPane.showInputDialog(null, "Digite o gênero: (M para masculino ou F feminino");

        weight = idealWeight(height, constantValue(gender));

        JOptionPane.showMessageDialog(null, "Peso ideal: " + weight);
    }
    static int constantValue (String gender) {
        return gender.equals("M")?4:2;
    }
    static float idealWeight (float height, int k) {
        return ((height - 100) - ((height - 150)/k))*-1;
    }
}