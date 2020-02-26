package com.example.ormsample
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    private var userModel:UserModel = UserModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boxStore = BaseApplication.getApp().boxStore
        val userBox = boxStore.boxFor(UserModel::class.java)
        userBox.removeAll()
        userModel = UserModel()

        val userList: ArrayList<UserModel> = ArrayList()

        /**
         * put new records//////////////////////////////
         */

        for (i in 0 until  10) {
            userList.add(UserModel(1000.toDouble()))
            userBox.put(userList)
        }

        /**
         * get all records//////////////////////////////
         */

        for (i in 0 until  userBox.all.size-1) {
            Log.d("data", userList[i].price.toString())
        }


        var user = userBox.all
        Log.d("data", "Todo list size: " + user.size)

        /**
         * get record with condition/////////////////////
         */



        val users = userBox.query().equal(UserModel_.name, "farhan 4").build().find()
        Log.d("data2 ","User query size: " + users.size)

    }

}
