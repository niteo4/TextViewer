package com.tiennt.android.simpletextviewer;

public class Story {

	/**
	 * Story's id
	 */
	private long mId;

	/**
	 * Story's title
	 */
	private String mTitle;

	/**
	 * Content of the story
	 */
	private String mContent;

	/**
	 * Created time in miliseconds
	 */
	private long mCreatedTime;

	/**
	 * If this item is favorite, this flag set to 1, 0 otherwise
	 */
	private int mIsFavourite;

	public Story() {

	}

	public Story(long id, String title, String content, long createdTime,
			int isFavourite) {
		mId = id;
		mTitle = title;
		mContent = content;
		mCreatedTime = createdTime;
		mIsFavourite = isFavourite;
	}

	public long getId() {
		return mId;
	}

	public void setId(long mId) {
		this.mId = mId;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getContent() {
		return mContent;
	}

	public void setContent(String mContent) {
		this.mContent = mContent;
	}

	public long getCreatedTime() {
		return mCreatedTime;
	}

	public void setCreatedTime(long mCreatedTime) {
		this.mCreatedTime = mCreatedTime;
	}

	public int isFavourite() {
		return mIsFavourite;
	}

	public void setIsFavourite(int mIsFavourite) {
		this.mIsFavourite = mIsFavourite;
	}
}
