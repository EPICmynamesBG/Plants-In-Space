package honr.gamedesign.plantsinspace.activities;

import honr.gamedesign.plantsinspace.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class LoadingActivity extends Activity {

    private ProgressBar mProgress;
    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();
    
    @Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setFullScreen();
		setContentView(R.layout.loading);
		progressBarController();

	}

	private void setFullScreen() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
	}
	
	private void progressBarController(){
		mProgress = (ProgressBar) findViewById(R.id.progressBar);
		

        new Thread(new Runnable() {
            public void run() {
                while (mProgressStatus < 100) {
                    doWork();
                    mProgressStatus++;
                    // Update the progress bar
                    mHandler.post(new Runnable() {
                        public void run() {
                            mProgress.setProgress(mProgressStatus);
                            //mProgress.invalidate();
                        }
                    });
                }
            }

			private void doWork() {
				try {
					wait(50);
				} catch (InterruptedException e) {
					Log.i("Wait error",e.toString());
				}
			}
        }).start();
	}
	
}
