package id.my.fanslab.kalkulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_pengurangan.*

class PenguranganFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_pengurangan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hitungKurang.setOnClickListener {
            val a = kurangsatu.text.toString().toDouble()
            val b = kurangdua.text.toString().toDouble()

            val result = a - b
            resultKurang.text = result.toString()
        }

        btnBack.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_penguranganFragment_to_homeFragment)
        }
    }

}