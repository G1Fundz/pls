import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Sunday {
    JFrame f;
    JTable j;

    Sunday() {
        f = new JFrame();
        f.setTitle("Sunday");

        String[][] data = {
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""}





        };

        String[] columnNames = {"Meal", "Food", "Calories", "Protein in grams"};

        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(1200, 350);
        f.setVisible(true);
    }
}

