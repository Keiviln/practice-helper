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
				esuggest.setText("���ع��ᣬע��Ӫ����");
			}else if(18.5<=result && result<24){
				esuggest.setText("��ϲ�㣬��������������뱣�֣�");
			}else if(24<=result && result<27){
				esuggest.setText("������ع��أ���Ҫ��ֶ�����");
			}else if(27<=result && result<30){
				esuggest.setText("��ȷ��֣���ע�⣡");
			}else if(30<=result && result<35){
				esuggest.setText("�жȷ��֣�Ҫ�����ˣ���");
			}else{
				esuggest.setText("�ضȷ��֣��þ�ʳ�ˣ�����");
			}
		}
		
	});
}
}
