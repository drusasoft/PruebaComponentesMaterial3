package com.dssoft.pruebacomponentesmaterial3.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dssoft.pruebacomponentesmaterial3.R
import com.dssoft.pruebacomponentesmaterial3.databinding.LayoutFragmentPruebaNavigationRailBinding


class FragmentPruebaNavigationRail: Fragment()
{

    var numVecesSeleccionado = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {

        val binding = LayoutFragmentPruebaNavigationRailBinding.inflate(inflater, container, false)

        //********************* Listeners del Navigation Rail *********************

        //se crea un badge una etiqueta que muestra un numero para un item de la NavigationRail, en mi caso muestro el numero de veces
        //que ha siso seleccionado el Item Tonto de la NavigationBar
        var badge = binding.navigationRail.getOrCreateBadge(R.id.navigationRailItem3)
        badge.isVisible = true
        badge.number = numVecesSeleccionado

        binding.navigationRail.setOnItemSelectedListener { item->

            when(item.itemId)
            {
                R.id.navigationRailItem1->{
                    Toast.makeText(requireContext(), "Seleccionado Item Ver", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.navigationRailItem2->{
                    Toast.makeText(requireContext(), "Seleccionado Item Favorito", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.navigationRailItem3->{

                    Toast.makeText(requireContext(), "Seleccionado Item Tonto", Toast.LENGTH_SHORT).show()

                    numVecesSeleccionado++
                    badge.number = numVecesSeleccionado

                    true
                }

                else->{ false }
            }

        }

        //********************* Fin Listeners del Navigation Rail *********************

        return binding.root

    }

}