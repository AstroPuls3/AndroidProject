package com.btse.tomabot.icecreamfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindIceCreamActivity extends AppCompatActivity {

    private IceCreamExpert expert = new IceCreamExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ice_cream);
    }

    public void onClickFindIceCream(View view) {
        // get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.flavors);

        // get a reference to the Spinner
        Spinner iceCreamMakers = (Spinner)  findViewById(R.id.ice_cream_makers);

        // get the selected item in the spinner
        String stringIceCreamType = String.valueOf(iceCreamMakers.getSelectedItem());

        // get recommendations from the iceCreamExpert
        List<String> flavorsList = expert.getBrands(stringIceCreamType);
        StringBuilder typeFormatted = new StringBuilder();
        for(String flavor : flavorsList) {
            typeFormatted.append(flavor).append('\n');
        }
        brands.setText(typeFormatted);
    }
}
