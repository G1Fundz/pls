import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Friday {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    Friday() {
        // Frame initialization
        f = new JFrame();

        // Frame Title
        f.setTitle("Friday");

        // Data to be displayed in the JTable
        String[][] data = {
                {"Breakfast", "2 slices Wheat Toast", "139", "7"},
                {"", "3 tbsp Peanut Butter", "400", "12"},
                {"", "Large bowl of Fruit Salad", "250", "1"},
                {"", "", "", ""},
                {"Lunch", "Lentil & Avocado Salad ", "294", "7"},
                {"", "28g Toasted Pine Nuts", "151", "4"},
                {"", "", "", ""},
                {"Dinner", "100g Soba Noodles", "330", "5"},
                {"", "100g Firm Tofu", "129", "17"},
                {"", "56g Cashew Nuts, 1 tbsp Sesame Oil, 50g Broccoli, 50g Baby Corn", "496", "15"},
                {"", "", "", ""},
                {"Snacks/Desserts", "1/3 tub of Hummus", "330", "2"},
                {"", "Oatmeal Raisin Cliff Bar", "240", "10"},
                {"", "", "", ""}





        };

        // Names
        String[] columnNames = {"Meal", "Food", "Calories", "Protein in grams"};

        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(1400, 350);
        f.setVisible(true);
    }
}

