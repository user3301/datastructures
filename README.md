# datastructures
some simple data structures implementation by java programming language

# Big O Notation & Complexity

This is an overview of Big O Notation as a description of algorithm complexity. Some common Big O examples are
presented below in order of best to worst performance.

![](http://ww1.sinaimg.cn/large/6b1abb29gy1fh22dyi96vj20go0ab0st.jpg)

## O(1)

Describes an algorithm whose execution time will be constant regardless of the size of the input data. An example of
this type of algorithm would be a function that returns a random element of a collection.

![](http://ww1.sinaimg.cn/large/6b1abb29gy1fh22ei216vj20go0ab0sl.jpg)

## O(log n)

Describes an algorithm whose execution time grows logarithmically (log base 2) with the size of the input data. An
example of this type of algorithm would be a binary search, which iteratively halves the input data, producing
a growth curve that peaks early and slowly flattens with each iteration as the input data gets smaller.

![](http://ww1.sinaimg.cn/large/6b1abb29gy1fh22f14m7yj20go0ab747.jpg)

## O(n)

Describes an algorithm whose execution time will grow linearly with the size of of the input data. An example of this
type of algorithm would be a function that iterates over a collection of numbers and calculates their sum.

![](http://ww1.sinaimg.cn/large/6b1abb29gy1fh22ff7azlj20go0abt8m.jpg)

## O(n<sup>2</sup>)

Describes an algorithm whose execution time is proportional to the square of the size of the input data. An example of
this type of algorithm would be a function that contains nested iterations over the same collection of elements.

![](http://ww1.sinaimg.cn/large/6b1abb29gy1fh22fyc7koj20go0abjrb.jpg)

## O(2<sup>n</sup>)

Describes an algorithm whose execution time doubles with the size of the input data. An example of this type of
algorithm would be a recursive function where each recursive call results in doubling execution time.

![](http://ww1.sinaimg.cn/large/6b1abb29gy1fh22ggyewmj20go0abt8n.jpg)
