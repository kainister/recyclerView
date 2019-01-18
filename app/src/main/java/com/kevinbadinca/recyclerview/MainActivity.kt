package com.kevinbadinca.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val projects = mutableListOf<Project>()
        projects.add(Project("Ticket-Manager", "gestion de ticket", "Symfony"))
        projects.add(Project("ORM", "Faire son propre ORM", "PHP"))
        projects.add(Project("WebLint", "Faire un Weblint", "Python"))

        screen1_recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ProjectAdapter(projects)
        }
    }
}
