package yarnwrap.data.report;
public class ItemListProvider { public net.minecraft.data.report.ItemListProvider wrapperContained; public ItemListProvider(net.minecraft.data.report.ItemListProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
public ItemListProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.report.ItemListProvider(output.wrapperContained,registryLookupFuture); }
// public void method_57955(yarnwrap.registry.RegistryOps entry) { wrapperContained.method_57955(entry.wrapperContained); }
// public java.util.concurrent.CompletionStage method_57959(yarnwrap.data.DataWriter registryLookup) { return wrapperContained.method_57959(registryLookup.wrapperContained); }
// public java.lang.IllegalStateException method_60581(java.lang.String components) { return wrapperContained.method_60581(components); }

}