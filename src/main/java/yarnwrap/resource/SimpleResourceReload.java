package yarnwrap.resource;
public class SimpleResourceReload { public net.minecraft.resource.SimpleResourceReload wrapperContained; public SimpleResourceReload(net.minecraft.resource.SimpleResourceReload wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture prepareStageFuture() { return wrapperContained.prepareStageFuture; }
// public void prepareStageFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.prepareStageFuture = value; }
// public java.util.concurrent.CompletableFuture applyStageFuture() { return wrapperContained.applyStageFuture; }
// public void applyStageFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.applyStageFuture = value; }
// public java.util.Set waitingReloaders() { return wrapperContained.waitingReloaders; }
// public void waitingReloaders(java.util.Set value) { wrapperContained.waitingReloaders = value; }
// public int reloaderCount() { return wrapperContained.reloaderCount; }
// public void reloaderCount(int value) { wrapperContained.reloaderCount = value; }
// public int toApplyCount() { return wrapperContained.toApplyCount; }
// public void toApplyCount(int value) { wrapperContained.toApplyCount = value; }
// public int appliedCount() { return wrapperContained.appliedCount; }
// public void appliedCount(int value) { wrapperContained.appliedCount = value; }
// public java.util.concurrent.atomic.AtomicInteger toPrepareCount() { return wrapperContained.toPrepareCount; }
// public void toPrepareCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.toPrepareCount = value; }
// public java.util.concurrent.atomic.AtomicInteger preparedCount() { return wrapperContained.preparedCount; }
// public void preparedCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.preparedCount = value; }
// public int FIRST_PREPARE_APPLY_WEIGHT() { return wrapperContained.FIRST_PREPARE_APPLY_WEIGHT; }
// public void FIRST_PREPARE_APPLY_WEIGHT(int value) { wrapperContained.FIRST_PREPARE_APPLY_WEIGHT = value; }
// public int SECOND_PREPARE_APPLY_WEIGHT() { return wrapperContained.SECOND_PREPARE_APPLY_WEIGHT; }
// public void SECOND_PREPARE_APPLY_WEIGHT(int value) { wrapperContained.SECOND_PREPARE_APPLY_WEIGHT = value; }
// public int RELOADER_WEIGHT() { return wrapperContained.RELOADER_WEIGHT; }
// public void RELOADER_WEIGHT(int value) { wrapperContained.RELOADER_WEIGHT = value; }
public yarnwrap.resource.SimpleResourceReload create(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage) { return new yarnwrap.resource.SimpleResourceReload(wrapperContained.create(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage)); }
public yarnwrap.resource.ResourceReload start(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,boolean profiled) { return new yarnwrap.resource.ResourceReload(wrapperContained.start(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage,profiled)); }

}