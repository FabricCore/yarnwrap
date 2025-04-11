package yarnwrap.enchantment;
public class EnchantmentLevelEntry { public net.minecraft.enchantment.EnchantmentLevelEntry wrapperContained; public EnchantmentLevelEntry(net.minecraft.enchantment.EnchantmentLevelEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment); }
// public void enchantment(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.enchantment = value.wrapperContained; }
public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }

}