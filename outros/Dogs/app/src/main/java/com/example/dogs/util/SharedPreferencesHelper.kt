package com.example.dogs.util

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager

class SharedPreferencesHelper {

    companion object {
        private const val PREFE_TIME = "pref time"
        private var prefs: SharedPreferences? = null
        @Volatile private var instance: SharedPreferencesHelper? = null
        private val LOCK = Any()

        operator fun invoke(context : Context): SharedPreferencesHelper = instance ?: synchronized(LOCK) {
            instance ?: buildHelper(context).also {
                instance = it
            }
        }
        private fun buildHelper(context: Context) : SharedPreferencesHelper{
            prefs = PreferenceManager.getDefaultSharedPreferences(context)
            return SharedPreferencesHelper()
        }
    }

    fun getUpdateTime() = prefs?.getLong(PREFE_TIME, 0)

    fun saveUpdateTime(time: Long){
        prefs?.edit(commit = true){
            putLong(PREFE_TIME, time)
        }
    }

    // aula 59
    fun getCacheDuration() = prefs?.getString("pref_cache_duration", "")
}