package com.example.broadcastrecapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BroadcastActivity extends Activity {
EditText et1;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
        et1=(EditText) findViewById(R.id.editText1);
    }
    public void msg(View v){
    	String m=et1.getText().toString();
    	Intent i=new Intent("myreceiver");
    	Bundle b=new Bundle();
    	b.putString("msg", m);
    	i.putExtras(b);
    	i.setAction("mycustomrec");
    	sendBroadcast(i);
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.broadcast, menu);
        return true;
    }
    
}
