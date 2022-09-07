import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class BMI extends JFrame{

    BMI() {
        JFrame bmiFrame = new JFrame();

        JLabel height = new JLabel("Height(Inches):");
        height.setBounds(20, 60, 100, 40); //y - 20
        bmiFrame.add(height); //adding component in JFrame

        JLabel weightlbs = new JLabel("Weight(Pounds):");
        weightlbs.setBounds(20, 120, 100, 40); //y - 60
        bmiFrame.add(weightlbs); //adding component in JFrame

        JLabel Total = new JLabel("Your BMI will appear here!");
        Total.setBounds(20, 175, 300, 40); //y - 90
        bmiFrame.add(Total); //adding component in JFrame

        JTextField Heighttext = new JTextField("");
        Heighttext.setBounds(120, 50, 200, 40); //y - 20
        bmiFrame.add(Heighttext);

        JTextField Weighttext = new JTextField("");
        Weighttext.setBounds(120, 120, 200, 40);
        bmiFrame.add(Weighttext);

        JButton button1 = new JButton("Calculate your BMI");
        button1.setBounds(40, 230, 300, 40);

        //Event
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                double weight = Double.parseDouble(Weighttext.getText());
                double height = Double.parseDouble(Heighttext.getText());

                double bmi = weight / Math.pow(height, 2) * 703; //formula for calculating bmi

                if (bmi < 18.5) {
                    Total.setText("underweight - BMI : " + bmi);
                } else if (bmi < 25) {
                    Total.setText("normal - BMI : " + bmi);
                } else if (bmi < 30) {
                    Total.setText("overweight - BMI : " + bmi);
                } else {
                    Total.setText("obese - BMI : " + bmi);
                }
            }
        });

        bmiFrame.add(button1);

        bmiFrame.setSize(400, 500); //h - 300
        bmiFrame.setLayout(null);
        bmiFrame.setVisible(true);
        bmiFrame.setResizable(false);

    }
}


