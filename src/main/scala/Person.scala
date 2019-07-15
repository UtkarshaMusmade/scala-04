class Person(val name: String, val age: Int) extends Ordered[Person] {


  override def compare(that: Person): Int = {
    if (this.name == that.name) {
      if (this.age < that.age) 1 else 0
    }
    else if (this.name.length < this.name.length) 1 else 0

  }
  
}

object Person extends App {
  val personOne = new Person("Utkarsha", 21)
  val personTwo = new Person("Utkarsha", 22)
  println(personOne.compare(personTwo))
}


