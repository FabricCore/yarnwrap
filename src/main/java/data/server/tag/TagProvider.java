package yarnwrap.data.server.tag;
public class TagProvider { public net.minecraft.data.server.tag.TagProvider wrapperContained; public TagProvider(net.minecraft.data.server.tag.TagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map tagBuilders() { return wrapperContained.tagBuilders; }
// public Object pathResolver() { return wrapperContained.pathResolver; }
// public yarnwrap.registry.RegistryKey registryRef() { return new yarnwrap.registry.RegistryKey(wrapperContained.registryRef); }
// public java.util.concurrent.CompletableFuture parentTagLookupFuture() { return wrapperContained.parentTagLookupFuture; }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public java.util.concurrent.CompletableFuture registryLoadFuture() { return wrapperContained.registryLoadFuture; }
// public Object getOrCreateTagBuilder(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getOrCreateTagBuilder(tag.wrapperContained); }
// public void configure(Object lookup) { wrapperContained.configure(lookup); }
// public yarnwrap.registry.tag.TagBuilder getTagBuilder(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.registry.tag.TagBuilder(wrapperContained.getTagBuilder(tag.wrapperContained)); }
// public java.util.concurrent.CompletableFuture getRegistryLookupFuture() { return wrapperContained.getRegistryLookupFuture(); }
public java.util.concurrent.CompletableFuture getTagLookupFuture() { return wrapperContained.getTagLookupFuture(); }

}