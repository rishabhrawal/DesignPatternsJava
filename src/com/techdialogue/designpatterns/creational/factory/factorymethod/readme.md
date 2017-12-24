**Introduction**

It defines an interface for creating object but lets subclasses decide which class to instantiate.
This pattern differs the instantiation to subclasses.


**Design**
Parent class is made abstract with an "Abstract Factory Method" to create objects.
Instantiation occurs at runtime depending on the concrete children.

It is one of the ways to implement **Dependency Inversion**
 