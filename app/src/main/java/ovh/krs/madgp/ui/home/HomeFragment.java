package ovh.krs.madgp.ui.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ovh.krs.madgp.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ImageView tree;
    private ProgressBar pgh;
    private Button history_list_btn;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        SharedPreferences hpref = getContext().getSharedPreferences("woh", 0); // 0 - for private mode
        int c= hpref.getInt("wocount", 0);;
        ImageView tree = root.findViewById(R.id.tree);
        tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip0, null));
        switch (c%100){
            case 1:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip1, null));break;
            case 2:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip2, null));break;
            case 3:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip3, null));break;
            case 4:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip4, null));break;
            case 5:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip5, null));break;
            case 6:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip6, null));break;
            case 7:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip7, null));break;
            case 8:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip8, null));break;
            case 9:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip9, null));break;
            case 10:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip10, null));break;
            case 11:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip11, null));break;
            case 12:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip12, null));break;
            case 13:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip13, null));break;
            case 14:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip14, null));break;
            case 15:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip15, null));break;
            case 16:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip16, null));break;
            case 17:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip17, null));break;
            case 18:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip18, null));break;
            case 19:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip19, null));break;
            case 20:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip20, null));break;
            case 21:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip21, null));break;
            case 22:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip22, null));break;
            case 23:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip23, null));break;
            case 24:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip24, null));break;
            case 25:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip25, null));break;
            case 26:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip26, null));break;
            case 27:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip27, null));break;
            case 28:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip28, null));break;
            case 29:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip29, null));break;
            case 30:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip30, null));break;
            case 31:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip31, null));break;
            case 32:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip32, null));break;
            case 33:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip33, null));break;
            case 34:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip34, null));break;
            case 35:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip35, null));break;
            case 36:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip36, null));break;
            case 37:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip37, null));break;
            case 38:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip38, null));break;
            case 39:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip39, null));break;
            case 40:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip40, null));break;
            case 41:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip41, null));break;
            case 42:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip42, null));break;
            case 43:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip43, null));break;
            case 44:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip44, null));break;
            case 45:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip45, null));break;
            case 46:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip46, null));break;
            case 47:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip47, null));break;
            case 48:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip48, null));break;
            case 49:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip49, null));break;
            case 50:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip50, null));break;
            case 51:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip51, null));break;
            case 52:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip52, null));break;
            case 53:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip53, null));break;
            case 54:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip54, null));break;
            case 55:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip55, null));break;
            case 56:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip56, null));break;
            case 57:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip57, null));break;
            case 58:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip58, null));break;
            case 59:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip59, null));break;
            case 60:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip60, null));break;
            case 61:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip61, null));break;
            case 62:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip62, null));break;
            case 63:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip63, null));break;
            case 64:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip64, null));break;
            case 65:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip65, null));break;
            case 66:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip66, null));break;
            case 67:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip67, null));break;
            case 68:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip68, null));break;
            case 69:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip69, null));break;
            case 70:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip70, null));break;
            case 71:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip71, null));break;
            case 72:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip72, null));break;
            case 73:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip73, null));break;
            case 74:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip74, null));break;
            case 75:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip75, null));break;
            case 76:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip76, null));break;
            case 77:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip77, null));break;
            case 78:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip78, null));break;
            case 79:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip79, null));break;
            case 80:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip80, null));break;
            case 81:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip81, null));break;
            case 82:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip82, null));break;
            case 83:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip83, null));break;
            case 84:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip84, null));break;
            case 85:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip85, null));break;
            case 86:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip86, null));break;
            case 87:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip87, null));break;
            case 88:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip88, null));break;
            case 89:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip89, null));break;
            case 90:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip90, null));break;
            case 91:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip91, null));break;
            case 92:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip92, null));break;
            case 93:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip93, null));break;
            case 94:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip94, null));break;
            case 95:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip95, null));break;
            case 96:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip96, null));break;
            case 97:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip97, null));break;
            case 98:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip98, null));break;
            case 99:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip99, null));break;
            case 100:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip100, null));break;
            default:tree.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.tree_flip0, null));break;
        }
        pgh = root.findViewById(R.id.pbh);
        pgh.setMax(100);
        pgh.setProgress(c%100);
        TextView tv1= root.findViewById(R.id.htv3);
        tv1.setText(String.valueOf(100-(c%100)));
        TextView tv2= root.findViewById(R.id.htv2);
        tv2.setText(String.valueOf(c/100));
        return root;
    }

}



