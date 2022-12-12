package com.dssoft.pruebacomponentesmaterial3.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dssoft.pruebacomponentesmaterial3.R
import com.dssoft.pruebacomponentesmaterial3.databinding.LayoutFragmentPruebaBotonesBinding





class FragmentPruebaBotones:Fragment()
{


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        val binding = LayoutFragmentPruebaBotonesBinding.inflate(layoutInflater, container, false)

        //********************* Listeners de los Botones *********************
        binding.btnElevado.setOnClickListener { Toast.makeText(requireContext(), "Bton Elevado", Toast.LENGTH_SHORT).show() }
        binding.btnFilled.setOnClickListener { Toast.makeText(requireContext(), "Bton Filled", Toast.LENGTH_SHORT).show() }
        binding.btnTonal.setOnClickListener { Toast.makeText(requireContext(), "Bton Tonal", Toast.LENGTH_SHORT).show() }
        binding.btnOutline.setOnClickListener { Toast.makeText(requireContext(), "Bton Elevado", Toast.LENGTH_SHORT).show() }

        binding.toggleButton.addOnButtonCheckedListener{ toggleButton, checkedId, isChecked ->

             when(checkedId)
             {
                 R.id.toggleButton1->{ if(isChecked) Toast.makeText(requireContext(), "Boton 1 Seleccionado", Toast.LENGTH_SHORT).show() }
                 R.id.toggleButton2->{ if(isChecked) Toast.makeText(requireContext(), "Boton 2 Seleccionado", Toast.LENGTH_SHORT).show() }
                 R.id.toggleButton3->{ if(isChecked) Toast.makeText(requireContext(), "Boton 3 Seleccionado", Toast.LENGTH_SHORT).show() }
             }
        }

        binding.toggleButtonIcon.addOnButtonCheckedListener { group, checkedId, isChecked ->

            when(checkedId)
            {
                R.id.toggleButtonIcon1->{ if(isChecked) Toast.makeText(requireContext(), "Boton Icono Ojete", Toast.LENGTH_SHORT).show() }
                R.id.toggleButtonIcon2->{ if(isChecked) Toast.makeText(requireContext(), "Boton Icono Corazon", Toast.LENGTH_SHORT).show() }
                R.id.toggleButtonIcon3->{ if(isChecked) Toast.makeText(requireContext(), "Boton Icono Cara", Toast.LENGTH_SHORT).show() }
            }
        }
        //********************* Fin Listeners de los Botones *********************

        return binding.root
    }


}