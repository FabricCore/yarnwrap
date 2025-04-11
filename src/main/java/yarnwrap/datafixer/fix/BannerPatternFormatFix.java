package yarnwrap.datafixer.fix;
public class BannerPatternFormatFix { public net.minecraft.datafixer.fix.BannerPatternFormatFix wrapperContained; public BannerPatternFormatFix(net.minecraft.datafixer.fix.BannerPatternFormatFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map OLD_TO_NEW_PATTERNS() { return wrapperContained.OLD_TO_NEW_PATTERNS; }
// public void OLD_TO_NEW_PATTERNS(java.util.Map value) { wrapperContained.OLD_TO_NEW_PATTERNS = value; }
public BannerPatternFormatFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BannerPatternFormatFix(outputSchema); }
public java.lang.String getColorFromInt(int color) { return wrapperContained.getColorFromInt(color); }
// public com.mojang.serialization.Dynamic replacePatterns() { return wrapperContained.replacePatterns(); }
// public com.mojang.serialization.Dynamic replacePatternAndColor() { return wrapperContained.replacePatternAndColor(); }

}