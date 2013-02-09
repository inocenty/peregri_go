package com.peregri.peregrigo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.TextView;

import com.peregri.peregrigo.R;

public class Podsumowanie extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podsumowanie);

        ((TextView) findViewById(R.id.opis_punktu)).setMovementMethod(new ScrollingMovementMethod());
        
    }

	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_podsumowanie, menu);
        return true;
    }
    
    
    
}
