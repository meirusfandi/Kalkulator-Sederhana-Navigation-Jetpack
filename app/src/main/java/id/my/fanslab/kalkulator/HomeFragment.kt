package id.my.fanslab.kalkulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        perkalian.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toMultiply)
        }

        pembagian.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toDivisible)
        }

        penjumlahan.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toAdditional)
        }

        pengurangan.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toSubstract)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}