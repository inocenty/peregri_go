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

public class ZlyPunkt extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zly_punkt);

        ((TextView) findViewById(R.id.opis_punktu)).setMovementMethod(new ScrollingMovementMethod());
        ((Button) findViewById(R.id.but_dalej)).setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	
		    	Intent newActivity = new Intent(ZlyPunkt.this, OknoGlowne.class);
		    	startActivity(newActivity);
		    	finish();
		    }
        });
        
    }

	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_zly_punkt, menu);
        return true;
    }
    
    
    
}
