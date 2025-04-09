package yarnwrap.data.client;
public class ModelProvider { public net.minecraft.data.client.ModelProvider wrapperContained; public ModelProvider(net.minecraft.data.client.ModelProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object blockstatesPathResolver() { return wrapperContained.blockstatesPathResolver; }
// public Object modelsPathResolver() { return wrapperContained.modelsPathResolver; }
// public java.util.concurrent.CompletableFuture writeJsons(yarnwrap.data.DataWriter cache,java.util.Map models,java.util.function.Function pathGetter) { return wrapperContained.writeJsons(cache.wrapperContained,models,pathGetter); }

}