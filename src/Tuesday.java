import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tuesday {
    JFrame f;
    JTable j;

    Tuesday() {

        f = new JFrame();

        f.setTitle("Tuesday");

        String[][] data = {
                {"Breakfast", "Scrambled Eggs on Rye Toast (3 Eggs, 2 Slices of Buttered Rye Toast)", "577", "27"},
                {"", "125ml or 1/2 cup Prune Juice", "94", "1"},
                {"", "", "", ""},
                {"Lunch", "100g/3.5oz (dry weight) Quinoa, cooked", "374", "4"},
                {"", "56g/2oz Buffalo Mozzarella", "159", "2"},
                {"", "28g/1oz Toasted Pine Nuts", "151", "4"},
                {"", "1 large handful of Baby Spinach, 1 tbsp Olive Oil, 1 bunch fresh Basil", "135", "5"},
                {"", "", "", ""},
                {"Dinner", "125g/4.5oz Whole Wheat Spelt Penne", "420", "18"},
                {"", "Shrimp & Cherry Tomato Sauce: 100g/3.5oz Shrimp, 85g Cherry Tomatoes, 1 tbsp Olive Oil, 2 tbsp chopped Parsley", "203", "30"},
                {"", "Salad: 1/2 bag Mixed Salad, 1 tbsp Olive Oil, 1 tsp Balsamic Vinegar", "133", "1"},
                {"", "", "", ""},
                {"Snacks/Desserts", "28g/1oz Pumpkin Seeds", "166", "5"},
                {"", "1 Pear", "60", "0.6"},
                {"", "3 tbsp Hummus", "120", "3"},
                {"", "Smoothie: Blend 1/2 Banana, 1 tbsp Almond Butter, a large handful of Blueberries, 150g/5oz Whole Milk Yoghurt", "302", "31"},
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