package yarnwrap.datafixer.fix;
public class BlockEntityBannerColorFix { public net.minecraft.datafixer.fix.BlockEntityBannerColorFix wrapperContained; public BlockEntityBannerColorFix(net.minecraft.datafixer.fix.BlockEntityBannerColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntityBannerColorFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityBannerColorFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic fixBannerColor(com.mojang.serialization.Dynamic bannerDynamic) { return wrapperContained.fixBannerColor(bannerDynamic); }
// public com.mojang.serialization.Dynamic method_28176(com.mojang.serialization.Dynamic patternsDynamic) { return wrapperContained.method_28176(patternsDynamic); }
// public com.mojang.serialization.Dynamic method_28177(com.mojang.serialization.Dynamic patternDynamic) { return wrapperContained.method_28177(patternDynamic); }
// public com.mojang.serialization.Dynamic method_28178(com.mojang.serialization.Dynamic colorDynamic) { return wrapperContained.method_28178(colorDynamic); }
// public com.mojang.serialization.Dynamic method_28179(com.mojang.serialization.Dynamic baseDynamic) { return wrapperContained.method_28179(baseDynamic); }

}