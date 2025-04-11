package yarnwrap.data.server;
public class DynamicRegistriesProvider { public net.minecraft.data.server.DynamicRegistriesProvider wrapperContained; public DynamicRegistriesProvider(net.minecraft.data.server.DynamicRegistriesProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
// public java.util.Optional writeRegistryEntries(yarnwrap.data.DataWriter writer,Object lookup,com.mojang.serialization.DynamicOps ops,Object registry) { return wrapperContained.writeRegistryEntries(writer.wrapperContained,lookup,ops,registry); }
// public java.util.concurrent.CompletableFuture writeToPath(java.nio.file.Path path,yarnwrap.data.DataWriter cache,com.mojang.serialization.DynamicOps json,com.mojang.serialization.Encoder encoder,java.lang.Object value) { return wrapperContained.writeToPath(path,cache.wrapperContained,json,encoder,value); }

}