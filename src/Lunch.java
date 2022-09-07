import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lunch {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    Lunch() {
        // Frame initialization
        f = new JFrame();

        // Frame Title
        f.setTitle("Lunch");

        // Data to be displayed in the JTable
        String[][] data = {
                {"100g of Ground Beef ", "250", "26",},
                {"(1 cup) 150 grams of rice", "204", "4.1",},
                {"(6oz) 170 gram fillet of salmon", "250", "34"},
                {"Avocado Salad", "460", "21"},
                {"Pesto Grilled Cheese", "781", "34"},
                {"Chicken Fajita Meal", "654", "36"},
                {"100g of Mac & Cheese", "164", "7"},
                {"Garlic Butter Pasta", "281", "10"}
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