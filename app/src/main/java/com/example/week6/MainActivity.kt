package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    var foods = arrayOf(
        "Planetfall",
        "The Magus Cypher",
        "Feast of Abscession",
        "Benevolent Companion",
        "Bladeform Legacy",
        "Great Sage's Reckoning",
        "Tempest Helm of the Thundergod",
        "Frost Avalanche",
        "Manifold Paradox",
        "Demon Eater",
        "Swine of the Sunken Galley Bundle",
        "Fractal Horns of Inner Abysm",
        "Blades of Voth Domosh",
        "Fiery Soul of the Slayer",
        "Yung Invoker",
        "Kindred of the Iron Dragon",
        "Swift Claw",
        "Blade of Tears",
        "Pale Mausoleum",
        "Rapiers of the Burning God"
    )
    var arrImg = arrayOf(
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/3/3d/Cosmetic_icon_Planetfall.png/200px-Cosmetic_icon_Planetfall.png?version=85795d7399433d177d8f880ba81b43fd",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/a/a9/Cosmetic_icon_The_Magus_Cypher.png/200px-Cosmetic_icon_The_Magus_Cypher.png?version=2ada2171681c1a8b75004e2d7fe0191f",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/c/c9/Cosmetic_icon_Feast_of_Abscession.png/200px-Cosmetic_icon_Feast_of_Abscession.png?version=34912cccdec308e25a6f11cb6a8e38e8",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/c/c4/Cosmetic_icon_Benevolent_Companion.png/200px-Cosmetic_icon_Benevolent_Companion.png?version=1815c6c5a2b13a56dbf621bc7bb93864",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/5/5c/Cosmetic_icon_Bladeform_Legacy.png/200px-Cosmetic_icon_Bladeform_Legacy.png?version=fb593eb6c906520afafd1bdf0d20f6f5",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/9/92/Cosmetic_icon_Great_Sage%27s_Reckoning.png/200px-Cosmetic_icon_Great_Sage%27s_Reckoning.png?version=c7f2f48afa93c17fd1a8f7894f7baac3",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/3/3b/Cosmetic_icon_Tempest_Helm_of_the_Thundergod.png/200px-Cosmetic_icon_Tempest_Helm_of_the_Thundergod.png?version=19c790493fe2914c393ec6dc2aeaa188",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/2/2f/Cosmetic_icon_Frost_Avalanche.png/200px-Cosmetic_icon_Frost_Avalanche.png?version=57e65265af16074b928a67ffa54ddd68",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/0/0c/Cosmetic_icon_Manifold_Paradox.png/200px-Cosmetic_icon_Manifold_Paradox.png?version=5b754ea1111c5eea6f9a9d223707c58a",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/8/81/Cosmetic_icon_Demon_Eater.png/200px-Cosmetic_icon_Demon_Eater.png?version=4c6e98535fffe8265fc7c5a8bfdf76c8",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/4/41/Cosmetic_icon_Swine_of_the_Sunken_Galley_Bundle.png/200px-Cosmetic_icon_Swine_of_the_Sunken_Galley_Bundle.png?version=5191e374d3c289b8243870908b9c9a64",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/a/a8/Cosmetic_icon_Fractal_Horns_of_Inner_Abysm.png/200px-Cosmetic_icon_Fractal_Horns_of_Inner_Abysm.png?version=d7e81b4dc2a45465ba99bb17556c37c9",
        "https://gamepedia.cursecdn.com/dota2_gamepedia/thumb/b/b1/Cosmetic_icon_Blades_of_Voth_Domosh.png/200px-Cosmetic_icon_Blades_of_Voth_Domosh.png?version=584d5a84c570d61e98a688d50518085e",
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