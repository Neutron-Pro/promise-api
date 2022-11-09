package fr.neutronstars.promise.api;

public interface Fulfillment<T>
{
    void accept(T type);

    void reject(Throwable throwable);
}
