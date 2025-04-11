package yarnwrap.datafixer.fix;
public class ItemWaterPotionFix { public net.minecraft.datafixer.fix.ItemWaterPotionFix wrapperContained; public ItemWaterPotionFix(net.minecraft.datafixer.fix.ItemWaterPotionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ItemWaterPotionFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemWaterPotionFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_5048(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_5048(itemStackTyped); }

}