package com.wanming_liao.android.geoquiz;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.os.Build;

public class QuizActivity extends ActionBarActivity {

	private Button mTrueButton;
	private Button mFalseButton;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mTrueButton = (Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(QuizActivity.this, R.string.corrected_toast, Toast.LENGTH_SHORT).show();
			}
		});
        mFalseButton = (Button)findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(QuizActivity.this, R.string.incorrected_toast, Toast.LENGTH_SHORT).show();
			}
		});
    }

    

}
