package q5;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.sql.*;
public class Q5 implements ActionListener{
	static JFrame f1=new JFrame("Customer JDBC");
	static JLabel l1=new JLabel("Customer No.");
	static JLabel l2=new JLabel("Customer Name");
	static JLabel l3=new JLabel("State");
	static JLabel l4=new JLabel("Credit Limit");
	static JLabel l5=new JLabel("Rep No.");
	static JTextField t1=new JTextField(20);
	static JTextField t2=new JTextField(20);
	static JTextField t3=new JTextField(20);
	static JTextField t4=new JTextField(20);
	static JTextField t5=new JTextField(20);
	static JButton submit=new JButton("Submit");
	static JButton display=new JButton("Display");
	void Data() {
		f1.setVisible(true);
		f1.setSize(1000,1000);
		f1.setLayout(new GridLayout(10,1));
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		f1.add(l3);
		f1.add(t3);
		f1.add(l4);
		f1.add(t4);
		f1.add(l5);
		f1.add(t5);
		f1.add(submit);
		submit.addActionListener(new Q5());
		f1.add(display);
		display.addActionListener(new Q5());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==submit) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Pandey123*");
				if(con!=null)
					System.out.println("Connection Estabhlished!");
				else
					System.out.println("Connection not estabhlished!");
				Statement st=con.createStatement();
//				ResultSet rs=st.executeQuery("select * from Customer");
				String cno=t1.getText();
				String cname=t2.getText();
				String cState=t3.getText();
				String cCL=t4.getText();
				String cRp=t5.getText();
				String query="insert into customer values("+cno+",'"+cname+"','"+cState+"',"+cCL+","+cRp+")";
				st.executeUpdate(query);				
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
		if(e.getSource()==display) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Pandey123*");
				if(con!=null)
					System.out.println("Connection Estabhlished!");
				else
					System.out.println("Connection not Estabhlished!");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from Customer where Credit_Limit>15000");
				System.out.println("CNo\tName\tState\tCredit\tRepNo");
				while(rs.next())
				{
					System.out.println(rs.getString("CustNo")+"\t"+rs.getString("CustName")+"\t"+rs.getString("State")+"\t"+rs.getString("Credit_Limit")+"\t"+rs.getString("RepNo")+"\t"+rs.getString(5));
				}
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
		
	}
	public static void main(String[] args) {
		Q5 solve= new Q5();
		solve.Data();
	}
	
}
