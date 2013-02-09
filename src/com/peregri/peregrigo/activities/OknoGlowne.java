package com.peregri.peregrigo.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.peregri.peregrigo.R;

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
		((Button) findViewById(R.id.but_zakoncz)).setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    finish();
		    }
		  });

		
    }

	@Override
	/**
	 * Reads data scanned by user and returned by QR Droid
	 */
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
//		TODO: oryginalnie powinniśmy sprawdzać exit-code: if( ACTIVITY_RESULT_QR_DRDROID==requestCode && null!=data && data.getExtras()!=null ) {
		if(null!=data && data.getExtras()!=null ) {
			String result = data.getExtras().getString("la.droid.qr.result");
			
			//tutaj sprawdzamy, czy kod jest właściwy dla następnego punktu.
			//Jeżeli tak, to wyświetlamy ekran właściwy dla typu trasy (sport, spacer, edu)
			//Jeżeli nie ta kolejność, to wyświetlamy ekran "zla kolejność"
			//Jeżeli to zły punkt (lub poprzedni, już zaliczony), to wyświetlamy ekran "zły punkt"
		    Intent newActivity = new Intent(OknoGlowne.this, PunktEdu.class);
		    startActivity(newActivity);
		    finish();
	
		}
	}
		
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_okno_glowne, menu);
        return true;
    }
    
    
    
}
