package com.example.materialdesignapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.materialdesignapp.databinding.FragmentCardComponenteBinding


class CardComponenteFragment : Fragment() {

    lateinit var mBinding: FragmentCardComponenteBinding
    private lateinit var mParent: MainActivity


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentCardComponenteBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clickCardAvancar()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainActivity) this.mParent = context
    }

    fun clickCardAvancar(){
        mBinding.cardViewMaterial.setOnClickListener {
            mParent.goToPage()
        }
    }

}