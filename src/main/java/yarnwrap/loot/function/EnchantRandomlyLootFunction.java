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
// public EnchantRandomlyLootFunction(java.util.List conditions,java.util.Optional options,boolean onlyCompatible) { this.wrapperContained = new net.minecraft.loot.function.EnchantRandomlyLootFunction(conditions,options,onlyCompatible); }
// public yarnwrap.item.ItemStack addEnchantmentToStack(yarnwrap.item.ItemStack stack,yarnwrap.registry.entry.RegistryEntry enchantment,yarnwrap.util.math.random.Random random) { return new yarnwrap.item.ItemStack(wrapperContained.addEnchantmentToStack(stack.wrapperContained,enchantment.wrapperContained,random.wrapperContained)); }
public Object create() { return wrapperContained.create(); }
// public Object builder(Object registryLookup) { return wrapperContained.builder(registryLookup); }
// public java.util.Optional method_53324(yarnwrap.loot.function.EnchantRandomlyLootFunction function) { return wrapperContained.method_53324(function.wrapperContained); }
// public java.lang.Boolean method_60290(yarnwrap.loot.function.EnchantRandomlyLootFunction function) { return wrapperContained.method_60290(function.wrapperContained); }
// public boolean method_60291(boolean entry) { return wrapperContained.method_60291(entry); }
// public com.mojang.datafixers.kinds.App method_60292(Object instance) { return wrapperContained.method_60292(instance); }

}