package yarnwrap.data.server.tag;
public class ItemTagProvider { public net.minecraft.data.server.tag.ItemTagProvider wrapperContained; public ItemTagProvider(net.minecraft.data.server.tag.ItemTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture blockTags() { return wrapperContained.blockTags; }
// public void blockTags(java.util.concurrent.CompletableFuture value) { wrapperContained.blockTags = value; }
// public java.util.Map blockTagsToCopy() { return wrapperContained.blockTagsToCopy; }
// public void blockTagsToCopy(java.util.Map value) { wrapperContained.blockTagsToCopy = value; }
// public void copy(yarnwrap.registry.tag.TagKey blockTag,yarnwrap.registry.tag.TagKey itemTag) { wrapperContained.copy(blockTag.wrapperContained,itemTag.wrapperContained); }

}