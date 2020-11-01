import javax.swing.JOptionPane;
public class Exercicio02 {

    public static void main (String[] args) {

        int fulano = 170, cicrano = 150, years = 0;

        do {
            fulano += 2;
            cicrano += 4;
            years++;
        } while (fulano > cicrano);
        
        JOptionPane.showMessageDialog(null, "Levara "+ years + " anos para que Cicrano fique maior que Fulano");
        
    }
}