// logical &&
def a = true
def b = false
def result = a && b  // result is false
println result;

// logical or ||
def a2 = true
def b2 = false
def res = a || b
println res;

// logical not !
def f = true
def result3 = !f  // result is false
println result3;

//logical exclusive Or (XOR)
def m = true
def n = false
def result5 = (m && !n) || (!m && n)
println result5;

//ternairy operators
def k = true
def result6 = (k) ? "It's true" : "It's false"
println result6

//Null Coalescing Operator (?:):
def p = null
def q = "Hello"
def result7 = p ?: q  // result is "Hello"
println result7