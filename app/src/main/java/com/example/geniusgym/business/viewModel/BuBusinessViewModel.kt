package com.example.geniusgym.business.viewModel

import android.app.AlertDialog
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.geniusgym.R
import com.example.geniusgym.business.model.Business
import com.example.geniusgym.sharedata.MeShareData
import com.google.gson.JsonObject
import com.example.geniusgym.business.core.service.requestTask
import java.text.SimpleDateFormat
import java.util.*

class BuBusinessViewModel: ViewModel() {
    val buz: MutableLiveData<Business> by lazy { MutableLiveData<Business>() }
    val url = MeShareData.javaWebUrl + "buBuz"

    fun genToString():String? {
        if (buz.value?.b_gen == 0){
            return "女"
        }
        if (buz.value?.b_gen == 1){
            return "男"
        }
        return null
    }

    fun timeToString():String? {
        val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return buz.value?.b_start_date?.let { format.format(it) }
    }

    fun Suspend(view: View){
        if (buz.value!!.b_sus == true) {
            AlertDialog.Builder(view.context)
                .setMessage("確定將此用戶停權?")
                .setPositiveButton("是") { _, _ ->
                    buz.value.run {
                        requestTask<JsonObject>(url, "DELETE", buz.value)
                        println(buz.value)
                        Navigation.findNavController(view).navigate(R.id.buBusinessDataFragment)
                    }
                }
                .setCancelable(true)
                .show()
        }else{
            AlertDialog.Builder(view.context)
            .setMessage("確定將此用戶解除停權?")
            .setPositiveButton("是") { _, _ ->
                buz.value.run {
                    requestTask<JsonObject>(url, "DELETE", buz.value)
                    println(buz.value)
                    Navigation.findNavController(view).navigate(R.id.buBusinessDataFragment)
                }
            }
            .setCancelable(true)
            .show()}
        true
    }

}