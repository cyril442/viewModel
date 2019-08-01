package cyril.cieslak.viewmodel


import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: UserViewModel




    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MainActivity", "onCreate()")
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this)
            .get(UserViewModel::class.java)
//
//        viewModel.getLatitude("123test").observe(this, Observer { latitudeLongitude ->
//            Log.i("MainActivity", "UI received User : $latitudeLongitude")
//
//        })


        var latitude = Latitude("45.11111")





        supportFragmentManager.beginTransaction()
            .add(android.R.id.content, MainFragment())
            .commit()
//
//        viewModel = ViewModelProviders.of(this)
//            .get(UserViewModel::class.java)

        viewModel.getLatitudeLongitude("$latitude").observe(this, Observer { latitude ->
            Log.i("MainActivity", "UI received User : $latitude")

        })

    }




    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy()")
    }
}
