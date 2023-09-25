package com.iamrutudhvaj.dices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView diceImageView1;
    private ImageView diceImageView2;
    private Random random=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImageView1 = findViewById(R.id.image_view_dice1);
        diceImageView2 = findViewById(R.id.image_view_dice2);


        diceImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeDice();
            }
        });

        diceImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeDice();
            }
        });

    }

    private void changeDice(){
        int randomNumber1 = random.nextInt(6)+1;
        int randomNumber2 = random.nextInt(6)+1;

        switch (randomNumber1){
            case 1:
                diceImageView1.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImageView1.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImageView1.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImageView1.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImageView1.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceImageView1.setImageResource(R.drawable.dice_6);
                break;
        }

        switch (randomNumber2){
            case 1:
                diceImageView2.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                diceImageView2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                diceImageView2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                diceImageView2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                diceImageView2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                diceImageView2.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}