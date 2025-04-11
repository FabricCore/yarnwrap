package yarnwrap.data.client;
public class ModelProvider { public net.minecraft.data.client.ModelProvider wrapperContained; public ModelProvider(net.minecraft.data.client.ModelProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object blockstatesPathResolver() { return wrapperContained.blockstatesPathResolver; }
// // public void blockstatesPathResolver(Object value) { wrapperContained.blockstatesPathResolver = value; }
// public Object modelsPathResolver() { return wrapperContained.modelsPathResolver; }
// // public void modelsPathResolver(Object value) { wrapperContained.modelsPathResolver = value; }
public ModelProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.data.client.ModelProvider(output.wrapperContained); }
// public java.util.concurrent.CompletableFuture writeJsons(yarnwrap.data.DataWriter cache,java.util.Map models,java.util.function.Function pathGetter) { return wrapperContained.writeJsons(cache.wrapperContained,models,pathGetter); }
// public boolean method_25738(java.util.Map block) { return wrapperContained.method_25738(block); }
// public void method_25739(java.util.Map blockStateSupplier) { wrapperContained.method_25739(blockStateSupplier); }
// public void method_25740(java.util.Map id,yarnwrap.util.Identifier jsonSupplier) { wrapperContained.method_25740(id,jsonSupplier.wrapperContained); }
// public void method_25741(java.util.Set block) { wrapperContained.method_25741(block); }
// public java.util.concurrent.CompletableFuture method_25742(java.util.function.Function entry) { return wrapperContained.method_25742(entry); }
// public java.nio.file.Path method_44110(yarnwrap.block.Block block) { return wrapperContained.method_44110(block.wrapperContained); }
// public boolean method_53817(Object entry) { return wrapperContained.method_53817(entry); }

}