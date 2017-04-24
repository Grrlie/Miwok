package com.example.android.miwok;

/**
 * Created by nwhor on 4/23/2017.
 */

public class Word {

    private String miwokWord;
    private String engWord;
    private int imageId = -1;

    public Word ( String eng, String miwok){
        this.engWord = eng;
        this.miwokWord = miwok;
    }

    public Word ( String eng, String miwok, int imageId){
        this.engWord = eng;
        this.miwokWord = miwok;
        this.imageId = imageId;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public int getImageId() { return imageId; }

    public boolean hasImage() {
        if (imageId == -1)
            return false;
        else
            return true;
    }

}
