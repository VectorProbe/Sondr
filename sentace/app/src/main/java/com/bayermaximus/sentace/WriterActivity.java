package com.bayermaximus.sentace;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class WriterActivity extends AppCompatActivity {
	
	private ArrayList<HashMap<String, Object>> genres = new ArrayList<>();
	private ArrayList<String> genre = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private EditText edittext1;
	private LinearLayout container;
	private LinearLayout linear5;
	private ScrollView storyScroll;
	private EditText edittext6;
	private LinearLayout props;
	private Button button1;
	private CheckBox checkbox2;
	private TextView textview1;
	private Spinner gerene;
	
	private Intent hi = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.writer);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		edittext1 = findViewById(R.id.edittext1);
		container = findViewById(R.id.container);
		linear5 = findViewById(R.id.linear5);
		storyScroll = findViewById(R.id.storyScroll);
		edittext6 = findViewById(R.id.edittext6);
		props = findViewById(R.id.props);
		button1 = findViewById(R.id.button1);
		checkbox2 = findViewById(R.id.checkbox2);
		textview1 = findViewById(R.id.textview1);
		gerene = findViewById(R.id.gerene);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().length() > 5) {
					if (edittext6.getText().toString().length() > 200) {
						hi.setClass(getApplicationContext(), PropsActivity.class);
						startActivity(hi);
						finish();
					}
					else {
						((EditText)edittext6).setError("Type a good story");
					}
				}
				else {
					((EditText)edittext1).setError("Type a good title");
				}
			}
		});
		
		gerene.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		genre.add("Education");
		genre.add("Politics");
		genre.add("Family");
		genre.add("Religion");
		genre.add("Experience");
		gerene.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, genre));
		((ArrayAdapter)gerene.getAdapter()).notifyDataSetChanged();
	}
	
	@Override
	public void onBackPressed() {
		hi.setClass(getApplicationContext(), StoriesActivity.class);
		startActivity(hi);
		finish();
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}