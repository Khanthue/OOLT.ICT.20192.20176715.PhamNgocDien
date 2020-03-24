import javax.swing.JOptionPane;
import java.lang.Math ;
public class Equation {

    private static void oneVarFirstDegreeEquation() {
        String strA, strB ;
        double a, b;
        String res = "" ;

        strA = JOptionPane.showInputDialog(null, "Enter a: ", JOptionPane.INFORMATION_MESSAGE) ;
        a = Double.parseDouble(strA) ;
        strB = JOptionPane.showInputDialog(null, "Enter b: ", JOptionPane.INFORMATION_MESSAGE) ;
        b = Double.parseDouble(strB) ;
            
        if (a == 0 && b == 0) {
            res = "Infinite solutions !!" ;
        }
        if (a == 0 && b != 0) {
            res = "No solution !!" ;
        }
        res = "The solution is: " + (-a / b) ;
        JOptionPane.showMessageDialog(null, res, "Ttitlehe solution of ", JOptionPane.INFORMATION_MESSAGE) ;
    }

    private static void twoVarFirstDegreeEquation() {
        String strA, strB, strC ;
        double a, b, c;
        String res = "" ;

        strA = JOptionPane.showInputDialog(null, "Enter a: ", JOptionPane.INFORMATION_MESSAGE) ;
        a = Double.parseDouble(strA) ;
        strB = JOptionPane.showInputDialog(null, "Enter b: ", JOptionPane.INFORMATION_MESSAGE) ;
        b = Double.parseDouble(strB) ;
        strC = JOptionPane.showInputDialog(null, "Enter c: ", JOptionPane.INFORMATION_MESSAGE) ;
        c = Double.parseDouble(strC) ;
            
        if (a == 0 && b == 0 && c == 0) {
            res = "Infinite solutions !!" ;
        } else if (a == 0 && b == 0 && c != 0) {
            res = "No solution !!" ;
        } else if (a == 0 && b != 0) {
            res = "y = " + (c / b) + "with any x" ;
        } else if (a != 0 && b == 0) {
            res = "x = " + (c / a) + "with any y" ;
        } else 
            res = "x = (" + c + "- " + b + "y) / " + a + " with any y" ;
        JOptionPane.showMessageDialog(null, res, "The solution of ", JOptionPane.INFORMATION_MESSAGE) ;
    }

    private static void oneVarSecondDegreeEquation() {
        String strA, strB, strC;
        double a, b, c;
        String res = "" ;

        strA = JOptionPane.showInputDialog(null, "Enter a: ", JOptionPane.INFORMATION_MESSAGE) ;
        a = Double.parseDouble(strA) ;
        strB = JOptionPane.showInputDialog(null, "Enter b: ", JOptionPane.INFORMATION_MESSAGE) ;
        b = Double.parseDouble(strB) ;
        strC = JOptionPane.showInputDialog(null, "Enter c: ", JOptionPane.INFORMATION_MESSAGE) ;
        c = Double.parseDouble(strC) ; 

        double delta = b*b - 4*a*c ;
        if (delta < 0) 
            res =  "No solution !!" ;
        if (delta == 0) 
            res =  "Solution: " + (-b / 2 / a) ;
        delta = Math.sqrt(delta) ;
        res = "Solution :\n" + ((delta - b) / 2 / a) + "\n" + ((-delta - b) / 2 / a) ;
        JOptionPane.showMessageDialog(null, res, "The solution of ", JOptionPane.INFORMATION_MESSAGE) ;
    }

    public static void main(String args[]) {
        String task ;
        String taskLists = "1. First degree equation with one variable\n 2. First degree equation with two variables\n 3. Second degree equation with one variable\n\nEnter task:" ;
        while (true) {
            task = JOptionPane.showInputDialog(null, taskLists, "Choose task", JOptionPane.INFORMATION_MESSAGE) ;
            if (task.equals("1")) 
                oneVarFirstDegreeEquation() ;
            else if (task.equals("2")) 
                twoVarFirstDegreeEquation();
            if (task.equals("3")) 
                oneVarSecondDegreeEquation() ;
        }
    }
}