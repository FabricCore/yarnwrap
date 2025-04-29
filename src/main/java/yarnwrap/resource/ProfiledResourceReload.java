package yarnwrap.resource;
public class ProfiledResourceReload { public net.minecraft.resource.ProfiledResourceReload wrapperContained; public ProfiledResourceReload(net.minecraft.resource.ProfiledResourceReload wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.resource.ProfiledResourceReload.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.resource.ProfiledResourceReload.LOGGER = value; }

// public com.google.common.base.Stopwatch reloadTimer() { return wrapperContained.reloadTimer; }
// public void reloadTimer(com.google.common.base.Stopwatch value) { wrapperContained.reloadTimer = value; }
// public static com.google.common.base.Stopwatch reloadTimer() { return net.minecraft.resource.ProfiledResourceReload.reloadTimer; }
// public static void reloadTimer(com.google.common.base.Stopwatch value, ) { net.minecraft.resource.ProfiledResourceReload.reloadTimer = value; }

public ProfiledResourceReload(yarnwrap.resource.ResourceManager manager,java.util.List reloaders,java.util.concurrent.Executor prepareExecutor,java.util.concurrent.Executor applyExecutor,java.util.concurrent.CompletableFuture initialStage) { this.wrapperContained = new net.minecraft.resource.ProfiledResourceReload(manager.wrapperContained,reloaders,prepareExecutor,applyExecutor,initialStage); }
// public java.util.List finish(java.util.List summaries) { return wrapperContained.finish(summaries); }
// public static java.util.List finish(java.util.List summaries, ) { return net.minecraft.resource.ProfiledResourceReload.finish(summaries); }
// public void method_18354(java.util.concurrent.Executor application) { wrapperContained.method_18354(application); }
// public static void method_18354(java.util.concurrent.Executor application, ) { net.minecraft.resource.ProfiledResourceReload.method_18354(application); }
// public java.util.concurrent.CompletableFuture method_18355(java.util.concurrent.Executor synchronizer,Object resourceManager,yarnwrap.resource.ResourceManager reloader,yarnwrap.resource.ResourceReloader prepare,java.util.concurrent.Executor apply) { return wrapperContained.method_18355(synchronizer,resourceManager,reloader.wrapperContained,prepare.wrapperContained,apply); }
// public static java.util.concurrent.CompletableFuture method_18355(java.util.concurrent.Executor synchronizer,Object resourceManager,yarnwrap.resource.ResourceManager reloader,yarnwrap.resource.ResourceReloader prepare,java.util.concurrent.Executor apply, ) { return net.minecraft.resource.ProfiledResourceReload.method_18355(synchronizer,resourceManager,reloader.wrapperContained,prepare.wrapperContained,apply); }
// public Object method_18356(yarnwrap.resource.ResourceReloader dummy) { return wrapperContained.method_18356(dummy.wrapperContained); }
// public static Object method_18356(yarnwrap.resource.ResourceReloader dummy, ) { return net.minecraft.resource.ProfiledResourceReload.method_18356(dummy.wrapperContained); }
// public void method_18358(java.util.concurrent.Executor preparation) { wrapperContained.method_18358(preparation); }
// public static void method_18358(java.util.concurrent.Executor preparation, ) { net.minecraft.resource.ProfiledResourceReload.method_18358(preparation); }

}