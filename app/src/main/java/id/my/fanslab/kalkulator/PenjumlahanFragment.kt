package id.my.fanslab.kalkulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_penjumlahan.*

class PenjumlahanFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_penjumlahan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hitungTambah.setOnClickListener {
            val a = tambahsatu.text.toString().toDouble()
            val b = tambahdua.text.toString().toDouble()

            val result = a + b
            resultTambah.text = result.toString()
        }

        btnBack.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_penjumlahanFragment_to_homeFragment)
        }
    }

}