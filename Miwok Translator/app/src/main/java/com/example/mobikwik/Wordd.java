package com.example.mobikwik;

public class Wordd {/** Default translation for the word */
private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;
private int mResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
   private int mAudioId;
    /** Constant value that represents no image was provided for this word */

/**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Wordd(String defaultTranslation, String miwokTranslation,int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId= audioId;
    }
    public Wordd(String defaultTranslation, String miwokTranslation,int imageresourceid,int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId= imageresourceid;
        mAudioId=audioId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }
public int getmResourceId()
{
    return mResourceId;
}
    public boolean hasImage() {
        return mResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioId() {
        return mAudioId;
    }
}

