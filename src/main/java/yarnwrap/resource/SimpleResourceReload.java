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

// public java.util.concurrent.atomic.AtomicInteger toApplyCount() { return wrapperContained.toApplyCount; }
// public void toApplyCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.toApplyCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger toApplyCount() { return net.minecraft.resource.SimpleResourceReload.toApplyCount; }
// public static void toApplyCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.resource.SimpleResourceReload.toApplyCount = value; }

// public java.util.concurrent.atomic.AtomicInteger appliedCount() { return wrapperContained.appliedCount; }
// public void appliedCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.appliedCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger appliedCount() { return net.minecraft.resource.SimpleResourceReload.appliedCount; }
// public static void appliedCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.resource.SimpleResourceReload.appliedCount = value; }

// public java.util.concurrent.atomic.AtomicInteger toPrepareCount() { return wrapperContained.toPrepareCount; }
// public void toPrepareCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.toPrepareCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger toPrepareCount() { return net.minecraft.resource.SimpleResourceReload.toPrepareCount; }
// public static void toPrepareCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.resource.SimpleResourceReload.toPrepareCount = value; }

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

// public java.util.concurrent.atomic.AtomicInteger preparedCount() { return wrapperContained.preparedCount; }
// public void preparedCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.preparedCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger preparedCount() { return net.minecraft.resource.SimpleResourceReload.preparedCount; }
// public static void preparedCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.resource.SimpleResourceReload.preparedCount = value; }

// public SimpleResourceReload(java.util.List waitingReloaders) { this.wrapperContained = new net.minecraft.resource.SimpleResourceReload(waitingReloaders); }
// public yarnwrap.resource.ResourceReload create(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage) { return new yarnwrap.resource.ResourceReload(wrapperContained.create(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage)); }
// public static yarnwrap.resource.ResourceReload create(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage, ) { return new yarnwrap.resource.ResourceReload(net.minecraft.resource.SimpleResourceReload.create(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage)); }
// public yarnwrap.resource.ResourceReload start(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,boolean profiled) { return new yarnwrap.resource.ResourceReload(wrapperContained.start(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage,profiled)); }
// public static yarnwrap.resource.ResourceReload start(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage,boolean profiled, ) { return new yarnwrap.resource.ResourceReload(net.minecraft.resource.SimpleResourceReload.start(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage,profiled)); }
// public java.util.concurrent.CompletableFuture startAsync(java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,yarnwrap.resource.ResourceManager manager,java.util.List reloaders,Object factory,java.util.concurrent.CompletableFuture initialStage) { return wrapperContained.startAsync(prepareExecutor,applyExecutor,manager.wrapperContained,reloaders,factory,initialStage); }
// public static java.util.concurrent.CompletableFuture startAsync(java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,yarnwrap.resource.ResourceManager manager,java.util.List reloaders,Object factory,java.util.concurrent.CompletableFuture initialStage, ) { return net.minecraft.resource.SimpleResourceReload.startAsync(prepareExecutor,applyExecutor,manager.wrapperContained,reloaders,factory,initialStage); }
// public int toWeighted(int prepare,int apply,int total) { return wrapperContained.toWeighted(prepare,apply,total); }
// public static int toWeighted(int prepare,int apply,int total, ) { return net.minecraft.resource.SimpleResourceReload.toWeighted(prepare,apply,total); }
// public Object createSynchronizer(yarnwrap.resource.ResourceReloader reloader,java.util.concurrent.CompletableFuture future,java.util.concurrent.Executor applyExecutor) { return wrapperContained.createSynchronizer(reloader.wrapperContained,future,applyExecutor); }
// public static Object createSynchronizer(yarnwrap.resource.ResourceReloader reloader,java.util.concurrent.CompletableFuture future,java.util.concurrent.Executor applyExecutor, ) { return net.minecraft.resource.SimpleResourceReload.createSynchronizer(reloader.wrapperContained,future,applyExecutor); }
// public void method_67575(java.util.concurrent.Executor runnable) { wrapperContained.method_67575(runnable); }
// public static void method_67575(java.util.concurrent.Executor runnable, ) { net.minecraft.resource.SimpleResourceReload.method_67575(runnable); }
// public void method_67577(java.util.concurrent.Executor runnable) { wrapperContained.method_67577(runnable); }
// public static void method_67577(java.util.concurrent.Executor runnable, ) { net.minecraft.resource.SimpleResourceReload.method_67577(runnable); }
// public void start(java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,yarnwrap.resource.ResourceManager manager,java.util.List reloaders,Object factory,java.util.concurrent.CompletableFuture initialStage) { wrapperContained.start(prepareExecutor,applyExecutor,manager.wrapperContained,reloaders,factory,initialStage); }
// public static void start(java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,yarnwrap.resource.ResourceManager manager,java.util.List reloaders,Object factory,java.util.concurrent.CompletableFuture initialStage, ) { net.minecraft.resource.SimpleResourceReload.start(prepareExecutor,applyExecutor,manager.wrapperContained,reloaders,factory,initialStage); }

}