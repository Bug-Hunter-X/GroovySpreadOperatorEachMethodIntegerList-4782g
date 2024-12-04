# Groovy Spread Operator (*) with each method on a List of Integers

This repository demonstrates a common error when using the spread operator (*) with the each method in Groovy when dealing with lists of primitive types like integers.

## Bug Description
The provided Groovy code aims to iterate over a list of integers, printing each integer to the console. The spread operator (*) is used incorrectly with the each method leading to a runtime exception.

## Solution
The solution avoids applying `each` to each number directly by iterating in a traditional manner or using the `each` method on the list directly.