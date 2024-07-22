package com.salihakbas.financeapp.activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.salihakbas.financeapp.adapter.ReportListAdapter
import com.salihakbas.financeapp.databinding.ActivityReportBinding
import com.salihakbas.financeapp.viewmodel.MainViewModel

class ReportActivity : AppCompatActivity() {
    lateinit var binding: ActivityReportBinding
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initRecyclerView()
        setVariable()

    }

    private fun setVariable() {
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
        private fun initRecyclerView() {
            binding.view2.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            binding.view2.adapter = ReportListAdapter(mainViewModel.loadBudget())
            binding.view2.isNestedScrollingEnabled = false
        }
    }