package yarnwrap.datafixer.fix;
public class ItemCustomNameToComponentFix { public net.minecraft.datafixer.fix.ItemCustomNameToComponentFix wrapperContained; public ItemCustomNameToComponentFix(net.minecraft.datafixer.fix.ItemCustomNameToComponentFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ItemCustomNameToComponentFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesTyped) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemCustomNameToComponentFix(outputSchema,changesTyped); }
// public com.mojang.serialization.Dynamic fixCustomName(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.fixCustomName(tagDynamic); }
// public com.mojang.datafixers.Typed method_5002(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_5002(itemStackTyped); }
// public com.mojang.datafixers.Typed method_5003(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.method_5003(tagTyped); }

}