package yarnwrap.datafixer.fix;
public class OminousBannerBlockEntityRenameFix { public net.minecraft.datafixer.fix.OminousBannerBlockEntityRenameFix wrapperContained; public OminousBannerBlockEntityRenameFix(net.minecraft.datafixer.fix.OminousBannerBlockEntityRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public OminousBannerBlockEntityRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.OminousBannerBlockEntityRenameFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic fixBannerName(com.mojang.serialization.Dynamic bannerDynamic) { return wrapperContained.fixBannerName(bannerDynamic); }

}