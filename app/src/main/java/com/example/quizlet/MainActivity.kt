package com.example.quizlet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizlet.adapter.LanguageAdapter
import com.example.quizlet.model.Language
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var languageRecycler: RecyclerView
    private lateinit var languageAdapter: LanguageAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationView: NavigationView = findViewById(R.id.navigationView)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        navController = findNavController(R.id.fragment)
        drawerLayout = findViewById(R.id.drawer_layout)

        navigationView.setupWithNavController(navController)
        bottomNavigationView.setupWithNavController(navController)
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)

        drawerLayout.openDrawer(GravityCompat.START)


        setupActionBarWithNavController(navController, appBarConfiguration)


        val languageList: MutableList<Language> = mutableListOf()
        languageList.add(Language(1, "france", "French", "Level 1"))
        languageList.add(Language(2, "spain", "Spanish", "Level 1"))
        languageList.add(Language(3, "italian", "Italian", "Level 2"))
        languageList.add(Language(4, "germany", "German", "Level 1"))


        setCourseRecycler(languageList)

    }

    private fun setCourseRecycler(languageList: MutableList<Language>) {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        languageRecycler = findViewById(R.id.languageRecycler)
        languageRecycler.layoutManager = layoutManager

        languageAdapter = LanguageAdapter(this, languageList)
        languageRecycler.adapter = languageAdapter
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController: NavController = findNavController(R.id.fragment)
        return navController.navigateUp(appBarConfiguration) ||
                super.onSupportNavigateUp()
    }
}
