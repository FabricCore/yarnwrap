package yarnwrap.enchantment;
public class EnchantmentLevelEntry { public net.minecraft.enchantment.EnchantmentLevelEntry wrapperContained; public EnchantmentLevelEntry(net.minecraft.enchantment.EnchantmentLevelEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment); }
// public void enchantment(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.enchantment = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.enchantment.EnchantmentLevelEntry.enchantment); }
// public static void enchantment(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.enchantment.EnchantmentLevelEntry.enchantment = value.wrapperContained; }

// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public static int level() { return net.minecraft.enchantment.EnchantmentLevelEntry.level; }
// public static void level(int value, ) { net.minecraft.enchantment.EnchantmentLevelEntry.level = value; }

public EnchantmentLevelEntry(yarnwrap.registry.entry.RegistryEntry enchantment,int level) { this.wrapperContained = new net.minecraft.enchantment.EnchantmentLevelEntry(enchantment.wrapperContained,level); }
// public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment()); }
// // public static yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.enchantment.EnchantmentLevelEntry.enchantment()); }
// public int level() { return wrapperContained.level(); }
// // public static int level() { return net.minecraft.enchantment.EnchantmentLevelEntry.level(); }
public int getWeight() { return wrapperContained.getWeight(); }
// public static int getWeight() { return net.minecraft.enchantment.EnchantmentLevelEntry.getWeight(); }

}