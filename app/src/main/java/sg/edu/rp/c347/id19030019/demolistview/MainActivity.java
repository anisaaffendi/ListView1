package sg.edu.rp.c347.id19030019.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Food> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvFood);

        //Create a few food in Food array
        foods = new ArrayList<>();
        foods.add(new Food("Ah Lat Coffee", false));
        foods.add(new Food("Rocky Choc", true));
        foods.add(new Food("Kid Cat Choc", true));

        //Link this Actiivity object, the row.xml layout for
        //each row and the food String array together
        aa = new FoodAdapter(this, R.layout.row, foods);
        lv.setAdapter(aa);
    }
}