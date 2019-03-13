package com.example.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    Button button;
    Random random;
    Integer [] image = {
            R.drawable.up,
            R.drawable.down,
            R.drawable.left,
            R.drawable.right
    };
    int pickedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview =(ImageView)findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);
        random = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageview.setImageResource(image[random.nextInt(image.length)]);
            }
        });
    }
}
