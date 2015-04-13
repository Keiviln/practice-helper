package com.dfxy.practisehelper;

import android.app.Service;
import android.speech.tts.TextToSpeech;
import android.text.format.Time;

public class Utils implements TextToSpeech.OnInitListener {
    private static Utils instance = null;

    private Utils() {
    }
     
    public static Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }
    
    public void setService(Service service) {
    }
    
    /********** SPEAKING **********/
    

    /********** Time **********/
    
    public static long currentTimeInMillis() {
        Time time = new Time();
        time.setToNow();
        return time.toMillis(false);
    }

	@Override
	public void onInit(int status) {
		// TODO Auto-generated method stub
		
	}
}
