package com.tiennt.android.simpletextviewer;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class RobotoTextView extends TextView {

	public RobotoTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		Typeface typeface = Typeface.createFromAsset(context.getAssets(),
				"fonts/roboto_regular.ttf");
		setTypeface(typeface);
	}

}
