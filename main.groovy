// static keyword
class MyClass {
    static int staticVariable = 10

    static void staticMethod() {
        println("This is a static method")
    }
}

println(MyClass.staticVariable)
MyClass.staticMethod()

// super keyword

class ChildClass extends ParentClass {
    void methodInChildClass() {
        super.methodInParentClass()
    }
}
//switch keyword

def fruit = 'apple'

switch (fruit) {
    case 'apple':
        println('Selected fruit is apple')
        break
    case 'banana':
        println('Selected fruit is banana')
        break
    default:
        println('Unknown fruit')
}

//synchronized keyword
synchronized (someObject) {
    // Code that should be synchronized
}

// this keyword
class Satya {
    def name

    MyClass(String name) {
        this.name = name
    }
}

//throw keyword
def myMethod() {
    if (someCondition) {
        throw new SomeException("Some error message")
    }
}
//threadsafe keyword
def sata =
        "threadsafe: The threadsafe keyword is not a standard Groovy keyword.it might be used in custom code or libraries toindicate that a particular piece of code is designed to be thread-safe."