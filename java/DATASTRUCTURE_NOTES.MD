#Notes on data structures.

#### Array:
A collection that can be used to store primitives or objects.
Elements are retrived by their index. Java arrays are dyanamically
allocated. This means that a reference is created when creating
and instance to that array and the object and its contents
can be allocated to that reference at run time. The size of an array
is a fixed sized opposed to an Arraylist. 


## Set
#### An UNORDERED collection where duplicate values CANNOT be stored.


##### Hashset

## Map
#### A group of items that are key value pairs.

##### Hashmap:
A collection that stores values based on key value pairs. A hash map cannot
have a duplicate key, but can have a duplicate value. Hashmap does allow a null key.
There is no order to how items are stored. The hashmap provides a more constant 
lookup time compared with a list because of its usage of the hash function to
look values up. It's performance is dependent on Initial capacity and load factor.
Initial capacity is the initial size of the hashmap and the load factor is a value
that determines when rehashing should be done which is the process of increasing capacity.

#### Linked hashmap
The same as hashmap except that it maintains assertion order while hashmap does not garuntee
order.

#### Treemap


## List 
#### An ORDERED collection of values where duplicates CAN be stored.



##### Why use an array?
- If you want a collection to contain primitive data types.
- It is faster than a Collection.





Read more about java arrays here.
https://www.geeksforgeeks.org/arrays-in-java/ 
https://www.geeksforgeeks.org/array-data-structure/

