package yarnwrap.loot.condition;
public class ReferenceLootCondition { public net.minecraft.loot.condition.ReferenceLootCondition wrapperContained; public ReferenceLootCondition(net.minecraft.loot.condition.ReferenceLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(wrapperContained.id); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.RegistryKey id() { return new yarnwrap.registry.RegistryKey(wrapperContained.id()); }
public Object builder(yarnwrap.registry.RegistryKey key) { return wrapperContained.builder(key.wrapperContained); }

}