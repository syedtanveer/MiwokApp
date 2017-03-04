package com.example.android.miwok;


/**
 * Created by Tanveer on 19-Feb-17.
 */

public class Word {
    private String mDefaultWord;
    private String mMiwokWord;
    private int mAudioResourseId;
    private final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /*
     * Construstor
     * @param: englishWord
     * @param: miwokWord
     */
    public Word(String englishWord, String miwokWord, int imageId, int audioId){
        mDefaultWord = englishWord;
        mMiwokWord = miwokWord;
        mImageResourceId = imageId;
        mAudioResourseId = audioId;
    }
    public Word(String englishWord, String miwokWord, int audioId){
        mDefaultWord = englishWord;
        mMiwokWord = miwokWord;
        mAudioResourseId = audioId;
    }
    /*
    * returns the miwok translation of word
    */
    public String getMiwokWord(){
        return mMiwokWord;
    }
    /*
    * returns the english translation of word
    */
    public String getDefaultWord(){
        return mDefaultWord;
    }
    /*
    * returns image id
     */
    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getAudioResourceId(){
        return mAudioResourseId;
    }

}
