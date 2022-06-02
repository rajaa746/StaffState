package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StaffCardList(
    list: List<Staff>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = list
        ) { staff ->
            StaffCard(
                staff = staff
            )
        }
    }
}
