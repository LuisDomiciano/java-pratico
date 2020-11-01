import javax.swing.JOptionPane;
public class Exercicio04 {

    public static void main (String []args) {

        float average, grade[] = new float[4];
        String message = "";

        for (int i = 0; i < grade.length; i++) {
            grade[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota "+ (i+1) + ": "));
        }
        average = getAverage(grade);

        if (isApproved(average)) {
            message = "Aprovado";
        }
        else if (isDisapproved(average)) {
            message = "Reprovado";
        } else {
            message = "Exame";
        }

        JOptionPane.showMessageDialog(null, average + " " + message);
    }
    static float getAverage (float grade[]) {
        return ( grade[0] + grade[1] + grade[2] + grade[3] ) / 4;
    }
    static boolean isApproved (float average) {
        return average >= 7.0;
    }
    static boolean isDisapproved (float average) {
        return average < 4.0;
    }
    
}