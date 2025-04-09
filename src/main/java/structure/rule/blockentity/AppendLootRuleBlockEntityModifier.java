package yarnwrap.structure.rule.blockentity;
public class AppendLootRuleBlockEntityModifier { public net.minecraft.structure.rule.blockentity.AppendLootRuleBlockEntityModifier wrapperContained; public AppendLootRuleBlockEntityModifier(net.minecraft.structure.rule.blockentity.AppendLootRuleBlockEntityModifier wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }

}