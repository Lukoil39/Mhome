package com.geekbrains.a2l1_sidemenu.ui.Feedback;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FeedbackViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FeedbackViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is feedback");
    }

    public LiveData<String> getText() {
        return mText;
    }
}