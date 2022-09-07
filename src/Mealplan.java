import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;


public class Mealplan extends JFrame implements ActionListener {

    JFrame mpFrame = new JFrame();

    JLabel l = new JLabel();
    JButton breakfastbtn = new JButton("Breakfast");
    JButton lunchbtn = new JButton("Lunch");

    JButton dinnerbtn = new JButton("Dinner");

    JButton weeklybtn = new JButton("Weekly");
    JButton backbtn = new JButton("Home");

    Mealplan() {

        setTitle("Meal Plan");

        mpFrame = new JFrame("label");

        add(breakfastbtn);
        breakfastbtn.addActionListener(this);
        breakfastbtn.setFocusable(false);
        breakfastbtn.setBounds(100, 100, 200, 40);

        add(lunchbtn);
        lunchbtn.addActionListener(this);
        lunchbtn.setFocusable(false);
        lunchbtn.setBounds(100, 150, 200, 40);

        add(dinnerbtn);
        dinnerbtn.addActionListener(this);
        dinnerbtn.setFocusable(false);
        dinnerbtn.setBounds(100, 200, 200, 40);

        add(weeklybtn);
        weeklybtn.addActionListener(this);
        weeklybtn.setFocusable(false);
        weeklybtn.setBounds(100, 250, 200, 40);

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
        if (e.getSource() == backbtn ) {
            dispose();
            new Homepage();

        } else if(e.getSource() == breakfastbtn) {
            new Breakfast();
        } else if(e.getSource() == lunchbtn) {
            new Lunch();
        } else if(e.getSource() == dinnerbtn) {
            new Dinner();
        } else if(e.getSource() == weeklybtn) {
            dispose();
            new Weekly();
        }
    }
}
