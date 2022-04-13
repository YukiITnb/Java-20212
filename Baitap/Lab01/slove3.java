import javax.swing.JOptionPane;
import java.lang.Math;
public class slove3 {
	public static void main(String[] args) {
		String strNuma, strNumb, strNumc;

		strNuma = JOptionPane.showInputDialog(null,
			"please input a","input a", 
			JOptionPane.INFORMATION_MESSAGE);

		strNumb = JOptionPane.showInputDialog(null,
			"please input b","input b", 
			JOptionPane.INFORMATION_MESSAGE);

		strNumc = JOptionPane.showInputDialog(null,
			"please input c","input c", 
			JOptionPane.INFORMATION_MESSAGE);


		double a = Double.parseDouble(strNuma);
		double b = Double.parseDouble(strNumb);
		double c = Double.parseDouble(strNumc);


		double Delta = b*b - 4*a*c;
		double X;

		if ( Delta < 0 ) 
			JOptionPane.showMessageDialog(null,"phuong trinh vo nghiem");
		if ( Delta == 0 ){
			X = -b/a;
			JOptionPane.showMessageDialog(null,"phuong trinh co nghiem kep la x = "+X);
		}
		if ( Delta >0 ) {
			double X1 = ( -b + Math.sqrt(Delta))/(2*a);
			double X2 = ( -b - Math.sqrt(Delta))/(2*a);
			JOptionPane.showMessageDialog(null,"phuong trinh co 2 nghiem la x = "+X1+"va x= "+X2);
		}

		System.exit(0);
	}
}