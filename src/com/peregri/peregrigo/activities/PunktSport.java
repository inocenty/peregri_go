package com.peregri.peregrigo.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.peregri.peregrigo.R;

public class PunktSport extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punkt_sport);

        ((TextView) findViewById(R.id.opis_punktu)).setMovementMethod(new ScrollingMovementMethod());
        ((Button) findViewById(R.id.but_dalej)).setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	
		    	Intent newActivity = new Intent(PunktSport.this, OknoGlowne.class);
		    	startActivity(newActivity);
		    	finish();
		    }
        });
        
    }

	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_punkt_sport, menu);
        return true;
    }
    
    
    
}
