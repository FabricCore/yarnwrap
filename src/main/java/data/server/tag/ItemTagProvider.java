package yarnwrap.data.server.tag;
public class ItemTagProvider { public net.minecraft.data.server.tag.ItemTagProvider wrapperContained; public ItemTagProvider(net.minecraft.data.server.tag.ItemTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.CompletableFuture blockTags() { return wrapperContained.blockTags; }
// public java.util.Map blockTagsToCopy() { return wrapperContained.blockTagsToCopy; }
// public void copy(yarnwrap.registry.tag.TagKey blockTag,yarnwrap.registry.tag.TagKey itemTag) { wrapperContained.copy(blockTag.wrapperContained,itemTag.wrapperContained); }

}