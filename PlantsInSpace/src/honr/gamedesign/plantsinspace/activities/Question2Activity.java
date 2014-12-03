package honr.gamedesign.plantsinspace.activities;

import honr.gamedesign.plantsinspace.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Question2Activity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setFullScreen();
		setContentView(R.layout.question2);
		
		Button sunButton = (Button) findViewById(R.id.sunlightButton);
		sunButton.setOnClickListener(lightClick);
		Button darkButton = (Button) findViewById(R.id.darkButton);
		darkButton.setOnClickListener(darkClick);
		
	}

	private void setFullScreen() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
	}
	
	View.OnClickListener lightClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			MainActivity.responses.growPlantWithLight();
			Intent loading = new Intent(Question2Activity.this, OutputActivity.class);
			Question2Activity.this.startActivity(loading);
		}
	};
	
	View.OnClickListener darkClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			MainActivity.responses.growPlantInDarkness();
			Intent loading = new Intent(Question2Activity.this, OutputActivity.class);
			Question2Activity.this.startActivity(loading);
		}
	};
}
