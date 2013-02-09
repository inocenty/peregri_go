package com.peregri.peregrigo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class OknoGlowne extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okno_glowne);

		((Button) findViewById(R.id.skanuj)).setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	 Intent qrDroid = new Intent( "la.droid.qr.scan" );
		    	 qrDroid.putExtra( "la.droid.qr.complete" , true);
		    	 startActivityForResult(qrDroid, 0);
		    }
		  });
        
    }

	@Override
	/**
	 * Reads data scanned by user and returned by QR Droid
	 */
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
//		if( ACTIVITY_RESULT_QR_DRDROID==requestCode && null!=data && data.getExtras()!=null ) {
		if(null!=data && data.getExtras()!=null ) {
			String result = data.getExtras().getString("la.droid.qr.result");
			//Just set result to EditText to be able to view it
			TextView resultTxt = ( TextView ) findViewById(R.id.czas_label);
			resultTxt.setText( result );
			resultTxt.setVisibility(View.VISIBLE);
		}
	}
		
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_okno_glowne, menu);
        return true;
    }
    
    
    
}
