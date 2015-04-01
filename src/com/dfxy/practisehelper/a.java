package com.dfxy.practisehelper;

import android.app.Activity;
import android.os.Bundle;
import java.text.DecimalFormat;

import com.example.testtab.R;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class a extends Activity {
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.a);
    Button btn=(Button)findViewById(R.id.count);
    btn.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			double eheight;
			double eweight;
			double result;
			EditText text1;
			EditText text2;
			TextView ehealth;
			TextView esuggest;
			text1=(EditText)findViewById(R.id.eheight);
	        text2=(EditText)findViewById(R.id.eweight);
	        eheight=Double.parseDouble(text1.getText().toString());
	        eweight=Double.parseDouble(text2.getText().toString());
	        ehealth=(TextView)findViewById(R.id.ehealth);
	        esuggest=(TextView)findViewById(R.id.esuggest);
	        result=eweight/(eheight*eheight)*10000;
	        DecimalFormat df=new DecimalFormat("0.0");
	        String s=df.format(result);
			ehealth.setText(s);
			if(result<18.5){
				esuggest.setText("体重过轻，注意营养！");
			}else if(18.5<=result && result<24){
				esuggest.setText("恭喜你，你的体重正常，请保持！");
			}else if(24<=result && result<27){
				esuggest.setText("你的体重过重，还要坚持锻炼！");
			}else if(27<=result && result<30){
				esuggest.setText("轻度肥胖，请注意！");
			}else if(30<=result && result<35){
				esuggest.setText("中度肥胖，要减肥了！！");
			}else{
				esuggest.setText("重度肥胖，该绝食了！！！");
			}
		}
		
	});
}
}
