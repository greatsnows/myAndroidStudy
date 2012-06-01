package overheat.study;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;

public class Activity15 extends Activity {
	private	ProgressBar firstBar = null;
	private	ProgressBar secondBar = null;
	private	Button	myButton = null;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        firstBar = (ProgressBar)findViewById(R.id.firstBar);
        secondBar = (ProgressBar)findViewById(R.id.secondBar);
        myButton = (Button)findViewById(R.id.myButton);
    }
    class ButtonListener implements OnClickListener{
    	@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
    }
}