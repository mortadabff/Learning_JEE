# The Decorator Pattern:
## Principe :
The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. This pattern is particularly useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern. It's also great for extending (decorating) the functionality of a certain object at runtime.

## Concept of Decorator Pattern:
1. *Component:* This is the original object to which the new functionality is added. In the Decorator pattern, both the component and the decorators share a common set of features defined by an interface or abstract class.
2. *Concrete Component:* A class that implements the Component interface and represents the original object that might be decorated with additional functionality.
3. *Decorator:* An abstract class or interface that wraps the component and has the same interface as the component. It holds a reference to a component object and delegates all Component interface calls to it.
4. *Concrete Decorators:* Classes that extend the Decorator class and add new functionality. They modify the behavior of the component by adding functionality before or after (or even in place of) the component method calls.
