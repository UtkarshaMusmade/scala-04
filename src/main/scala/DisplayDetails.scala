

class FirstName(val name:String)extends AnyVal{

  override def toString: String = s"$name"
}
class LastName(val name:String)extends AnyVal{
  override def toString: String = s"$name"

}
class Age(val age:Int)extends AnyVal{
  override def toString: String = s"$age"

}


object DisplayDetails extends App{





  def displayDetails(firstname:FirstName,lastname:LastName, age: Age):Unit={

println(firstname.toString+" "+lastname.toString+" is of "+age.toString+" years")

  }
 val firstname= new FirstName("Utkarsha")
 val lastname= new LastName("Musmade")
 val age= new Age(21)

  displayDetails(firstname,lastname,age)
}



