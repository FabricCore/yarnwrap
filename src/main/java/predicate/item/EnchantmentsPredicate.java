package yarnwrap.predicate.item;
public class EnchantmentsPredicate { public net.minecraft.predicate.item.EnchantmentsPredicate wrapperContained; public EnchantmentsPredicate(net.minecraft.predicate.item.EnchantmentsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List enchantments() { return wrapperContained.enchantments; }
public Object enchantments(java.util.List enchantments) { return wrapperContained.enchantments(enchantments); }
public com.mojang.serialization.Codec createCodec(java.util.function.Function predicateFunction) { return wrapperContained.createCodec(predicateFunction); }
// public java.util.List getEnchantments() { return wrapperContained.getEnchantments(); }
public Object storedEnchantments(java.util.List storedEnchantments) { return wrapperContained.storedEnchantments(storedEnchantments); }

}