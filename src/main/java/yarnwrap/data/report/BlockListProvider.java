package yarnwrap.data.report;
public class BlockListProvider { public net.minecraft.data.report.BlockListProvider wrapperContained; public BlockListProvider(net.minecraft.data.report.BlockListProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.report.BlockListProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.report.BlockListProvider.output = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
// public static java.util.concurrent.CompletableFuture registryLookupFuture() { return net.minecraft.data.report.BlockListProvider.registryLookupFuture; }
// public static void registryLookupFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.report.BlockListProvider.registryLookupFuture = value; }

public BlockListProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.report.BlockListProvider(output.wrapperContained,registryLookupFuture); }
// public void method_57952(yarnwrap.registry.RegistryOps entry) { wrapperContained.method_57952(entry.wrapperContained); }
// public static void method_57952(yarnwrap.registry.RegistryOps entry, ) { net.minecraft.data.report.BlockListProvider.method_57952(entry.wrapperContained); }
// public java.util.concurrent.CompletionStage method_57954(yarnwrap.data.DataWriter registryLookup) { return wrapperContained.method_57954(registryLookup.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_57954(yarnwrap.data.DataWriter registryLookup, ) { return net.minecraft.data.report.BlockListProvider.method_57954(registryLookup.wrapperContained); }

}