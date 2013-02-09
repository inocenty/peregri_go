package com.peregri.peregrigo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class PunktZlaKolejnosc extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punkt_zla_kolejnosc);

        ((TextView) findViewById(R.id.opis_punktu)).setMovementMethod(new ScrollingMovementMethod());
        ((Button) findViewById(R.id.but_opusc)).setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	
		    	// TODO: zanotuj aktualny punkt
		    	
		    	Intent newActivity = new Intent(PunktZlaKolejnosc.this, OknoGlowne.class);
		    	startActivity(newActivity);
		    	finish();
		    }
        });
        ((Button) findViewById(R.id.but_wracam)).setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	
		    	
		    	Intent newActivity = new Intent(PunktZlaKolejnosc.this, OknoGlowne.class);
		    	startActivity(newActivity);
		    	finish();
		    }
        });

        
        
        
    }

	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_punkt_zla_kolejnosc, menu);
        return true;
    }
    
    
    
}
