package yarnwrap.resource;
public class SimpleResourceReload { public net.minecraft.resource.SimpleResourceReload wrapperContained; public SimpleResourceReload(net.minecraft.resource.SimpleResourceReload wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture prepareStageFuture() { return wrapperContained.prepareStageFuture; }
// public java.util.concurrent.CompletableFuture applyStageFuture() { return wrapperContained.applyStageFuture; }
// public java.util.Set waitingReloaders() { return wrapperContained.waitingReloaders; }
// public int reloaderCount() { return wrapperContained.reloaderCount; }
// public int toApplyCount() { return wrapperContained.toApplyCount; }
// public int appliedCount() { return wrapperContained.appliedCount; }
// public java.util.concurrent.atomic.AtomicInteger toPrepareCount() { return wrapperContained.toPrepareCount; }
// public java.util.concurrent.atomic.AtomicInteger preparedCount() { return wrapperContained.preparedCount; }
// public int FIRST_PREPARE_APPLY_WEIGHT() { return wrapperContained.FIRST_PREPARE_APPLY_WEIGHT; }
// public int SECOND_PREPARE_APPLY_WEIGHT() { return wrapperContained.SECOND_PREPARE_APPLY_WEIGHT; }
// public int RELOADER_WEIGHT() { return wrapperContained.RELOADER_WEIGHT; }
public yarnwrap.resource.SimpleResourceReload create(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage) { return new yarnwrap.resource.SimpleResourceReload(wrapperContained.create(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage)); }
public yarnwrap.resource.ResourceReload start(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,boolean profiled) { return new yarnwrap.resource.ResourceReload(wrapperContained.start(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage,profiled)); }

}