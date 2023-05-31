package q3;
import java.util.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
class Student{
	String name,usn,addr,cat;
	int age;
	double s1,s2,s3,s4,cgpa;
	Student(String name,String usn,int age,String addr,String cat,double s1,double s2,double s3,double s4){
		this.name=name;
		this.usn=usn;
		this.age=age;
		this.addr=addr;
		this.cat=cat;
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}
}
public class Q3 implements ActionListener{
	static JFrame f1=new JFrame("Student System");
	static JLabel l1=new JLabel("Enter Name");
	static JLabel l2=new JLabel("Enter USN");
	static JLabel l3=new JLabel("Enter Age");
	static JLabel l4=new JLabel("Enter Category");
	static JLabel l5=new JLabel("Enter Address");
	static JLabel l6=new JLabel("Enter SGPA 1");
	static JLabel l7=new JLabel("Enter SGPA 2");
	static JLabel l8=new JLabel("Enter SGPA 3");
	static JLabel l9=new JLabel("Enter SGPA 4");
	static JTextField t1=new JTextField(20);
	static JTextField t2=new JTextField(20);
	static JTextField t3=new JTextField(20);
	static JTextField t4=new JTextField(20);
	static JTextField t5=new JTextField(20);
	static JTextField t6=new JTextField(20);
	static JTextField t7=new JTextField(20);
	static JTextField t8=new JTextField(20);
	static JTextField t9=new JTextField(20);
	static JButton b1=new JButton("Compute");
	static JButton b2=new JButton("Done");
	static JButton b3=new JButton("Display");
	static ArrayList<Student> sList=new ArrayList<>();
	public static void main(String[] args) {
		f1.setLayout(new GridLayout(12,2));
		f1.setSize(1000,500);
		f1.setVisible(true);
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
		f1.add(l6);
		f1.add(t6);
		f1.add(l7);
		f1.add(t7);
		f1.add(l8);
		f1.add(t8);
		f1.add(l9);
		f1.add(t9);
		f1.add(b1);
		b1.addActionListener(new Q3());
		f1.add(b2);
		b2.addActionListener(new Q3());
		f1.add(b3);
		b3.addActionListener(new Q3());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			int age=Integer.parseInt(t3.getText());
			if(age<18||age>30) {
				System.out.println("Children and Elderly are not valid!");
				String temp=JOptionPane.showInputDialog(null,"Enter Valid Age!");
				t3.setText(temp);
			}
			double s1=Double.parseDouble(t6.getText());
			double s2=Double.parseDouble(t7.getText());
			double s3=Double.parseDouble(t8.getText());
			double s4=Double.parseDouble(t9.getText());
			if(s1>10||s2>10||s3>10||s4>10)
			{
				System.out.println("Enter Valid SGPA!");
				t6.setText(null);
				t7.setText(null);
				t8.setText(null);
				t9.setText(null);
			}
		}
		if(e.getSource()==b2) {
			double s1=Double.parseDouble(t6.getText());
			double s2=Double.parseDouble(t7.getText());
			double s3=Double.parseDouble(t8.getText());
			double s4=Double.parseDouble(t9.getText());
			double cg=(s1+s2+s3+s4)/4.0;
			Student stud=new Student(t1.getText(),t2.getText(),Integer.parseInt(t3.getText()),t4.getText(),t5.getText(),s1,s2,s3,s4);
			stud.cgpa=cg;
			sList.add(stud);
		}
		if(e.getSource()==b3) {
			f1.setVisible(false);
			JFrame f2=new JFrame("Details");
			f2.setVisible(true);
			f2.setSize(1000,500);
			JTextField tInfo= new JTextField(500);
			for(Student stud:sList) {
				tInfo.setText(stud.name+" "+stud.usn+" "+stud.age+" "+stud.addr+" "+stud.cat+" "+stud.cgpa);
			f2.add(tInfo);
			}
		}
	}
}
