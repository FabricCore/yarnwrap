package yarnwrap.client.texture;
public class AsyncTexture { public net.minecraft.client.texture.AsyncTexture wrapperContained; public AsyncTexture(net.minecraft.client.texture.AsyncTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture future() { return wrapperContained.future; }
// public void future(java.util.concurrent.CompletableFuture value) { wrapperContained.future = value; }
public java.util.concurrent.CompletableFuture getLoadCompleteFuture() { return wrapperContained.getLoadCompleteFuture(); }
// public java.util.concurrent.Executor createRenderThreadExecutor(java.util.concurrent.Executor executor) { return wrapperContained.createRenderThreadExecutor(executor); }

}