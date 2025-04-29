package yarnwrap.item;
public class BannerPatternItem { public net.minecraft.item.BannerPatternItem wrapperContained; public BannerPatternItem(net.minecraft.item.BannerPatternItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey patternItemTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.patternItemTag); }
// public void patternItemTag(yarnwrap.registry.tag.TagKey value) { wrapperContained.patternItemTag = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagKey patternItemTag() { return new yarnwrap.registry.tag.TagKey(net.minecraft.item.BannerPatternItem.patternItemTag); }
// public static void patternItemTag(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.item.BannerPatternItem.patternItemTag = value.wrapperContained; }

// public BannerPatternItem(yarnwrap.registry.tag.TagKey patternItemTag,Object settings) { this.wrapperContained = new net.minecraft.item.BannerPatternItem(patternItemTag.wrapperContained,settings); }
public yarnwrap.text.MutableText getDescription() { return new yarnwrap.text.MutableText(wrapperContained.getDescription()); }
// public static yarnwrap.text.MutableText getDescription() { return new yarnwrap.text.MutableText(net.minecraft.item.BannerPatternItem.getDescription()); }
public yarnwrap.registry.tag.TagKey getPattern() { return new yarnwrap.registry.tag.TagKey(wrapperContained.getPattern()); }
// public static yarnwrap.registry.tag.TagKey getPattern() { return new yarnwrap.registry.tag.TagKey(net.minecraft.item.BannerPatternItem.getPattern()); }

}