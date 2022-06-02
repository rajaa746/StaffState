package dtu.engtech.iabr.stateincompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun StaffScreen(
    modifier: Modifier = Modifier,
    staffViewModel: StaffViewModel = viewModel()
) {
    StaffCardList(
        list = staffViewModel.staff
    )
}