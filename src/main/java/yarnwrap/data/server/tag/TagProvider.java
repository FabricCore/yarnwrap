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
// public Object getOrCreateTagBuilder(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getOrCreateTagBuilder(tag.wrapperContained); }
// public void configure(Object lookup) { wrapperContained.configure(lookup); }
// public yarnwrap.registry.tag.TagBuilder getTagBuilder(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.getTagBuilder(tag.wrapperContained)); }
// public java.util.concurrent.CompletableFuture getRegistryLookupFuture() { return wrapperContained.getRegistryLookupFuture(); }
public java.util.concurrent.CompletableFuture getTagLookupFuture() { return wrapperContained.getTagLookupFuture(); }

}