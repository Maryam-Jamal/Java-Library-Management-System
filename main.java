import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Library implements ActionListener{
    JFrame jf;
    JRadioButton j1;
    JRadioButton j2;
    JRadioButton j3;
    JRadioButton j4;
    JRadioButton j5;
    ButtonGroup Bg = new ButtonGroup();
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JLabel L1;
    JLabel L2;
    JLabel L3;
    JLabel L4;
    JLabel L5;
    JLabel L6;
    JLabel L7;
    JLabel L8;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    Library() {
        jf = new JFrame("Read More , Learn More..");
        L1 = new JLabel("Reader’s Paradise Library");
        L1.setFont(new Font("Edwardian Script ITC", Font.BOLD, 26));
        L1.setBounds(130, 60, 120, 30);
        jf.add(L1);
        L2 = new JLabel("Member Name:");
        L2.setBounds(10, 20, 50, 10);
        jf.add(L2);
        t1 = new JTextField(14);
        t1.setBounds(50, 100, 200, 30);
        jf.add(t1);
        L3 = new JLabel("Age:");
        L3.setBounds(40, 40, 90, 20);
        jf.add(L3);
        t2 = new JTextField(15);
        t2.setBounds(50, 100, 200, 30);
        jf.add(t2);
        L4 = new JLabel("Membership type:");
        L4.setBounds(40, 40, 90, 20);
        jf.add(L4);
        j1 = new JRadioButton("Monthly:");
        jf.add(j1);
        Bg.add(j1);
        j2 = new JRadioButton("Quarterly:");
        jf.add(j2);
        Bg.add(j2);
        j3 = new JRadioButton("Yearly:");
        jf.add(j3);
        Bg.add(j3);
        b1 = new JButton("Check for");
        b1.setBounds(40, 90, 85, 20);
        jf.add(b1);
        L5 = new JLabel("Fee:");
        L5.setBounds(40, 40, 90, 20);
        jf.add(L5);
        t3 = new JTextField(20);
        t3.setBounds(50, 100, 200, 30);
        jf.add(t3);
        L6 = new JLabel("Discount eligibility:");
        L6.setBounds(40, 40, 90, 20);
        jf.add(L6);
        j4 = new JRadioButton("Students");
        jf.add(j4);
        Bg.add(j4);
        j5 = new JRadioButton("Others");
        jf.add(j5);
        Bg.add(j5);
        b2 = new JButton("Check Discount");
        b2.setBounds(40, 90, 85, 20);
        jf.add(b2);
        L7 = new JLabel("Discount :");
        L7.setBounds(40, 40, 90, 20);
        jf.add(L7);
        t4 = new JTextField(20);
        t4.setBounds(50, 100, 200, 30);
        jf.add(t4);
        b3 = new JButton("Calculate");
        b3.setBounds(40, 90, 85, 20);
        jf.add(b3);
        L8 = new JLabel("Net Fee :");
        L8.setBounds(40, 40, 90, 20);
        jf.add(L8);
        t5 = new JTextField(20);
        t5.setBounds(50, 100, 200, 30);
        jf.add(t5);
        b4 = new JButton("Clear all");
        b4.setBounds(40, 90, 85, 20);
        b4.addActionListener(this);
        jf.add(b4);
        jf.setSize(500, 500);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT, 190, 1));
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionperformed(ActionEvent ae) {
        String button;
        button = ae.getActionCommand();
        if (button.equals("Check fee")) {
            if (j1.isSelected()) {
                t3.setText("500");
            } else if (j2.isSelected()) {
                t3.setText("1000");
            } else {
                t3.setText("1500");
            }
        } else if (button.equals("Check Discount")) {
            if (j4.isSelected()) {
                t4.setText("200");
            } else {
                t4.setText("100");
            }
        } else if (button.equals("Calculate")) {
            int a = Integer.parseInt(t3.getText());
            int b = Integer.parseInt(t4.getText());
            int c = a - b;
            String d = String.valueOf(c);
            t5.setText(d);
        } else if (button.equals("Clear all")) {
            clearfield();
        }
    }
    private void clearfield() {
        throw new UnsupportedOperationException("Not supported"); 
    }

    public static void main(String[] args) {
        new Library();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported"); 
    }
}
