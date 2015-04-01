package com.dfxy.practisehelper;

import android.app.Activity;
import android.os.Bundle;
import java.util.Calendar;

import com.dfxy.practisehelper.AlarmReceiver;
import com.example.testtab.R;
import com.dfxy.practisehelper.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.util.Log;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class b extends Activity implements OnClickListener {
    private Button mb1;
	private Button mb2;
	private Button mb3;
	private Button mb4;
	private Button mb5;
	private Button mc1;
	private Button mc2;
	private Button mc3;
	private Button mc4;
	private Button mc5;
	private Calendar calendar;
	private AlarmManager alarmManager;
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.b);
		alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
		mb1 = (Button) findViewById(R.id.button1);
		mb2 = (Button) findViewById(R.id.button2);
		mb3 = (Button) findViewById(R.id.button3);
		mb4 = (Button) findViewById(R.id.button4);
		mb5 = (Button) findViewById(R.id.button5);
		mb1.setOnClickListener(this);
		mb2.setOnClickListener(this);
		mb3.setOnClickListener(this);
		mb4.setOnClickListener(this);
		mb5.setOnClickListener(this);
		mc1 = (Button) findViewById(R.id.cancel1);
		mc2 = (Button) findViewById(R.id.cancel2);
		mc3 = (Button) findViewById(R.id.cancel3);
		mc4 = (Button) findViewById(R.id.cancel4);
		mc5 = (Button) findViewById(R.id.cancel5);
		mc1.setOnClickListener(this);
		mc2.setOnClickListener(this);
		mc3.setOnClickListener(this);
		mc4.setOnClickListener(this);
		mc5.setOnClickListener(this);
		calendar = Calendar.getInstance();
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.button1:
			setAlrm(1);
			break;
		case R.id.button2:
			setAlrm(2);
			break;
		case R.id.button3:
			setAlrm(3);
			break;
		case R.id.button4:
			setAlrm(4);
			break;
		case R.id.button5:
			setAlrm(5);
			break;
		case R.id.cancel1:
			cancelAlrm(1);
			
			break;
		case R.id.cancel2:
			cancelAlrm(2);
			break;
		case R.id.cancel3:
			cancelAlrm(3);
			break;
		case R.id.cancel4:
			cancelAlrm(4);
			break;
		case R.id.cancel5:
			cancelAlrm(5);
			break;
		default:
			break;
		}

	}

	private void cancelAlrm(int i) {
		jj = i;
		Intent intent = new Intent(b.this,
				AlarmReceiver.class);
		intent.putExtra("jj", jj);
		PendingIntent pendingIntent = PendingIntent
				.getBroadcast(b.this, jj,
						intent, 0);
		alarmManager.cancel(pendingIntent);
		
	}

	public static int jj;

	private void setAlrm(int ii) {
		jj = ii;
		calendar.setTimeInMillis(System.currentTimeMillis());
		new TimePickerDialog(b.this,
				new TimePickerDialog.OnTimeSetListener() {
			public void onTimeSet(TimePicker arg0, int h, int m) {
				// 设置日历的时间，主要是让日历的年月日和当前同步
				calendar.setTimeInMillis(System.currentTimeMillis());
				Log.d("hu",
						"System.currentTimeMillis() = "
								+ System.currentTimeMillis());
				// 设置日历的小时和分钟
				calendar.set(Calendar.HOUR_OF_DAY, h);
				calendar.set(Calendar.MINUTE, m);
				// 将秒和毫秒设置为0
				calendar.set(Calendar.SECOND, 0);
				calendar.set(Calendar.MILLISECOND, 0);
				// 建立Intent和PendingIntent来调用闹钟管理器
				Intent intent = new Intent(b.this,
						AlarmReceiver.class);
				intent.putExtra("jj", jj);
				PendingIntent pendingIntent = PendingIntent
						.getBroadcast(b.this, jj,
								intent, 0);
				// 获取闹钟管理器
				AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
				// 设置闹钟
				Log.d("hu",
						"calendar.getTimeInMillis() = "
								+ calendar.getTimeInMillis());
				alarmManager.set(AlarmManager.RTC_WAKEUP,
						calendar.getTimeInMillis(), pendingIntent);
				// alarmManager.setRepeating(
				// AlarmManager.RTC_WAKEUP,
				// calendar.getTimeInMillis(), 10 * 1000,
				// pendingIntent);
				Toast.makeText(
						b.this,
						"设置闹钟的时间为：" + String.valueOf(h) + ":"
								+ String.valueOf(m), Toast.LENGTH_SHORT)
						.show();
			}
		}, calendar.get(Calendar.HOUR_OF_DAY), calendar
				.get(Calendar.MINUTE), true).show();
}
}