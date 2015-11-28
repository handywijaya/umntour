package com.example.daniel.firman.handy.umntour_12110110074_12110110076_12110110097;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class Lantai_6_1 extends Activity {

    public ImageView ivStairsDown, ivStairsUp, ivMoveForward, ivMoveBackward, ivMoveToilet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lantai_6_1);

        ivStairsDown = (ImageView) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This stairs connects the 5th floor and the 3rd floor of tower C.",Toast.LENGTH_SHORT).show();
            }
        });

        ivStairsUp = (ImageView) findViewById(R.id.ivStairUp);
        ivStairsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This stairs moves you to the 6th floor of tower C", Toast.LENGTH_SHORT).show();
            }
        });

        ivMoveForward = (ImageView) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_3.class);
                startActivity(i);
                finish();
            }
        });

        ivMoveBackward = (ImageView) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_8.class);
                startActivity(i);
                finish();
            }
        });

        ivMoveToilet = (ImageView) findViewById(R.id.ivMoveToilet);
        ivMoveToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_2.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lantai_6_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
