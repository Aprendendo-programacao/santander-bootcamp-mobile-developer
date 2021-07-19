import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce {
        acc, bigDecimal -> acc + bigDecimal
}

fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()