package fr.neutronstars.promise.api;

public interface PromiseService
{
    <T> Promise<T> of(Resolver<T> resolver);

    Promise<Object[]> all(Promise<?>... promises);

    Promise<Settled<?>[]> allSettled(Promise<?>... promises);

    Promise<?> any(Promise<?>... promises);

    Promise<?> race(Promise<?>... promises);

    void shutdown();
}
