import org.codehaus.groovy.runtime.StringBufferWriter

// Every one write down the code here
println("Hello World")


   println "/* */ are used for multiline comments";


  /*
    *In the main method ,
    * we are given three numbers
    * and find the largest among them
    * by using Ternary operator
    * First we are checking whether "a" is greater than "b" and "c"
    * if it is true it returns "a" or else
    * check "b" greater than "c" .
    * if it is true print "b" or else
    * print "c"
     */
    static void main(String[] args) {
        def a=32;
        def b=45;
        def c=11;
        println(" $a ,$b, $c maximum number is :"+((a > b && a > c) ? a : (b > c) ? b : c));
    }
