package ovh.krs.madgp.ui.startwo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class startwoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public startwoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("@strings/c_intro");
    }

    public LiveData<String> getText() {
        return mText;
    }
}