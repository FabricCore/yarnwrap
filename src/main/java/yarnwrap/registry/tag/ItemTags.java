package yarnwrap.registry.tag;
public class ItemTags { public net.minecraft.registry.tag.ItemTags wrapperContained; public ItemTags(net.minecraft.registry.tag.ItemTags wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey of(java.lang.String id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.tag.TagKey of(java.lang.String id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.ItemTags.of(id)); }

}