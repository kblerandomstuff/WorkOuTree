package ovh.krs.madgp.wo

import android.graphics.*
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_wo1.*
import ovh.krs.madgp.R


class wo1activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wo1)

        val assets = applicationContext.assets;
        val assetFileName = "test.webp";
        val source = ImageDecoder.createSource(assets, assetFileName)
        val drawable = ImageDecoder.decodeDrawable(source)
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)


        imageView.setImageDrawable(drawable)


        if (drawable is AnimatedImageDrawable) {
            ImageDecoder.OnHeaderDecodedListener { decoder, info, source ->
                decoder.setTargetSize(displayMetrics.widthPixels,((displayMetrics.widthPixels*0.5625).toInt()))
            }
            drawable.start()

        }
    }
}