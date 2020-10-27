package id.my.fanslab.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_penjumlahan.*

class PenjumlahanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penjumlahan)

        btnJumlah.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0!!.id == R.id.btnJumlah) {
            val a = tiga.text.toString().toDouble()
            val b = empat.text.toString().toDouble()
            val result = a + b
            Snackbar.make(p0, "result is ${result.toString()}" ,Snackbar.LENGTH_LONG).setAction("Action", null).show()
        }
    }
}