package yarnwrap.resource;
public class SimpleResourceReload { public net.minecraft.resource.SimpleResourceReload wrapperContained; public SimpleResourceReload(net.minecraft.resource.SimpleResourceReload wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture prepareStageFuture() { return wrapperContained.prepareStageFuture; }
// public void prepareStageFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.prepareStageFuture = value; }
// public static java.util.concurrent.CompletableFuture prepareStageFuture() { return net.minecraft.resource.SimpleResourceReload.prepareStageFuture; }
// public static void prepareStageFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.resource.SimpleResourceReload.prepareStageFuture = value; }

// public java.util.concurrent.CompletableFuture applyStageFuture() { return wrapperContained.applyStageFuture; }
// public void applyStageFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.applyStageFuture = value; }
// public static java.util.concurrent.CompletableFuture applyStageFuture() { return net.minecraft.resource.SimpleResourceReload.applyStageFuture; }
// public static void applyStageFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.resource.SimpleResourceReload.applyStageFuture = value; }

// public java.util.Set waitingReloaders() { return wrapperContained.waitingReloaders; }
// public void waitingReloaders(java.util.Set value) { wrapperContained.waitingReloaders = value; }
// public static java.util.Set waitingReloaders() { return net.minecraft.resource.SimpleResourceReload.waitingReloaders; }
// public static void waitingReloaders(java.util.Set value, ) { net.minecraft.resource.SimpleResourceReload.waitingReloaders = value; }

// public int reloaderCount() { return wrapperContained.reloaderCount; }
// public void reloaderCount(int value) { wrapperContained.reloaderCount = value; }
// public static int reloaderCount() { return net.minecraft.resource.SimpleResourceReload.reloaderCount; }
// public static void reloaderCount(int value, ) { net.minecraft.resource.SimpleResourceReload.reloaderCount = value; }

// public int toApplyCount() { return wrapperContained.toApplyCount; }
// public void toApplyCount(int value) { wrapperContained.toApplyCount = value; }
// public static int toApplyCount() { return net.minecraft.resource.SimpleResourceReload.toApplyCount; }
// public static void toApplyCount(int value, ) { net.minecraft.resource.SimpleResourceReload.toApplyCount = value; }

// public int appliedCount() { return wrapperContained.appliedCount; }
// public void appliedCount(int value) { wrapperContained.appliedCount = value; }
// public static int appliedCount() { return net.minecraft.resource.SimpleResourceReload.appliedCount; }
// public static void appliedCount(int value, ) { net.minecraft.resource.SimpleResourceReload.appliedCount = value; }

// public java.util.concurrent.atomic.AtomicInteger toPrepareCount() { return wrapperContained.toPrepareCount; }
// public void toPrepareCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.toPrepareCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger toPrepareCount() { return net.minecraft.resource.SimpleResourceReload.toPrepareCount; }
// public static void toPrepareCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.resource.SimpleResourceReload.toPrepareCount = value; }

// public java.util.concurrent.atomic.AtomicInteger preparedCount() { return wrapperContained.preparedCount; }
// public void preparedCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.preparedCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger preparedCount() { return net.minecraft.resource.SimpleResourceReload.preparedCount; }
// public static void preparedCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.resource.SimpleResourceReload.preparedCount = value; }

// public int FIRST_PREPARE_APPLY_WEIGHT() { return wrapperContained.FIRST_PREPARE_APPLY_WEIGHT; }
// public void FIRST_PREPARE_APPLY_WEIGHT(int value) { wrapperContained.FIRST_PREPARE_APPLY_WEIGHT = value; }
// public static int FIRST_PREPARE_APPLY_WEIGHT() { return net.minecraft.resource.SimpleResourceReload.FIRST_PREPARE_APPLY_WEIGHT; }
// public static void FIRST_PREPARE_APPLY_WEIGHT(int value, ) { net.minecraft.resource.SimpleResourceReload.FIRST_PREPARE_APPLY_WEIGHT = value; }

// public int SECOND_PREPARE_APPLY_WEIGHT() { return wrapperContained.SECOND_PREPARE_APPLY_WEIGHT; }
// public void SECOND_PREPARE_APPLY_WEIGHT(int value) { wrapperContained.SECOND_PREPARE_APPLY_WEIGHT = value; }
// public static int SECOND_PREPARE_APPLY_WEIGHT() { return net.minecraft.resource.SimpleResourceReload.SECOND_PREPARE_APPLY_WEIGHT; }
// public static void SECOND_PREPARE_APPLY_WEIGHT(int value, ) { net.minecraft.resource.SimpleResourceReload.SECOND_PREPARE_APPLY_WEIGHT = value; }

// public int RELOADER_WEIGHT() { return wrapperContained.RELOADER_WEIGHT; }
// public void RELOADER_WEIGHT(int value) { wrapperContained.RELOADER_WEIGHT = value; }
// public static int RELOADER_WEIGHT() { return net.minecraft.resource.SimpleResourceReload.RELOADER_WEIGHT; }
// public static void RELOADER_WEIGHT(int value, ) { net.minecraft.resource.SimpleResourceReload.RELOADER_WEIGHT = value; }

// public SimpleResourceReload(java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,yarnwrap.resource.ResourceManager manager,java.util.List reloaders,Object factory,java.util.concurrent.CompletableFuture initialStage) { this.wrapperContained = new net.minecraft.resource.SimpleResourceReload(prepareExecutor,applyExecutor,manager.wrapperContained,reloaders,factory,initialStage); }
// public void method_18367(java.util.concurrent.Executor application) { wrapperContained.method_18367(application); }
// public static void method_18367(java.util.concurrent.Executor application, ) { net.minecraft.resource.SimpleResourceReload.method_18367(application); }
// public java.util.concurrent.CompletableFuture method_18368(java.util.concurrent.Executor synchronizer,Object resourceManager,yarnwrap.resource.ResourceManager reloader,yarnwrap.resource.ResourceReloader prepare,java.util.concurrent.Executor apply) { return wrapperContained.method_18368(synchronizer,resourceManager,reloader.wrapperContained,prepare.wrapperContained,apply); }
// public static java.util.concurrent.CompletableFuture method_18368(java.util.concurrent.Executor synchronizer,Object resourceManager,yarnwrap.resource.ResourceManager reloader,yarnwrap.resource.ResourceReloader prepare,java.util.concurrent.Executor apply, ) { return net.minecraft.resource.SimpleResourceReload.method_18368(synchronizer,resourceManager,reloader.wrapperContained,prepare.wrapperContained,apply); }
// public yarnwrap.resource.SimpleResourceReload create(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage) { return new yarnwrap.resource.SimpleResourceReload(wrapperContained.create(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage)); }
// public static yarnwrap.resource.SimpleResourceReload create(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage, ) { return new yarnwrap.resource.SimpleResourceReload(net.minecraft.resource.SimpleResourceReload.create(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage)); }
// public void method_18372(java.util.concurrent.Executor preparation) { wrapperContained.method_18372(preparation); }
// public static void method_18372(java.util.concurrent.Executor preparation, ) { net.minecraft.resource.SimpleResourceReload.method_18372(preparation); }
// public yarnwrap.resource.ResourceReload start(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,boolean profiled) { return new yarnwrap.resource.ResourceReload(wrapperContained.start(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage,profiled)); }
// public static yarnwrap.resource.ResourceReload start(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,boolean profiled, ) { return new yarnwrap.resource.ResourceReload(net.minecraft.resource.SimpleResourceReload.start(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage,profiled)); }

}