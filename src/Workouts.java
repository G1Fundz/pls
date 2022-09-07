import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Workouts extends JFrame implements ActionListener {

    JButton btn = new JButton("Biceps");
    JButton btn2 = new JButton("Triceps");
    JButton btn3 = new JButton("Chest");
    JButton btn4 = new JButton("Legs");
    JButton btn5 = new JButton("Back");
    JButton btn6 = new JButton("Cardio");
    JButton backbtn = new JButton("Home");

    JFrame wFrame = new JFrame();
    JLabel lbl = new JLabel();

    Workouts() {

        setTitle("Workouts");

        //right side of tab
        add(btn);
        btn.addActionListener((ActionListener) this);
        btn.setFocusable(false);
        btn.setBounds(195, 100, 180, 40);

        add(btn2);
        btn2.addActionListener((ActionListener) this);
        btn2.setFocusable(false);
        btn2.setBounds(195, 160, 180, 40);

        add(btn3);
        btn3.addActionListener((ActionListener) this);
        btn3.setFocusable(false);
        btn3.setBounds(195, 220, 180, 40);

        //left side of tab
        add(btn4);
        btn4.addActionListener((ActionListener) this);
        btn4.setFocusable(false);
        btn4.setBounds(10, 100, 180, 40);

        add(btn5);
        btn5.addActionListener((ActionListener) this);
        btn5.setFocusable(false);
        btn5.setBounds(10, 160, 180, 40);

        add(btn6);
        btn6.addActionListener((ActionListener) this);
        btn6.setFocusable(false);
        btn6.setBounds(10, 220, 180, 40);

        add(backbtn);
        backbtn.addActionListener(this);
        backbtn.setFocusable(false);
        backbtn.setBounds(100, 380, 200, 40);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setResizable(false);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {
            dispose();
            new Biceps();
        }   else if (e.getSource() == btn2) {
            dispose();
            new Triceps();
        }   else if (e.getSource() == btn3) {
            dispose();
            new Chest();
        }   else if (e.getSource() == btn4) {
            dispose();
            new Legs();
        }   else if (e.getSource() == btn5) {
            dispose();
            new Back();
        }   else if (e.getSource() == btn6) {
            dispose();
            new Cardio();
        }   else if (e.getSource() == backbtn) {
            dispose();
            new Homepage();
        }

    }
}


