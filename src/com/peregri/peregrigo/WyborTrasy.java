package com.peregri.peregrigo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class WyborTrasy extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wybor_trasy);

        
    }

	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_wybor_trasy, menu);
        return true;
    }
    
    
    
}
