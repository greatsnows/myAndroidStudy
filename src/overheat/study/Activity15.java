package overheat.study;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Activity15 extends Activity {
	private	ProgressBar firstBar = null;
	private	ProgressBar secondBar = null;
	private	Button	myButton = null;
	private int i = 0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        firstBar = (ProgressBar)findViewById(R.id.firstBar);
        secondBar = (ProgressBar)findViewById(R.id.secondBar);
        myButton = (Button)findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {
			
        	public void onClick(View v) {
    			// TODO Auto-generated method stub
    			if(i == 0)
    			{
    				firstBar.setVisibility(View.VISIBLE);
    				secondBar.setVisibility(View.VISIBLE);

    			}
    			else if (i<firstBar.getMax())
    			{
    				firstBar.setProgress(i);
    				firstBar.setSecondaryProgress(i+10);
    				secondBar.setProgress(i);
    			}
    			else
    			{
    				firstBar.setVisibility(View.GONE);
    				secondBar.setVisibility(View.GONE);
    			}
    			i = i+10;
        	}
        });
    }

}