package yarnwrap.datafixer.fix;
public class ItemPotionFix { public net.minecraft.datafixer.fix.ItemPotionFix wrapperContained; public ItemPotionFix(net.minecraft.datafixer.fix.ItemPotionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String WATER() { return wrapperContained.WATER; }
// public void WATER(java.lang.String value) { wrapperContained.WATER = value; }
// public int SPLASH_POTION_FLAG() { return wrapperContained.SPLASH_POTION_FLAG; }
// public void SPLASH_POTION_FLAG(int value) { wrapperContained.SPLASH_POTION_FLAG = value; }
// public java.lang.String[] ID_TO_POTIONS() { return wrapperContained.ID_TO_POTIONS; }
// public void ID_TO_POTIONS(java.lang.String[] value) { wrapperContained.ID_TO_POTIONS = value; }
public ItemPotionFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemPotionFix(outputSchema,changesType); }
// public void method_5023(java.lang.String[] potions) { wrapperContained.method_5023(potions); }
// public com.mojang.datafixers.Typed method_5024(com.mojang.datafixers.OpticFinder itemStack) { return wrapperContained.method_5024(itemStack); }

}