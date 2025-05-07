package protection.member.riko_chan

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import protection.member.riko_chan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.photoBottom.setOnClickListener {
            val successClick = Intent(this, PhotoActivity::class.java)
            startActivity(successClick)

            Toast.makeText(this, "Welcome to Riko-chan's all Photo", Toast.LENGTH_SHORT).show()
        }

        binding.imageBottom.setOnClickListener {
            val successClick = Intent(this, ImageActivity::class.java)
            startActivity(successClick)

            Toast.makeText(this, "Welcome to Riko-chan's all image", Toast.LENGTH_SHORT).show()
        }
    }
}