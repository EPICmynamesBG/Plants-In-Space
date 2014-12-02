package honr.gamedesign.plantsinspace.activities;

import honr.gamedesign.plantsinspace.R;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity{
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setFullScreen();
		
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
			
		}
	};
}
