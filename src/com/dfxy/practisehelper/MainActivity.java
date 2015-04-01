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
		//获取对象  
        tabHost = getTabHost();  
          
         
        tabHost.addTab(tabHost.newTabSpec("index")  
                .setIndicator("BMI计算")  
                .setContent(new Intent(this, a.class)));  
        tabHost.addTab(tabHost.newTabSpec("center")  
                .setIndicator("锻炼提醒")  
                .setContent(new Intent(this, b.class))); 
        tabHost.addTab(tabHost.newTabSpec("self")  
                .setIndicator("计步器")  
                .setContent(new Intent(this, c.class))); 
          
        
        //指定的当前的tab  
        //通过索引指定  索引从0开始  
        //即一开始要显示的是哪一页
        tabHost.setCurrentTab(0); //从零开始  
		
	}

}
