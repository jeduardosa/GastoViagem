package learn.project.gastoviagem

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import learn.project.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        binding.editDistance

    }
}