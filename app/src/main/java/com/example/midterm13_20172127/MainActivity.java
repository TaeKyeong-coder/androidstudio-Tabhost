package com.example.midterm13_20172127;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    RadioGroup rGroup;
    RadioButton catBtn, dogBtn, horseBtn, rabbitBtn;
    Button displayBtn;
    ImageView imageView;
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost.TabSpec tabSpecTab1 = tabHost.newTabSpec("TAB1").setIndicator("선호도조사");
        tabSpecTab1.setContent(R.id.tab1);
        tabHost.addTab(tabSpecTab1);

        TabHost.TabSpec tabSpecTab2 = tabHost.newTabSpec("TAB2").setIndicator("통계");
        tabSpecTab2.setContent(R.id.tab2);
        tabHost.addTab(tabSpecTab2);

        TabHost.TabSpec tabSpecTab3 = tabHost.newTabSpec("TAB3").setIndicator("결과");
        tabSpecTab3.setContent(R.id.tab3);
        tabHost.addTab(tabSpecTab3);

        TabHost.TabSpec tabSpecTab4 = tabHost.newTabSpec("TAB4").setIndicator("SETTING");
        tabSpecTab4.setContent(R.id.tab1);
        tabHost.addTab(tabSpecTab4);

        tabHost.setCurrentTab(0);

        rGroup = (RadioGroup)findViewById(R.id.rGroup);
        catBtn = (RadioButton)findViewById(R.id.catBtn);
        dogBtn = (RadioButton)findViewById(R.id.dogBtn);
        horseBtn = (RadioButton)findViewById(R.id.horseBtn);
        rabbitBtn = (RadioButton)findViewById(R.id.rabbitBtn);
        displayBtn = (Button)findViewById(R.id.displayBtn);
        imageView = (ImageView)findViewById(R.id.imageView);

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.catBtn){
                    imageView.setImageResource(R.drawable.cat);
                }
                else if(i==R.id.dogBtn){
                    imageView.setImageResource(R.drawable.dog);
                }
                else if(i==R.id.horseBtn){
                    imageView.setImageResource(R.drawable.horse);
                }
                else{
                    imageView.setImageResource(R.drawable.rabbit);
                }
            }
        });

        displayBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                switch(rGroup.getCheckedRadioButtonId()){
                    case R.id.catBtn : imageView.setImageResource(R.drawable.cat);
                    break;
                    case R.id.dogBtn: imageView.setImageResource(R.drawable.dog);
                    break;
                    case R.id.horseBtn : imageView.setImageResource(R.drawable.horse);
                    break;
                    case R.id.rabbitBtn : imageView.setImageResource(R.drawable.rabbit);
                    break;
                }
            }
        });
    }

}