package com.example.netcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast

class MainPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        val ivMovie1: ImageView = findViewById(R.id.iv_movie1)
        val ivMovie2: ImageView = findViewById(R.id.iv_movie2)
        val ivMovie3: ImageView = findViewById(R.id.iv_movie3)
        val ivMovie4: ImageView = findViewById(R.id.iv_movie4)
        val ivMovie5: ImageView = findViewById(R.id.iv_movie5)
        val ivMovie6: ImageView = findViewById(R.id.iv_movie6)

        val profileImageView = listOf(
            findViewById<ImageView>(R.id.iv_profile1),
            findViewById<ImageView>(R.id.iv_profile2),
            findViewById<ImageView>(R.id.iv_profile3),
            findViewById<ImageView>(R.id.iv_profile4),
            findViewById<ImageView>(R.id.iv_profile5),
        )


//        ivProfile1.setOnClickListener {
//            val intent = Intent(this, ProfilePageHeyrin::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
//        }
//        ivProfile2.setOnClickListener {
//            val intent = Intent(this, ProfilePageJina::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
//        }
//        ivProfile3.setOnClickListener {
//            val intent = Intent(this, ProfilePageYongseok::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
//        }
//        ivProfile4.setOnClickListener {
//            val intent = Intent(this, ProfilePageMinji::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
//        }
//        ivProfile5.setOnClickListener {
//            val intent = Intent(this, ProfilePageDonghyun::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
//        }

        ivMovie1.setOnClickListener {
            val intent = Intent(this, MovieDetailPage1::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
            Toast.makeText(this,"마녀 페이지", Toast.LENGTH_SHORT).show()
        }
        ivMovie2.setOnClickListener {
            val intent = Intent(this, MovieDetailPage2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
            Toast.makeText(this,"행오버3 페이지", Toast.LENGTH_SHORT).show()
        }
        ivMovie3.setOnClickListener {
            val intent = Intent(this, MovieDetailPage3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
            Toast.makeText(this,"라라랜드 페이지", Toast.LENGTH_SHORT).show()
        }
        ivMovie4.setOnClickListener {
            val intent = Intent(this, MovieDetailPage4::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
            Toast.makeText(this,"극한직업 페이지", Toast.LENGTH_SHORT).show()
        }
        ivMovie5.setOnClickListener {
            val intent = Intent(this, MovieDetailPage5::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
            Toast.makeText(this,"아저씨 페이지", Toast.LENGTH_SHORT).show()
        }
        ivMovie6.setOnClickListener {
            val intent = Intent(this, MovieDetailPage6::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.slide_left_exit)
            Toast.makeText(this,"테이큰 페이지", Toast.LENGTH_SHORT).show()
        }
    }
}