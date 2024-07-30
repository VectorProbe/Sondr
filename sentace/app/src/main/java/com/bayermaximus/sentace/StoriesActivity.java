package com.bayermaximus.sentace;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class StoriesActivity extends AppCompatActivity {
	
	private FloatingActionButton _fab;
	
	private LinearLayout central;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private TextView topic;
	private LinearLayout linear1;
	private LinearLayout linear5;
	private LinearLayout linear8;
	private LinearLayout linear11;
	private LinearLayout linear14;
	private TextView title;
	private LinearLayout linear3;
	private TextView story;
	private LinearLayout linear4;
	private TextView name;
	private TextView time;
	private ImageView imageview1;
	private TextView views;
	private TextView genre;
	private TextView title2;
	private LinearLayout linear6;
	private TextView story2;
	private LinearLayout linear7;
	private TextView name2;
	private TextView date2;
	private ImageView imageview2;
	private TextView views2;
	private TextView genre2;
	private TextView title3;
	private LinearLayout linear9;
	private TextView story3;
	private LinearLayout linear10;
	private TextView name3;
	private TextView time3;
	private ImageView imageview3;
	private TextView views3;
	private TextView genre3;
	private TextView title4;
	private LinearLayout linear12;
	private TextView story4;
	private LinearLayout linear13;
	private TextView name4;
	private TextView time4;
	private ImageView imageview4;
	private TextView views4;
	private TextView genre4;
	private TextView title5;
	private LinearLayout linear15;
	private TextView story5;
	private LinearLayout linear16;
	private TextView name5;
	private TextView time5;
	private ImageView imageview5;
	private TextView views5;
	private TextView genre5;
	
	private Intent hi = new Intent();
	private SharedPreferences sh;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.stories);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		
		central = findViewById(R.id.central);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		topic = findViewById(R.id.topic);
		linear1 = findViewById(R.id.linear1);
		linear5 = findViewById(R.id.linear5);
		linear8 = findViewById(R.id.linear8);
		linear11 = findViewById(R.id.linear11);
		linear14 = findViewById(R.id.linear14);
		title = findViewById(R.id.title);
		linear3 = findViewById(R.id.linear3);
		story = findViewById(R.id.story);
		linear4 = findViewById(R.id.linear4);
		name = findViewById(R.id.name);
		time = findViewById(R.id.time);
		imageview1 = findViewById(R.id.imageview1);
		views = findViewById(R.id.views);
		genre = findViewById(R.id.genre);
		title2 = findViewById(R.id.title2);
		linear6 = findViewById(R.id.linear6);
		story2 = findViewById(R.id.story2);
		linear7 = findViewById(R.id.linear7);
		name2 = findViewById(R.id.name2);
		date2 = findViewById(R.id.date2);
		imageview2 = findViewById(R.id.imageview2);
		views2 = findViewById(R.id.views2);
		genre2 = findViewById(R.id.genre2);
		title3 = findViewById(R.id.title3);
		linear9 = findViewById(R.id.linear9);
		story3 = findViewById(R.id.story3);
		linear10 = findViewById(R.id.linear10);
		name3 = findViewById(R.id.name3);
		time3 = findViewById(R.id.time3);
		imageview3 = findViewById(R.id.imageview3);
		views3 = findViewById(R.id.views3);
		genre3 = findViewById(R.id.genre3);
		title4 = findViewById(R.id.title4);
		linear12 = findViewById(R.id.linear12);
		story4 = findViewById(R.id.story4);
		linear13 = findViewById(R.id.linear13);
		name4 = findViewById(R.id.name4);
		time4 = findViewById(R.id.time4);
		imageview4 = findViewById(R.id.imageview4);
		views4 = findViewById(R.id.views4);
		genre4 = findViewById(R.id.genre4);
		title5 = findViewById(R.id.title5);
		linear15 = findViewById(R.id.linear15);
		story5 = findViewById(R.id.story5);
		linear16 = findViewById(R.id.linear16);
		name5 = findViewById(R.id.name5);
		time5 = findViewById(R.id.time5);
		imageview5 = findViewById(R.id.imageview5);
		views5 = findViewById(R.id.views5);
		genre5 = findViewById(R.id.genre5);
		sh = getSharedPreferences("rTmp", Activity.MODE_PRIVATE);
		
		linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sh.edit().putString("title", title.getText().toString()).commit();
				sh.edit().putString("name", name.getText().toString()).commit();
				sh.edit().putString("time", time.getText().toString()).commit();
				sh.edit().putString("story", story.getText().toString()).commit();
				sh.edit().putString("views", views.getText().toString()).commit();
				sh.edit().putString("genre", genre.getText().toString()).commit();
				hi.setClass(getApplicationContext(), StorypageActivity.class);
				startActivity(hi);
				finish();
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sh.edit().putString("title", title2.getText().toString()).commit();
				sh.edit().putString("name", name2.getText().toString()).commit();
				sh.edit().putString("time", date2.getText().toString()).commit();
				sh.edit().putString("story", story2.getText().toString()).commit();
				sh.edit().putString("views", views2.getText().toString()).commit();
				sh.edit().putString("genre", genre2.getText().toString()).commit();
				hi.setClass(getApplicationContext(), StorypageActivity.class);
				startActivity(hi);
				finish();
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sh.edit().putString("title", title3.getText().toString()).commit();
				sh.edit().putString("name", name3.getText().toString()).commit();
				sh.edit().putString("time", time3.getText().toString()).commit();
				sh.edit().putString("story", story3.getText().toString()).commit();
				sh.edit().putString("views", views3.getText().toString()).commit();
				sh.edit().putString("genre", genre3.getText().toString()).commit();
				hi.setClass(getApplicationContext(), StorypageActivity.class);
				startActivity(hi);
				finish();
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sh.edit().putString("title", title4.getText().toString()).commit();
				sh.edit().putString("name", name4.getText().toString()).commit();
				sh.edit().putString("time", time4.getText().toString()).commit();
				sh.edit().putString("story", story4.getText().toString()).commit();
				sh.edit().putString("views", views4.getText().toString()).commit();
				sh.edit().putString("genre", genre4.getText().toString()).commit();
				hi.setClass(getApplicationContext(), StorypageActivity.class);
				startActivity(hi);
				finish();
			}
		});
		
		linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sh.edit().putString("title", title5.getText().toString()).commit();
				sh.edit().putString("name", name5.getText().toString()).commit();
				sh.edit().putString("time", time5.getText().toString()).commit();
				sh.edit().putString("story", story5.getText().toString()).commit();
				sh.edit().putString("views", views5.getText().toString()).commit();
				sh.edit().putString("genre", genre5.getText().toString()).commit();
				hi.setClass(getApplicationContext(), StorypageActivity.class);
				startActivity(hi);
				finish();
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				hi.setClass(getApplicationContext(), WriterActivity.class);
				startActivity(hi);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
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