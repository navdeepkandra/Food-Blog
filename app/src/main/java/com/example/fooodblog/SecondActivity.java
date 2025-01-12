package com.example.fooodblog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView locationTextView, restaurantTextView, foodTextView, foodDescriptionTextView;
    ImageView locationImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        locationTextView = findViewById(R.id.locationTextView);
        restaurantTextView = findViewById(R.id.restaurantTextView);
        foodTextView = findViewById(R.id.foodTextView);
        foodDescriptionTextView = findViewById(R.id.foodDescriptionTextView);
        locationImageView = findViewById(R.id.locationImageView);

        // Get the selected location from the intent
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");

        // Update the UI based on the selected location
        locationTextView.setText(location);

        switch (location) {
            case "Pavagada":
                restaurantTextView.setText("Famous Restaurant: Rajanandhan Restaurant");
                foodTextView.setText("Famous Food: Chicken Biryani");
                locationImageView.setImageResource(R.drawable.pavagada_food);  // Add image in res/drawable
                foodDescriptionTextView.setText("Chicken Biryani is a flavorful and aromatic dish made with tender chicken, basmati rice, and a mix of spices. It is often served with raita or salan, making it a favorite across the region.");
                break;

            case "Tiptur":
                restaurantTextView.setText("Famous Restaurant: Annapurna Veg");
                foodTextView.setText("Famous Food: Masala Dosa");
                locationImageView.setImageResource(R.drawable.tiptur_food);  // Add image in res/drawable
                foodDescriptionTextView.setText("Masala Dosa is a famous South Indian dish made of fermented batter. It's crispy on the outside and soft inside, often served with chutney and sambar.");
                break;

            case "Raichur":
                restaurantTextView.setText("Famous Restaurant: Parivar Dhaba");
                foodTextView.setText("Famous Food: Jolada Roti");
                locationImageView.setImageResource(R.drawable.raichur_food);  // Add image in res/drawable
                foodDescriptionTextView.setText("Jolada Roti is a traditional flatbread made from sorghum flour, often served with spicy curries in the Raichur region.");
                break;

            case "Mysore":
                restaurantTextView.setText("Famous Restaurant: Raja Mysore Pak");
                foodTextView.setText("Famous Food: Mysore Pak");
                locationImageView.setImageResource(R.drawable.mysore);  // Add image in res/drawable
                foodDescriptionTextView.setText("Mysore pak is an Indian sweet prepared in ghee. It originated in the city of Mysore, one of the major cities in the Indian state of Karnataka. It is made of generous amounts of ghee, sugar, gram flour, and often cardamom. The texture of this sweet is similar to a buttery and dense cookie.");
                break;

            case "Bengaluru":
                restaurantTextView.setText("Famous Restaurant: Rameshwaram Cafe");
                foodTextView.setText("Famous Food: Filter Coffee");
                locationImageView.setImageResource(R.drawable.bengaluru);  // Add image in res/drawable
                foodDescriptionTextView.setText("Indian filter coffee is a coffee drink made by mixing hot milk and sugar with the infusion obtained by percolation brewing of finely ground coffee powder with chicory in a traditional Indian filter. It has been described as \"hot, strong, sweet and topped with bubbly froth\" and is known as filter kaapi in India.");
                break;

            case "Hyderabad":
                restaurantTextView.setText("Famous Restaurant: Shadhab Hotel");
                foodTextView.setText("Famous Food: Hyderabadi Biryani");
                locationImageView.setImageResource(R.drawable.hyderabad);  // Add image in res/drawable
                foodDescriptionTextView.setText("Hyderabadi biryani (also known as Hyderabadi dum biryani) is a style of biryani originating from Hyderabad, India made with basmati rice and meat (mostly mutton). Originating in the kitchens of the Nizam of Hyderabad, it combines elements of Hyderabadi and Mughlai cuisines.");
                break;

            default:
                restaurantTextView.setText("Famous Restaurant: Unknown");
                foodTextView.setText("Famous Food: Unknown");
                foodDescriptionTextView.setText("No description available.");
                break;
        }
    }
}
