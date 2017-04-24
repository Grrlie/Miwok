package com.example.android.miwok;

/**
 * Created by nwhor on 4/23/2017.
 */

public class Word {

    private String miwokWord;
    private String engWord;
    private int imageId = -1;
    private int soundId = -1;

    public Word ( String eng, String miwok, int soundId){
        this.engWord = eng;
        this.miwokWord = miwok;
        this.soundId = soundId;
    }

    public Word ( String eng, String miwok, int imageId, int soundId ){
        this.engWord = eng;
        this.miwokWord = miwok;
        this.imageId = imageId;
        this.soundId = soundId;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public int getImageId() { return imageId; }

    public int getSoundId() { return soundId; }

    public boolean hasImage() {
        if (imageId == -1)
            return false;
        else
            return true;
    }

}
