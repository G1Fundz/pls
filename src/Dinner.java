import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Dinner {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    Dinner() {
        // Frame initialization
        f = new JFrame();

        // Frame Title
        f.setTitle("Lunch");

        // Data to be displayed in the JTable
        String[][] data = {
                {"Portion of French Fries", "312", "3.4",},
                {"Chicken Stir Fry with Rice", "342", "15",},
                {"Roast Chicken Pie", "751", "46"},
                {"14 inch Pepperoni Pizza (Thin Crust)" , "1720", "111"},
                {"Chicken & Halloumi  Burger", "737", "39"},
                {"Beef Burritos", "872", "42"},
                {"Chicken Fajitas", "723", "39"},
                {"Spaghetti & Meatballs", "870", "46"}
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