package com.peregri.peregrigo;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class PunktEdu extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punkt_edu);

        ((TextView) findViewById(R.id.opis_punktu)).setMovementMethod(new ScrollingMovementMethod());
        
    }

	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_punkt_edu, menu);
        return true;
    }
    
    
    
}