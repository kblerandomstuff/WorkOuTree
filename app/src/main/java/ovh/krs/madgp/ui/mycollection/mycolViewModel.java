package ovh.krs.madgp.ui.mycollection;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class mycolViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public mycolViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("@strings/c_intro");
    }

    public LiveData<String> getText() {
        return mText;
    }
}