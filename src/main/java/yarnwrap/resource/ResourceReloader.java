package yarnwrap.resource;
public class ResourceReloader { public net.minecraft.resource.ResourceReloader wrapperContained; public ResourceReloader(net.minecraft.resource.ResourceReloader wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.resource.ResourceReloader.getName(); }
// public java.util.concurrent.CompletableFuture reload(Object synchronizer,yarnwrap.resource.ResourceManager manager,yarnwrap.util.profiler.Profiler prepareProfiler,yarnwrap.util.profiler.Profiler applyProfiler,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor) { return wrapperContained.reload(synchronizer,manager.wrapperContained,prepareProfiler.wrapperContained,applyProfiler.wrapperContained,prepareExecutor,applyExecutor); }
// public static java.util.concurrent.CompletableFuture reload(Object synchronizer,yarnwrap.resource.ResourceManager manager,yarnwrap.util.profiler.Profiler prepareProfiler,yarnwrap.util.profiler.Profiler applyProfiler,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor, ) { return net.minecraft.resource.ResourceReloader.reload(synchronizer,manager.wrapperContained,prepareProfiler.wrapperContained,applyProfiler.wrapperContained,prepareExecutor,applyExecutor); }

}