package com.logs.loglibrary

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.annotation.Keep

@Keep
class LogInfo {

      fun displayDebugLog(tag:String,message:String){
           Log.d(tag,message)
      }
    fun displayInfoLog(tag:String,message:String){
        Log.i(tag,message)
    }

    fun displayErrorLog(tag:String,message:String){
        Log.e(tag,message)
    }


    fun displayToast(ctx: Context,message:String ){
        Toast.makeText(ctx,message,Toast.LENGTH_LONG).show()
    }

    fun displayToastWithShortDuration(ctx: Context,message:String ){
        Toast.makeText(ctx,message,Toast.LENGTH_SHORT).show()
    }

}