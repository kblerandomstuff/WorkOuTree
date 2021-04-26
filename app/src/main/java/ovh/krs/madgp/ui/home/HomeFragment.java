package ovh.krs.madgp.ui.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import ovh.krs.madgp.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ImageView tree;
    private ProgressBar pgb;
    private Button history_list_btn;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        SharedPreferences hpref = getContext().getSharedPreferences("woh", 0); // 0 - for private mode
        int c= 3;
                hpref.getInt("wocount", -1);
        ImageView tree = root.findViewById(R.id.tree);
        tree.setImageDrawable(getResources().getDrawable(R.drawable.tree_flip1));
        switch (c){
            case 1:tree.setImageResource(R.drawable.tree_flip1);
            case 2:tree.setImageResource(R.drawable.tree_flip2);
            case 3:tree.setImageResource(R.drawable.tree_flip3);
            case 4:tree.setImageResource(R.drawable.tree_flip4);
            case 5:tree.setImageResource(R.drawable.tree_flip5);
            case 6:tree.setImageResource(R.drawable.tree_flip6);
            case 7:tree.setImageResource(R.drawable.tree_flip7);
            case 8:tree.setImageResource(R.drawable.tree_flip8);
            case 9:tree.setImageResource(R.drawable.tree_flip9);
            case 10:tree.setImageResource(R.drawable.tree_flip10);
            case 11:tree.setImageResource(R.drawable.tree_flip11);
            case 12:tree.setImageResource(R.drawable.tree_flip12);
            case 13:tree.setImageResource(R.drawable.tree_flip13);
            case 14:tree.setImageResource(R.drawable.tree_flip14);
            case 15:tree.setImageResource(R.drawable.tree_flip15);
            case 16:tree.setImageResource(R.drawable.tree_flip16);
            case 17:tree.setImageResource(R.drawable.tree_flip17);
            case 18:tree.setImageResource(R.drawable.tree_flip18);
            case 19:tree.setImageResource(R.drawable.tree_flip19);
            case 20:tree.setImageResource(R.drawable.tree_flip20);
            case 21:tree.setImageResource(R.drawable.tree_flip21);
            case 22:tree.setImageResource(R.drawable.tree_flip22);
            case 23:tree.setImageResource(R.drawable.tree_flip23);
            case 24:tree.setImageResource(R.drawable.tree_flip24);
            case 25:tree.setImageResource(R.drawable.tree_flip25);
            case 26:tree.setImageResource(R.drawable.tree_flip26);
            case 27:tree.setImageResource(R.drawable.tree_flip27);
            case 28:tree.setImageResource(R.drawable.tree_flip28);
            case 29:tree.setImageResource(R.drawable.tree_flip29);
            case 30:tree.setImageResource(R.drawable.tree_flip30);
            case 31:tree.setImageResource(R.drawable.tree_flip31);
            case 32:tree.setImageResource(R.drawable.tree_flip32);
            case 33:tree.setImageResource(R.drawable.tree_flip33);
            case 34:tree.setImageResource(R.drawable.tree_flip34);
            case 35:tree.setImageResource(R.drawable.tree_flip35);
            case 36:tree.setImageResource(R.drawable.tree_flip36);
            case 37:tree.setImageResource(R.drawable.tree_flip37);
            case 38:tree.setImageResource(R.drawable.tree_flip38);
            case 39:tree.setImageResource(R.drawable.tree_flip39);
            case 40:tree.setImageResource(R.drawable.tree_flip40);
            case 41:tree.setImageResource(R.drawable.tree_flip41);
            case 42:tree.setImageResource(R.drawable.tree_flip42);
            case 43:tree.setImageResource(R.drawable.tree_flip43);
            case 44:tree.setImageResource(R.drawable.tree_flip44);
            case 45:tree.setImageResource(R.drawable.tree_flip45);
            case 46:tree.setImageResource(R.drawable.tree_flip46);
            case 47:tree.setImageResource(R.drawable.tree_flip47);
            case 48:tree.setImageResource(R.drawable.tree_flip48);
            case 49:tree.setImageResource(R.drawable.tree_flip49);
            case 50:tree.setImageResource(R.drawable.tree_flip50);
            case 51:tree.setImageResource(R.drawable.tree_flip51);
            case 52:tree.setImageResource(R.drawable.tree_flip52);
            case 53:tree.setImageResource(R.drawable.tree_flip53);
            case 54:tree.setImageResource(R.drawable.tree_flip54);
            case 55:tree.setImageResource(R.drawable.tree_flip55);
            case 56:tree.setImageResource(R.drawable.tree_flip56);
            case 57:tree.setImageResource(R.drawable.tree_flip57);
            case 58:tree.setImageResource(R.drawable.tree_flip58);
            case 59:tree.setImageResource(R.drawable.tree_flip59);
            case 60:tree.setImageResource(R.drawable.tree_flip50);
            case 61:tree.setImageResource(R.drawable.tree_flip61);
            case 62:tree.setImageResource(R.drawable.tree_flip62);
            case 63:tree.setImageResource(R.drawable.tree_flip63);
            case 64:tree.setImageResource(R.drawable.tree_flip64);
            case 65:tree.setImageResource(R.drawable.tree_flip65);
            case 66:tree.setImageResource(R.drawable.tree_flip66);
            case 67:tree.setImageResource(R.drawable.tree_flip67);
            case 68:tree.setImageResource(R.drawable.tree_flip68);
            case 69:tree.setImageResource(R.drawable.tree_flip69);
            case 70:tree.setImageResource(R.drawable.tree_flip70);
            case 71:tree.setImageResource(R.drawable.tree_flip71);
            case 72:tree.setImageResource(R.drawable.tree_flip72);
            case 73:tree.setImageResource(R.drawable.tree_flip73);
            case 74:tree.setImageResource(R.drawable.tree_flip74);
            case 75:tree.setImageResource(R.drawable.tree_flip75);
            case 76:tree.setImageResource(R.drawable.tree_flip76);
            case 77:tree.setImageResource(R.drawable.tree_flip77);
            case 78:tree.setImageResource(R.drawable.tree_flip78);
            case 79:tree.setImageResource(R.drawable.tree_flip79);
            case 80:tree.setImageResource(R.drawable.tree_flip80);
            case 81:tree.setImageResource(R.drawable.tree_flip81);
            case 82:tree.setImageResource(R.drawable.tree_flip82);
            case 83:tree.setImageResource(R.drawable.tree_flip83);
            case 84:tree.setImageResource(R.drawable.tree_flip84);
            case 85:tree.setImageResource(R.drawable.tree_flip85);
            case 86:tree.setImageResource(R.drawable.tree_flip86);
            case 87:tree.setImageResource(R.drawable.tree_flip87);
            case 88:tree.setImageResource(R.drawable.tree_flip88);
            case 89:tree.setImageResource(R.drawable.tree_flip89);
            case 90:tree.setImageResource(R.drawable.tree_flip90);
            case 91:tree.setImageResource(R.drawable.tree_flip91);
            case 92:tree.setImageResource(R.drawable.tree_flip92);
            case 93:tree.setImageResource(R.drawable.tree_flip93);
            case 94:tree.setImageResource(R.drawable.tree_flip94);
            case 95:tree.setImageResource(R.drawable.tree_flip95);
            case 96:tree.setImageResource(R.drawable.tree_flip96);
            case 97:tree.setImageResource(R.drawable.tree_flip97);
            case 98:tree.setImageResource(R.drawable.tree_flip98);
            case 99:tree.setImageResource(R.drawable.tree_flip99);
            case 100:tree.setImageResource(R.drawable.tree_flip100);
        }
        pgb = root.findViewById(R.id.pbh);
        return root;
    }

}



