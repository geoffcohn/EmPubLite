package com.commonsware.empublite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.view.ViewPager;

public class EmPubLiteActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        pager = (ViewPager)findViewById(R.id.pager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return(super.onCreateOptionsMenu(menu));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                return(true);

            case R.id.about:
                Intent i=new Intent(this, SimpleContentActivity.class);
                startActivity(i);

                return(true);

            case R.id.help:
                i=new Intent(this, SimpleContentActivity.class);
                startActivity(i);

                return(true);
        }
        return(super.onOptionsItemSelected(item));
    }

    private ViewPager pager = null;
}