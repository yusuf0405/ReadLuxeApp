package screens

import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import java.util.Locale
import java.util.UUID

@Composable
fun TextToSpeechScreen() {
    var text by remember { mutableStateOf(TextFieldValue("The 1870 book Dictionary of Greek and Roman Biography and Mythology noted[6]\n" +
            "\n" +
            "Thales dogma that water is the origin of things, that is, that it is that out of which every thing arises, and into which every thing resolves itself, Thales may have followed Orphic cosmogonies, while, unlike them, he sought to establish the truth of the assertion. Hence, Aristotle, immediately after he has called him the originator of philosophy brings forward the reasons which Thales was believed to have adduced in confirmation of that assertion; for that no written development of it, or indeed any book by Thales, was extant, is proved by the expressions which Aristotle uses when he brings forward the doctrines and proofs of the Milesian. (p. 1016)\n" +
            "Plato, describes the idea of the good, or the Godhead, sometimes teleologically, as the ultimate purpose of all conditioned existence; sometimes cosmologically, as the ultimate operative cause; and has begun to develop the cosmological, as also the physico-theological proof for the being of God; but has referred both back to the idea of the Good, as the necessary presupposition to all other ideas, and the cognition of them. (p. 402)\n" +
            "The book The Works of Aristotle (1908, p. 80 Fragments) mentioned[7]\n" +
            "\n" +
            "Aristotle says the poet Orpheus never existed; the Pythagoreans ascribe this Orphic poem to a certain Cercon (see Cercops).\n" +
            "Bertrand Russell (1947) noted[8]\n" +
            "\n" +
            "The Orphics were an ascetic sect; wine, to them, was only a symbol, as, later, in the Christian sacrament. The intoxication that they sought was that of \"enthusiasm,\" of union with the god. They believed themselves, in this way, to acquire mystic knowledge not obtainable by ordinary means. This mystical element entered into Greek philosophy with Pythagoras, who was a reformer of Orphism as Orpheus was a reformer of the religion of Dionysus. From Pythagoras Orphic elements entered into the philosophy of Plato, and from Plato into most later philosophy that was in any degree religious.")) }
    var utteranceId by remember { mutableStateOf(UUID.randomUUID().toString()) }

    val context = LocalContext.current
    val textToSpeech = remember(context) {
        TextToSpeech(context) { status ->
            if (status == TextToSpeech.SUCCESS) {

            } else {
                // Обработка ошибки
            }
        }
    }
    textToSpeech.language = Locale.US

    textToSpeech.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
        override fun onStart(utteranceId: String?) {}

        override fun onDone(utteranceId: String?) {
            if (utteranceId == utteranceId) {
                // Это уникальный идентификатор для определенного слова
                // Выполните необходимые действия
            }
        }

        override fun onError(utteranceId: String?) {}
    })

    Column {
        Button(
            onClick = {
                utteranceId = UUID.randomUUID().toString()
                textToSpeech.speak(text.text, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
            }) {
            // Кнопка для озвучивания текста
        }
        Button(
            onClick = {
            }) {
            // Кнопка для озвучивания текста
        }

        // Текстовое поле для ввода текста
        // Здесь также можете добавить логику для изменения текста
    }
}

@Preview
@Composable
fun TextToSpeechScreenPreview() {
    TextToSpeechScreen()
}
