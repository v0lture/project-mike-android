package com.v0lture.projectmike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
com.google.firebase.iid.FirbaseListAdapter<String> myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRef
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
  /*  public boolean onOptionsItemSelected (final MenuItem Item){
         switch(Item.getItemId()) {
             case findViewById(R.id.me) :


        }
    }*/
}
