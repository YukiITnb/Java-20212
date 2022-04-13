import javax.swing.JOptionPane;
public class onevari {
	public static void main(String[] args) {
		String strNum1, strNum2;

		strNum1 = JOptionPane.showInputDialog(null,
			"please input the first number","input the first number", 
			JOptionPane.INFORMATION_MESSAGE);

		strNum2 = JOptionPane.showInputDialog(null,
			"please input the second number","input the second number", 
			JOptionPane.INFORMATION_MESSAGE);

		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);


		double ketqua =  -num2/num1;

		JOptionPane.showMessageDialog(null, ketqua,
			"Nghiem cua phuong trinh la:", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}