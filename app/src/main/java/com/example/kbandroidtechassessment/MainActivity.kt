package com.example.kbandroidtechassessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.DateRangePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDateRangePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.kbandroidtechassessment.ui.theme.KBAndroidTechAssessmentTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}
data class Transaction(
    val date: LocalDate, val description: String, val amount: Double
)

private fun getTransactions() = listOf(
    Transaction(LocalDate.parse("2025-07-22"), "Restaurant", -35.00),
    Transaction(LocalDate.parse("2025-07-24"), "Car Repair", -150.00),
    Transaction(LocalDate.parse("2025-07-11"), "Utilities", -150.00),
    Transaction(LocalDate.parse("2025-07-19"), "Clothing Store", -100.00),
    Transaction(LocalDate.parse("2025-07-12"), "Car Repair", -200.00),
    Transaction(LocalDate.parse("2025-07-13"), "Book Purchase", -30.00),
    Transaction(LocalDate.parse("2025-07-14"), "Electronics", -500.00),
    Transaction(LocalDate.parse("2025-07-17"), "Groceries", -70.00),
    Transaction(LocalDate.parse("2025-07-26"), "Electronics", -300.00),
    Transaction(LocalDate.parse("2025-07-18"), "Gym Membership", -50.00),
    Transaction(LocalDate.parse("2025-07-01"), "Coffee Shop", -15.00),
    Transaction(LocalDate.parse("2025-07-02"), "Grocery Store", -75.00),
    Transaction(LocalDate.parse("2025-07-05"), "Clothing Store", -120.00),
    Transaction(LocalDate.parse("2025-07-06"), "Gym Membership", -50.00),
    Transaction(LocalDate.parse("2025-07-30"), "Gym Membership", -50.00),
    Transaction(LocalDate.parse("2025-07-15"), "Vacation", -1500.00),
    Transaction(LocalDate.parse("2025-07-07"), "Movie Tickets", -30.00),
    Transaction(LocalDate.parse("2025-07-08"), "Salary", 2500.00),
    Transaction(LocalDate.parse("2025-07-09"), "Groceries", -80.00),
    Transaction(LocalDate.parse("2025-07-23"), "Groceries", -90.00),
    Transaction(LocalDate.parse("2025-07-10"), "Rent", -1200.00),
    Transaction(LocalDate.parse("2025-07-20"), "Movie Tickets", -25.00),
    Transaction(LocalDate.parse("2025-07-21"), "Gas Station", -55.00),
    Transaction(LocalDate.parse("2025-07-25"), "Utilities", -120.00),
    Transaction(LocalDate.parse("2025-07-27"), "Vacation", -1000.00),
    Transaction(LocalDate.parse("2025-07-28"), "Restaurant", -45.00),
    Transaction(LocalDate.parse("2025-07-29"), "Groceries", -85.00),
    Transaction(LocalDate.parse("2025-07-16"), "Restaurant", -40.00),
    Transaction(LocalDate.parse("2025-07-03"), "Restaurant", -35.00),
    Transaction(LocalDate.parse("2025-07-04"), "Gas Station", -60.00),
)