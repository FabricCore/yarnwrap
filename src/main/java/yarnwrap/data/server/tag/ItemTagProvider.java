package yarnwrap.data.server.tag;
public class ItemTagProvider { public net.minecraft.data.server.tag.ItemTagProvider wrapperContained; public ItemTagProvider(net.minecraft.data.server.tag.ItemTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture blockTags() { return wrapperContained.blockTags; }
// public void blockTags(java.util.concurrent.CompletableFuture value) { wrapperContained.blockTags = value; }
// public static java.util.concurrent.CompletableFuture blockTags() { return net.minecraft.data.server.tag.ItemTagProvider.blockTags; }
// public static void blockTags(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.server.tag.ItemTagProvider.blockTags = value; }

// public java.util.Map blockTagsToCopy() { return wrapperContained.blockTagsToCopy; }
// public void blockTagsToCopy(java.util.Map value) { wrapperContained.blockTagsToCopy = value; }
// public static java.util.Map blockTagsToCopy() { return net.minecraft.data.server.tag.ItemTagProvider.blockTagsToCopy; }
// public static void blockTagsToCopy(java.util.Map value, ) { net.minecraft.data.server.tag.ItemTagProvider.blockTagsToCopy = value; }

// public ItemTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture,java.util.concurrent.CompletableFuture blockTagLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.ItemTagProvider(output.wrapperContained,registryLookupFuture,blockTagLookupFuture); }
// public ItemTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture,java.util.concurrent.CompletableFuture parentTagLookupFuture,java.util.concurrent.CompletableFuture blockTagLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.ItemTagProvider(output.wrapperContained,registryLookupFuture,parentTagLookupFuture,blockTagLookupFuture); }
// public void copy(yarnwrap.registry.tag.TagKey blockTag,yarnwrap.registry.tag.TagKey itemTag) { wrapperContained.copy(blockTag.wrapperContained,itemTag.wrapperContained); }
// public static void copy(yarnwrap.registry.tag.TagKey blockTag,yarnwrap.registry.tag.TagKey itemTag, ) { net.minecraft.data.server.tag.ItemTagProvider.copy(blockTag.wrapperContained,itemTag.wrapperContained); }
// public yarnwrap.registry.RegistryKey method_46831(yarnwrap.item.Item item) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_46831(item.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_46831(yarnwrap.item.Item item, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.data.server.tag.ItemTagProvider.method_46831(item.wrapperContained)); }
// public Object method_49649(Object lookup,Object blockTags) { return wrapperContained.method_49649(lookup,blockTags); }
// public static Object method_49649(Object lookup,Object blockTags, ) { return net.minecraft.data.server.tag.ItemTagProvider.method_49649(lookup,blockTags); }
// public void method_49650(Object blockTag,yarnwrap.registry.tag.TagKey itemTag) { wrapperContained.method_49650(blockTag,itemTag.wrapperContained); }
// public static void method_49650(Object blockTag,yarnwrap.registry.tag.TagKey itemTag, ) { net.minecraft.data.server.tag.ItemTagProvider.method_49650(blockTag,itemTag.wrapperContained); }
// public yarnwrap.registry.RegistryKey method_49652(yarnwrap.item.Item item) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_49652(item.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_49652(yarnwrap.item.Item item, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.data.server.tag.ItemTagProvider.method_49652(item.wrapperContained)); }

}