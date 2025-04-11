package yarnwrap.data.server.tag;
public class TagProvider { public net.minecraft.data.server.tag.TagProvider wrapperContained; public TagProvider(net.minecraft.data.server.tag.TagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map tagBuilders() { return wrapperContained.tagBuilders; }
// public void tagBuilders(java.util.Map value) { wrapperContained.tagBuilders = value; }
// public Object pathResolver() { return wrapperContained.pathResolver; }
// // public void pathResolver(Object value) { wrapperContained.pathResolver = value; }
// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public void registryRef(yarnwrap.registry.RegistryKey value) { wrapperContained.registryRef = value.wrapperContained; }
// public java.util.concurrent.CompletableFuture parentTagLookupFuture() { return wrapperContained.parentTagLookupFuture; }
// public void parentTagLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.parentTagLookupFuture = value; }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
// public java.util.concurrent.CompletableFuture registryLoadFuture() { return wrapperContained.registryLoadFuture; }
// public void registryLoadFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLoadFuture = value; }
// public TagProvider(yarnwrap.data.DataOutput output,yarnwrap.registry.RegistryKey registryRef,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.TagProvider(output.wrapperContained,registryRef.wrapperContained,registryLookupFuture); }
// public TagProvider(yarnwrap.data.DataOutput output,yarnwrap.registry.RegistryKey registryRef,java.util.concurrent.CompletableFuture registryLookupFuture,java.util.concurrent.CompletableFuture parentTagLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.TagProvider(output.wrapperContained,registryRef.wrapperContained,registryLookupFuture,parentTagLookupFuture); }
// public Object getOrCreateTagBuilder(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getOrCreateTagBuilder(tag.wrapperContained); }
// public void configure(Object lookup) { wrapperContained.configure(lookup); }
// public yarnwrap.registry.tag.TagBuilder getTagBuilder(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.getTagBuilder(tag.wrapperContained)); }
// public yarnwrap.registry.tag.TagBuilder method_27170(yarnwrap.util.Identifier id) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.method_27170(id.wrapperContained)); }
// public boolean method_46832(Object id) { return wrapperContained.method_46832(id); }
// public java.util.concurrent.CompletableFuture getRegistryLookupFuture() { return wrapperContained.getRegistryLookupFuture(); }
// public java.util.Optional method_49656(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.method_49656(tag.wrapperContained); }
// public Object method_49657(Object lookup,Object parent) { return wrapperContained.method_49657(lookup,parent); }
// public boolean method_49658(java.util.function.Predicate tagEntry) { return wrapperContained.method_49658(tagEntry); }
// public java.util.concurrent.CompletionStage method_49659(yarnwrap.data.DataWriter info) { return wrapperContained.method_49659(info.wrapperContained); }
// public boolean method_49660(Object id) { return wrapperContained.method_49660(id); }
// public Object method_49661(java.lang.Void void_) { return wrapperContained.method_49661(void_); }
public java.util.concurrent.CompletableFuture getTagLookupFuture() { return wrapperContained.getTagLookupFuture(); }
// public Object method_49706(Object lookup) { return wrapperContained.method_49706(lookup); }
// public Object method_49707(Object registryLookupFuture) { return wrapperContained.method_49707(registryLookupFuture); }

}