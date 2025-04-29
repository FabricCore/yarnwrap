package yarnwrap.datafixer.fix;
public class RenameEnchantmentFix { public net.minecraft.datafixer.fix.RenameEnchantmentFix wrapperContained; public RenameEnchantmentFix(net.minecraft.datafixer.fix.RenameEnchantmentFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.datafixer.fix.RenameEnchantmentFix.name; }
// public static void name(java.lang.String value, ) { net.minecraft.datafixer.fix.RenameEnchantmentFix.name = value; }

// public java.util.Map oldToNewIds() { return wrapperContained.oldToNewIds; }
// public void oldToNewIds(java.util.Map value) { wrapperContained.oldToNewIds = value; }
// public static java.util.Map oldToNewIds() { return net.minecraft.datafixer.fix.RenameEnchantmentFix.oldToNewIds; }
// public static void oldToNewIds(java.util.Map value, ) { net.minecraft.datafixer.fix.RenameEnchantmentFix.oldToNewIds = value; }

public RenameEnchantmentFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.Map oldToNewIds) { this.wrapperContained = new net.minecraft.datafixer.fix.RenameEnchantmentFix(outputSchema,name,oldToNewIds); }
// public com.mojang.datafixers.Typed method_56055(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_56055(itemStackTyped); }
// public static com.mojang.datafixers.Typed method_56055(com.mojang.datafixers.OpticFinder itemStackTyped, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.method_56055(itemStackTyped); }
// public com.mojang.datafixers.Typed method_56056(com.mojang.datafixers.Typed itemTagTyped) { return wrapperContained.method_56056(itemTagTyped); }
// public static com.mojang.datafixers.Typed method_56056(com.mojang.datafixers.Typed itemTagTyped, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.method_56056(itemTagTyped); }
// public com.mojang.serialization.Dynamic fixIds(com.mojang.serialization.Dynamic itemTagDynamic) { return wrapperContained.fixIds(itemTagDynamic); }
// public static com.mojang.serialization.Dynamic fixIds(com.mojang.serialization.Dynamic itemTagDynamic, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.fixIds(itemTagDynamic); }
// public com.mojang.serialization.Dynamic method_56059(com.mojang.serialization.Dynamic idDynamic) { return wrapperContained.method_56059(idDynamic); }
// public static com.mojang.serialization.Dynamic method_56059(com.mojang.serialization.Dynamic idDynamic, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.method_56059(idDynamic); }
// public com.mojang.serialization.Dynamic fixIds(com.mojang.serialization.Dynamic itemTagDynamic,java.lang.String enchantmentsKey) { return wrapperContained.fixIds(itemTagDynamic,enchantmentsKey); }
// public static com.mojang.serialization.Dynamic fixIds(com.mojang.serialization.Dynamic itemTagDynamic,java.lang.String enchantmentsKey, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.fixIds(itemTagDynamic,enchantmentsKey); }
// public java.util.stream.Stream method_56061(java.util.stream.Stream enchantments) { return wrapperContained.method_56061(enchantments); }
// public static java.util.stream.Stream method_56061(java.util.stream.Stream enchantments, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.method_56061(enchantments); }
// public com.mojang.serialization.Dynamic method_56062(com.mojang.serialization.Dynamic enchantmentsDynamic) { return wrapperContained.method_56062(enchantmentsDynamic); }
// public static com.mojang.serialization.Dynamic method_56062(com.mojang.serialization.Dynamic enchantmentsDynamic, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.method_56062(enchantmentsDynamic); }
// public com.mojang.serialization.Dynamic method_56064(com.mojang.serialization.Dynamic oldId) { return wrapperContained.method_56064(oldId); }
// public static com.mojang.serialization.Dynamic method_56064(com.mojang.serialization.Dynamic oldId, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.method_56064(oldId); }
// public com.mojang.serialization.Dynamic method_56065(com.mojang.serialization.Dynamic enchantmentDynamic) { return wrapperContained.method_56065(enchantmentDynamic); }
// public static com.mojang.serialization.Dynamic method_56065(com.mojang.serialization.Dynamic enchantmentDynamic, ) { return net.minecraft.datafixer.fix.RenameEnchantmentFix.method_56065(enchantmentDynamic); }

}