package com.dfxy.practisehelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.example.testtab.R;
import com.dfxy.practisehelper.d;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class d extends Activity implements OnClickListener {
    private Button mb1;
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.d);
		mb1 = (Button) findViewById(R.id.button1);
        mb1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(d.this, c.class);
                startActivity(intent);
            }
        });
	}

public void onClick(View v) {
	// TODO Auto-generated method stub
	
}
}