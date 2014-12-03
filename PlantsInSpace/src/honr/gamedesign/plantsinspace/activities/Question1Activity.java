package honr.gamedesign.plantsinspace.activities;

import honr.gamedesign.plantsinspace.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Question1Activity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setFullScreen();
		setContentView(R.layout.question1);
		
		Button earthButton = (Button) findViewById(R.id.earthButton);
		earthButton.setOnClickListener(earthClick);
		Button spaceButton = (Button) findViewById(R.id.spaceButton);
		spaceButton.setOnClickListener(spaceClick);
		
	}

	private void setFullScreen() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
	}
	
	View.OnClickListener earthClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			MainActivity.responses.growPlantOnEarth();
			Intent nextQuestion = new Intent(Question1Activity.this, Question2Activity.class);
			Question1Activity.this.startActivity(nextQuestion);
		}
	};
	
	View.OnClickListener spaceClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			MainActivity.responses.growPlantInSpace();
			Intent nextQuestion = new Intent(Question1Activity.this, Question2Activity.class);
			Question1Activity.this.startActivity(nextQuestion);
		}
	};
}
