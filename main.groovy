// Every one write down the code here

// Issue 2
println "Single-line comments start with // and can be found at any position in the line. The characters following //, until the end of the line, are considered part of the comment."
// a standalone single line comment
println "hello" // a comment till the end of the line

//Issue 6
//for
for (int i = 0; i < 5; i++) {
    println("Iteration $i")
}

//if
def age = 18
if (age >= 18) {
    println("You are an adult.")
} else {
    println("You are a minor.")
}

//implements
class MyInterfaceImpl implements MyInterface {

}

//import
import java.util.ArrayList

def list = new ArrayList<String>()

//instanceof
def obj = "Hello"
if (obj instanceof String) {
    println("obj is a String")
}

//interface
interface GroovyInterface {
    void myMethod()
}

//native
//In Groovy, which is a dynamic language, we don't typically use the native keyword to declare methods or perform platform-specific operations./*


//new
 def instance = new MyClass()

//null
def myVar = null

//non-sealed
//The non-sealed keyword is not typically used in Groovy and is more relevant in languages like Java.

//package
//package com.example.myproject;


//public private protected
class AccessSpecifier {
    public String publicField
    protected int protectedField
    private def privateField
}

//return
def add(a, b) {
    return a + b
}

//Issue 11

def fileName = 'C:\\Users\\LENOVO\\Desktop\\GroovyPractise_Repo\\groovyintro\\Hello_Bridgelabz.txt'
def fileContents = new File(fileName).text

def words = fileContents.split(/\s+/)
def totalWordCount = words.size()


def wordFrequency = words.countBy { it }

println "Total number of words: $totalWordCount"
println "Word Frequency:"
wordFrequency.each { word, count ->
    println "$word: $count"
}

//Issue 12 -> Arithmetic Operators + - * / %
assert 10 % 3 == 1
assert  9.intdiv(5) == 1  // Quotient
assert 2.2.plus(1.1) == 3.3

def x = 5;
def y = 10;
def z = 8;

//Performing addition of 2 operands
println(x+y);

//Subtracts second operand from the first
println(x-y);

//Multiplication of both operands
println(x*y);

//Division of numerator by denominator
println(z/x);

//Modulus Operator and remainder of after an integer/float division
println(z%x);


//Issue 16 -> Ternary Operator
def q = 10
def result = (q > 5) ? "q is greater than 5" : "q is not greater than 5"
println result

//Issue 18 -> Exception Handling
def arr = new int[3];
arr[5] = 5; //ArrayIndexOutOfBoundsException






