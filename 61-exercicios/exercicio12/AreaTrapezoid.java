import javax.swing.JOptionPane;

public class AreaTrapezoid {

    public static void main (String [] args) {
        
        int longBase = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base maior:"));
        int shortBase = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base menor:"));
        int altitude = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura:"));
        int area = area(longBase, shortBase, altitude);

        JOptionPane.showMessageDialog(null, "Area do Trapezio: " + area);   

    }
    static int area (int longBase, int shortBase, int altitude) {
        return ( (longBase + shortBase) /2)* altitude;
    }
}