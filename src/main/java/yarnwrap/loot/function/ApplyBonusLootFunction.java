package yarnwrap.loot.function;
public class ApplyBonusLootFunction { public net.minecraft.loot.function.ApplyBonusLootFunction wrapperContained; public ApplyBonusLootFunction(net.minecraft.loot.function.ApplyBonusLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object formula() { return wrapperContained.formula; }
// // public void formula(Object value) { wrapperContained.formula = value; }
// public java.util.Map FACTORIES() { return wrapperContained.FACTORIES; }
// public void FACTORIES(java.util.Map value) { wrapperContained.FACTORIES = value; }
// public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment); }
// public void enchantment(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.enchantment = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
// public com.mojang.serialization.MapCodec FORMULA_CODEC() { return wrapperContained.FORMULA_CODEC; }
// public void FORMULA_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.FORMULA_CODEC = value; }
public Object oreDrops(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.oreDrops(enchantment.wrapperContained); }
public Object uniformBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.uniformBonusCount(enchantment.wrapperContained); }
public Object uniformBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment,int bonusMultiplier) { return wrapperContained.uniformBonusCount(enchantment.wrapperContained,bonusMultiplier); }
public Object binomialWithBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment,float probability,int extra) { return wrapperContained.binomialWithBonusCount(enchantment.wrapperContained,probability,extra); }

}