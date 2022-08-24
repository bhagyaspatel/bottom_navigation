package com.trulyias.fly_ferry_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.ActionBar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.trulyias.fly_ferry_assignment.databinding.ActivityMainBinding
import com.trulyias.fly_ferry_assignment.fragments.FriendsFragment
import com.trulyias.fly_ferry_assignment.fragments.HomeFragment
import com.trulyias.fly_ferry_assignment.fragments.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.hide()
        }

        replaceFragment(HomeFragment())

        binding.bottomNavigation.setOnItemSelectedListener { item->

            when(item.itemId){
                R.id.homeFragment ->{
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.searchFragment ->{
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.friendsFragment ->{
                    replaceFragment(FriendsFragment())
                    true
                }
                else -> {
                    true
                }
            }
        }


    }

    private fun replaceFragment (fragment: Fragment){
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmenTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        fragmenTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmenTransaction.commit()
    }

}