package yarnwrap.datafixer.fix;
public class ItemShulkerBoxColorFix { public net.minecraft.datafixer.fix.ItemShulkerBoxColorFix wrapperContained; public ItemShulkerBoxColorFix(net.minecraft.datafixer.fix.ItemShulkerBoxColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String[] COLORED_SHULKER_BOX_IDS() { return wrapperContained.COLORED_SHULKER_BOX_IDS; }
// public void COLORED_SHULKER_BOX_IDS(java.lang.String[] value) { wrapperContained.COLORED_SHULKER_BOX_IDS = value; }
public static java.lang.String[] COLORED_SHULKER_BOX_IDS() { return net.minecraft.datafixer.fix.ItemShulkerBoxColorFix.COLORED_SHULKER_BOX_IDS; }
// public static void COLORED_SHULKER_BOX_IDS(java.lang.String[] value, ) { net.minecraft.datafixer.fix.ItemShulkerBoxColorFix.COLORED_SHULKER_BOX_IDS = value; }

public ItemShulkerBoxColorFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemShulkerBoxColorFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_5031(com.mojang.datafixers.OpticFinder itemStack) { return wrapperContained.method_5031(itemStack); }
// public static com.mojang.datafixers.Typed method_5031(com.mojang.datafixers.OpticFinder itemStack, ) { return net.minecraft.datafixer.fix.ItemShulkerBoxColorFix.method_5031(itemStack); }

}