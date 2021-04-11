package ovh.krs.madgp.wo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

import ovh.krs.madgp.MainActivity;
import ovh.krs.madgp.R;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.danny.framesSquencce.WebpImageView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static com.danny.framesSquencce.WebpImageView.STATUS_DEFAULT;
import static com.danny.framesSquencce.WebpImageView.STATUS_FINAL;
import static com.danny.framesSquencce.WebpImageView.STATUS_NEUTRAL;

public class wo1activity extends AppCompatActivity{
    WebpImageView webpImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wo1);
        webpImageView = ((WebpImageView) findViewById(R.id.webpImage));
        InputStream is = getResources().openRawResource(R.raw.test);
        String result = getStringFromInputStream(is);
        int num = Integer.parseInt(result);
        webpImageView.setDefaultDrawable(num);

        // set animation count for DEFAULT & NEUTRAL & FINAL animation
        webpImageView.setDefaultAnimationCount(10);

    }

    public void defaultAnim(View view) {
        webpImageView.playAnimation(STATUS_DEFAULT);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        webpImageView.destroy();
    }
    private static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }

    }


