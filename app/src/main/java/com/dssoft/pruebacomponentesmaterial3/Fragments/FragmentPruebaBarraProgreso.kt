package com.dssoft.pruebacomponentesmaterial3.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dssoft.pruebacomponentesmaterial3.databinding.LayoutFragmentPruebaBarraProgresoBinding




class FragmentPruebaBarraProgreso:Fragment()
{

    private var progreso = 0


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {

        val binding = LayoutFragmentPruebaBarraProgresoBinding.inflate(inflater, container, false)

        binding.barraProgresoLineal.max = 100
        binding.barraProgresoCircular.max = 100
        binding.barraProgresoLineal.progress = 0
        binding.barraProgresoCircular.progress = 0

        //********************* Listeners de los Botones *********************

        binding.btnIncrementar.setOnClickListener{

            if(progreso < 100)
                progreso += 5

            binding.barraProgresoLineal.progress = progreso
            binding.barraProgresoCircular.progress = progreso
        }

        binding.btnDecrementar.setOnClickListener {

            if(progreso > 0)
                progreso -= 5

            binding.barraProgresoLineal.progress = progreso
            binding.barraProgresoCircular.progress = progreso
        }

        //********************* Fin Listeners de los Botones *********************

        return binding.root

    }


}