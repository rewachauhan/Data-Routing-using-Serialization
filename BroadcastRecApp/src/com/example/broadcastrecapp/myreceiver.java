package com.example.broadcastrecapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class myreceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		Bundle b=arg1.getExtras();
		String str=b.getString("msg1");
		Toast.makeText(arg0,str, Toast.LENGTH_LONG).show();
	}

}
