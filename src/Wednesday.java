import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Wednesday {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    Wednesday() {
        f = new JFrame();
        f.setTitle("Wednesday");


        String[][] data = {
                {"Breakfast", "Cinnamon Oatmeal", "543", "11"},
                {"", "Toppings: 28g of Walnuts or Pecans & A Handful Of Blueberries", "208", "24"},
                {"", "", "", ""},
                {"Lunch", "Smoked Mackerel Pâté", "431", "14"},
                {"", "6 Oat Cakes", "270", "18"},
                {"", "1 Apple", "77", "0.3"},
                {"", "", "", ""},
                {"Dinner", "120g Grilled Fillet Steak", "332", "32"},
                {"", "Baked Potato with Garlic Butter", "269", "8"},
                {"", "10g Crushed Walnuts & 10g Crushed Dark Chocolate", "127", "2"},
                {"", "", "", ""},
                {"Snacks/Desserts", "1 small pot Greek Yogurt", "134", "5"},
                {"", "Small Banana, sliced", "72", "1"},
                {"", "Granola Bar", "119", "2"},
                {"", "", "", ""}




        };


        String[] columnNames = {"Meal", "Food", "Calories", "Protein in grams"};


        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(1400, 350);
        f.setVisible(true);
    }
}

