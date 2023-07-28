package com.example.listviewproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class FruitAdapter(private val context: Context, private val fruitList: ArrayList<FruitClass>) :
    BaseAdapter() {
    override fun getCount(): Int {
        return fruitList.size
    }

    /**
     * here return Type can be Any, Int or FruitClass
     * But i used FruitClass because in getView() there is a place where i need to access the id of the fruit_item
     */
    override fun getItem(position: Int): FruitClass {
        return fruitList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        val inflater: LayoutInflater = LayoutInflater.from(context)
//        val view: View = inflater.inflate(R.layout.fruit_item, null)


        var fruitView = convertView
        if (fruitView == null) {
            fruitView = LayoutInflater.from(context).inflate(R.layout.fruit_item, parent, false)
        }
        /**
         * if you use fruitList[position] give item index like
         * fruitImage.setImageResource(fruitList[position].fruitImg)
         *
         * except using this use this
         * val currentItem = getItem(position)
         */
        val currentItem = getItem(position)

        val fruitImage: ImageView = fruitView!!.findViewById(R.id.FruitImg)
        val fruitTitle: TextView = fruitView.findViewById(R.id.FruitTitle)
        val fruitDescription: TextView = fruitView.findViewById(R.id.FruitDes)
        val fruitTime: TextView = fruitView.findViewById(R.id.FruitTime)



        fruitImage.setImageResource(currentItem.fruitImg)
        fruitTitle.text = currentItem.fruitTitle
        fruitDescription.text = currentItem.fruitDes
        fruitTime.text = currentItem.fruitTime

        return fruitView
    }


}