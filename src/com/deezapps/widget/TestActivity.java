package com.deezapps.widget;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * User: jeanguy@gmail.com
 * Date: Aug 8, 2010
 */
public class TestActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final HorizontalPager pager = (HorizontalPager) findViewById(R.id.pager);
        pager.addOnScrollListener(new HorizontalPager.OnScrollListener() {
            public void onScroll(int scrollX) {
                Log.d("TestActivity", "scrollX=" + scrollX);
            }

            public void onViewScrollFinished(int viewIndex) {
                Log.d("TestActivity", "viewIndex=" + viewIndex);
            }
        });

        Button b = (Button) findViewById(R.id.left);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                pager.scrollLeft();
            }
        });
        b = (Button) findViewById(R.id.right);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                pager.scrollRight();
            }
        });
    }
}
