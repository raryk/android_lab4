package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.CheckBox;

import android.widget.EditText;

import android.widget.ImageView;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String getName() {
        EditText editText = (EditText) findViewById((R.id.name));
        String name = editText.getText().toString();

        return name;
    }
    public boolean onCheckOne(View view) {
        CheckBox check = findViewById(R.id.checkBoxOne);
        boolean isCheck = check.isChecked();
        return isCheck;
    }
    public boolean onCheckTwo(View view) {
        CheckBox check = findViewById(R.id.checkBoxTwo);
        boolean isCheck2 = check.isChecked();
        return isCheck2;
    }
    public boolean onCheckThree(View view) {
        CheckBox check = findViewById(R.id.checkBoxFour);
        boolean isCheck4 = check.isChecked();
        return isCheck4;
    }
    public boolean onCheckFour(View view) {
        CheckBox check = findViewById(R.id.checkBoxFive);
        boolean isCheck5 = check.isChecked();
        return isCheck5;
    }
    private String inCheckBox(View view) {
        String result;
        if(onCheckOne(view)) {
            result="еко";
        } else if (onCheckTwo(view)) {
            result="цегляний";
        } else {
            result="газобетонний";
        }
        return result;
    }
    private String inCheckBoxTwo(View view) {
        String result;
        if(onCheckThree(view)) {
            result="Рококо";
        } else if (onCheckFour(view)){
            result="Модернізм";
        } else {
            result="Хай-тек";
        }
        return result;
    }
    public void house(View view) {
        ImageView beforehouseImageView = (ImageView)
                findViewById(R.id.android_house_image_view);
        beforehouseImageView.setImageResource(R.drawable.after);
        TextView statusInitialTextView = (TextView)
                findViewById(R.id.status_text_view);
        statusInitialTextView.setText(getName() +" Ваш будинок готовий.");
        TextView statusInitialTextViewTwo = (TextView)
                findViewById(R.id.status_text_viewTwo);
        statusInitialTextViewTwo.setText("Це " + inCheckBox(view) + " будинок. У стилі " + inCheckBoxTwo(view));
    }
}