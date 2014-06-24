package com.tiennt.android.simpletextviewer;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ListStoryFragment extends Fragment {
	private ListView mListStories;
	private ArrayList<Story> mStories;
	private StoriesAdapter mStoryAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		mStories = new ArrayList<Story>();
		mStories.add(new Story(0, "Title 1", "Content 1", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 2", "Content 2", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 3", "Content 3", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 4", "Content 4", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));
		mStories.add(new Story(0, "Title 5", "Content 5", System
				.currentTimeMillis(), 1));

		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.list_story_fragment,
				container, false);
		mListStories = (ListView) rootView.findViewById(R.id.listStory);
		mStoryAdapter = new StoriesAdapter(getActivity(), R.layout.story_item,
				mStories);
		mListStories.setAdapter(mStoryAdapter);
		return rootView;
	}
}
