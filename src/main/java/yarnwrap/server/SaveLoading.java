package yarnwrap.server;
public class SaveLoading { public net.minecraft.server.SaveLoading wrapperContained; public SaveLoading(net.minecraft.server.SaveLoading wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.SaveLoading.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.SaveLoading.LOGGER = value; }

// public void method_42096(yarnwrap.resource.LifecycledResourceManager dataPackContents,yarnwrap.server.DataPackContents throwable) { wrapperContained.method_42096(dataPackContents.wrapperContained,throwable.wrapperContained); }
// public static void method_42096(yarnwrap.resource.LifecycledResourceManager dataPackContents,yarnwrap.server.DataPackContents throwable, ) { net.minecraft.server.SaveLoading.method_42096(dataPackContents.wrapperContained,throwable.wrapperContained); }
// public java.lang.Object method_42097(Object dataPackContents) { return wrapperContained.method_42097(dataPackContents); }
// public static java.lang.Object method_42097(Object dataPackContents, ) { return net.minecraft.server.SaveLoading.method_42097(dataPackContents); }
// public java.util.concurrent.CompletableFuture load(Object serverConfig,Object loadContextSupplier,Object saveApplierFactory,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor) { return wrapperContained.load(serverConfig,loadContextSupplier,saveApplierFactory,prepareExecutor,applyExecutor); }
// public static java.util.concurrent.CompletableFuture load(Object serverConfig,Object loadContextSupplier,Object saveApplierFactory,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor, ) { return net.minecraft.server.SaveLoading.load(serverConfig,loadContextSupplier,saveApplierFactory,prepareExecutor,applyExecutor); }

}