package id.my.fanslab.kalkulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_pembagian.*

class PembagianFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pembagian, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hitungBagi.setOnClickListener {
            val a = bagisatu.text.toString().toDouble()
            val b = bagidua.text.toString().toDouble()

            val result = a / b
            resultBagi.text = result.toString()
        }

        btnBack.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pembagianFragment_to_homeFragment)
        }
    }

}