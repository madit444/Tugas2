package com.example.tugas2;

public class ExampleItem {
    private String mImageUrl, mCreator;
    private int mLikes;

    public ExampleItem(String imageUrl, String creator, int likes){
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }
}
