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

public class Lantai_6_4 extends Activity {

    ImageView ivMoveLeft, ivMoveBackward, ivMoveLift, ivEnter609, ivEnter601;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lantai_6_4);

        ivMoveBackward = (ImageView) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_3.class);
                startActivity(i);
                finish();
            }
        });

        ivMoveLeft = (ImageView) findViewById(R.id.ivMoveLeft);
        ivMoveLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_7.class);
                startActivity(i);
                finish();
            }
        });

        ivMoveLift = (ImageView) findViewById(R.id.ivMoveLift);
        ivMoveLift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_5.class);
                startActivity(i);
                finish();
            }
        });

        ivEnter609 = (ImageView) findViewById(R.id.ivEnter609);
        ivEnter609.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Room 609 = Room 601", Toast.LENGTH_SHORT).show();
            }
        });

        ivEnter601 = (ImageView) findViewById(R.id.ivEnter601);
        ivEnter601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Big_Classroom_Wood.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lantai_6_4, menu);
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
