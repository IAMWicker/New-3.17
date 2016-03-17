import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
  
  
 //VS4E -- DO NOT REMOVE THIS LINE! 
  
 public class mainFrame extends JFrame { 
  
  private static final long serialVersionUID = 1L; 
  private JTextField jTextField2; 
  private JTextField jTextField1; 
  private JTextField jTextField0; 
  private JTextField jTextField3; 
  private JButton jButton0; 
  private JButton jButton1; 
  private JLabel jLabel3; 
  private JLabel jLabel2; 
  private JLabel jLabel1; 
  private JLabel jLabel0;
 private JTextField jTextField4;
 private JLabel jLabel4; 
  
  public mainFrame() { 
   initComponents(); 
  } 
  
  private void initComponents() {
	setTitle("复利计算器");
	setAlwaysOnTop(true);
	setBackground(Color.lightGray);
	setFont(new Font("Dialog", Font.BOLD, 15));
	setLayout(new GroupLayout());
	add(getJTextField2(), new Constraints(new Leading(105, 10, 10), new Leading(179, 10, 10)));
	add(getJTextField1(), new Constraints(new Leading(105, 10, 10), new Leading(140, 10, 10)));
	add(getJTextField3(), new Constraints(new Leading(105, 10, 10), new Leading(220, 10, 10)));
	add(getJLabel3(), new Constraints(new Leading(61, 38, 10, 10), new Leading(222, 10, 10)));
	add(getJLabel2(), new Constraints(new Leading(61, 38, 10, 10), new Leading(180, 10, 10)));
	add(getJLabel1(), new Constraints(new Leading(61, 38, 10, 10), new Leading(138, 12, 12)));
	add(getJLabel0(), new Constraints(new Leading(59, 38, 10, 10), new Leading(98, 10, 10)));
	add(getJTextField4(), new Constraints(new Leading(105, 38, 10, 10), new Leading(268, 12, 12)));
	add(getJLabel4(), new Constraints(new Leading(61, 27, 10, 10), new Leading(268, 12, 12)));
	add(getJTextField0(), new Constraints(new Leading(105, 12, 12), new Leading(98, 24, 12, 12)));
	add(getJButton4(), new Constraints(new Leading(245, 12, 12), new Leading(98, 12, 12)));
	add(getJButton5(), new Constraints(new Leading(243, 116, 12, 12), new Leading(139, 12, 12)));
	add(getJButton2(), new Constraints(new Leading(151, 204, 12, 12), new Leading(179, 19, 12, 12)));
	add(getJButton3(), new Constraints(new Leading(149, 204, 12, 12), new Leading(224, 18, 12, 12)));
	add(getJButton1(), new Constraints(new Leading(151, 12, 12), new Leading(138, 12, 12)));
	add(getJButton0(), new Constraints(new Leading(151, 12, 12), new Leading(98, 12, 12)));
	add(getJButton6(), new Constraints(new Leading(195, 12, 12), new Leading(263, 12, 12)));
	add(getJButton7(), new Constraints(new Leading(195, 12, 12), new Leading(309, 12, 12)));
	setSize(418, 410);
}

private JButton getJButton7() {
	if (jButton7 == null) {
		jButton7 = new JButton();
		jButton7.setBackground(new Color(128, 0, 255));
		jButton7.setForeground(Color.white);
		jButton7.setText("多次所需年限");
		jButton7.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent event) {
				jButton7MouseMouseClicked(event);
			}
		});
	}
	return jButton7;
}

private JButton getJButton6() {
  if (jButton6 == null) {
   jButton6 = new JButton();
   jButton6.setBackground(new Color(128, 0, 255));
   jButton6.setForeground(Color.white);
   jButton6.setText("一次所需年限");
   jButton6.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton6MouseMouseClicked(event);
    }
   });
  }
  return jButton6;
 }

 private JButton getJButton5() {
  if (jButton5 == null) {
   jButton5 = new JButton();
   jButton5.setBackground(new Color(255, 0, 128));
   jButton5.setForeground(Color.white);
   jButton5.setText("多次所需本金");
   jButton5.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton5MouseMouseClicked(event);
    }
   });
  }
  return jButton5;
 }

 private JButton getJButton4() {
  if (jButton4 == null) {
   jButton4 = new JButton();
   jButton4.setBackground(new Color(255, 0, 128));
   jButton4.setForeground(Color.white);
   jButton4.setText("一次所需本金");
   jButton4.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton4MouseMouseClicked(event);
    }
   });
  }
  return jButton4;
 }

 private JButton getJButton3() {
  if (jButton3 == null) {
   jButton3 = new JButton();
   jButton3.setBackground(new Color(255, 128, 255));
   jButton3.setForeground(Color.white);
   jButton3.setText("多次复利最低本金要求");
   jButton3.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton3MouseMouseClicked(event);
    }
   });
  }
  return jButton3;
 }

 private JButton getJButton2() {
  if (jButton2 == null) {
   jButton2 = new JButton();
   jButton2.setBackground(new Color(255, 128, 255));
   jButton2.setForeground(Color.white);
   jButton2.setText("一次复利最低本金要求");
   jButton2.addMouseListener(new MouseAdapter() {
 
    public void mouseClicked(MouseEvent event) {
     jButton2MouseMouseClicked(event);
    }
   });
  }
  return jButton2;
 }

 private JLabel getJLabel4() {
  if (jLabel4 == null) {
   jLabel4 = new JLabel();
   jLabel4.setText("F");
  }
  return jLabel4;
 }

 private JTextField getJTextField4() {
  if (jTextField4 == null) {
   jTextField4 = new JTextField();
   jTextField4.setText("0     ");
  }
  return jTextField4;
 }

 private JLabel getJLabel0() { 
   if (jLabel0 == null) { 
    jLabel0 = new JLabel(); 
    jLabel0.setText("P"); 
   } 
   return jLabel0; 
  } 
  
  private JLabel getJLabel1() { 
   if (jLabel1 == null) { 
    jLabel1 = new JLabel(); 
    jLabel1.setText("i"); 
   } 
   return jLabel1; 
  } 
  
  private JLabel getJLabel2() { 
   if (jLabel2 == null) { 
    jLabel2 = new JLabel(); 
    jLabel2.setText("n"); 
   } 
   return jLabel2; 
  } 
  
  private JLabel getJLabel3() { 
   if (jLabel3 == null) { 
    jLabel3 = new JLabel(); 
    jLabel3.setText("A"); 
   } 
   return jLabel3; 
  } 
  
  private JTextField getJTextField0() { 
   if (jTextField0 == null) { 
    jTextField0 = new JTextField(); 
    jTextField0.setText("0         "); 
   } 
   return jTextField0; 
  } 
  
  private JTextField getJTextField1() { 
   if (jTextField1 == null) { 
    jTextField1 = new JTextField(); 
    jTextField1.setText("0         "); 
   } 
   return jTextField1; 
  } 
  
  private JTextField getJTextField2() { 
   if (jTextField2 == null) { 
    jTextField2 = new JTextField(); 
    jTextField2.setText("0         "); 
   } 
   return jTextField2; 
  } 
  
  private JButton getJButton1() { 
   if (jButton1 == null) { 
    jButton1 = new JButton(); 
    jButton1.setBackground(Color.blue); 
    jButton1.setForeground(Color.white); 
    jButton1.setText("多次复利"); 
    jButton1.addMouseListener(new MouseAdapter() { 
   
     public void mouseClicked(MouseEvent event) { 
      jButton1MouseMouseClicked(event); 
     } 
    }); 
   } 
   return jButton1; 
  } 
  
  private JButton getJButton0() { 
   if (jButton0 == null) { 
    jButton0 = new JButton(); 
    jButton0.setBackground(Color.blue); 
    jButton0.setForeground(Color.white); 
    jButton0.setText("一次复利"); 
    jButton0.addMouseListener(new MouseAdapter() { 
   
     public void mouseClicked(MouseEvent event) { 
      jButton0MouseMouseClicked(event); 
     } 
    }); 
   } 
   return jButton0; 
  } 
  
  private JTextField getJTextField3() { 
   if (jTextField3 == null) { 
    jTextField3 = new JTextField(); 
    jTextField3.setText("0         "); 
   } 
   return jTextField3; 
  } 
float P=(float)Double.parseDouble(getJTextField0().getText()), 
    i=(float)Double.parseDouble(getJTextField1().getText()), 
    n=(float)Double.parseDouble(getJTextField2().getText()), 
    A=(float)Double.parseDouble(getJTextField3().getText()), 
    F=0;
private JButton jButton2;
private JButton jButton3;
private JButton jButton4;
private JButton jButton5;
private JButton jButton6;
private JButton jButton7;  
  private void jButton0MouseMouseClicked(MouseEvent event) {  
   F=(float) (P*Math.pow(i+1, n)); 
   JOptionPane.showMessageDialog(jButton0, "F="+F,"计算结果", JOptionPane.INFORMATION_MESSAGE); 
  } 
  
  private float pow(float g, float n2) { 
   // TODO Auto-generated method stub 
   return 0; 
  } 
  
  private void jButton1MouseMouseClicked(MouseEvent event) {   

   F=(float) (A*(Math.pow((1+i),n)-1)/i);

   JOptionPane.showMessageDialog(jButton0, "F="+F,"计算结果", JOptionPane.INFORMATION_MESSAGE); 
  }

 private void jButton2MouseMouseClicked(MouseEvent event) {
  P=(float) (F/Math.pow((1+i),n));
  JOptionPane.showMessageDialog(jButton0, "P="+P,"计算结果", JOptionPane.INFORMATION_MESSAGE);

 }

 private void jButton3MouseMouseClicked(MouseEvent event) {
  P=(float) (A*Math.pow((1+i),n-1)/(i*Math.pow((1+i),n)));

  JOptionPane.showMessageDialog(jButton0, "P="+P,"计算结果", JOptionPane.INFORMATION_MESSAGE); 
 }

 private void jButton4MouseMouseClicked(MouseEvent event) {
  A=(float) (F*i/(Math.pow((1+i),n)-1));
  JOptionPane.showMessageDialog(jButton0, "A="+A,"计算结果", JOptionPane.INFORMATION_MESSAGE);


 }

 private void jButton5MouseMouseClicked(MouseEvent event) {
  A=(float) ((float)P*(i*Math.pow(1+i,n))/(Math.pow((1+i),n)-1));
  JOptionPane.showMessageDialog(jButton0, "A="+A,"计算结果", JOptionPane.INFORMATION_MESSAGE); 
 }

 private void jButton6MouseMouseClicked(MouseEvent event) {
  n=(float) (Math.log((F/P))/Math.log(1+i));
  JOptionPane.showMessageDialog(jButton0, "n="+n,"计算结果", JOptionPane.INFORMATION_MESSAGE); 
 }

private void jButton7MouseMouseClicked(MouseEvent event) {
	n=(float)(Math.log(F*i/A+1)/Math.log(1+i));
	JOptionPane.showMessageDialog(jButton0, "n="+n,"计算结果", JOptionPane.INFORMATION_MESSAGE); 
} 
}
