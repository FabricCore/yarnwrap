package yarnwrap.loot.condition;
public class ReferenceLootCondition { public net.minecraft.loot.condition.ReferenceLootCondition wrapperContained; public ReferenceLootCondition(net.minecraft.loot.condition.ReferenceLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(wrapperContained.id); }
// public void id(yarnwrap.registry.RegistryKey value) { wrapperContained.id = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(wrapperContained.id()); }
public Object builder(yarnwrap.registry.RegistryKey key) { return wrapperContained.builder(key.wrapperContained); }

}