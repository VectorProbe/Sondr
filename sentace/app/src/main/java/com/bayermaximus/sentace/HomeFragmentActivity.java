package com.bayermaximus.sentace;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
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
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class HomeFragmentActivity extends Fragment {
	
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
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.home_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		central = _view.findViewById(R.id.central);
		vscroll1 = _view.findViewById(R.id.vscroll1);
		linear2 = _view.findViewById(R.id.linear2);
		topic = _view.findViewById(R.id.topic);
		linear1 = _view.findViewById(R.id.linear1);
		linear5 = _view.findViewById(R.id.linear5);
		linear8 = _view.findViewById(R.id.linear8);
		linear11 = _view.findViewById(R.id.linear11);
		linear14 = _view.findViewById(R.id.linear14);
		title = _view.findViewById(R.id.title);
		linear3 = _view.findViewById(R.id.linear3);
		story = _view.findViewById(R.id.story);
		linear4 = _view.findViewById(R.id.linear4);
		name = _view.findViewById(R.id.name);
		time = _view.findViewById(R.id.time);
		imageview1 = _view.findViewById(R.id.imageview1);
		views = _view.findViewById(R.id.views);
		genre = _view.findViewById(R.id.genre);
		title2 = _view.findViewById(R.id.title2);
		linear6 = _view.findViewById(R.id.linear6);
		story2 = _view.findViewById(R.id.story2);
		linear7 = _view.findViewById(R.id.linear7);
		name2 = _view.findViewById(R.id.name2);
		date2 = _view.findViewById(R.id.date2);
		imageview2 = _view.findViewById(R.id.imageview2);
		views2 = _view.findViewById(R.id.views2);
		genre2 = _view.findViewById(R.id.genre2);
		title3 = _view.findViewById(R.id.title3);
		linear9 = _view.findViewById(R.id.linear9);
		story3 = _view.findViewById(R.id.story3);
		linear10 = _view.findViewById(R.id.linear10);
		name3 = _view.findViewById(R.id.name3);
		time3 = _view.findViewById(R.id.time3);
		imageview3 = _view.findViewById(R.id.imageview3);
		views3 = _view.findViewById(R.id.views3);
		genre3 = _view.findViewById(R.id.genre3);
		title4 = _view.findViewById(R.id.title4);
		linear12 = _view.findViewById(R.id.linear12);
		story4 = _view.findViewById(R.id.story4);
		linear13 = _view.findViewById(R.id.linear13);
		name4 = _view.findViewById(R.id.name4);
		time4 = _view.findViewById(R.id.time4);
		imageview4 = _view.findViewById(R.id.imageview4);
		views4 = _view.findViewById(R.id.views4);
		genre4 = _view.findViewById(R.id.genre4);
		title5 = _view.findViewById(R.id.title5);
		linear15 = _view.findViewById(R.id.linear15);
		story5 = _view.findViewById(R.id.story5);
		linear16 = _view.findViewById(R.id.linear16);
		name5 = _view.findViewById(R.id.name5);
		time5 = _view.findViewById(R.id.time5);
		imageview5 = _view.findViewById(R.id.imageview5);
		views5 = _view.findViewById(R.id.views5);
		genre5 = _view.findViewById(R.id.genre5);
	}
	
	private void initializeLogic() {
	}
	
}