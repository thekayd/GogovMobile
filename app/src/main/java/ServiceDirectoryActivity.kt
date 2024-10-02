/*
package com.example.newsnest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ServiceDirectoryActivity : AppCompatActivity() {
    private lateinit var serviceList: List<Service>
    private lateinit var adapter: ServiceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_directory)

        serviceList = listOf(
            Service("Home Affairs", "ID Documents, Passports"),
            Service("Transport", "Driver's License, Vehicle Registration"),
            // Add more services here
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rvServices)
        adapter = ServiceAdapter(serviceList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
*/