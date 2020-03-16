package com.example.recyclertwo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.example.recyclertwo.R
import com.example.recyclertwo.adapter.ShoeAdapter
import com.example.recyclertwo.model.Shoe
import kotlinx.android.synthetic.main.fragment_shoe.view.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class ShoeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_shoe, container, false)
        var shoeList = ArrayList<Shoe>()
        shoeList.add(Shoe(1, R.drawable.shoe_one, "Nike\naa", 200.0))
        shoeList.add(Shoe(2, R.drawable.shoe_two, "Supra\nhh", 700.0))
        shoeList.add(Shoe(3, R.drawable.shoe_three, "Air\nJoden", 1000.0))
        shoeList.add(Shoe(4, R.drawable.shoe_four, "Air\nForce", 800.0))
        shoeList.add(Shoe(5, R.drawable.shoe_five, "Air\nPaper Max", 136.0))
        shoeList.add(Shoe(6, R.drawable.shoe_six, "LeBron\nFly", 670.0))
        shoeList.add(Shoe(7, R.drawable.shoe_seven, "Nike\nClassic", 400.0))
        shoeList.add(Shoe(8, R.drawable.shoe_eight, "Supra\nGreen", 550.0))


        val shoeAdapter = ShoeAdapter(shoeList)

        root.recyclerShoe.apply {
            layoutManager = GridLayoutManager(context,2)
            adapter = shoeAdapter
        }
        // Inflate the layout for this fragment
        return root
    }

}
