package com.example.a2015041040__hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import  android.view.MenuItem;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 레이아웃 생성
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(1, 001, 0, "강아지");
        menu.add(1, 002, 0, "고양이");
        menu.add(1, 003, 0, "토끼");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Drawable drawable;
        ImageView imageView = new ImageView(getBaseContext());
        switch (item.getItemId()) {
            case 001:
                drawable = getResources().getDrawable(R.drawable.dog);
                imageView.setImageDrawable(drawable);
                setContentView(imageView);
                return true;
            case 002:
                drawable = getResources().getDrawable(R.drawable.cat);
                imageView.setImageDrawable(drawable);
                setContentView(imageView);
                return true;
            case 003:
                drawable = getResources().getDrawable(R.drawable.rabbit);
                imageView.setImageDrawable(drawable);
                setContentView(imageView);
                return true;
        }
        return true;
    }
}
