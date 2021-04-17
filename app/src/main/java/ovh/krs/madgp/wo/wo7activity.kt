package ovh.krs.madgp.wo

import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_wo1.*
import ovh.krs.madgp.R


class wo7activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wo7)
        val assets = applicationContext.assets
        val assetFileName = "work7.webp"
        val source = ImageDecoder.createSource(assets, assetFileName)
        val drawable = ImageDecoder.decodeDrawable(source)
        imageView.setImageDrawable(drawable)
        if (drawable is AnimatedImageDrawable) {
            drawable.start()
        }
    }
}