package yarnwrap.datafixer.fix;
public class CustomModelDataExpansionFix { public net.minecraft.datafixer.fix.CustomModelDataExpansionFix wrapperContained; public CustomModelDataExpansionFix(net.minecraft.datafixer.fix.CustomModelDataExpansionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public CustomModelDataExpansionFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.CustomModelDataExpansionFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_65328(com.mojang.serialization.Dynamic customModelDataDynamic) { return wrapperContained.method_65328(customModelDataDynamic); }
// public static com.mojang.serialization.Dynamic method_65328(com.mojang.serialization.Dynamic customModelDataDynamic, ) { return net.minecraft.datafixer.fix.CustomModelDataExpansionFix.method_65328(customModelDataDynamic); }

}