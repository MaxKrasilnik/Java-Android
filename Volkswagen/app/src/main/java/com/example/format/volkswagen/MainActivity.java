package com.example.format.volkswagen;

import android.app.ListActivity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        ImageView imgNow = (ImageView)view;
        ImageView img =(ImageView)findViewById(R.id.imgBtnBefore);
        ;
        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(MainActivity.this, BeforeWar.class);
            startActivity(intent);
        }

        img =(ImageView)findViewById(R.id.imgBtnFifty);
        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(MainActivity.this, Fifty.class);
            startActivity(intent);
        }

        img =(ImageView)findViewById(R.id.imgBtnSeventy);
        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(MainActivity.this, Seventy.class);
            startActivity(intent);
        }

        img =(ImageView)findViewById(R.id.imgBtnEighty);
        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(MainActivity.this, Eighty.class);
            startActivity(intent);
        }

        img =(ImageView)findViewById(R.id.imgBtnTOne);
        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(MainActivity.this, TOneStart.class);
            startActivity(intent);
        }

        img =(ImageView)findViewById(R.id.imgBtnNow);
        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(MainActivity.this, TOneNow.class);
            startActivity(intent);
        }

        img =(ImageView)findViewById(R.id.imgBtnNowModel);
        if(imgNow.getId()==img.getId())
        {
            Intent intent = new Intent(MainActivity.this, NowModel.class);
            startActivity(intent);
        }
    }
}
