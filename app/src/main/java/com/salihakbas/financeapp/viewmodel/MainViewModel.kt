package com.salihakbas.financeapp.viewmodel

import androidx.lifecycle.ViewModel
import com.salihakbas.financeapp.repository.MainRepository

class MainViewModel(val repository: MainRepository) : ViewModel() {
    constructor() : this(MainRepository())

    fun loadData() = repository.items
    fun loadBudget() = repository.budget
}