package top.sencom.test8;

//import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Cal {
	private static JFrame f;
	private static JTextArea display;
	
	public Cal() {
		f = new JFrame("MyCal");
		f.setSize(280, 380);
		f.setLayout(null);
		
		//显示区域
		display = new JTextArea();
		display.setBounds(10,10,250,100);
		display.setEditable(false);
		
		//清除错误和清除
		JButton bC = new JButton("C");
		bC.setBounds(10,120, 120, 40);
		JButton bCE = new JButton("CE");
		bCE.setBounds(140,120, 120, 40);
		
		//按键 1 2 3 *
		JButton b1 = new JButton("1");
		b1.setBounds(10,180, 50, 30);
		JButton b2 = new JButton("2");
		b2.setBounds(70,180, 50, 30);
		JButton b3 = new JButton("3");
		b3.setBounds(130,180, 50, 30);
		JButton bMut = new JButton("*");
		bMut.setBounds(190,180, 70, 30);
		
		
		//按键 4 5 6 /
		JButton b4 = new JButton("4");
		b4.setBounds(10,220, 50, 30);
		JButton b5 = new JButton("5");
		b5.setBounds(70,220, 50, 30);
		JButton b6 = new JButton("6");
		b6.setBounds(130,220, 50, 30);
		JButton bDiv = new JButton("/");
		bDiv.setBounds(190,220, 70, 30);
		
		//按键 7 8 9 =
		JButton b7 = new JButton("7");
		b7.setBounds(10,260, 50, 30);
		JButton b8 = new JButton("8");
		b8.setBounds(70,260, 50, 30);
		JButton b9 = new JButton("9");
		b9.setBounds(130,260, 50, 30);
		JButton bEqu = new JButton("=");
		bEqu.setBounds(190,260, 70, 70);
		//bEqu.setFont( new Font("宋体",1, 50));
		
		//按键 + 0 -
		JButton bAdd = new JButton("+");
		bAdd.setBounds(10,300, 50, 30);
		JButton b0= new JButton("0");
		b0.setBounds(70,300, 50, 30);
		JButton bSub = new JButton("-");
		bSub.setBounds(130,300, 50, 30);
		
		f.add(display);
		f.add(bC);
		f.add(bCE);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bMut);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bDiv);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bEqu);
		f.add(bAdd);
		f.add(b0);
		f.add(bSub);
		
		f.setResizable(false);
		f.setVisible(true);
		
		ActionListener listener = new ClickListener();
		bC.addActionListener(listener);
		bCE.addActionListener(listener);
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		bMut.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		bDiv.addActionListener(listener);
		b7.addActionListener(listener);
		b8.addActionListener(listener);
		b9.addActionListener(listener);
		bEqu.addActionListener(listener);
		bAdd.addActionListener(listener);
		b0.addActionListener(listener);
		bSub.addActionListener(listener);
	}
	
	//处理按键事件
	private class ClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String buttonName = e.getActionCommand();
			if (buttonName.equals("CE")) {
				//JOptionPane.showMessageDialog(f,"按钮1 被点击");
				String tmp = display.getText();
				if(tmp.length() >=1) {
					String res = tmp.substring(0, tmp.length() - 1 );
					display.setText(res);
				}
				else {
					display.setText("");
				}
			}
			if (buttonName.equals("C")) {
				display.setText("");
			}
			if (buttonName.equals("1")) {
				display.append("1");
			}
			if (buttonName.equals("2")) {
				display.append("2");
			}
			if (buttonName.equals("3")) {
				display.append("3");
			}
			if (buttonName.equals("*")) {
				display.append("*");
			}
			if (buttonName.equals("4")) {
				display.append("4");
			}
			if (buttonName.equals("5")) {
				display.append("5");
			}
			if (buttonName.equals("6")) {
				display.append("6");
			}
			if (buttonName.equals("/")) {
				display.append("/");
			}
			if (buttonName.equals("7")) {
				display.append("7");
			}
			if (buttonName.equals("8")) {
				display.append("8");
			}
			if (buttonName.equals("9")) {
				display.append("9");
			}if (buttonName.equals("=")) {
				//do some fucking parser!!!
				String exp = display.getText();
				display.append("\n="+Parser.parser(exp));
			}
			if (buttonName.equals("+")) {
				display.append("+");
			}
			if (buttonName.equals("0")) {
				display.append("0");
			}
			if (buttonName.equals("-")) {
				display.append("-");
			}
		}
		 
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cal();
	}

}
