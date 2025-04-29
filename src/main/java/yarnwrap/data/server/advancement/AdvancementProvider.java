package yarnwrap.data.server.advancement;
public class AdvancementProvider { public net.minecraft.data.server.advancement.AdvancementProvider wrapperContained; public AdvancementProvider(net.minecraft.data.server.advancement.AdvancementProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List tabGenerators() { return wrapperContained.tabGenerators; }
// public void tabGenerators(java.util.List value) { wrapperContained.tabGenerators = value; }
// public static java.util.List tabGenerators() { return net.minecraft.data.server.advancement.AdvancementProvider.tabGenerators; }
// public static void tabGenerators(java.util.List value, ) { net.minecraft.data.server.advancement.AdvancementProvider.tabGenerators = value; }

// public Object pathResolver() { return wrapperContained.pathResolver; }
// // public void pathResolver(Object value) { wrapperContained.pathResolver = value; }
// // public static Object pathResolver() { return net.minecraft.data.server.advancement.AdvancementProvider.pathResolver; }
// // public static void pathResolver(Object value, ) { net.minecraft.data.server.advancement.AdvancementProvider.pathResolver = value; }

// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
// public static java.util.concurrent.CompletableFuture registryLookupFuture() { return net.minecraft.data.server.advancement.AdvancementProvider.registryLookupFuture; }
// public static void registryLookupFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.server.advancement.AdvancementProvider.registryLookupFuture = value; }

public AdvancementProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture,java.util.List tabGenerators) { this.wrapperContained = new net.minecraft.data.server.advancement.AdvancementProvider(output.wrapperContained,registryLookupFuture,tabGenerators); }
// public void method_10333(java.util.Set advancement) { wrapperContained.method_10333(advancement); }
// public static void method_10333(java.util.Set advancement, ) { net.minecraft.data.server.advancement.AdvancementProvider.method_10333(advancement); }
// public java.util.concurrent.CompletionStage method_46809(yarnwrap.data.DataWriter lookup) { return wrapperContained.method_46809(lookup.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_46809(yarnwrap.data.DataWriter lookup, ) { return net.minecraft.data.server.advancement.AdvancementProvider.method_46809(lookup.wrapperContained); }

}