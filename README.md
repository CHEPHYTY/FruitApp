# Android FRUITSTORY app Using LISTVIEW TUTORIAL

## FruitList App

> OBJECTIVE: This is Short Tutorial for Using List View and custom Adapter to Set Data dynamically.

[![Watch the video](https://github.com/CHEPHYTY/FruitApp/assets/101518415/8353b091-d950-4ae8-bc29-8eba29aeda1d)](https://youtu.be/TL0QPJc8GZk)

> [To Watch the video click on the picture](https://youtu.be/TL0QPJc8GZk)

# Lets Start the Tutorial.

### There are Few Steps to Get the Listview Responsive

### In this App we used static data to Create ListView

- STEP 1: Add all the Resource file to the drawable file and add all the extra color and string want to use it to respective resource file.
- STEP 2: Create a ListView in MainActivity.xml and give it a ID.
- STEP 3: For Item Display create a separete resource file (xml file) to show data properly.
- STEP 4: Create a Data Class.
- STEP 5: Create a Adapter for the ListView. In our case we used BASE_Adapter to extend adapter
- STEP 6: Create Another Activity to Show Data Exclusively.

- STEP 7: Share Data among activity using Itent.

---

### STEP 1:

Add all the Resource file to the drawable file and add all the extra color and string want to use it to respective resource file.

- Image Resource

![image](https://github.com/CHEPHYTY/FruitApp/assets/101518415/d02de453-eda2-42a5-b5a6-a8f800bf2283)


- Color Resource

![Color Data](https://github.com/CHEPHYTY/FruitApp/assets/101518415/f818eb59-8738-44fb-b9b6-6dde70d4b521)


---

### STEP 2:

Create a ListView in MainActivity.xml and give it a ID.

![LIst View](https://github.com/CHEPHYTY/FruitApp/assets/101518415/bdbe04bf-2b2b-4c61-ac2c-59293027d470)


### STEP 3:

For Item Display create a separete resource file (xml file) to show data properly.

TO DO so got to Layout Folder >> Right Click >> New >> Layout Resource File and give Name In our case we use **"fruit_item"** as Name






### STEP 4:

Create a Data Class.

To do so folder >> Right click >> New >> Kotlin Class/File >> Name

in our Case We Named as **"FruitClass"**

## ![List View](image-3.png)


### STEP 5:

In our case we create Adapter Called **"FruitAdapter"**

### Code :

''' Kotlin

    class FruitAdapter(private val context: Context, private val fruitList: ArrayList<FruitClass>) : BaseAdapter() {
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
'''

---

### STEP 6:

Create Another Activity to Show Data Exclusively.

Folder >> RightClick >> New >> Activity >> EmptyActivity

<video src="20230728-1256-07.6168847.mp4" controls title="Title"></video>

### STEP 7:

Create a Intent in main activity and use **putExtra()** share data

Code:

'''kotlin

            myListView.setOnItemClickListener { parent, view    position, id ->
            val fruit = myFruitList[position]

            val fruitImg = fruit.fruitImg
            val fruitTit = fruit.fruitTitle
            val fruitDes = fruit.fruitDes
            val fruitTime = fruit.fruitTime
            val fruitTag = fruit.TagNo.toString()
            val fruitStory = fruit.Story


            val i = Intent(this, FruitStory::class.java)
            i.putExtra("Image",fruitImg)
            i.putExtra("name", fruitTit)
            i.putExtra("Description", fruitDes)
            i.putExtra("Time", fruitTime)
            i.putExtra("Tag", fruitTag)
            i.putExtra("Story", fruitStory)

            startActivity(i)

        }

'''

Recieve and put Data to container

'''Kotlin

     val fruitImg = intent.getIntExtra("Image", R.drawable.apple)
        val fruitTit = intent.getStringExtra("name")
        val fruitDes = intent.getStringExtra("Description")
        val fruitTime = intent.getStringExtra("Time")
        val fruitTag = intent.getStringExtra("Tag")
        val fruitStory = intent.getStringExtra("Story")

        var fImage = findViewById<ImageView>(R.id.FrImg)
        var fTitle = findViewById<TextView>(R.id.FTitle)
        var fDescription = findViewById<TextView>(R.id.FDes)
        var fTime = findViewById<TextView>(R.id.FTime)
        var fTag = findViewById<TextView>(R.id.FTag)
        var fStory = findViewById<TextView>(R.id.FStory)


        fImage.setImageResource(fruitImg)
        fTitle.text = fruitTit
        fDescription.text = fruitDes
        fTime.text = fruitTime
        fTag.text = fruitTag
        fStory.text = fruitStory

'''

Good bye See YOU Soon 🤗🤗🤗🤗🤗🤗
