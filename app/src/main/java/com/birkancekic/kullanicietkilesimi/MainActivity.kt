package com.birkancekic.kullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.birkancekic.kullanicietkilesimi.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener {
            Toast.makeText(this, "Merhaba",Toast.LENGTH_SHORT).show()
        }

        binding.buttonSnackbar.setOnClickListener {
            Snackbar.make(it, "Silmek istiyor musunuz", Snackbar.LENGTH_SHORT).setAction("EVET") {
                Snackbar.make(it, "Silindi", Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(Color.WHITE)
                    .setTextColor(Color.BLUE)
                    .show()

            }.setBackgroundTint(Color.WHITE)
                .setTextColor(Color.BLUE)
                .setActionTextColor(Color.RED)
                .show()


            binding.buttonDialog.setOnClickListener {
                MaterialAlertDialogBuilder(this@MainActivity)
                    .setTitle("BAŞLIK")
                    .setMessage("Mesaj")
                    .setPositiveButton("Tamam"){d, i->
                        Toast.makeText(this, "Tamam Seçildi",Toast.LENGTH_SHORT).show()
                    }
                    .setNegativeButton("İptal"){d,i->
                        Toast.makeText(this, "İptal Seçildi",Toast.LENGTH_SHORT).show()
                    }
                    .show()
            }


        }
    }
}

