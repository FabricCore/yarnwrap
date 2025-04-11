package yarnwrap.client.realms.util;
public class PeriodicRunnerFactory { public net.minecraft.client.realms.util.PeriodicRunnerFactory wrapperContained; public PeriodicRunnerFactory(net.minecraft.client.realms.util.PeriodicRunnerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public java.util.concurrent.TimeUnit timeUnit() { return wrapperContained.timeUnit; }
// public void timeUnit(java.util.concurrent.TimeUnit value) { wrapperContained.timeUnit = value; }
// public yarnwrap.util.TimeSupplier timeSupplier() { return new yarnwrap.util.TimeSupplier(wrapperContained.timeSupplier); }
// public void timeSupplier(yarnwrap.util.TimeSupplier value) { wrapperContained.timeSupplier = value.wrapperContained; }
public PeriodicRunnerFactory(java.util.concurrent.Executor executor,java.util.concurrent.TimeUnit timeUnit,yarnwrap.util.TimeSupplier timeSupplier) { this.wrapperContained = new net.minecraft.client.realms.util.PeriodicRunnerFactory(executor,timeUnit,timeSupplier.wrapperContained); }
public Object create() { return wrapperContained.create(); }
public Object create(java.lang.String name,java.util.concurrent.Callable task,java.time.Duration cycle,yarnwrap.client.util.Backoff backoff) { return wrapperContained.create(name,task,cycle,backoff.wrapperContained); }

}