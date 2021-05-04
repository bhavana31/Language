package com.example.language;

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** kannada translation for the word */
    private String mKannadaTranslation;
    private int mResourceId= NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;;
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param kannadaTranslation is the word in the kannada language
     */
    public Word(String defaultTranslation, String kannadaTranslation,int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mKannadaTranslation = kannadaTranslation;
        mAudioResourceId=audioResource;
    }
    public Word(String defaultTranslation,String kannadaTranslation,int resourceId,int audioResource){
        mDefaultTranslation = defaultTranslation;
        mKannadaTranslation = kannadaTranslation;
        mResourceId=resourceId;
        mAudioResourceId=audioResource;
    }
    public int getResourceId(){
        return mResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Kannada translation of the word.
     */
    public String getKannadaTranslation() {
        return mKannadaTranslation;
    }
    public int getAudioResource(){
        return mAudioResourceId;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mResourceId != NO_IMAGE_PROVIDED;
    }

}
