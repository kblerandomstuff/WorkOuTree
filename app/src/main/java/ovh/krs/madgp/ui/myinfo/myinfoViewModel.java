package ovh.krs.madgp.ui.myinfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class myinfoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public myinfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("@strings/c_intro");
    }

    public LiveData<String> getText() {
        return mText;
    }
}