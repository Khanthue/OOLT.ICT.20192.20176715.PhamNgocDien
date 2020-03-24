import javax.swing.JOptionPane;
public class CalculateNumbers{
    public static void main(String[] args){
        String strNum1, strNum2;
        
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double dif = Math.abs(num1 - num2);
        double pro = num1 * num2;
        double quo = num1 / num2;
        String strNotification = String.format("Results \nSum: %2f\nDifference: %2f\nProduct: %2f\nQuotient: %2f", sum, dif, pro, quo);
    
        JOptionPane.showMessageDialog(null, strNotification, "Show results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}