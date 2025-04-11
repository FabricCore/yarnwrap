package yarnwrap.loot.function;
public class EnchantRandomlyLootFunction { public net.minecraft.loot.function.EnchantRandomlyLootFunction wrapperContained; public EnchantRandomlyLootFunction(net.minecraft.loot.function.EnchantRandomlyLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional options() { return wrapperContained.options; }
// public void options(java.util.Optional value) { wrapperContained.options = value; }
// public boolean onlyCompatible() { return wrapperContained.onlyCompatible; }
// public void onlyCompatible(boolean value) { wrapperContained.onlyCompatible = value; }
// public yarnwrap.item.ItemStack addEnchantmentToStack(yarnwrap.item.ItemStack stack,yarnwrap.registry.entry.RegistryEntry enchantment,yarnwrap.util.math.random.Random random) { return new yarnwrap.item.ItemStack(wrapperContained.addEnchantmentToStack(stack.wrapperContained,enchantment.wrapperContained,random.wrapperContained)); }
public Object create() { return wrapperContained.create(); }
// public Object builder(Object registryLookup) { return wrapperContained.builder(registryLookup); }

}