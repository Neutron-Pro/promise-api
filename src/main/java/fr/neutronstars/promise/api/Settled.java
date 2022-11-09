package fr.neutronstars.promise.api;

public interface Settled<T>
{
    Status status();

    T value();

    Throwable throwable();

    String reason();

    long time();
}
