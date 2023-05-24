package com.example.geniusgym.business

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.geniusgym.R
import com.example.geniusgym.business.viewModel.BuMenuViewModel
import com.example.geniusgym.databinding.FragmentBuMenuBinding

class BuMenuFragment : Fragment() {
    private lateinit var viewModel: BuMenuViewModel
    private lateinit var binding: FragmentBuMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().setTitle(R.string.bu_menu_title)
        binding = FragmentBuMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding){
            btMemberDataManage.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_buMenu_to_buMemberData)
            }
            btCoachDataManage.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_buMenu_to_buCoachData)
            }
            btBusinessDataManage.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_buMenu_to_buBusinessData)
            }
            btClassDataManage.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_buMenu_to_buClassData)
            }
            btNotificationManage.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_buMenu_to_buNotificaitonManage)
            }
            btPostManage.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_buMenu_to_buPostManage)
            }
        }
    }



}