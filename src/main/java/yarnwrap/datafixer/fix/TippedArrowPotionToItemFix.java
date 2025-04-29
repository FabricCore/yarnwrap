package yarnwrap.datafixer.fix;
public class TippedArrowPotionToItemFix { public net.minecraft.datafixer.fix.TippedArrowPotionToItemFix wrapperContained; public TippedArrowPotionToItemFix(net.minecraft.datafixer.fix.TippedArrowPotionToItemFix wrapperContained) { this.wrapperContained = wrapperContained; }

public TippedArrowPotionToItemFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.TippedArrowPotionToItemFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_57274(java.util.Optional itemDynamic) { return wrapperContained.method_57274(itemDynamic); }
// public static com.mojang.serialization.Dynamic method_57274(java.util.Optional itemDynamic, ) { return net.minecraft.datafixer.fix.TippedArrowPotionToItemFix.method_57274(itemDynamic); }

}