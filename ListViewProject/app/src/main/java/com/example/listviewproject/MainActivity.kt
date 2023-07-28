package com.example.listviewproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myFruitList = ArrayList<FruitClass>()
        myFruitList.add(
            FruitClass(
                R.drawable.apple,
                "Apple",
                "Good for Health",
                "Morning",
                988988,
                "Once upon a time, there was an apple tree that grew in a small village. The tree was very old and gnarled, and it had seen many seasons come and go. But one day, something strange happened. A small apple sprouted on the tree, and it was unlike any other apple that had ever grown there before.\n" +
                        "\n" +
                        "The apple was a deep, dark red, and it was as shiny as a polished gem. It was also much larger than the other apples on the tree, and it had a strange, sweet smell that filled the air.\n" +
                        "\n" +
                        "The villagers were curious about the apple, and they soon began to whisper about it. Some people said that it was a magical apple, while others said that it was poisonous. But no one dared to eat it.\n" +
                        "\n" +
                        "One day, a young girl named Alice was playing in the forest near the village. She saw the apple tree, and she was immediately drawn to the strange, beautiful apple. She picked it up and took a bite.\n" +
                        "\n" +
                        "The apple was delicious. It was the sweetest thing that Alice had ever tasted. She ate the whole apple, and then she felt a strange tingling sensation all over her body.\n" +
                        "\n" +
                        "Suddenly, Alice felt like she could do anything. She felt stronger, faster, and smarter than she had ever felt before. She could run and jump higher than she ever could before, and she could solve problems that she had never been able to solve before.\n" +
                        "\n" +
                        "Alice realized that the apple had given her magical powers. She could do anything she set her mind to. She could help people, solve problems, and make the world a better place.\n" +
                        "\n" +
                        "Alice used her powers to help the villagers. She cured the sick, helped the poor, and protected the innocent. She became a beloved figure in the village, and she was known as the \"Apple Girl.\"\n" +
                        "\n" +
                        "One day, a group of bandits came to the village. They were planning to rob the villagers and burn the village to the ground. But Alice was there to stop them. She used her powers to defeat the bandits, and she saved the village.\n" +
                        "\n" +
                        "The villagers were so grateful to Alice that they built a statue of her in the town square. The statue showed Alice holding the apple, and it was a reminder to everyone of the power of kindness and compassion.\n" +
                        "\n" +
                        "Alice lived a long and happy life, and she used her powers to make the world a better place. She was a true hero, and she will never be forgotten.\n" +
                        "\n" +
                        "I hope you enjoyed this story!"
            )
        )
        myFruitList.add(
            FruitClass(
                R.drawable.avocados,
                "Avocado",
                "Good for Ear",
                "Dusk",
                689689,
                "Once upon a time, there was a young woman named Ava who lived in a small village. Ava was a kind and generous person, but she was also very poor. She worked hard every day, but she could barely make enough money to feed herself.\n" +
                        "\n" +
                        "One day, Ava was walking through the forest when she came across a strange tree. The tree was covered in large, green fruits that Ava had never seen before. She took a closer look, and she saw that the fruits were avocados.\n" +
                        "\n" +
                        "Ava had never eaten an avocado before, but she was curious. She picked one of the fruits and took a bite. The avocado was delicious! It was creamy, nutty, and slightly sweet. Ava had never tasted anything like it.\n" +
                        "\n" +
                        "Ava decided to take some of the avocados home with her. She shared them with her neighbors, and they all loved them. Ava soon became known as the \"Avocado Lady.\"\n" +
                        "\n" +
                        "Ava's avocados were so popular that she started selling them at the market. She made enough money to buy a new house for herself and her family. She also started a foundation to help other poor people in her village.\n" +
                        "\n" +
                        "Ava lived a long and happy life. She was known for her kindness, generosity, and her love of avocados. She was a true inspiration to everyone who knew her.\n" +
                        "\n" +
                        "The end."
            )
        )
        myFruitList.add(
            FruitClass(
                R.drawable.banana,
                "Banana",
                "Keep Body Energetic",
                "Morning",
                789789,
                "Once upon a time, there was a young boy named Banana who lived in a small village. Banana was a kind and gentle boy, but he was also very shy. He didn't have many friends, and he often felt lonely.\n" +
                        "\n" +
                        "One day, Banana was walking through the forest when he came across a strange creature. The creature was small and green, with a long tail and big ears. Banana had never seen anything like it before.\n" +
                        "\n" +
                        "The creature looked up at Banana and said, \"Hello. My name is Bob.\"\n" +
                        "\n" +
                        "Banana was surprised. He didn't know that creatures like Bob existed.\n" +
                        "\n" +
                        "\"What are you?\" Banana asked.\n" +
                        "\n" +
                        "\"I'm a banana fairy,\" Bob said. \"I'm here to help you.\"\n" +
                        "\n" +
                        "Banana was confused. \"Help me with what?\" he asked.\n" +
                        "\n" +
                        "\"I'm here to help you make friends,\" Bob said. \"I know you're shy, but I can help you overcome that.\"\n" +
                        "\n" +
                        "Banana wasn't sure if he believed Bob, but he was willing to give it a try.\n" +
                        "\n" +
                        "Bob took Banana's hand and led him through the forest. They came to a clearing, and in the middle of the clearing was a group of children playing.\n" +
                        "\n" +
                        "\"These are my friends,\" Bob said. \"I'm going to introduce you to them.\"\n" +
                        "\n" +
                        "Bob led Banana over to the children, and they all introduced themselves. Banana was nervous at first, but Bob helped him to relax. He told Banana jokes, and he made him laugh.\n" +
                        "\n" +
                        "Banana soon realized that he was having fun. He started to talk to the other children, and he made some new friends.\n" +
                        "\n" +
                        "Banana was so happy. He had finally found a way to overcome his shyness. He thanked Bob for helping him, and Bob said, \"You're welcome. I'm glad I could help.\"\n" +
                        "\n" +
                        "Banana and Bob continued to be friends. They would often go on adventures together in the forest. Banana was no longer shy, and he had many friends. He was a happy boy, and he knew that he would never forget Bob, the banana fairy.\n" +
                        "\n" +
                        "The end."
            )
        )
        myFruitList.add(
            FruitClass(
                R.drawable.coconut,
                "Coconut",
                "Best For Skin",
                "Afternoon",
                453453,
                "Once upon a time, there was a young girl named Coco who lived on a small island in the tropics. Coco loved coconuts. She loved the way they tasted, the way they smelled, and the way they made her feel.\n" +
                        "\n" +
                        "One day, Coco was playing in the forest when she came across a coconut tree that was unlike any other tree she had ever seen. The tree was huge, and it was covered in coconuts. Coco had never seen so many coconuts in one place.\n" +
                        "\n" +
                        "Coco climbed up the tree and picked a coconut. She took a bite, and she was amazed by how delicious it was. The coconut was sweet and creamy, and it had a hint of tropical flavor.\n" +
                        "\n" +
                        "Coco ate the whole coconut, and then she decided to take the rest of the coconuts home with her. She filled her basket with coconuts, and she started to walk back to her village.\n" +
                        "\n" +
                        "As Coco was walking, she saw a group of children playing in the forest. The children were all thirsty, and they were looking for something to drink.\n" +
                        "\n" +
                        "Coco remembered the coconuts in her basket, and she had an idea. She gave the children the coconuts, and the children were so happy. They drank the coconut water, and they ate the coconut flesh.\n" +
                        "\n" +
                        "The children thanked Coco for the coconuts, and they told her that she was a hero. Coco was so happy. She knew that she had made a difference in the lives of the children.\n" +
                        "\n" +
                        "Coco continued to give coconuts to the children in her village. She also started to sell coconuts at the market. Coco's coconuts were so popular that she soon became known as the \"Coconut Girl.\"\n" +
                        "\n" +
                        "Coco lived a long and happy life. She was known for her kindness, generosity, and her love of coconuts. She was a true inspiration to everyone who knew her.\n" +
                        "\n" +
                        "The end."
            )
        )
        myFruitList.add(
            FruitClass(
                R.drawable.graps,
                "Grape",
                "Keep Blood Clean",
                "Afternoon",
                243243,
                "Once upon a time, there was a young girl named Grape who lived in a small village. Grape was a kind and generous girl, but she was also very shy. She didn't have many friends, and she often felt lonely.\n" +
                        "\n" +
                        "One day, Grape was walking through the forest when she came across a strange creature. The creature was small and green, with a long tail and big ears. Grape had never seen anything like it before.\n" +
                        "\n" +
                        "The creature looked up at Grape and said, \"Hello. My name is Grapevine.\"\n" +
                        "\n" +
                        "Grape was surprised. She didn't know that creatures like Grapevine existed.\n" +
                        "\n" +
                        "\"What are you?\" Grape asked.\n" +
                        "\n" +
                        "\"I'm a grape fairy,\" Grapevine said. \"I'm here to help you.\"\n" +
                        "\n" +
                        "Grape was confused. \"Help me with what?\" she asked.\n" +
                        "\n" +
                        "\"I'm here to help you make friends,\" Grapevine said. \"I know you're shy, but I can help you overcome that.\"\n" +
                        "\n" +
                        "Grape wasn't sure if she believed Grapevine, but she was willing to give it a try.\n" +
                        "\n" +
                        "Grapevine took Grape's hand and led her through the forest. They came to a clearing, and in the middle of the clearing was a group of children playing.\n" +
                        "\n" +
                        "\"These are my friends,\" Grapevine said. \"I'm going to introduce you to them.\"\n" +
                        "\n" +
                        "Grapevine led Grape over to the children, and they all introduced themselves. Grape was nervous at first, but Grapevine helped her to relax. She told Grape jokes, and she made her laugh.\n" +
                        "\n" +
                        "Grape soon realized that she was having fun. She started to talk to the other children, and she made some new friends.\n" +
                        "\n" +
                        "Grape was so happy. She had finally found a way to overcome her shyness. She thanked Grapevine for helping her, and Grapevine said, \"You're welcome. I'm glad I could help.\"\n" +
                        "\n" +
                        "Grape and Grapevine continued to be friends. They would often go on adventures together in the forest. Grape was no longer shy, and she had many friends. She was a happy girl, and she knew that she would never forget Grapevine, the grape fairy.\n" +
                        "\n" +
                        "The end.\n" +
                        "\n" +
                        "I hope you enjoyed this story!"
            )
        )
        myFruitList.add(
            FruitClass(
                R.drawable.orange,
                "Orange",
                "Keep Stomach in Check",
                "Dawn",
                515515,
                "Once upon a time, there was a young girl named Orange who lived in a small village. Orange was a kind and generous girl, but she was also very shy. She didn't have many friends, and she often felt lonely.\n" +
                        "\n" +
                        "One day, Orange was walking through the forest when she came across a strange tree. The tree was covered in bright orange fruits that Orange had never seen before. She took a closer look, and she saw that the fruits were oranges.\n" +
                        "\n" +
                        "Orange had never eaten an orange before, but she was curious. She picked one of the fruits and took a bite. The orange was delicious! It was sweet and juicy, and it had a hint of citrus flavor.\n" +
                        "\n" +
                        "Orange decided to take some of the oranges home with her. She shared them with her neighbors, and they all loved them. Orange soon became known as the \"Orange Girl.\"\n" +
                        "\n" +
                        "Orange's oranges were so popular that she started selling them at the market. She made enough money to buy a new house for herself and her family. She also started a foundation to help other poor people in her village.\n" +
                        "\n" +
                        "Orange lived a long and happy life. She was known for her kindness, generosity, and her love of oranges. She was a true inspiration to everyone who knew her.\n" +
                        "\n" +
                        "One day, Orange was visited by a fairy. The fairy told Orange that she was a special girl, and that she had been chosen to have a magical adventure.\n" +
                        "\n" +
                        "The fairy led Orange to a secret door in the forest. Orange opened the door, and she found herself in a magical land. The land was filled with orange trees, and the air was filled with the smell of oranges.\n" +
                        "\n" +
                        "Orange spent the next few days exploring the magical land. She met all sorts of interesting creatures, including talking animals, fairies, and elves. She also had many adventures, including a battle with a dragon.\n" +
                        "\n" +
                        "At the end of her adventure, Orange returned to her village. She was a changed girl. She was no longer shy, and she had many friends. She was also a more confident and courageous person.\n" +
                        "\n" +
                        "Orange continued to sell oranges, but she also used her newfound skills to help others. She started a school for children in her village, and she also started a program to help poor people.\n" +
                        "\n" +
                        "Orange lived a long and happy life. She was known for her kindness, generosity, and her love of oranges. She was a true inspiration to everyone who knew her.\n" +
                        "\n" +
                        "The end.\n" +
                        "\n" +
                        "I hope you enjoyed this story!"
            )
        )
        myFruitList.add(
            FruitClass(
                R.drawable.watermelon,
                "Watermelon",
                "Keep Body Hydrated in Summer",
                "Afternoon",
                912912,
                "The Watermelon Seed\n" +
                        "\n" +
                        "Once upon a time, there was a young crocodile named Croc who loved watermelons. He loved the way they tasted, the way they felt, and the way they made him feel.\n" +
                        "\n" +
                        "One day, Croc was playing in the river when he saw a watermelon floating by. He swam over to the watermelon and took a bite. The watermelon was delicious! It was sweet and juicy, and it had a hint of sweetness.\n" +
                        "\n" +
                        "Croc ate the whole watermelon, and then he decided to take the watermelon seed home with him. He planted the seed in a pot, and he watered it every day.\n" +
                        "\n" +
                        "A few days later, a small sprout appeared in the pot. Croc was so excited! He watered the sprout every day, and it grew bigger and bigger.\n" +
                        "\n" +
                        "A few weeks later, the sprout turned into a small watermelon plant. Croc was so happy! He continued to water the plant, and it grew bigger and bigger.\n" +
                        "\n" +
                        "A few months later, the watermelon plant was full of watermelons. Croc was so excited! He picked one of the watermelons and took a bite. The watermelon was delicious! It was even better than the first watermelon he had eaten.\n" +
                        "\n" +
                        "Croc ate all of the watermelons, and he saved the seeds. He planted the seeds in the ground, and he grew more watermelon plants.\n" +
                        "\n" +
                        "Croc became known as the \"Watermelon Crocodile.\" He would often share his watermelons with the other animals in the river. The animals loved Croc's watermelons, and they were always grateful for his generosity.\n" +
                        "\n" +
                        "Croc lived a long and happy life. He was known for his love of watermelons, and he was always willing to share his watermelons with others. He was a true inspiration to everyone who knew him.\n" +
                        "\n" +
                        "The end.\n" +
                        "\n" +
                        "I hope you enjoyed this story!"
            )
        )

        val myListView = findViewById<ListView>(R.id.ListView)
        myListView.adapter = FruitAdapter(this, myFruitList)
        myListView.setOnItemClickListener { parent, view, position, id ->
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
//            i.putIntExtra("Tag",fruitTag)
            i.putExtra("Tag", fruitTag)
            i.putExtra("Story", fruitStory)

            startActivity(i)

        }

    }
}