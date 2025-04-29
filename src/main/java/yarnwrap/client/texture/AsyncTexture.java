package yarnwrap.client.texture;
public class AsyncTexture { public net.minecraft.client.texture.AsyncTexture wrapperContained; public AsyncTexture(net.minecraft.client.texture.AsyncTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture future() { return wrapperContained.future; }
// public void future(java.util.concurrent.CompletableFuture value) { wrapperContained.future = value; }
// public static java.util.concurrent.CompletableFuture future() { return net.minecraft.client.texture.AsyncTexture.future; }
// public static void future(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.texture.AsyncTexture.future = value; }

public AsyncTexture(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id,java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.client.texture.AsyncTexture(resourceManager.wrapperContained,id.wrapperContained,executor); }
public java.util.concurrent.CompletableFuture getLoadCompleteFuture() { return wrapperContained.getLoadCompleteFuture(); }
// public static java.util.concurrent.CompletableFuture getLoadCompleteFuture() { return net.minecraft.client.texture.AsyncTexture.getLoadCompleteFuture(); }
// public java.lang.Void method_18149(Object texture) { return wrapperContained.method_18149(texture); }
// public static java.lang.Void method_18149(Object texture, ) { return net.minecraft.client.texture.AsyncTexture.method_18149(texture); }
// public java.util.concurrent.Executor createRenderThreadExecutor(java.util.concurrent.Executor executor) { return wrapperContained.createRenderThreadExecutor(executor); }
// public static java.util.concurrent.Executor createRenderThreadExecutor(java.util.concurrent.Executor executor, ) { return net.minecraft.client.texture.AsyncTexture.createRenderThreadExecutor(executor); }
// public void method_22809(java.util.concurrent.Executor runnable) { wrapperContained.method_22809(runnable); }
// public static void method_22809(java.util.concurrent.Executor runnable, ) { net.minecraft.client.texture.AsyncTexture.method_22809(runnable); }

}