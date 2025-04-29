package yarnwrap.datafixer.fix;
public class ItemStackEnchantmentFix { public net.minecraft.datafixer.fix.ItemStackEnchantmentFix wrapperContained; public ItemStackEnchantmentFix(net.minecraft.datafixer.fix.ItemStackEnchantmentFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap ID_TO_ENCHANTMENTS_MAP() { return wrapperContained.ID_TO_ENCHANTMENTS_MAP; }
// public void ID_TO_ENCHANTMENTS_MAP(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.ID_TO_ENCHANTMENTS_MAP = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap ID_TO_ENCHANTMENTS_MAP() { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.ID_TO_ENCHANTMENTS_MAP; }
// public static void ID_TO_ENCHANTMENTS_MAP(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.datafixer.fix.ItemStackEnchantmentFix.ID_TO_ENCHANTMENTS_MAP = value; }

public ItemStackEnchantmentFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemStackEnchantmentFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_28206(com.mojang.serialization.Dynamic storedEnchantmentsDynamic) { return wrapperContained.method_28206(storedEnchantmentsDynamic); }
// public static com.mojang.serialization.Dynamic method_28206(com.mojang.serialization.Dynamic storedEnchantmentsDynamic, ) { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.method_28206(storedEnchantmentsDynamic); }
// public com.mojang.serialization.Dynamic method_28207(com.mojang.serialization.Dynamic storedEnchantment) { return wrapperContained.method_28207(storedEnchantment); }
// public static com.mojang.serialization.Dynamic method_28207(com.mojang.serialization.Dynamic storedEnchantment, ) { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.method_28207(storedEnchantment); }
// public com.mojang.serialization.Dynamic method_28208(com.mojang.serialization.Dynamic enchantment) { return wrapperContained.method_28208(enchantment); }
// public static com.mojang.serialization.Dynamic method_28208(com.mojang.serialization.Dynamic enchantment, ) { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.method_28208(enchantment); }
// public void method_5033(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap map) { wrapperContained.method_5033(map); }
// public static void method_5033(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap map, ) { net.minecraft.datafixer.fix.ItemStackEnchantmentFix.method_5033(map); }
// public java.util.stream.Stream method_5034(java.util.stream.Stream storedEnchantments) { return wrapperContained.method_5034(storedEnchantments); }
// public static java.util.stream.Stream method_5034(java.util.stream.Stream storedEnchantments, ) { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.method_5034(storedEnchantments); }
// public com.mojang.serialization.Dynamic fixEnchantments(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.fixEnchantments(tagDynamic); }
// public static com.mojang.serialization.Dynamic fixEnchantments(com.mojang.serialization.Dynamic tagDynamic, ) { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.fixEnchantments(tagDynamic); }
// public com.mojang.datafixers.Typed method_5036(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_5036(itemStackTyped); }
// public static com.mojang.datafixers.Typed method_5036(com.mojang.datafixers.OpticFinder itemStackTyped, ) { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.method_5036(itemStackTyped); }
// public java.util.stream.Stream method_5037(java.util.stream.Stream enchantments) { return wrapperContained.method_5037(enchantments); }
// public static java.util.stream.Stream method_5037(java.util.stream.Stream enchantments, ) { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.method_5037(enchantments); }
// public com.mojang.datafixers.Typed method_5041(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.method_5041(tagTyped); }
// public static com.mojang.datafixers.Typed method_5041(com.mojang.datafixers.Typed tagTyped, ) { return net.minecraft.datafixer.fix.ItemStackEnchantmentFix.method_5041(tagTyped); }

}