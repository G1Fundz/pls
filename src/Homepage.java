import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

// inheriting JFrame
public class Homepage extends JFrame implements ActionListener {
    JFrame home;
    JButton button = new JButton("BMI Calculator");
    JButton button2 = new JButton("Stopwatch");
    JButton button3 = new JButton("Workouts");
    JButton button4 = new JButton("Meal Plan");

    Homepage() {
        setTitle("Homepage");

        JMenuBar menuBar = new JMenuBar();

        JMenu homeMenu = new JMenu("Back");

        menuBar.add(homeMenu);
        this.setVisible(true);

        // adding bmi button on frame
        add(button);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBounds(100, 100, 200, 40);

        //adding stopwatch button on frame
        add(button2);
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setBounds(100, 160, 200, 40);

        //adding workouts button on frame
        add(button3);
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setBounds(100, 220, 200, 40);

        //adding mealplan button on frame
        add(button4);
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setBounds(100, 280, 200, 40);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            new BMI();

        } else if (e.getSource() == button2){


            new Stopwatch();

        } else if(e.getSource() == button3) {

            dispose();
            new Workouts();

        } else if(e.getSource() == button4 ) {

            dispose();
            new Mealplan();
        }
    }
}
