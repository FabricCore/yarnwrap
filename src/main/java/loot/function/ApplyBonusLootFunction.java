package yarnwrap.loot.function;
public class ApplyBonusLootFunction { public net.minecraft.loot.function.ApplyBonusLootFunction wrapperContained; public ApplyBonusLootFunction(net.minecraft.loot.function.ApplyBonusLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object formula() { return wrapperContained.formula; }
// public java.util.Map FACTORIES() { return wrapperContained.FACTORIES; }
// public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public com.mojang.serialization.MapCodec FORMULA_CODEC() { return wrapperContained.FORMULA_CODEC; }
public Object oreDrops(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.oreDrops(enchantment.wrapperContained); }
public Object uniformBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.uniformBonusCount(enchantment.wrapperContained); }
public Object uniformBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment,int bonusMultiplier) { return wrapperContained.uniformBonusCount(enchantment.wrapperContained,bonusMultiplier); }
public Object binomialWithBonusCount(yarnwrap.registry.entry.RegistryEntry enchantment,float probability,int extra) { return wrapperContained.binomialWithBonusCount(enchantment.wrapperContained,probability,extra); }

}