// multi catch block
try {
    // Code that may throw exceptions
    def result = 10 / 0
} catch (ArithmeticException e) {
    println "Arithmetic Exception: ${e.message}"
} catch (NullPointerException e) {
    println "Null Pointer Exception: ${e.message}"
} catch (Exception e) {
    println "General Exception: ${e.message}"
}

