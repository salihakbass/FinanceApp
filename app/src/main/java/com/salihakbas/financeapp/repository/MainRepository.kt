package com.salihakbas.financeapp.repository

import com.salihakbas.financeapp.domain.ExpanseDomain

class MainRepository {
    val items = mutableListOf(
        ExpanseDomain("Restaurant",573.12,"img1","17 jun 2024 19:15"),
        ExpanseDomain("McDonald",77.82,"img2","16 jun 2024 13:57"),
        ExpanseDomain("Cinema",23.47,"img3","16 jun 2024 20:15"),
        ExpanseDomain("Restaurant",341.12,"img1","15 jun 2024 19:15")
    )
}