package com.minux.criminalintent

import android.util.Log
import java.text.DateFormat
import java.util.Date

private const val TAG = "DateUtil"
enum class DayOfWeek(val value: Int) {
    Sunday(0), Monday(1), Tuesday(2),
    Wednesday(3), Thursday(4), Friday(5),
    Saturday(7);
}

class DateUtil(private val date: Date) {
    private val formatter =  DateFormat.getDateInstance().format(date)
    private val dayOfWeeks = DayOfWeek.values()
    val dayName: String get() = dayOfWeeks[formatter[DateFormat.DAY_OF_WEEK_FIELD].digitToInt() - 1].name

    val formattedDate: String get() ="$dayName, $formatter"
}