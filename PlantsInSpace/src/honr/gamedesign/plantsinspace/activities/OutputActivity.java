package honr.gamedesign.plantsinspace.activities;

import honr.gamedesign.plantsinspace.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class OutputActivity extends Activity{

	boolean onEarth=MainActivity.responses.getQuestion1Respose();
	boolean withLight=MainActivity.responses.getQuestion2Response();
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setFullScreen();
		setContentView(R.layout.output);
		//setBackground();
		getPlant();
		
		
		Button exitButton = (Button) findViewById(R.id.exit);
		exitButton.setOnClickListener(exitClick);
		Button againButton = (Button) findViewById(R.id.tryAgain);
		againButton.setOnClickListener(againClick);
	}

	private void setFullScreen() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
	}
	
	View.OnClickListener exitClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent exitGame = new Intent(OutputActivity.this, MainActivity.class);
			OutputActivity.this.startActivity(exitGame);
		}
	};
	
	View.OnClickListener againClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent playAgain = new Intent(OutputActivity.this, Question1Activity.class);
			OutputActivity.this.startActivity(playAgain);
		}
	};
	
	private void getPlant(){
		Drawable newPlant;
		ImageView plant = (ImageView) findViewById(R.id.plant);
		TextView output= (TextView) findViewById(R.id.ouputText);
		
		if(onEarth && withLight){
			newPlant=getResources().getDrawable(R.drawable.seedling_6);
			output.setText(R.string.medLargePlant);
		}
		else if(onEarth && !withLight){
			newPlant=getResources().getDrawable(R.drawable.seedling_4);
			output.setText(R.string.regPlant);
		}
		else if(!onEarth && withLight){
			newPlant=getResources().getDrawable(R.drawable.seedling_8);
			output.setText(R.string.bigPlant);
		}
		else if(!onEarth && !withLight){
			newPlant=getResources().getDrawable(R.drawable.seedling_2);
			output.setText(R.string.smallPlant);
		}
		else{
			newPlant=getResources().getDrawable(R.drawable.plantsinspacetext);
			output.setText(R.string.errorPlant);
		}
		plant.setImageDrawable(newPlant);
		plant.invalidate();
	}

	
	@SuppressWarnings("unused")
	private void setBackground(){
		Drawable newBackground;
		RelativeLayout background=(RelativeLayout) findViewById(R.layout.output);
		if(onEarth && withLight){
			newBackground=getResources().getDrawable(R.drawable.dirt);
		}
		else if(onEarth && !withLight){
			newBackground=getResources().getDrawable(R.drawable.dirt);
		}
		else if(!onEarth && withLight){
			newBackground=getResources().getDrawable(R.drawable.outerspace);
		}
		else if(!onEarth && !withLight){
			newBackground=getResources().getDrawable(R.drawable.outerspace);
		}
		else{
			newBackground=getResources().getDrawable(R.drawable.dirt);
		}
		background.setBackground(newBackground);;
		background.invalidate();
	}
}
	

