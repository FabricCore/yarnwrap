package yarnwrap.datafixer.fix;
public class ItemStackUuidFix { public net.minecraft.datafixer.fix.ItemStackUuidFix wrapperContained; public ItemStackUuidFix(net.minecraft.datafixer.fix.ItemStackUuidFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ItemStackUuidFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemStackUuidFix(outputSchema); }
// public java.lang.Boolean method_26051(com.mojang.datafixers.util.Pair id) { return wrapperContained.method_26051(id); }
// public com.mojang.serialization.Dynamic method_26053(com.mojang.serialization.Dynamic skullOwner) { return wrapperContained.method_26053(skullOwner); }
// public com.mojang.serialization.Dynamic method_26293(com.mojang.serialization.Dynamic attributeModifiersDynamic) { return wrapperContained.method_26293(attributeModifiersDynamic); }
// public com.mojang.datafixers.Typed method_26294(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_26294(itemStackTyped); }
// public com.mojang.serialization.Dynamic method_26295(com.mojang.datafixers.Typed tagDynamic) { return wrapperContained.method_26295(tagDynamic); }
// public com.mojang.datafixers.Typed method_26296(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.method_26296(tagTyped); }
// public com.mojang.serialization.Dynamic fixAttributeModifiers(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.fixAttributeModifiers(tagDynamic); }
// public com.mojang.serialization.Dynamic fixSkullOwner(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.fixSkullOwner(tagDynamic); }
// public com.mojang.serialization.Dynamic method_26299(com.mojang.serialization.Dynamic attributeModifier) { return wrapperContained.method_26299(attributeModifier); }

}