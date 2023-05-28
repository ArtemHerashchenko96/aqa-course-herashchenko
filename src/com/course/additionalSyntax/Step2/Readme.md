Sequence of Printed Messages and Code Execution

1. Message from Parent static initialization block - This is the static block of code in the Parent class, which is executed first.
2. Message from Child static initialization block - This is the static block of code in the Child class, which is executed after the static block of the Parent class.
3. Message from Parent initialization block - This is the non-static initialization block of the Parent class, which is executed before the constructor of the Parent class.
4. Message from Parent constructor - This is the constructor of the Parent class, which is executed after the initialization block of the Parent class.
5. Message from Child initialization block - This is the non-static initialization block of the Child class, which is executed before the constructor of the Child class.
6. Message from Child constructor - This is the constructor of the Child class, which is executed after the initialization block of the Child class.






