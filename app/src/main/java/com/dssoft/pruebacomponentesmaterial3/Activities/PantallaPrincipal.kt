package com.dssoft.pruebacomponentesmaterial3.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.dssoft.pruebacomponentesmaterial3.R
import com.dssoft.pruebacomponentesmaterial3.databinding.LayoutPantallaPrincipalBinding





class PantallaPrincipal :AppCompatActivity()
{

    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        val binding = LayoutPantallaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolBarPantallaPrincipal)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeButtonEnabled(true)

        //Se Crea Objeto NavController
        navController = Navigation.findNavController(this, R.id.NavHostFragment)

        //Añadimos el navController a la Toolbar(Actionbar), Para que se muestre la flecha volver y el titulo del frgament en la toolbar cuando se navega a otros fragments desde el fragment home
        binding.toolBarPantallaPrincipal.setupWithNavController(navController)

        //Se registra un Listener para el objeto navigation, que se ejecuta cada vez que se navega
        navController.addOnDestinationChangedListener { navController: NavController, navDestination: NavDestination, bundle: Bundle? ->

            when(navDestination.id){

                navController.graph.startDestinationId-> { binding.toolBarPantallaPrincipal.setTitle("Componentes Material") }

                R.id.fragmentPruebaBotones->{ binding.toolBarPantallaPrincipal.setTitle("Prueba Botones")}

                R.id.fragmentPruebaNavigationBar->{ binding.toolBarPantallaPrincipal.setTitle("Navigation Bar") }

                R.id.fragmentPruebaNavigationRail->{ binding.toolBarPantallaPrincipal.setTitle("Navigation Rail") }

            }

        }

    }


}