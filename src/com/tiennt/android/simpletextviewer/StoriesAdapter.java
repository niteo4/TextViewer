package com.tiennt.android.simpletextviewer;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class StoriesAdapter extends ArrayAdapter<Story> {
	Context mContext;
	ArrayList<Story> mStories;

	public StoriesAdapter(Context context, int resource,
			ArrayList<Story> objects) {
		super(context, resource, objects);
		mContext = context;
		mStories = objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.story_item, null);
		}

		View rootView = convertView;

		StoryViewHolder holder = (StoryViewHolder) rootView.getTag();
		if (holder == null) {
			holder = new StoryViewHolder(rootView);
			rootView.setTag(holder);
		}

		Story story = mStories.get(position);
		holder.getTitleTextView().setText(story.getTitle());
		holder.getContentTextView().setText(story.getContent());
		if (story.isFavourite() == 1) {
			holder.getImageViewFavourite().setImageResource(
					R.drawable.favourite_enable);
		} else {
			holder.getImageViewFavourite().setImageResource(
					R.drawable.favourite_enable);
		}
		return rootView;
	}

}
