```groovy
def myMethod(List<Integer> numbers) {
    numbers.each { number ->
        println number
    }
}

//Alternative solution using a for loop
def myMethod2(List<Integer> numbers) {
    for (number in numbers) {
        println number
    }
}

myMethod([1, 2, 3])
myMethod2([1,2,3])
```