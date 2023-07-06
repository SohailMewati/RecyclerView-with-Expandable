package com.sohel.rvexpandable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sohel.rvexpandable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var mainBinding: ActivityMainBinding? = null
    val binding get() = mainBinding!!

    var languagesList = ArrayList<Languages>()
    lateinit var rvAdapter: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding!!.root)

        // set layout manager to the recyclerView
        binding.recyclerViewList.layoutManager = LinearLayoutManager(this)

        // Attach adapter to to the recyclerView
        rvAdapter = RvAdapter(languagesList)
        binding.recyclerViewList.adapter = rvAdapter

        // Create new object
        // add some row data
        /*val language1 = Languages("Java", "Java is an Object Oriented Programming language." +
                " Java is used in all kind of applications like Mobile Applications (Android is Java based), " +
                "desktop applications, web applications, client server applications, enterprise applications and many more. ",
            false
        )

        val language2 = Languages("Kotlin", "Kotlin is a statically typed, general-purpose programming language" +
                " developed by JetBrains, that has built world-class IDEs like IntelliJ IDEA, PhpStorm, Appcode, etc.",
            false
        )

        val language3 = Languages("Paython",
            "Python is a high-level, general-purpose and a very popular programming language." +
                    " Python programming language (latest Python 3) is being used in web development, Machine Learning applications, " +
                    "along with all cutting edge technology in Software Industry.",
            false
        )

        val language4 = Languages(
            "CPP",
            "C++ is a general purpose programming language and widely used now a days for " +
                    "competitive programming. It has imperative, object-oriented and generic programming features. ",
            false
        )

        val language5 = Languages(
            "JSP",
            "JSP is a general purpose programming language and widely used now a days for " +
                    "competitive programming. It has imperative, object-oriented and generic programming features. ",
            false
        )

        // Add item to list
        languagesList.add(language1)
        languagesList.add(language2)
        languagesList.add(language3)
        languagesList.add(language4)
        languagesList.add(language5)

        rvAdapter.notifyDataSetChanged()
*/

        val languagesObject: MutableList<Languages> = mutableListOf<Languages>()

        languagesObject.add(
            Languages("Java","Java is an Object Oriented Programming language." +
                    " Java is used in all kind of applications like Mobile Applications (Android is Java based), " +
                    "desktop applications, web applications, client server applications, enterprise applications and many more. ", false))

       languagesObject.add( Languages("Kotlin", "Kotlin is a statically typed, general-purpose programming language" +
                " developed by JetBrains, that has built world-class IDEs like IntelliJ IDEA, PhpStorm, Appcode, etc.",false))

        languagesObject.add(Languages("Paython",
            "Python is a high-level, general-purpose and a very popular programming language." +
                    " Python programming language (latest Python 3) is being used in web development, Machine Learning applications, " +
                    "along with all cutting edge technology in Software Industry.",false))

        languagesObject.add( Languages(
            "CPP",
            "C++ is a general purpose programming language and widely used now a days for " +
                    "competitive programming. It has imperative, object-oriented and generic programming features. ",false))

        languagesObject.add(Languages("Jsp", "JavaScript is a scripting language that enables"+
                "you to create dynamically updating content, control multimedia, animate images, and pretty much everything else.", false))

        languagesObject.add(Languages("Node Js" ,"Node. js (Node) is an open source, cross-platform runtime"+
                " environment for executing JavaScript code. Node is used extensively for server-side programming, making it possible for" +
                " developers to use JavaScript for client-side and server-side code without needing to learn an additional language." , false))

        binding.recyclerViewList.adapter = RvAdapter(languagesObject)



    }
}