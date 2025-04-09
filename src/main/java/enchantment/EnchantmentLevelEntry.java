package yarnwrap.enchantment;
public class EnchantmentLevelEntry { public net.minecraft.enchantment.EnchantmentLevelEntry wrapperContained; public EnchantmentLevelEntry(net.minecraft.enchantment.EnchantmentLevelEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment); }
public int level() { return wrapperContained.level; }

}