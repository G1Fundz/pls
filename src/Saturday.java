import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Saturday {

    JFrame f;
    JTable j;


    Saturday() {

        f = new JFrame();

        f.setTitle("Saturday");

        String[][] data = {
                {"Breakfast", "Bircher Muesli (200g Greek Yogurt,80g cup Oats,50g Hazelnuts,028g  Raisins,1 Apple Grated", "1036", "39"},
                {"", "1 Glass Grape Juice", "125", "1"},
                {"", "", "", ""},
                {"Lunch", "Salad (1/2 Avocado,85g Char Grilled Artichokes,28g Pine Nuts,28g Pumpkin Seeds", "791", "14"},
                {"", "56g Feta", "140", "8"},
                {"", "Buttered Wheat Roll", "242", "2"},
                {"", "", "", ""},
                {"Dinner", "Bolognaise (150g Beef Mince)", "563", "22"},
                {"", "100g Whole Wheat Spaghetti", "350", "13"},
                {"", "20g Parmesan", "80", "8"},
                {"", "55g Green Salad,1 tbsp Olive Oil and Lemon Juice", "130", "1"},
                {"", "50g Dark Chocolate", "265", "15"},
                {"", "", "", ""},
                {"Snacks/Desserts", "56g Granola", "277", "6"},
                {"", "125ml Cup Whole Milk", "73", "4"},
                {"", "28g Almonds", "164", "6"},
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

