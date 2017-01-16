// Data-Level Refactorings
// 1) Replace a magic number with a named constant
// 2) Convert a data primitive to a class
// 3) Change an array to an object
// 4) Convert a set of type codes to a class or an enumeration
//    replace type code with class
// 5) Convert a set of type codes to a class with subclasses
//    replace type code with subclass
//
// Statement-Level Refactorings
// 1) Replace conditionals (especially repeated case statements) with polymorphism
// 2) Create and use null objects instead of testing for null values (if-null statement)
//
// Routine-Level Refactorings
// 1) Separate query operations from modification operations
// 2) Combine similar routines by parameterizing them
//
// Class Implementation Refactorings
// 1) Change value objects to reference objects
//    If you create numerous copies of large or complex objects, change usage of those objects so that only one master copy exists (the value object) and
//    the rest of the code uses references to that object (reference objects)
// 2) Change reference objects to value objects
//    If you perform a lot of reference housekeeping for small or simple objects, change usage of those objects so that all objects are value objects
// 3) Extract specialized code into a subclass
// 4) Combine similar code into a superclass
//
// Class Interface Refactorings
// 1) Hide a delegate
//    ex.
//      Class A calls Class B and Class C
//      A -> B
//        -> C
//      when the right abstraction is for A's interaction with B, and B should be responsible for calling C
//      A -> B -> C
// 2) Remove a middleman
//    ex.
//      Class A calls Class B and Class B calls Class C
//      A -> B -> C
//      do not delegate to class B, as this best maintains the integrity of Class B's interface
//      A -> B
//        -> C
// 2) Replace inheritance with delegation
//    when a class (client) needs to use another class (delegate) but wants more control over its interface
//    then expose a set of routines that will provide a cohesive abstraction
//    i.e. client -> (uses) wrapper -> (HAS_A) delegate
// 3) Replace delegation with inheritance
//    when a class exposes every public routine of a delegate class, inherit from the delegate class instead of just using the class
//    i.e. client -> (uses) subclass -> (inherits) delegate
//
// System-Level Refactorings
// 1) Change unidirectional class association to bidirectional class association
// 2) Change bidirectional class association to unidirectional class association
// 3) Provide a factory routine rather than a simple constructor
