package com.delnortedevs.atm

import androidx.lifecycle.ViewModel
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class ATMViewModel : ViewModel() {

    private var _balance : Double = 5000.00
    private val _movimientos = mutableListOf<Movimientos>()

    val balance get() = _balance
    val movimientos  = _movimientos

/*    fun retiro(cantidad: Double) {

    }

    fun availableBalance(cantidad: Double): Boolean {

    }*/

}