package honr.gamedesign.plantsinspace.activities;

import honr.gamedesign.plantsinspace.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setFullScreen();
		setContentView(R.layout.main);
		
		
		Button startButton = (Button) findViewById(R.id.startButton);
		startButton.setOnClickListener(startClick);
		
	}

	private void setFullScreen() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
	}
	
	View.OnClickListener startClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent question1 = new Intent(MainActivity.this, Question1Activity.class);
			MainActivity.this.startActivity(question1);
		}
	};
	
	@Override
	public void onBackPressed()
	{
		Intent homeIntent= new Intent(Intent.ACTION_MAIN);
		homeIntent.addCategory(Intent.CATEGORY_HOME);
		homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(homeIntent);
	}
}
