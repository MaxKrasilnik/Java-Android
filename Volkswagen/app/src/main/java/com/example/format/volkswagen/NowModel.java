package com.example.format.volkswagen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Format on 09.12.2018.
 */

public class NowModel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_model);
    }

    public void onClickNowModel(View view)
    {
        ImageView imgNow = (ImageView)view;
        ImageView img =(ImageView)findViewById(R.id.imgBtnNowGolf);

        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(NowModel.this, Golf.class);
            startActivity(intent);
        }

        img =(ImageView)findViewById(R.id.imgBtnNowPolo);

        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(NowModel.this, Polo.class);
            startActivity(intent);
        }

        img =(ImageView)findViewById(R.id.imgBtnNowTiguan);

        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(NowModel.this, Tiguan.class);
            startActivity(intent);
        }
    }
}
