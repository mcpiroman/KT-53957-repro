fun main() {
    val a = ::meth
}

private class Ctx3 {
    val x = 0
}

private class Scope {
    val y = 1
}

private val meth: (context(Ctx3) Scope.() -> Unit) = {
    println(y.toString())
}
