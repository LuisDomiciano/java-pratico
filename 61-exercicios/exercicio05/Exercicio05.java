import javax.swing.JOptionPane;
public class Exercicio05 {
    
    public static void main (String []args) {

        int numbers[] = {1, 2, 0, 29, 78, 46, 54, 21, 33, 77, 1001, 909, 564, 364, 47, 88, 99, 65, 905, 1010, 1024, 134, 56, 70, 25};

        JOptionPane.showMessageDialog(null, "Somatorio dos pares: " + sumEvenNumbers(numbers) + "\nSomatorio dos impares: " + sumOddNumbers(numbers) + "\nMaior somatorio : " + largestSum(sumEvenNumbers(numbers), sumOddNumbers(numbers)));
        

    }

    static int sumEvenNumbers (int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++ ) {
            if (isEven(numbers[i])) {
                sum += numbers[i];
            }
        }
        return sum;
    }
    static int sumOddNumbers (int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (!isEven(numbers[i])) {
                sum += numbers[i];
            }
        }
        return sum;
    } 
    static boolean isEven (int number) {
        return number % 2 == 0;
    }

    static int largestSum (int number1, int number2) {
        return number1 > number2 ? number1:number2; 
    }
}