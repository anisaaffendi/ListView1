package sg.edu.rp.c347.id19030019.demolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<Food> {

    private ArrayList<Food> foods;
    private Context context;
    private TextView tvFoodName;
    private ImageView ivStar;

    public FoodAdapter(Context context, int resource, ArrayList<Food> objects){
        super(context, resource, objects);
        //Store the food that is passed to this adapter
        foods = objects;
        //Store Context onject as we would need to use it later
        this.context = context;
    }
    //getView() is the method listView will cll to get the
    //View object evry time ListView needs a row

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //The usual way to get the LayoutInflater object to
        //"inflate" the XML file into View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //"Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        //Get the TextView object
        tvFoodName = (TextView) rowView.findViewById(R.id.tvFoodName);
        //Get the ImageView object
        ivStar = (ImageView) rowView.findViewById(R.id.ivStar);

        //The parameter "position" is the index oof the
        //row ListView is requesting.
        //We get back the food at the same index.
        Food currentFood = foods.get(position);
        //Set the TextView to show the food
        tvFoodName.setText(currentFood.getName());
        //Set the image to star or nostar accordingly
        if(currentFood.isStar()){
            ivStar.setImageResource(R.drawable.star);
        }else{
            ivStar.setImageResource(R.drawable.nostar);
        }
        //Return the nicely done up View to the ListView
        return rowView;
    }
}
