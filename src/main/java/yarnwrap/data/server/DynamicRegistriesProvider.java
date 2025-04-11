package yarnwrap.data.server;
public class DynamicRegistriesProvider { public net.minecraft.data.server.DynamicRegistriesProvider wrapperContained; public DynamicRegistriesProvider(net.minecraft.data.server.DynamicRegistriesProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
public DynamicRegistriesProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.DynamicRegistriesProvider(output.wrapperContained,registryLookupFuture); }
// public java.util.Optional writeRegistryEntries(yarnwrap.data.DataWriter writer,Object lookup,com.mojang.serialization.DynamicOps ops,Object registry) { return wrapperContained.writeRegistryEntries(writer.wrapperContained,lookup,ops,registry); }
// public java.util.concurrent.CompletableFuture writeToPath(java.nio.file.Path path,yarnwrap.data.DataWriter cache,com.mojang.serialization.DynamicOps json,com.mojang.serialization.Encoder encoder,java.lang.Object value) { return wrapperContained.writeToPath(path,cache.wrapperContained,json,encoder,value); }
// public java.util.concurrent.CompletableFuture method_46592(Object entry) { return wrapperContained.method_46592(entry); }
// public java.util.concurrent.CompletableFuture method_46813(yarnwrap.registry.RegistryKey wrapper) { return wrapperContained.method_46813(wrapper.wrapperContained); }
// public java.util.concurrent.CompletionStage method_46814(yarnwrap.data.DataWriter lookup) { return wrapperContained.method_46814(lookup.wrapperContained); }
// public java.util.stream.Stream method_46816(yarnwrap.data.DataWriter entry) { return wrapperContained.method_46816(entry.wrapperContained); }

}