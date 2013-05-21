package it.ipero.peppersworld;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.view.Menu;

public class PeppersWorldMainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
		
	}


}
