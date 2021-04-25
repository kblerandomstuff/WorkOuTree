package ovh.krs.madgp.ui.myhis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class myhisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public myhisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("@strings/c_intro");
    }

    public LiveData<String> getText() {
        return mText;
    }
}