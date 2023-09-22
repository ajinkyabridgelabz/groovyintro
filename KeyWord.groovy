/* 1)  abstract : Used to declare abstract classes and methods.
 Abstract classes cannot be instantiated, and abstract
 methods must be implemented by subclasses.*/

abstract class Shape {
    abstract def draw();
}

/*  class : The 'class' keyword is used to define classes in Groovy similar to java.
    extends : 'extends' keyword is used for inherit parent class data*/

class KeyWord extends Shape {//

/*  def keyword : is used for dynamic typing in Groovy.It allows you to declare
   variables  without specifying their data types explicitly.*/
    def name = "Sourabh"    //we can write def instead of String, int, boolean etc.
    def number = 88

    def draw() {
        println("Drawing a Circle")
    }

    static void main(args) {
        KeyWord a = new KeyWord();
        a.draw()

/*  assert : Used for debugging purposes to check if a given condition is true.
               If the condition is false, an AssertionError is thrown.*/
        def x = 5
        assert x == 5

//  break : Used to exit the current loop (for, while, or switch) prematurely
//  continue: This will skip the current iteration when i is 2
        for (i in 1..5) {
            if (i == 3) {
                break
            }
            if (i == 2) {
                continue
            }
            println(i)
        }


//  case : A "switch-case" statement is a control flow structure used in programming to execute different code blocks based on the value of a specific expression or variable.
        switch (1) {
            case 1:
                println("case keyword 1")
                break
            case 2:
                println("case keyword 2")
                break
            default: println("This is default keyword")
        }

//  do
        def count = 0
        do {
            println("Count: $count")
            count++
        } while (count < 3)

        // final
        final PI = 3.14159


//      Using the enum
        def currentDay = DayOfWeek.WEDNESDAY

        switch (currentDay) {
            case DayOfWeek.SUNDAY:
                println("It's Sunday!")
                break
            case DayOfWeek.SATURDAY:
                println("It's Saturday!")
                break
            default:
                println("It's a regular weekday.")
        }


    }

//  finally
    def divide(int q, int b) {
        try {
            return q / b
        } catch (Exception e) {
            println("An error occurred: ${e.message}")
        } finally {
            println("Finally block executed")
        }
    }
    // Define an enum called 'DayOfWeek' representing days of the week
    enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

//  final keyword: It's used for assigning the final variable, so we won't reassign the value.
    final int myNumber = 42


}
