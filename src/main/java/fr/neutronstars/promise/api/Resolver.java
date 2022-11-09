package fr.neutronstars.promise.api;

@FunctionalInterface
public interface Resolver<T>
{
    void resolve(Fulfillment<T> fulfillment);
}
