package com.minux.criminalintent


import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.util.Calendar
import android.app.DatePickerDialog
import android.os.Build
import java.io.Serializable
import java.util.Date

private const val ARG_DATE = "date"

class DatePickerFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val date = arguments?.customGetSerializable<Date>(ARG_DATE)
        date ?: dismiss()
        val calendar = Calendar.getInstance()
        calendar.time = date!!

        return DatePickerDialog(
            requireContext(),
            null,
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
    }

    companion object {
        fun newInstance(date: Date): DatePickerFragment {
            val args = Bundle().apply {
                putSerializable(ARG_DATE, date)
            }

            return DatePickerFragment().apply {
                arguments = args
            }
        }
    }
}