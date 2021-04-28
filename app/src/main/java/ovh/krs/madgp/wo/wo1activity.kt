package ovh.krs.madgp.wo

import android.graphics.*
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_wo1.*
import ovh.krs.madgp.R

class wo1activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wo1)
        val assets = applicationContext.assets
        val assetFileName = "work1_.webp"
        val source = ImageDecoder.createSource(assets, assetFileName)
        val drawable = ImageDecoder.decodeDrawable(source)
        imageView.setImageDrawable(drawable)
        if (drawable is AnimatedImageDrawable) {
            drawable.start()
        }
    }
}