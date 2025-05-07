package protection.member.riko_chan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import protection.member.riko_chan.databinding.ActivityPhotoBinding
import protection.member.riko_chan.fragment.ImageFragment
import protection.member.riko_chan.fragment.PhotoFragment

class PhotoActivity : AppCompatActivity() {
    lateinit var binding: ActivityPhotoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhotoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(PhotoFragment())

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.photo -> replaceFragment(PhotoFragment())
                R.id.image -> replaceFragment(ImageFragment())
            }

            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}