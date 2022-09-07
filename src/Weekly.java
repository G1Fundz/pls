import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Weekly extends JFrame implements ActionListener {

    JFrame weeklyFrame = new JFrame();

    JButton backbtn = new JButton("Back");

    JButton monbtn = new JButton("Monday");

    JButton tuesbtn = new JButton("Tuesday");

    JButton wedbtn = new JButton("Wednesday");

    JButton thursbtn = new JButton("Thursday");

    JButton fribtn = new JButton("Friday");

    JButton satbtn = new JButton("Saturday");

    JButton sunbtn = new JButton("Sunday");

    Weekly() {

        setTitle("Mon - Sun Meal Plan");

        weeklyFrame = new JFrame("Mon - Sun Meal Plan");

        add(monbtn);
        monbtn.addActionListener(this);
        monbtn.setFocusable(false);
        monbtn.setBounds(100, 30, 200, 40);

        add(tuesbtn);
        tuesbtn.addActionListener(this);
        tuesbtn.setFocusable(false);
        tuesbtn.setBounds(100, 80, 200, 40);

        add(wedbtn);
        wedbtn.addActionListener(this);
        wedbtn.setFocusable(false);
        wedbtn.setBounds(100, 130, 200, 40);

        add(thursbtn);
        thursbtn.addActionListener(this);
        thursbtn.setFocusable(false);
        thursbtn.setBounds(100, 180, 200, 40);

        add(fribtn);
        fribtn.addActionListener(this);
        fribtn.setFocusable(false);
        fribtn.setBounds(100, 230, 200, 40);

        add(satbtn);
        satbtn.addActionListener(this);
        satbtn.setFocusable(false);
        satbtn.setBounds(100, 280, 200, 40);

        add(sunbtn);
        sunbtn.addActionListener(this);
        sunbtn.setFocusable(false);
        sunbtn.setBounds(100, 330, 200, 40);

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
        if (e.getSource() == backbtn) {
            dispose();
            new Mealplan();

        } else if (e.getSource() == monbtn) {
            new Monday();
        } else if (e.getSource() == tuesbtn) {
            new Tuesday();
        } else if(e.getSource() == wedbtn) {
            new Wednesday();
        } else if(e.getSource() == thursbtn) {
            new Thursday();
        } else if (e.getSource() == fribtn) {
            new Friday();
        } else if (e.getSource() == satbtn) {
            new Saturday();
        } else if(e.getSource() == sunbtn) {
            new Sunday();
        }
    }
}