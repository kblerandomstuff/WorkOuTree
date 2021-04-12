package ovh.krs.madgp.ui.timer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class timerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public timerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("@strings/c_intro");
    }

    public LiveData<String> getText() {
        return mText;
    }
}