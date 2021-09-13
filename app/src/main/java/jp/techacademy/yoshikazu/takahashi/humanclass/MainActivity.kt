package jp.techacademy.yoshikazu.takahashi.humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("佐藤", 30, "自転車")
        human.say()
        human.think()

        val human2 = Human("鈴木", 40, "ゴルフ")
        human2.say()
        human2.think()
    }
}