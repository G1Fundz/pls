import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Monday {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    Monday() {
        // Frame initialization
        f = new JFrame();

        // Frame Title
        f.setTitle("Monday");

        // Data to be displayed in the JTable
        String[][] data = {
                {"Breakfast", "75g/2.65oz Granola", "368", "8"},
                {"", "100g/3.5oz Greek Yogurt", "120", "10"},
                {"", "Topping: 28g/1oz chopped Brazil Nuts", "184", "4"},
                {"", "Topping: 1 handful each of Blueberries and Raspberries", "50", "1"},
                {"", "", "", ""},
                {"Lunch", "2 Whole Wheat Pita Breads", "308", "12"},
                {"", "100g/3.5oz Roast Chicken", "190", "31"},
                {"", "1 medium Avocado, sliced or mashed", "322", "3"},
                {"", "", "", ""},
                {"Dinner", "140g/5oz Salmon Fillet", "275", "30"},
                {"", "100g/3.5oz Brown Basmati Rice (dry weight)", "360", "9"},
                {"", "Tahini Broccoli - 85g/3oz", "239", "6"},
                {"", "80g (2.8oz) Green Peas", "55", "4"},
                {"", "", "", ""},
                {"Snacks/Desserts", "Medium Banana", "105", "1.3"},
                {"", "2 Oatcakes", "90", "6"},
                {"", "1 Nectarine", "62", "1"},
                {"", "1 tablespoon Peanut Butter", "94", "4"},
                {"", "50g/1.75oz Trail Mix", "250", "7"},
                {"", "", "", ""}

        };

        // Column Names
        String[] columnNames = {"Meal", "Food", "Calories", "Protein in grams"};

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(1200, 400);
        // Frame Visible = true
        f.setVisible(true);
    }
}