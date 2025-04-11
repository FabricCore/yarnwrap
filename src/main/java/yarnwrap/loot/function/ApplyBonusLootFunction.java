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
// public ApplyBonusLootFunction(java.util.List conditions,yarnwrap.registry.entry.RegistryEntry enchantment,Object formula) { this.wrapperContained = new net.minecraft.loot.function.ApplyBonusLootFunction(conditions,enchantment.wrapperContained,formula); }
// public yarnwrap.loot.function.LootFunction method_453(yarnwrap.registry.entry.RegistryEntry conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_453(conditions.wrapperContained)); }
public Object oreDrops(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.oreDrops(enchantment.wrapperContained); }
public Object uniformBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.uniformBonusCount(enchantment.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_457(yarnwrap.registry.entry.RegistryEntry conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_457(conditions.wrapperContained)); }
// public yarnwrap.loot.function.LootFunction method_459(yarnwrap.registry.entry.RegistryEntry conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_459(conditions.wrapperContained)); }
public Object uniformBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment,int bonusMultiplier) { return wrapperContained.uniformBonusCount(enchantment.wrapperContained,bonusMultiplier); }
// public yarnwrap.loot.function.LootFunction method_462(yarnwrap.registry.entry.RegistryEntry conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_462(conditions.wrapperContained)); }
public Object binomialWithBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment,float probability,int extra) { return wrapperContained.binomialWithBonusCount(enchantment.wrapperContained,probability,extra); }
// public com.mojang.serialization.DataResult method_53298(yarnwrap.util.Identifier id) { return wrapperContained.method_53298(id.wrapperContained); }
// public Object method_53299(yarnwrap.loot.function.ApplyBonusLootFunction function) { return wrapperContained.method_53299(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53301(Object instance) { return wrapperContained.method_53301(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_53302(yarnwrap.loot.function.ApplyBonusLootFunction function) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_53302(function.wrapperContained)); }

}