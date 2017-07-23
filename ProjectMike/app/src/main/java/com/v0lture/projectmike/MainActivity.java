package com.v0lture.projectmike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

//import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


//    private static final int SIGN_IN_REQUEST_CODE = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* if(FirebaseAuth.getInstance().getCurrentUser()==null){
            //Start sign In - Sign Up Activity
            startActivityForResult(
                    AuthUI.getInstance().createSignInIntentBuilder().build(),SIGN_IN_REQUEST_CODE
            );
        }else{
            //User already in,
            //Display Welcome
            Toast.makeText(this, "Welcome"+ FirebaseAuth.getInstance().getCurrentUser().getDisplayName(),Toast.LENGTH_LONG).show();
            //Load Chat
            displayMessages();
        }*/
    }

    private void displayMessages(){

    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode == SIGN_IN_REQUEST_CODE){
            if(resultCode == RESULT_OK){
                Toast.makeText(this, "Successfully signed in. Welcome!",Toast.LENGTH_LONG).show();
                displayMessages();
            }else{
                Toast.makeText(this, "Sorry, we couldn't sign you in. Please Try again later.", Toast.LENGTH_LONG).show();
                //Close
                finish();
            }
        }
    }*/



    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected (final MenuItem Item){
         switch(Item.getItemId()) {
             case R.id.me:
                 return true;
             case R.id.you:
                 return true;
             default:
                 return super.onOptionsItemSelected(Item);
        }
    }
}
