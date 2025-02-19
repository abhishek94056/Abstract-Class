Q. What is abstract class?
A. The abstract class has both types of methods normal and abstract.

Q. What is need of abstract class?
A. To host/hold both types of methods under same roof.

Q. How to create abstract class?
A. By adding the "abstract" keyword in the declaration.

The class has all normal methods.

The interface has all abstract methods.

The abstract class has both types of methods normal and abstract.

Normal class:
10 methods -> 10 normal methods

interface:
10 methods -> 10 abstract methods

abstract class:
10 methods -> 7 normal methods + 3 abstract methods

Q. Why can we write constructor in abstract class when we can not create object of abstract class?
A. We can not directly call the constructor of abstract class but we can definitely call it indirectly using the concept of constructor chaining to perform some tasks. Also, we get chance to initialize global/instance variables in the constructor.

The abstract class must have a child.

The abstract class can not be declared as final.

We can NOT achieve multiple inheritance using abstract class.

The normal class achieves 0% abstraction.

The abstract class achieves partial abstraction.

Pre JDK 8:
The interface achieves 100% abstraction.

Post JDK 8:
The interface achieves partial abstraction.
