import android.content.Context
import android.widget.Toast

object ToastError {
    fun showErrorToast(context: Context, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}