// "Replace with 'newFun(p, this)'" "true"

@Deprecated("", ReplaceWith("newFun(p, this)"))
fun String.oldFun(p: Int) {
    newFun(p, this)
}

fun newFun(p: Int, s: String){}

fun foo() {
    "" <caret>oldFun 1
}
