package yarnwrap.datafixer.fix;
public class ItemPotionFix { public net.minecraft.datafixer.fix.ItemPotionFix wrapperContained; public ItemPotionFix(net.minecraft.datafixer.fix.ItemPotionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String WATER() { return wrapperContained.WATER; }
// public int SPLASH_POTION_FLAG() { return wrapperContained.SPLASH_POTION_FLAG; }
// public java.lang.String[] ID_TO_POTIONS() { return wrapperContained.ID_TO_POTIONS; }

}