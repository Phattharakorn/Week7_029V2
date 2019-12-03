package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    var foods = arrayOf(
        "Xiaomi Mi 3A",
        "Xiaomi Mi 9T",
        "Xiaomi Mi 9",
        "Xiaomi Mix 3",
        "Xiaomi Mi 8 Pro",
        "Xiaomi Mi 8",
        "Xiaomi Mi 8 Lite",
        "Xiaomi Mi Max 3",
        "Xiaomi Mi A2 Lite",
        "Xiaomi Mi A2",
        "Xiaomi Mix 2s",
        "Xiaomi Redmi Note 7",
        "Xiaomi Redmi Go",
        "Xiaomi Redmi Note 6 Pro",
        "Xiaomi Redmi 6A",
        "Xiaomi Redmi 6",
        "Xiaomi Redmi Note 5",
        "Xiaomi POCOPHONE F1",
        "Xiaomi Mi Smart Band 4",
        "Xiaomi Mi Smart Sensor Set"
    )
    var arrImg = arrayOf(
        "https://i01.appmifile.com/webfile/globalimg/Iris/mi-a3-800.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Iris/mi-9-t-800-blue.png?width=140&height=140",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/Mi9.png?width=140&height=140",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/green.png?width=140&height=140",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Mi8Pro.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Mi8.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Mi8Lite.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Max3.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/MiA2Lite.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/A2.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Mix2s.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/blue70.jpg?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Iris/redmi-go-200x200-Blue.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Redminote6pro.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Redmi6A.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Redmi6.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Redminote5.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Sukrita/70pz/Pocophonegrey.png?width=70&height=70",
        "https://i01.appmifile.com/webfile/globalimg/Iris/band-4-800.png?width=140&height=140",
        "https://i01.appmifile.com/webfile/globalimg/Iris/Mi-Smart-Sensor-Set-800.png?width=140&height=140"

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycleView) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.setLayoutManager(GridLayoutManager(this, 2))
        val myAdapter = AdapterRecycleView(foods,arrImg,this)
        recyclerView!!.setAdapter(myAdapter)
    }
}