package com.dssoft.pruebacomponentesmaterial3.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dssoft.pruebacomponentesmaterial3.R
import com.dssoft.pruebacomponentesmaterial3.databinding.LayoutFragmentPruebaNavigationBarBinding


class FragmentPruebaNavigationBar: Fragment()
{

    var numVecesSeleccionado = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {

        val binding = LayoutFragmentPruebaNavigationBarBinding.inflate(inflater, container, false)

        //se crea un badge una etiqueta que muestra un numero para un item de la NavigationBar, en mi caso muestro el numero de veces
        //que ha siso seleccionado el Item Tonto de la NavigationBar
        var badge = binding.navigationBar.getOrCreateBadge(R.id.navigationBarItem3)
        badge.isVisible = true
        badge.number = numVecesSeleccionado

        //********************* Listeners del Navigation bar *********************

        //Listener que se ejecuta cuando se selecciona un elemento del navigationBar
        binding.navigationBar.setOnItemSelectedListener{item->

            when(item.itemId)
            {
                R.id.navigationBarItem1->{

                    Toast.makeText(requireContext(), "Seleccionado Item Ver", Toast.LENGTH_SHORT).show()

                    true
                }

                R.id.navigationBarItem2->{

                    Toast.makeText(requireContext(), "Seleccionado Item Favorito", Toast.LENGTH_SHORT).show()

                    true
                }

                R.id.navigationBarItem3->{

                    Toast.makeText(requireContext(), "Seleccionado Item Tonto", Toast.LENGTH_SHORT).show()

                    numVecesSeleccionado++
                    badge.number = numVecesSeleccionado

                    true
                }

                else->{ false }
            }
        }



        //********************* Fin Listeners Navigation bar *********************


        return binding.root
    }

}