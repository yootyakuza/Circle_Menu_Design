package com.example.qq.circle_menu_design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CircleMenuLayout mCircleMenuLayout;
    private String[] mItemTexts = new String[] { "A", "B", "C","D", "E", "F","G","H" };
    private int[] mItemImgs = new int[] { R.drawable.star,
            R.drawable.star, R.drawable.warning,
            R.drawable.star, R.drawable.warning,
            R.drawable.star,R.drawable.warning,R.drawable.star};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCircleMenuLayout = findViewById(R.id.id_menulayout);
        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);

        mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener()
        {

            @Override
            public void itemClick(View view, int pos)
            {
                Toast.makeText(MainActivity.this, mItemTexts[pos],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void itemCenterClick(View view)
            {
                Toast.makeText(MainActivity.this,"you can do something just like ccb  ",Toast.LENGTH_SHORT).show();
            }
        });
    }
}