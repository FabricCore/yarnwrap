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
// public void method_51230(yarnwrap.loot.LootTableReporter entry) { wrapperContained.method_51230(entry.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53411(Object instance) { return wrapperContained.method_53411(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }

}