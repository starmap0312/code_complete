// REASONS TO REFACTOR
// 1) class has poor cohesion
//    a class with unrelated responsibilities should be broken up into multiple classes, each of which has
//    one or a set of cohesive responsibilities
// 2) class interface does not provide a consistent level of abstraction
// 3) one class is overly intimate with another (one class that knows more about another class than it should)
//    encapsulation (information hiding) is the strongest tool that make your program manageable and
//    minimize effects of code changes
// 4) subclass uses only a small percentage of its parents' routines
//    this usually indicates that the subclass is logically a descendent of the superclass
//    change the relationship from an is-a relationship (inheritance) to a has-a relationship
// 5) changes require parallel modifications to multiple classes
//    rearrange those classes to one class so that changes affect only one class
// 6) inheritance hierarchies have to be modified in parallel
//    ex. whenever you create subclass A1 of class A, you also need to create subclass B2 of class B
// 7) case statements have to be modified in parallel
//    ex. you need to modify similar case statements in multiple parts of the program
//        (consider use inheritance/polymorphism instead)
