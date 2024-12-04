```groovy
def myMethod(List<Integer> numbers) {
    numbers*.each { number ->
        println number
    }
}

myMethod([1, 2, 3])
```