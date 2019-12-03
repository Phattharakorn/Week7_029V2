package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    var foods = arrayOf(
        "AMD RX5700XT MSI MECH OC",
        "GeForce 510",
        "GeForce GT 520",
        "GeForce GT 530",
        "1060 6gb asus",
        "GEFORCE GTX 1070 TI",
        "GeForce GTX 1080 Ti 11GB",
        "MSI GTX 1050 Ti GAMING X 4G",
        "GEFORCE RTX 2060 SUPER",
        "GEFORCE RTX 2070 SUPER",
        "GEFORCE RTX 2080 SUPER",
        "GEFORCE GTX 1650 SUPER",
        "GTX 1660 OC edition 6gB",
        "",
        "Yung Invoker",
        "Kindred of the Iron Dragon",
        "Swift Claw",
        "Blade of Tears",
        "Pale Mausoleum",
        "Rapiers of the Burning God"
    )
    var arrImg = arrayOf(
        "https://fi.lnwfile.com/4na6it.png",
        "http://images.nvidia.com/products/geforce-gt-520/geforce-gt-520-3qtr-low.png",
        "https://images-na.ssl-images-amazon.com/images/I/817e73gCieL._SX466_.jpg",
        "https://i.ebayimg.com/images/g/uOMAAOSwG4ZdqOF3/s-l640.jpg",
        "https://jib.co.th/img_master/product/original/2019012209500423168_1.jpg",
        "https://www.jib.co.th/img_master/product/original/20180711161307-11963954.jpg",
        "http://ustatic.priceza.com/img/productgroup/328337-1-l.jpg",
        "https://www.jib.co.th/img_master/product/original/20180723095111_23623_72_1.jpg",
        "https://www.jib.co.th/img_master/product/original/2019081411260234773_1.jpg",
        "https://www.jib.co.th/img_master/product/original/2019071010180934452_1.png",
        "https://www.jib.co.th/img_master/product/original/2019072416151634558_1.jpg",
        "https://www.jib.co.th/img_master/product/original/2019112515422835804_1.jpg",
        "https://www.asus.com/media/global/products/x03AiX1wsU0ZEklC/P_setting_000_1_90_end_500.png",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/7/77/Cosmetic_icon_Fiery_Soul_of_the_Slayer.png/200px-Cosmetic_icon_Fiery_Soul_of_the_Slayer.png?version=ce2299c7b223bfcfdff664bc129bdc62",
        "https://cdn.estnn.com/wp-content/uploads/2019/07/20022808/acolyte-1.jpg",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/a/a3/Cosmetic_icon_Kindred_of_the_Iron_Dragon.png/100px-Cosmetic_icon_Kindred_of_the_Iron_Dragon.png?version=79111cf0fb4f032723ce6f95be67f8a2",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/0/0d/Cosmetic_icon_Swift_Claw.png/100px-Cosmetic_icon_Swift_Claw.png?version=65224104caf4e29ff2ab233152f7ba61",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/0/0d/Cosmetic_icon_Swift_Claw.png/100px-Cosmetic_icon_Swift_Claw.png?version=65224104caf4e29ff2ab233152f7ba61",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/8/87/Cosmetic_icon_Pale_Mausoleum.png/100px-Cosmetic_icon_Pale_Mausoleum.png?version=50ad119d9fa863bcc8acff16829af9a4",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/2/24/Cosmetic_icon_Rapiers_of_the_Burning_God.png/100px-Cosmetic_icon_Rapiers_of_the_Burning_God.png?version=6fdf794c995349a17fdf81592e5e44cd"

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