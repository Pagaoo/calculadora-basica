class Calculadora() {
    fun calcular(x: Int, y: Int, operador: String = "+") : Int {
        var resultado = 0
        when (operador) {
            "+" -> resultado = somar(x,y)
            "-" -> resultado = subtrair(x,y)
            "*" -> resultado = multiplicar(x,y)
            "/" -> resultado = dividir(x,y)
        }
        return resultado
    }

    private fun somar(x: Int,y: Int) = x + y
    private fun subtrair(x: Int, y: Int) = x - y
    private fun multiplicar(x: Int, y: Int) = x * y
    private fun dividir(x: Int, y: Int) = x / y
}