import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Breakfast {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    Breakfast() {
        // Frame initialization
        f = new JFrame();

        // Frame Title
        f.setTitle("Breakfast");

        // Data to be displayed in the JTable
        String[][] data = {
                {"2 Large Scrambled Eggs", "203", "12",},
                {"Non-Fat Plain Greek Yoghurt", "80", "13",},
                {"Whole Grain Pancake", "78", "6"},
                {"30g of Porridge Oats", "117", "0.7"},
                {"Butter on Toast", "116", "2.5"},
                {"1 Sliced Ham", "34", "9.5"},
                {"1 Bacon Strip", "43", "3"},
                {"1 Sausage", "37", "14"}
        };

        // Column Names
        String[] columnNames = {"Food", "Calories", "Protein in grams"};

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
}