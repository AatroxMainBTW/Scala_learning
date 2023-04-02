import java.time.format.{DateTimeFormatter, FormatStyle}
import java.time.LocalDate
import java.util.Locale.*


@main def frenchdate():Unit = {
    val now = LocalDate.now()
    val df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(FRANCE)
    println(df.format(now))
}