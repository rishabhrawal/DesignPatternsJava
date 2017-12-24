Software Designs should be flexible to cope with changes.
Following are some of the design principles or guidelines to write maintainable code.

1)Encapsulate what varies
2)Program to an interface, not an implementation
3)Favor composition over inheritance 
  Though inheritance is powerful, it might lead to non flexible designs
  Composition lets one change behaviour dynamically, hence to add functionality
  one just has to write new classes rather than altering existing code
4)Strive for loosely coupled designs between objects that interact
  when two objects are loosely coupled, they can interact, but have very little knowledge of each other
5) Classes should be open for extension but closed for modification
   applying open closed principle everywhere is wasteful and unnecessary 
   and might lead to hard to understand code
6) Depend upon abstractions, do not depend upon concrete classes
   Dependency Inversion(factory method, )
7)

For OOP follow SOLID principles
S -> Single responsibility principle
O -> Open/closed principle (Software entities should be Open for extension Closed for modification)
L -> Liskov substitution principle(objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program)
I -> Interface segregation principle (many client-specific interfaces are better than one general-purpose interface)
D -> Dependency Inversion principle(one should “depend upon abstractions, not concretions)