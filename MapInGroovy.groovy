
def map = ['key': 'value', 'key1': 'value1']
println map

def employee = ['name': 'Sourabh', 'city': 'Seoni', 'mark':81]

println(employee) //This will print all data.

println employee.name//This will print only name.
println employee['name']//This will also print only name.

println employee.get('mark')//getting mark value.
println (employee["mark"])//this will also for getting mark value.
println employee.size()

employee.put('address','AAA')//adding new filed in employee
println employee

//containsKey and containsValue is checking for key and value is present or not.
println(employee.containsKey('address'))
println(employee.containsValue(8))

employee.each {key,value ->
    println "$key" :"$value"


    map.each {  entry->
        assert entry.key in ['key','key1']
        assert entry.value in ['value','value1']
    }
}
