class UnaryOpeators {
    static void main(String[] args) {
        def var=41;
        //unary Opertors
        //Unary operators require only one operator to perform the operation
        println("post increment: "+var++) //41
        println("pre increment: "+ ++var) //43
        println("Post decrement: "+var--) //43
        println("pre decrement: "+--var) //41


        int a = 10
        //assign sign to the variable
        int c;
        c = +a
        println "Unary plus = " + c
        c = -a
        println "Unary minus = " + c
    }
}