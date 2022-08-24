package com.trulyias.fly_ferry_assignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.trulyias.fly_ferry_assignment.R
import com.trulyias.fly_ferry_assignment.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        setupNavigationDrawer()
    }

//    private fun setupNavigationDrawer() {
////        val navHostFragment = parentFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
////        val navController = navHostFragment.navController
////        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
////        val navController = navHostFragment.navController
//
//        val navigationView = requireActivity().findViewById<NavigationView>(R.id.navigation_view)
//        val drawerLayout = requireActivity().findViewById<DrawerLayout>(R.id.drawerLayout) //from activity_xml
//        val navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)
////
////        val myAppBarConfiguration : AppBarConfiguration = AppBarConfiguration.Builder(
////            R.id.home, R.id.post, R.id.friends, R.id.logout)
////            .setDrawerLayout(drawerLayout)
////            .build()
//
//
////        NavigationUI.setupActionBarWithNavController(requireActivity(), navController, myAppBarConfiguration)
//
//        NavigationUI.setupWithNavController(
//            binding.toolbar, navController,
//            AppBarConfiguration.Builder(R.id.side_menu_navigation, R.id.homeFragment)
//                .setDrawerLayout(drawerLayout)
//                .build()
//        )
//
//        navigationView.setupWithNavController(navController)
//
//        navigationView.setNavigationItemSelectedListener {
//            drawerLayout.closeDrawers()
//
//            when (it.itemId) {
//                R.id.logout -> {
//                    findNavController().navigate(
//                        HomeFragmentDirections.actionHomeFragment2ToLogoutFragment()
//                    )
//                    true
//                }
//                R.id.post -> {
//                    findNavController().navigate(
//                        HomeFragmentDirections.actionHomeFragment2ToPostFragment()
//                    )
//                    true
//                }
//                R.id.friends -> {
//                    findNavController().navigate(
//                        HomeFragmentDirections.actionHomeFragment2ToFriendsFragment2()
//                    )
//                    true
//                }
//                else -> false
//            }
//        }
//    }
}