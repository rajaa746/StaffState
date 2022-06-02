package dtu.engtech.iabr.stateincompose

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class StaffViewModel : ViewModel() {
    private val _staff = getStaff().toMutableStateList()
    val staff: List<Staff>
        get() = _staff
}
private fun getStaff() = StaffData.staffSample
