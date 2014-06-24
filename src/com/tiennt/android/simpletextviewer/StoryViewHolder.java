package com.tiennt.android.simpletextviewer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryViewHolder {
	private View root;
	private ImageView favouriteImageView;
	private TextView titleTextView;
	private TextView contentTextView;

	public StoryViewHolder(View root) {
		this.root = root;
	}

	public ImageView getImageViewFavourite() {
		if (favouriteImageView == null) {
			favouriteImageView = (ImageView) root
					.findViewById(R.id.imvFavouriteIcon);
		}
		return favouriteImageView;
	}

	public TextView getTitleTextView() {
		if (titleTextView == null) {
			titleTextView = (TextView) root.findViewById(R.id.tvTitle);
		}
		return titleTextView;
	}

	public TextView getContentTextView() {
		if (contentTextView == null) {
			contentTextView = (TextView) root
					.findViewById(R.id.tvContentPreview);
		}
		return contentTextView;
	}
}
