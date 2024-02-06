import java.lang.Math.*
import kotlin.math.pow

fun main(){
    //задание 2
    try {
        print("Введите первый член прогрессии: ")
        val a = readLine()!!.toInt()
        print("Введите разность прогрессии: ")
        val b = readLine()!!.toInt()
        print("Введите номер первого члена прогрессии: ")
        val M = readLine()!!.toInt()
        print("Введите номер второго члена прогрессии: ")
        val N = readLine()!!.toInt()
        var sum = 0
        for (i in M..N) {
            sum = sum + a + (i - 1) * b
        }
        println("Сумма членов с номерами от $M до $N равна $sum")
    }catch(e:Exception){println("Неккоректный ввод данных")}

    //задание 11
    try {
        print("Введите радиус окружности: ")
        val R = readLine()!!.toDouble()
        print("Введите сторону правильного вписанного многоугольника: ")
        val c = readLine()!!.toDouble()
        val v = sqrt(2 * (R * R) - 2 * R * (sqrt((R * R) - ((c * c) / 4))))
        println("Сторона правильного вписанного многоугольника с удвоенным силом сторон равен ${String.format("%.2f", v)}")
    }catch (e:Exception){println("Неккоректный ввод даных")}

    //Задание 7.2
    try{
    print("Введите занчение х: ")
    val x = readLine()!!.toDouble()
    print("Введите занчение y: ")
    val y = readLine()!!.toDouble()
    print("Введите занчение z: ")
    val z = readLine()!!.toDouble()
    print("Введите занчение е: ")
    val e = readLine()!!.toDouble()
    val A = (3+e.pow(y-1))/(1+x.pow(2)+abs(y-tan(z)))
    val B = 1+abs(y-x)+((y-x).pow(2)/2)+abs(y-x).pow(3)/3)
    println("a= $A")
    println("b= $B")
    }catch (e:Exception){println("Введены неккоректные данные")
}