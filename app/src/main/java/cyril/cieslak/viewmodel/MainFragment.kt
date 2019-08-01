package cyril.cieslak.viewmodel

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlin.properties.Delegates

class MainFragment : Fragment() {

   private lateinit var viewModel: UserViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

              // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)





        viewModel = ViewModelProviders.of(this)
            .get(UserViewModel::class.java)



        viewModel.latitude.observe(this, Observer { newLatitude ->

//            Log.i("MainFragment", " LA newLATITUDE : $newLatitude")
//
           val lat =  view!!.findViewById<TextView>(R.id.textViewFragment)
//            val latTest = "123456"


                lat.text = newLatitude!!.latitude


        } )




        }



    }

