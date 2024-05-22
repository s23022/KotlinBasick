package org.example

//open class Car(val color: String) { //Carの中に車に色を付ける要素を追加
//    var distance = 0.0
//    open fun drive(d: Double) {
//        distance = distance + d
//        println("${color}の車が　${d}km 走りました")
//        println("マイレージは ${distance}キロになりました")
//    }
//}
//abstract class Car(val color: String) { //抽象クラスに定義 このabstractをつかって新しいクラスかつ独自の機能を追加して利用する
//    var distance = 0.0
//    abstract fun drive(d: Double)
//}
//
//// class Ferrari () : Car()
//// class Ferrari(color: String) : Car(color) //車に色の要素を追加
//class Ferrari(color: String) : Car(color) { // Ferrariクラスに独自機能に変える
//    override fun drive(d: Double) {
//        distance = distance + d
//        println("${color}のフェラーリが走っています！ブーーーンｗｗｗｗ")
//        println("おお！かっこよｗｗｗｗｗ")
//        println("マイレージは ${distance}キロになりました")
//    }
//}
//
//class Prius(color: String) : Car(color) { //　表示するメッセージの内容の変更
//    override fun drive(d: Double) {
//        distance = distance + d
//        println("${color}のプリウスが走っています！スィーン！")
//        println("静かだね")
//        println("マイレージは${distance}キロです")
//        println("トヨタ車の車はたくさん走ってもなかなか壊れません！")
//    }
//}
//
//fun main(args: Array<String>) {
//
//    println("---------------------------------")
//// Ferrariクラスの実行
//    val car2 = Ferrari(" 赤 ")
//    car2.drive(100.0)
//
//    println("---------------------------------")
////Priusクラスの実行
//    val car3 = Prius("グレー")
//    car3.drive(500.0)
//}