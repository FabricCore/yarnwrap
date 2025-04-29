package yarnwrap.registry.tag;
public class BlockTags { public net.minecraft.registry.tag.BlockTags wrapperContained; public BlockTags(net.minecraft.registry.tag.BlockTags wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey of(java.lang.String id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.tag.TagKey of(java.lang.String id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.BlockTags.of(id)); }

}