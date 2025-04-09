package yarnwrap.client.realms.util;
public class PeriodicRunnerFactory { public net.minecraft.client.realms.util.PeriodicRunnerFactory wrapperContained; public PeriodicRunnerFactory(net.minecraft.client.realms.util.PeriodicRunnerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public java.util.concurrent.TimeUnit timeUnit() { return wrapperContained.timeUnit; }
// public yarnwrap.util.TimeSupplier timeSupplier() { return new yarnwrap.util.TimeSupplier(wrapperContained.timeSupplier); }
public Object create() { return wrapperContained.create(); }
public Object create(java.lang.String name,java.util.concurrent.Callable task,java.time.Duration cycle,yarnwrap.client.util.Backoff backoff) { return wrapperContained.create(name,task,cycle,backoff.wrapperContained); }

}