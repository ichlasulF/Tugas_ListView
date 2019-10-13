package com.example.tugas_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.app.Dialog;

import android.widget.TextView
import com.example.lv_icon.Model
import com.example.presiden_listv.MyListAdapter


class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        var list = mutableListOf<Model>()

        val dialog = Dialog(this@MainActivity)
        dialog.setContentView(R.layout.dialogcustom)

        dialog.setTitle("Deskripsi")


        list.add(Model("Ir. Soekarno",   "Presiden ke-1",   R.drawable.pres_1))
        list.add(Model("Soeharto",   "Presiden ke-2",   R.drawable.pres_2))
        list.add(Model("Bacharuddin Jusuf Habibie", "Presiden ke-3", R.drawable.pres_3 ))
        list.add(Model("Abdurrahman Wahid",  "Presiden ke-4",  R.drawable.pres_4  ))
        list.add(Model("Megawati Soekarnoputri",  "Presiden ke-5",  R.drawable.pres_5))
        list.add(Model("Susilo Bambang Yudhoyono",  "Presiden ke-6",  R.drawable.pres_6))
        list.add(Model("Prabowo Subianto",  "Pengen jadi presiden :(",  R.drawable.pres_7))

        listView.adapter = MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "SOEKARNO"
                dialog.show()

            }
            if (position==1){

                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "SOEHART0"
                dialog.show()

            }
            if (position==2){

                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "HABIBIE"
                dialog.show()

            }
            if (position==3){

                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "Gus Dur"
                dialog.show()

            }
            if (position==4){

                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "MEGAWATI"
                dialog.show()

            }
            if (position==5){
                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "SBY"
                dialog.show()
            }
            if (position==6){
                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "PAK WOWO"
                dialog.show()
            }
        }

    }
}

