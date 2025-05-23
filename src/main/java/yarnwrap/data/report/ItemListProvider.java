package yarnwrap.data.report;
public class ItemListProvider { public net.minecraft.data.report.ItemListProvider wrapperContained; public ItemListProvider(net.minecraft.data.report.ItemListProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.report.ItemListProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.report.ItemListProvider.output = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture registriesFuture() { return wrapperContained.registriesFuture; }
// public void registriesFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registriesFuture = value; }
// public static java.util.concurrent.CompletableFuture registriesFuture() { return net.minecraft.data.report.ItemListProvider.registriesFuture; }
// public static void registriesFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.report.ItemListProvider.registriesFuture = value; }

public ItemListProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.report.ItemListProvider(output.wrapperContained,registriesFuture); }
// public void method_57955(yarnwrap.registry.RegistryOps entry) { wrapperContained.method_57955(entry.wrapperContained); }
// public static void method_57955(yarnwrap.registry.RegistryOps entry, ) { net.minecraft.data.report.ItemListProvider.method_57955(entry.wrapperContained); }
// public java.util.concurrent.CompletionStage method_57959(yarnwrap.data.DataWriter registries) { return wrapperContained.method_57959(registries.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_57959(yarnwrap.data.DataWriter registries, ) { return net.minecraft.data.report.ItemListProvider.method_57959(registries.wrapperContained); }
// public java.lang.IllegalStateException method_60581(java.lang.String components) { return wrapperContained.method_60581(components); }
// public static java.lang.IllegalStateException method_60581(java.lang.String components, ) { return net.minecraft.data.report.ItemListProvider.method_60581(components); }

}