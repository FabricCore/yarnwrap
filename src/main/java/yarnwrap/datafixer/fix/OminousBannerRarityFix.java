package yarnwrap.datafixer.fix;
public class OminousBannerRarityFix { public net.minecraft.datafixer.fix.OminousBannerRarityFix wrapperContained; public OminousBannerRarityFix(net.minecraft.datafixer.fix.OminousBannerRarityFix wrapperContained) { this.wrapperContained = wrapperContained; }

public OminousBannerRarityFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.OminousBannerRarityFix(outputSchema); }
// public com.mojang.datafixers.Typed fixNameAndRarity() { return wrapperContained.fixNameAndRarity(); }
// public static com.mojang.datafixers.Typed fixNameAndRarity() { return net.minecraft.datafixer.fix.OminousBannerRarityFix.fixNameAndRarity(); }

}