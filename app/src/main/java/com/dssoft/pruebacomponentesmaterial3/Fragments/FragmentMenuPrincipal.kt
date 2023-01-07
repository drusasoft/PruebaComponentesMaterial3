package com.dssoft.pruebacomponentesmaterial3.Fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.dssoft.pruebacomponentesmaterial3.R
import com.dssoft.pruebacomponentesmaterial3.databinding.LayoutFragmentMenuPrincipalBinding





class FragmentMenuPrincipal: Fragment()
{

    private lateinit var navController: NavController



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        val binding = LayoutFragmentMenuPrincipalBinding.inflate(layoutInflater, container, false)

        //***************************** ClickListeners *****************************

        //se navega a los distintos Fragments doinde se prueban algunos componentes Material 3
        binding.txtOpcionBotones.setOnClickListener {  navController.navigate(R.id.fragmentPruebaBotones) }
        binding.txtOpcionNavigationBar.setOnClickListener { navController.navigate(R.id.irFragmentPruebaNavigationBar) }
        binding.txtOpcionNavigationRail.setOnClickListener { navController.navigate(R.id.irFragmentPruebaNavigationRail) }
        binding.txtOpcionBarraProgreso.setOnClickListener { navController.navigate(R.id.irFragmentPruebaBarraProgreso) }

        //*************************** Fin ClickListeners *****************************

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        //Se instancia el objeto NavController
        navController = Navigation.findNavController(view)
    }


}