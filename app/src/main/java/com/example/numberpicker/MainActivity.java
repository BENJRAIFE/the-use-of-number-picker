package com.example.numberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private NumberPicker nmPicker_qte,nmPicker_prdt;
private TextView qte1,pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //l'accée aux éléments
        nmPicker_qte=findViewById(R.id.numberPicker_qte);
        nmPicker_prdt=findViewById(R.id.numberPicker_prdt);
        qte1=findViewById(R.id.textView_qte);
        pd=findViewById(R.id.textprd);

        //quantity
        nmPicker_qte.setMinValue(1);
        nmPicker_qte.setMaxValue(100);

        nmPicker_qte.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int old, int jdida) {
                qte1.setText(R.string.affichage_quntity+jdida);
            }
        });
        // products
        final String []produit={"pianneau","smartphone","tebla","scanner"};
        nmPicker_prdt.setMinValue(0);
        nmPicker_prdt.setMaxValue(produit.length-1);
        nmPicker_prdt.setDisplayedValues(produit);
        nmPicker_prdt.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldValue, int ValueJdida) {
             pd.setText(R.string.afficher_prduit+produit[ValueJdida]);
            }
        });
    }
}