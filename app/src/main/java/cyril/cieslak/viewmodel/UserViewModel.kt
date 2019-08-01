package cyril.cieslak.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log

class UserViewModel : ViewModel () {


   val latitude = MutableLiveData<Latitude>()



    fun getLatitudeLongitude(latitude : String) : LiveData<Latitude> {
           loadLatitudeLongitude(latitude)
        return this.latitude
    }

    fun loadLatitudeLongitude(latitude: String) {
               this.latitude.value = Latitude("$latitude")

              Log.i("UserViewModel", "latitude : $latitude")

    }

//    fun getTheLatitude() : String {
////       var theLat = loadLatitudeLongitude(latitude.value.toString())
////        var theLatOne = theLat.toString()
//
//        latitude.value =
//        //   var lat = getLatitudeLongitude(latitude).value.toString()
//     //   var thelat =lat
//       // var theLatOne = getLatitudeLongitude(latitude.toString()).value.toString()
//        Log.i("UserViewModel", "theLAT : $thelat")
//       return thelat
//    }

//    fun theLatitude() : String {
//
//        var latitude = getLatitudeLongitude(latitude.toString(), latitude.).value
//    }




//    init {
//        Log.i("UserViewModel", "init()")
//    }
//
//    override fun onCleared() {
//        super.onCleared()
//        Log.i("UserViewModel", "onCleared()")
//    }
}