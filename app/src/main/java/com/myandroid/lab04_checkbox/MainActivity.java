package com.myandroid.lab04_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mPrice=5;
    private int mQuanity=0;
    private StringBuilder sb= new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  private void displayQuantity() {
        TextView quantityTextView=(TextView)findViewById(R.id.totalquantity);
        quantityTextView.setText(String.valueOf(mQuanity));
    }

    public void decrement(View view) {
        if(mQuanity>0){--mQuanity;
        displayQuantity();}
    }

    public void increment(View view) {
        ++mQuanity;
        displayQuantity();
    }

    public void clickToppings(View view) {
        CheckBox checkBox=findViewById(R.id.toppings_checkbox);
        if(checkBox.isChecked()){
            System.out.println("有勾");
    }else {
            System.out.println("沒有勾");}}

    public void submitorder(View view) {

        int totalprice= mPrice * mQuanity;
        System.out.println(totalprice);
    }
}
