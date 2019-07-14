

class FirstName(val name: String) extends AnyVal {

  override def toString: String = s"$name"
}

class LastName(val name: String) extends AnyVal {
  override def toString: String = s"$name"

}

class Age(val age: Int) extends AnyVal {
  override def toString: String = s"$age"

}


object DisplayDetails extends App {


  def displayDetails(firstname: FirstName, lastname: LastName, age: Age): String = {

    firstname.toString + " " + lastname.toString + " is of " + age.toString + " years"

  }



}



