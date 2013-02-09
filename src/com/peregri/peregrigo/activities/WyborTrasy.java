package com.peregri.peregrigo.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.peregri.peregrigo.R;

public class WyborTrasy extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wybor_trasy);
		((Button) findViewById(R.id.but_start)).setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    Intent newActivity = new Intent(WyborTrasy.this, OknoGlowne.class);
		    startActivity(newActivity);
		    finish();
		    }
		  });

        
    }

	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_wybor_trasy, menu);
        return true;
    }
    
    
    
}
