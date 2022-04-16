interface Study{
    fun readBooks()

    fun doHomework(){
        println("do homework default implementation")
    }

}

class Student(name:String, age:Int)Student{
    override fun readBooks{
        println(name, " is reading.")
    }

    override fun doHomework(){
        println(name, " is doing homework.")
    }
}

fun doStudy(student:Student){
    student.readBooks()
    student.doHomework()
}

fun main(){
    val student = Student("Jack", 10)
    doStudy(student)
}