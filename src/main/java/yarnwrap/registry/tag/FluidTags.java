package yarnwrap.registry.tag;
public class FluidTags { public net.minecraft.registry.tag.FluidTags wrapperContained; public FluidTags(net.minecraft.registry.tag.FluidTags wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey of(java.lang.String id) { return new yarnwrap.registry.tag.TagKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.tag.TagKey of(java.lang.String id, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.registry.tag.FluidTags.of(id)); }

}