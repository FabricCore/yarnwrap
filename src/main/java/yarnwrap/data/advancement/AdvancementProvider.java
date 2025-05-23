package yarnwrap.data.advancement;
public class AdvancementProvider { public net.minecraft.data.advancement.AdvancementProvider wrapperContained; public AdvancementProvider(net.minecraft.data.advancement.AdvancementProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List tabGenerators() { return wrapperContained.tabGenerators; }
// public void tabGenerators(java.util.List value) { wrapperContained.tabGenerators = value; }
// public static java.util.List tabGenerators() { return net.minecraft.data.advancement.AdvancementProvider.tabGenerators; }
// public static void tabGenerators(java.util.List value, ) { net.minecraft.data.advancement.AdvancementProvider.tabGenerators = value; }

// public Object pathResolver() { return wrapperContained.pathResolver; }
// // public void pathResolver(Object value) { wrapperContained.pathResolver = value; }
// // public static Object pathResolver() { return net.minecraft.data.advancement.AdvancementProvider.pathResolver; }
// // public static void pathResolver(Object value, ) { net.minecraft.data.advancement.AdvancementProvider.pathResolver = value; }

// public java.util.concurrent.CompletableFuture registriesFuture() { return wrapperContained.registriesFuture; }
// public void registriesFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registriesFuture = value; }
// public static java.util.concurrent.CompletableFuture registriesFuture() { return net.minecraft.data.advancement.AdvancementProvider.registriesFuture; }
// public static void registriesFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.advancement.AdvancementProvider.registriesFuture = value; }

public AdvancementProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture,java.util.List tabGenerators) { this.wrapperContained = new net.minecraft.data.advancement.AdvancementProvider(output.wrapperContained,registriesFuture,tabGenerators); }
// public void method_10333(java.util.Set advancement) { wrapperContained.method_10333(advancement); }
// public static void method_10333(java.util.Set advancement, ) { net.minecraft.data.advancement.AdvancementProvider.method_10333(advancement); }
// public java.util.concurrent.CompletionStage method_46809(yarnwrap.data.DataWriter registries) { return wrapperContained.method_46809(registries.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_46809(yarnwrap.data.DataWriter registries, ) { return net.minecraft.data.advancement.AdvancementProvider.method_46809(registries.wrapperContained); }

}