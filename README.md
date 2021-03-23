# AspectJObserverPattern
Implementation of Observer / Observable pattern in Java with AspectJ


# Usage

For exemple, you can do the following line to instantiate the object Point:
```java
Point point = new Point(1, 1);
```

Then, you can instantiate observers:
```java
PointObserver1 pointObserver1 = new PointObserver1();
PointObserver2 pointObserver2 = new PointObserver2();
```

Finally, you can add observsers to your observable point:
```java
point.addObserver(pointObserver1);
point.addObserver(pointObserver2);
```

# Implement new observable class
Go in `src/Core/Observable.aj`, and add the following line replacing `Fraction` with the name of your class:

```aj
declare parents: Fraction implements Subject;
```


# Build and compile
1. Download and add AspectJ to your project:
    - [IntelliJ Instructions](https://www.jetbrains.com/help/idea/using-the-aspectj-ajc-compiler.html#settings)


2. Set AJC compiler:
    - [IntelliJ Instructions](https://www.jetbrains.com/help/idea/using-the-aspectj-ajc-compiler.html#settings)

# Built With
- [AspectJ](https://www.eclipse.org/aspectj/) - AspectJ is an aspect-oriented programming (AOP) extension for the Java programming language.
