package yarnwrap.datafixer.fix;
public class AreaEffectCloudDurationScaleFix { public net.minecraft.datafixer.fix.AreaEffectCloudDurationScaleFix wrapperContained; public AreaEffectCloudDurationScaleFix(net.minecraft.datafixer.fix.AreaEffectCloudDurationScaleFix wrapperContained) { this.wrapperContained = wrapperContained; }

public AreaEffectCloudDurationScaleFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.AreaEffectCloudDurationScaleFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_66047(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_66047(dynamic); }
// public static com.mojang.serialization.Dynamic method_66047(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.AreaEffectCloudDurationScaleFix.method_66047(dynamic); }

}