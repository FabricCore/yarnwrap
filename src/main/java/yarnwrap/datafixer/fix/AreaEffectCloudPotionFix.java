package yarnwrap.datafixer.fix;
public class AreaEffectCloudPotionFix { public net.minecraft.datafixer.fix.AreaEffectCloudPotionFix wrapperContained; public AreaEffectCloudPotionFix(net.minecraft.datafixer.fix.AreaEffectCloudPotionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public AreaEffectCloudPotionFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.AreaEffectCloudPotionFix(outputSchema); }
// public com.mojang.serialization.Dynamic update(com.mojang.serialization.Dynamic areaEffectCloudDynamic) { return wrapperContained.update(areaEffectCloudDynamic); }
// public static com.mojang.serialization.Dynamic update(com.mojang.serialization.Dynamic areaEffectCloudDynamic, ) { return net.minecraft.datafixer.fix.AreaEffectCloudPotionFix.update(areaEffectCloudDynamic); }

}