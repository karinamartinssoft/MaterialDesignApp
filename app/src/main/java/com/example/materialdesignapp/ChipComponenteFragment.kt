package com.example.materialdesignapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.materialdesignapp.databinding.FragmentChipComponenteBinding

class ChipComponenteFragment : Fragment() {

    lateinit var mBinding: FragmentChipComponenteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentChipComponenteBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

}