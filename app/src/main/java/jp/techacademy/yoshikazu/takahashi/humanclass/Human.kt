package jp.techacademy.yoshikazu.takahashi.humanclass

import android.util.Log

class Human: Animal, Thinkable {
     var hobby: String

    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name+"です。年は"+this.age+"です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は"+this.hobby +"について考える。")
    }
}