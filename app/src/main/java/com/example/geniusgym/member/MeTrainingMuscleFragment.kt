package com.example.geniusgym.member

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.geniusgym.R

class MeTrainingMuscleFragment : Fragment() {

    companion object {
        fun newInstance() = MeTrainingMuscleFragment()
    }

    private lateinit var viewModel: MeTrainingMuscleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_me_training_muscle, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MeTrainingMuscleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}