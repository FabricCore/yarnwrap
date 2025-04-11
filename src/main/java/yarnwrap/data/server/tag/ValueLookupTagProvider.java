package yarnwrap.data.server.tag;
public class ValueLookupTagProvider { public net.minecraft.data.server.tag.ValueLookupTagProvider wrapperContained; public ValueLookupTagProvider(net.minecraft.data.server.tag.ValueLookupTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function valueToKey() { return wrapperContained.valueToKey; }
// public void valueToKey(java.util.function.Function value) { wrapperContained.valueToKey = value; }
// public ValueLookupTagProvider(yarnwrap.data.DataOutput output,yarnwrap.registry.RegistryKey registryRef,java.util.concurrent.CompletableFuture registryLookupFuture,java.util.concurrent.CompletableFuture parentTagLookupFuture,java.util.function.Function valueToKey) { this.wrapperContained = new net.minecraft.data.server.tag.ValueLookupTagProvider(output.wrapperContained,registryRef.wrapperContained,registryLookupFuture,parentTagLookupFuture,valueToKey); }
// public ValueLookupTagProvider(yarnwrap.data.DataOutput output,yarnwrap.registry.RegistryKey registryRef,java.util.concurrent.CompletableFuture registryLookupFuture,java.util.function.Function valueToKey) { this.wrapperContained = new net.minecraft.data.server.tag.ValueLookupTagProvider(output.wrapperContained,registryRef.wrapperContained,registryLookupFuture,valueToKey); }

}