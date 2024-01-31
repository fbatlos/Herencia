
open class Persona(open val nombre :String , edad: Int){


    var edad:Int = edad
        private set

    fun cumple(){
        edad ++
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre , edad = $edad)"
    }

}

class Estudiante(nombre: String , edad: Int , var carrera:String):Persona(nombre , edad){
    override var nombre = nombre
        get() = field.uppercase()
}



fun main() {
    val persona = Persona("pepe" , 25)
    persona.cumple()
   // println(persona.toString())
  //  println(persona)

    val estudiante = Estudiante("marta" , 19 , "Derecho")
    println(estudiante.nombre)
    println(persona.nombre)
}