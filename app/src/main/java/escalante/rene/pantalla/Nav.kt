package escalante.rene.pantalla

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import escalante.rene.pantalla.ui.theme.AzulClaro
import escalante.rene.pantalla.ui.theme.AzulFER

@Composable
fun BottomNavBar(modifier: Modifier = Modifier) {
    var seleccionado by rememberSaveable { mutableIntStateOf(0) }
    val iconos = listOf(
        Icons.Outlined.Home,
        Icons.Outlined.Favorite,
        Icons.Outlined.DateRange,
        Icons.Outlined.Info,
        Icons.Outlined.Settings
    )

    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(32.dp),
        color = Color.White,
        shadowElevation = 8.dp
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            iconos.forEachIndexed { i, icono ->
                val activo = i == seleccionado
                IconButton(
                    onClick = { seleccionado = i },
                    modifier = Modifier
                        .size(44.dp)
                        .background(if (activo) AzulClaro else Color.Transparent, CircleShape)
                ) {
                    Icon(
                        imageVector = icono,
                        contentDescription = null,
                        tint = if (activo) AzulFER else Color.DarkGray
                    )
                }
            }
        }
    }
}