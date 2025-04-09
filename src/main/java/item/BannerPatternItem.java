package yarnwrap.item;
public class BannerPatternItem { public net.minecraft.item.BannerPatternItem wrapperContained; public BannerPatternItem(net.minecraft.item.BannerPatternItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey patternItemTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.patternItemTag); }
public yarnwrap.text.MutableText getDescription() { return new yarnwrap.text.MutableText(wrapperContained.getDescription()); }
public yarnwrap.registry.tag.TagKey getPattern() { return new yarnwrap.registry.tag.TagKey(wrapperContained.getPattern()); }

}