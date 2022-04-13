import javax.swing.JOptionPane;
public class caculate {
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

		double ketqua = num1 + num2;

		JOptionPane.showMessageDialog(null, ketqua,
			"ket qua la", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}