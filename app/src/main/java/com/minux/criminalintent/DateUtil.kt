package com.minux.criminalintent

import java.text.DateFormat
import java.util.Date

enum class DayOfWeek(val value: Int) {
    Sunday(0), Monday(1), Tuesday(2),
    Wednesday(3), Thursday(4), Friday(5),
    Saturday(7);
}

class DateUtil(private val date: Date) {
    private val formatter =  DateFormat.getDateInstance().format(date)
    private val dayOfWeeks = DayOfWeek.values()
    val dayName: String get() = dayOfWeeks[formatter[DateFormat.DAY_OF_WEEK_FIELD].digitToInt()].name
    val formattedDate: String get() ="$dayName, $formatter"
}