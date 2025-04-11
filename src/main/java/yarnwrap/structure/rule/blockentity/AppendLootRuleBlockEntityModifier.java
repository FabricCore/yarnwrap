package yarnwrap.structure.rule.blockentity;
public class AppendLootRuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.AppendLootRuleBlockEntityModifier wrapperContained; public AppendLootRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.AppendLootRuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
public AppendLootRuleBlockEntityModifier(yarnwrap.registry.RegistryKey lootTable) { this.wrapperContained = new net.minecraft.structure.rule.blockentity.AppendLootRuleBlockEntityModifier(lootTable.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_49893(Object instance) { return wrapperContained.method_49893(instance); }
// public yarnwrap.registry.RegistryKey method_49894(yarnwrap.structure.rule.blockentity.AppendLootRuleBlockEntityModifier modifier) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_49894(modifier.wrapperContained)); }
// public void method_49895(yarnwrap.nbt.NbtCompound nbtx) { wrapperContained.method_49895(nbtx.wrapperContained); }

}