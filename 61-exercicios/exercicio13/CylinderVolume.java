import javax.swing.JOptionPane;

public class CylinderVolume {

    public static void main (String []args) {

        int radius = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do raio:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da altura:"));
        float volume = volume(radius, height);

        JOptionPane.showMessageDialog(null, "Volume: " + volume);       
    }

    static float volume (int radius, int height) {
        return (float) Math.PI * (radius * radius) * height;
    }

}