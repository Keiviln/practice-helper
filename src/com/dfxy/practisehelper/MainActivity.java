package com.dfxy.practisehelper;



import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	public TabHost tabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//��ȡ����  
        tabHost = getTabHost();  
          
         
        tabHost.addTab(tabHost.newTabSpec("index")  
                .setIndicator("BMI����")  
                .setContent(new Intent(this, a.class)));  
        tabHost.addTab(tabHost.newTabSpec("center")  
                .setIndicator("��������")  
                .setContent(new Intent(this, b.class))); 
        tabHost.addTab(tabHost.newTabSpec("self")  
                .setIndicator("�Ʋ���")  
                .setContent(new Intent(this, c.class))); 
          
        
        //ָ���ĵ�ǰ��tab  
        //ͨ������ָ��  ������0��ʼ  
        //��һ��ʼҪ��ʾ������һҳ
        tabHost.setCurrentTab(0); //���㿪ʼ  
		
	}

}
