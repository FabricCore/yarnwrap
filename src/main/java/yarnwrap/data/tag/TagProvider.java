package yarnwrap.data.tag;
public class TagProvider { public net.minecraft.data.tag.TagProvider wrapperContained; public TagProvider(net.minecraft.data.tag.TagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map tagBuilders() { return wrapperContained.tagBuilders; }
// public void tagBuilders(java.util.Map value) { wrapperContained.tagBuilders = value; }
// public static java.util.Map tagBuilders() { return net.minecraft.data.tag.TagProvider.tagBuilders; }
// public static void tagBuilders(java.util.Map value, ) { net.minecraft.data.tag.TagProvider.tagBuilders = value; }

// public Object pathResolver() { return wrapperContained.pathResolver; }
// // public void pathResolver(Object value) { wrapperContained.pathResolver = value; }
// // public static Object pathResolver() { return net.minecraft.data.tag.TagProvider.pathResolver; }
// // public static void pathResolver(Object value, ) { net.minecraft.data.tag.TagProvider.pathResolver = value; }

// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(net.minecraft.data.tag.TagProvider.registryRef); }
// public static void registryRef(yarnwrap.registry.RegistryKey value, ) { net.minecraft.data.tag.TagProvider.registryRef = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture parentTagLookupFuture() { return wrapperContained.parentTagLookupFuture; }
// public void parentTagLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.parentTagLookupFuture = value; }
// public static java.util.concurrent.CompletableFuture parentTagLookupFuture() { return net.minecraft.data.tag.TagProvider.parentTagLookupFuture; }
// public static void parentTagLookupFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.tag.TagProvider.parentTagLookupFuture = value; }

// public java.util.concurrent.CompletableFuture registriesFuture() { return wrapperContained.registriesFuture; }
// public void registriesFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registriesFuture = value; }
// public static java.util.concurrent.CompletableFuture registriesFuture() { return net.minecraft.data.tag.TagProvider.registriesFuture; }
// public static void registriesFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.tag.TagProvider.registriesFuture = value; }

// public java.util.concurrent.CompletableFuture registryLoadFuture() { return wrapperContained.registryLoadFuture; }
// public void registryLoadFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLoadFuture = value; }
// public static java.util.concurrent.CompletableFuture registryLoadFuture() { return net.minecraft.data.tag.TagProvider.registryLoadFuture; }
// public static void registryLoadFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.tag.TagProvider.registryLoadFuture = value; }

// public TagProvider(yarnwrap.data.DataOutput output,yarnwrap.registry.RegistryKey registryRef,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.TagProvider(output.wrapperContained,registryRef.wrapperContained,registriesFuture); }
// public TagProvider(yarnwrap.data.DataOutput output,yarnwrap.registry.RegistryKey registryRef,java.util.concurrent.CompletableFuture registriesFuture,java.util.concurrent.CompletableFuture parentTagLookupFuture) { this.wrapperContained = new net.minecraft.data.tag.TagProvider(output.wrapperContained,registryRef.wrapperContained,registriesFuture,parentTagLookupFuture); }
// public void configure(Object registries) { wrapperContained.configure(registries); }
// public static void configure(Object registries, ) { net.minecraft.data.tag.TagProvider.configure(registries); }
// public yarnwrap.registry.tag.TagBuilder getTagBuilder(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.getTagBuilder(tag.wrapperContained)); }
// public static yarnwrap.registry.tag.TagBuilder getTagBuilder(yarnwrap.registry.tag.TagKey tag, ) { return new yarnwrap.registry.tag.TagBuilder(net.minecraft.data.tag.TagProvider.getTagBuilder(tag.wrapperContained)); }
// public yarnwrap.registry.tag.TagBuilder method_27170(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.method_27170(id.wrapperContained)); }
// public static yarnwrap.registry.tag.TagBuilder method_27170(yarnwrap.util.Identifier id, ) { return new yarnwrap.registry.tag.TagBuilder(net.minecraft.data.tag.TagProvider.method_27170(id.wrapperContained)); }
// public boolean method_46832(Object id) { return wrapperContained.method_46832(id); }
// public static boolean method_46832(Object id, ) { return net.minecraft.data.tag.TagProvider.method_46832(id); }
// public java.util.concurrent.CompletableFuture getRegistriesFuture() { return wrapperContained.getRegistriesFuture(); }
// public static java.util.concurrent.CompletableFuture getRegistriesFuture() { return net.minecraft.data.tag.TagProvider.getRegistriesFuture(); }
// public java.util.Optional method_49656(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.method_49656(tag.wrapperContained); }
// public static java.util.Optional method_49656(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.data.tag.TagProvider.method_49656(tag.wrapperContained); }
// public Object method_49657(Object registries,Object parent) { return wrapperContained.method_49657(registries,parent); }
// public static Object method_49657(Object registries,Object parent, ) { return net.minecraft.data.tag.TagProvider.method_49657(registries,parent); }
// public boolean method_49658(java.util.function.Predicate tagEntry) { return wrapperContained.method_49658(tagEntry); }
// public static boolean method_49658(java.util.function.Predicate tagEntry, ) { return net.minecraft.data.tag.TagProvider.method_49658(tagEntry); }
// public java.util.concurrent.CompletionStage method_49659(yarnwrap.data.DataWriter info) { return wrapperContained.method_49659(info.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_49659(yarnwrap.data.DataWriter info, ) { return net.minecraft.data.tag.TagProvider.method_49659(info.wrapperContained); }
// public boolean method_49660(Object id) { return wrapperContained.method_49660(id); }
// public static boolean method_49660(Object id, ) { return net.minecraft.data.tag.TagProvider.method_49660(id); }
// public Object method_49661(java.lang.Void void_) { return wrapperContained.method_49661(void_); }
// public static Object method_49661(java.lang.Void void_, ) { return net.minecraft.data.tag.TagProvider.method_49661(void_); }
public java.util.concurrent.CompletableFuture getTagLookupFuture() { return wrapperContained.getTagLookupFuture(); }
// public static java.util.concurrent.CompletableFuture getTagLookupFuture() { return net.minecraft.data.tag.TagProvider.getTagLookupFuture(); }
// public Object method_49706(Object registries) { return wrapperContained.method_49706(registries); }
// public static Object method_49706(Object registries, ) { return net.minecraft.data.tag.TagProvider.method_49706(registries); }
// public Object method_49707(Object registriesFuture) { return wrapperContained.method_49707(registriesFuture); }
// public static Object method_49707(Object registriesFuture, ) { return net.minecraft.data.tag.TagProvider.method_49707(registriesFuture); }

}