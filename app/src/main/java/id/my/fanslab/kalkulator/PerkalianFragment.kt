package id.my.fanslab.kalkulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_perkalian.*

class PerkalianFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_perkalian, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hitungKali.setOnClickListener {
            val a = kalisatu.text.toString().toDouble()
            val b = kalidua.text.toString().toDouble()

            val result = a * b
            resultKali.text = result.toString()
        }

        btnBack.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_perkalianFragment_to_homeFragment)
        }
    }
}