import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Thursday {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    Thursday() {
        // Frame initialization
        f = new JFrame();

        // Frame Title
        f.setTitle("Thursday");

        // Data to be displayed in the JTable
        String[][] data = {
                {"Breakfast", "HEALTHY VEGETARIAN ENGLISH BREAKFAST:", "", ""},
                {"", "3 Vegetarian Sausages, 2 Grilled Portabella Mushrooms", "", ""},
                {"", "1 large Grilled Tomato, 85g Baked Beans", "373", "36"},
                {"", "2 slices Buttered Wheat Toast", "240", "10"},
                {"", "250ml/1cup Pineapple Juice", "115", "0.5"},
                {"", "", "", ""},
                {"Lunch", "Goat's Cheese", "152", "12"},
                {"", "2 Wheat Pita Breads", "310", "11"},
                {"", "Zucchini & Parmesan Frittata (3 eggs, 1 Sautéed Zucchini, 56g of Parmesan)", "582", "41"},
                {"", "1 Medium Sweet Potato cut into Wedges", "238", "1"},
                {"", "Green Salad, dressed with 1 tbsp Olive Oil and Lemon Juice", "137", "1"},
                {"", "", "", ""},
                {"Snacks/Desserts", "40g Dark Chocolate", "212", "1"},
                {"", "2 tbsp Cream Cheese", "101", "1"},
                {"", "28g Pumpkin Seeds", "166", "5"},
                {"", "2 Rye Crackers", "70", "16"},
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

