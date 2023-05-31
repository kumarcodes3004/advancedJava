package q4;
import java.util.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Q4 implements ActionListener{
	static JFrame f1=new JFrame("Customer Shopee");
	static JFrame f2= new JFrame("Kirana Provisions");
	static JLabel l1=new JLabel("Enter Customer ID");
	static JTextField cId=new JTextField(20);
	static JLabel l2=new JLabel("Enter Customer Phone No.:");
	static JTextField cPh=new JTextField(20);
	static JButton check=new JButton("Check");
	static JLabel l3=new JLabel("#1 Apple Rs.100/Ton #2 Samosa Rs.10/Piece");
	static JLabel l4=new JLabel("Enter Item Number you to Purchase:");
	static JLabel l5= new JLabel("Enter Quantity of Item to Purchase:");
	static JTextField iNo =new JTextField(10);
	static JTextField iQ=new JTextField(10);
	static JLabel l6= new JLabel("50% Discount Available");
	static JButton compute= new JButton("Compute");
	static JTextField bill=new JTextField(100);
	static HashMap<String,Integer> cList=new HashMap<>();
	static HashMap<Integer,Double> prod=new HashMap<>();
	void Start() {
		cList.put("8544259175",100);
		cList.put("7897153396",101);
		prod.put(1, 100.00);
		prod.put(2, 10.00);
		String user=JOptionPane.showInputDialog(null,"Enter User Name");
		String pass=JOptionPane.showInputDialog(null,"Enter Password");
		if(user.equals("Ramu")&&pass.equals("thandaJuice")) {
			JOptionPane.showMessageDialog(null, "Login Valid! Hack My System");
			f1.setSize(1000,1000);
			f1.setVisible(true);
			f1.setLayout(new GridLayout(5,2));
			f1.add(l1);
			f1.add(cId);
			f1.add(l2);
			f1.add(cPh);
			f1.add(check);
			check.addActionListener(new Q4());
			f1.add(l3);
			f1.add(l4);
			f1.add(iNo);
			f1.add(l5);
			f1.add(iQ);
			f1.add(l6);
			f1.add(compute);
			compute.addActionListener(new Q4());
			f1.add(bill);
			}
		else {
			JOptionPane.showMessageDialog(null, "Login Invalid");
		}	
	}
	public static void main(String[] args) {
		Q4 process= new Q4();
		process.Start();
//		process.Shop();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==check) {
			String ph=cPh.getText();
			if(cList.containsKey(ph)) {
				JOptionPane.showMessageDialog(null, "Old Grahak");
				cId.setText(Integer.toString(cList.get(ph)));
			}
			else {
				cList.put(ph, 102);
			}
		}
		if(e.getSource()==compute) {
			System.out.println("Ok");
			double billAmt=0.5*(prod.get(Integer.parseInt(iNo.getText()))*Double.parseDouble(iQ.getText()));
			bill.setText("Total Amount is:"+billAmt);
		}
		
	}
}
