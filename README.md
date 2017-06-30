# datastructures
some simple data structures implementation by java programming language

# Big O Notation & Complexity

This is an overview of Big O Notation as a description of algorithm complexity. Some common Big O examples are
presented below in order of best to worst performance.

![](https://github.com/user3301/datastructures/blob/master/resource/all.png)

## O(1)

Describes an algorithm whose execution time will be constant regardless of the size of the input data. An example of
this type of algorithm would be a function that returns a random element of a collection.

![](https://github.com/user3301/datastructures/blob/master/resource/O(1).png)

## O(log n)

Describes an algorithm whose execution time grows logarithmically (log base 2) with the size of the input data. An
example of this type of algorithm would be a binary search, which iteratively halves the input data, producing
a growth curve that peaks early and slowly flattens with each iteration as the input data gets smaller.

![](https://github.com/user3301/datastructures/blob/master/resource/O(logn).png)

## O(n)

Describes an algorithm whose execution time will grow linearly with the size of of the input data. An example of this
type of algorithm would be a function that iterates over a collection of numbers and calculates their sum.

![](https://github.com/user3301/datastructures/blob/master/resource/O(n).png)

## O(n<sup>2</sup>)

Describes an algorithm whose execution time is proportional to the square of the size of the input data. An example of
this type of algorithm would be a function that contains nested iterations over the same collection of elements.

![](https://github.com/user3301/datastructures/blob/master/resource/O(n2).png)

## O(2<sup>n</sup>)

Describes an algorithm whose execution time doubles with the size of the input data. An example of this type of
algorithm would be a recursive function where each recursive call results in doubling execution time.

![](https://github.com/user3301/datastructures/blob/master/resource/O(2n).png)
