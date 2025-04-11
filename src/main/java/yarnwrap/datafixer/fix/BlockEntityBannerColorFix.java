package yarnwrap.datafixer.fix;
public class BlockEntityBannerColorFix { public net.minecraft.datafixer.fix.BlockEntityBannerColorFix wrapperContained; public BlockEntityBannerColorFix(net.minecraft.datafixer.fix.BlockEntityBannerColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixBannerColor(com.mojang.serialization.Dynamic bannerDynamic) { return wrapperContained.fixBannerColor(bannerDynamic); }

}