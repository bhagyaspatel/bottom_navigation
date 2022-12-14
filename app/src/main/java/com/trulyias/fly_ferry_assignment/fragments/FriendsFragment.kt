package com.trulyias.fly_ferry_assignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trulyias.fly_ferry_assignment.R
import com.trulyias.fly_ferry_assignment.databinding.FragmentFriendsBinding
import com.trulyias.fly_ferry_assignment.databinding.FragmentHomeBinding

class FriendsFragment : Fragment() {

    private lateinit var binding : FragmentFriendsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFriendsBinding.inflate(inflater,container,false)
        return binding.root
    }
}