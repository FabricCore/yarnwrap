package yarnwrap.data.report;
public class BlockListProvider { public net.minecraft.data.report.BlockListProvider wrapperContained; public BlockListProvider(net.minecraft.data.report.BlockListProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.report.BlockListProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.report.BlockListProvider.output = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture registriesFuture() { return wrapperContained.registriesFuture; }
// public void registriesFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registriesFuture = value; }
// public static java.util.concurrent.CompletableFuture registriesFuture() { return net.minecraft.data.report.BlockListProvider.registriesFuture; }
// public static void registriesFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.report.BlockListProvider.registriesFuture = value; }

public BlockListProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.report.BlockListProvider(output.wrapperContained,registriesFuture); }
// public void method_57952(yarnwrap.registry.RegistryOps entry) { wrapperContained.method_57952(entry.wrapperContained); }
// public static void method_57952(yarnwrap.registry.RegistryOps entry, ) { net.minecraft.data.report.BlockListProvider.method_57952(entry.wrapperContained); }
// public java.util.concurrent.CompletionStage method_57954(yarnwrap.data.DataWriter registries) { return wrapperContained.method_57954(registries.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_57954(yarnwrap.data.DataWriter registries, ) { return net.minecraft.data.report.BlockListProvider.method_57954(registries.wrapperContained); }

}