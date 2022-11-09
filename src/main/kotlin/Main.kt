fun main() {
    val calculadora = Calculadora()
    println(calculadora.calcular(10,10))
    println(calculadora.calcular(x = 80, y = 10, operador = "-"))
    println(calculadora.calcular(x = 100,y = 10, operador = "*"))
    println(calculadora.calcular(1190,10,"/"))
}