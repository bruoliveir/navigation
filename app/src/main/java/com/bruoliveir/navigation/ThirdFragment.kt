package com.bruoliveir.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        listOf(
            bFourth to R.id.action_third_to_fourth,
            bFifth to R.id.action_third_to_fifth
        ).forEach {
            it.first.setOnClickListener(Navigation.createNavigateOnClickListener(it.second))
        }
    }

}
