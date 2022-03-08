package com.example.dogs.view

//import android.support.v7.app.AppCompatActivity

import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.dogs.R
import com.example.dogs.util.PERMISSION_SEND_SMS
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment  // fragmentContainerView is the name of my fragment. In this video he called it fragment. Also, need to import NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController,null)
    }
    /*fun checkSmsPermission(){
        if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.SEND_SMS)){
                AlertDialog.Builder(this)
                    .setTitle("Send SMS permission")
                    .setMessage("This app requires access to send as SMS.")
                    .setPositiveButton("Ask me"){
                        dialog: DialogInterface, which: int ->
                            requestSmsPermission()
                    }
                    .setNegativeButton("No") {
                            dialog: DialogInterface, which: int ->
                            notifyDetailFragment(false)
                    }
                    .show()
            }else {
                requestSmsPermission()
            }


        }else {
            notifyDetailFragment(true)
        }

    }*/
    private fun requestSmsPermission(){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS), PERMISSION_SEND_SMS)
    }
/*
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when(requestCode) {
            PERMISSION_SEND_SMS ->{
                if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    notifyDetailFragment(permissionGranted = true)
                }else{
                    notifyDetailFragment(permissionGranted = false)
                }
            }
        }
    }*/
    /*private fun notifyDetailFragment(permissionGranted : Boolean){
        val activeFragment :Fragment? = fragment.childFragmentManager.primaryNavigationFragment
        if(activeFragment is DetailFragment){
            (activeFragment as DetailFragment).onPermissionResult(permissionGranted)
        }
    }*/
}