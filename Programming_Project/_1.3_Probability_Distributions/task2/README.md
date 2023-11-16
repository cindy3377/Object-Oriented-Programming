Question:

Why can't a Singleton object be created from outside the Singleton class using the new operation?

Answer:

A Singleton object cannot be created from outside the Singleton class using the new operation because the Singleton class typically has a private constructor. The private constructor restricts external classes from directly instantiating the Singleton class. 

The only way to obtain an instance of the Singleton class is through a public static method within the class, enforcing the pattern's goal of having a single, globally accessible instance.

