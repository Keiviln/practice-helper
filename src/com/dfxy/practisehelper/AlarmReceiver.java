package com.dfxy.practisehelper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class AlarmReceiver extends BroadcastReceiver {

	public void onReceive(Context context, Intent data) {
		Log.d("hu","its time " + data.getIntExtra("jj", -1));
		AlarmAlertWakeLock.acquireCpuWakeLock(context);
		Intent intent = new Intent(context, showactivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		intent.putExtra("jj", data.getIntExtra("jj", -1));
		context.startActivity(intent);
		
		
	}
}
