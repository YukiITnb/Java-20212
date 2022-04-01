import javax.swing.JOptionPane;
public class twovari {
	public static void main(String[] args) {
		String strNuma11, strNuma12, strNumb1;
		String strNuma21, strNuma22, strNumb2;

		strNuma11 = JOptionPane.showInputDialog(null,
			"please input a11","input a11", 
			JOptionPane.INFORMATION_MESSAGE);

		strNuma12 = JOptionPane.showInputDialog(null,
			"please input a12","input a12", 
			JOptionPane.INFORMATION_MESSAGE);

		strNumb1 = JOptionPane.showInputDialog(null,
			"please input b1","input b1", 
			JOptionPane.INFORMATION_MESSAGE);



		strNuma21 = JOptionPane.showInputDialog(null,
			"please input a21","input a21", 
			JOptionPane.INFORMATION_MESSAGE);

		strNuma22 = JOptionPane.showInputDialog(null,
			"please input a22","input a22", 
			JOptionPane.INFORMATION_MESSAGE);

		strNumb2 = JOptionPane.showInputDialog(null,
			"please input b2","input b2", 
			JOptionPane.INFORMATION_MESSAGE);



		double a11 = Double.parseDouble(strNuma11);
		double a12 = Double.parseDouble(strNuma12);
		double b1  = Double.parseDouble(strNumb1);
		double a21 = Double.parseDouble(strNuma21);
		double a22 = Double.parseDouble(strNuma22);
		double b2  = Double.parseDouble(strNumb2);

		double D = a11 * a22 - a21 * a12;
    	double DX = b1 * a22 - b2 * a12;
    	double DY = a11 * b2 - a21 * b1;

    	if (D == 0) {
    		if (DX + DY == 0) 
    			JOptionPane.showMessageDialog(null,"phuong trinh vo so nghiem");
    		else
    			JOptionPane.showMessageDialog(null,"phuong trinh vo nghiem");
    		
    	}
    	else{
    		double x = DX / D;
    		double y = DY / D;
    		JOptionPane.showMessageDialog(null,"phuong trinh co nghiem la "+ x +" va "+y);
    	}

		// JOptionPane.showMessageDialog(null, ketqua,
			// "Nghiem cua phuong trinh la:", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}