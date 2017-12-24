Singleton pattern guarantees that only one instance of the object is present 
throughout the application

Single threaded Eager loading (With a public static final instance)
Single threaded Lazy loading  (With a public static factory method)
Multithreaded Lazy loading    (Double checked locking)

**Design**

**Applications**
Resource pools, Caches, Registries, Loggers, Device drivers 

**Problems**
1) deserialization ==> readResolve()
2) reflection ==> 
Modern solution Enum in Java
