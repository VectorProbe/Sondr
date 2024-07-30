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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
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

public class SettingsFragmentActivity extends Fragment {
	
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear2;
	private TextView textview2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private Button button1;
	private LinearLayout linear6;
	private CheckBox checkbox1;
	private CheckBox checkbox2;
	private CheckBox checkbox3;
	private CheckBox checkbox4;
	private CheckBox checkbox5;
	private CheckBox checkbox6;
	private CheckBox checkbox7;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.settings_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		linear1 = _view.findViewById(R.id.linear1);
		textview1 = _view.findViewById(R.id.textview1);
		linear2 = _view.findViewById(R.id.linear2);
		textview2 = _view.findViewById(R.id.textview2);
		linear3 = _view.findViewById(R.id.linear3);
		linear4 = _view.findViewById(R.id.linear4);
		button1 = _view.findViewById(R.id.button1);
		linear6 = _view.findViewById(R.id.linear6);
		checkbox1 = _view.findViewById(R.id.checkbox1);
		checkbox2 = _view.findViewById(R.id.checkbox2);
		checkbox3 = _view.findViewById(R.id.checkbox3);
		checkbox4 = _view.findViewById(R.id.checkbox4);
		checkbox5 = _view.findViewById(R.id.checkbox5);
		checkbox6 = _view.findViewById(R.id.checkbox6);
		checkbox7 = _view.findViewById(R.id.checkbox7);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
	}
	
}