package com.dssoft.pruebacomponentesmaterial3.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dssoft.pruebacomponentesmaterial3.databinding.LayoutFragmentMenuPrincipalBinding





class FragmentMenuPrincipal:Fragment()
{



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val binding = LayoutFragmentMenuPrincipalBinding.inflate(layoutInflater, container, false)

        return binding.root
    }


}