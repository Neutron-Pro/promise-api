# Promise API for JAVA

This api readapts the Promise javascript on java. They aim to be as similar as possible to the original ones and are also asynchronous.

## Implementation of api in your project

**Core**: https://github.com/Neutron-Pro/promise-core

```gradle
repositories {
  maven { url "https://jitpack.io" }
}

dependencies {
  implementation 'com.github.Neutron-Pro:promise-core:{{ version }}'
}
```

## Examples

For create a promise, use `fr.neutronstars.promise.api.PromiseService`.

```java
service.of(resolver -> resolver.accept("This is a test!"))
    .then(System.out::println) // Output: "This is a test!"
    .map(str -> 5)
    .then(System.out::println) // Output: 5
    .async();
```

```java
int x = service.of(resolver -> resolver.accept("This is a test!"))
    .then(System.out::println) // Output: "This is a test!"
    .map(str -> 5)
    .then(System.out::println) // Output: 5
    .await();

System.out.println(x); // Output: 5
```
