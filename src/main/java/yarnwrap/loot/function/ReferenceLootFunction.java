package yarnwrap.loot.function;
public class ReferenceLootFunction { public net.minecraft.loot.function.ReferenceLootFunction wrapperContained; public ReferenceLootFunction(net.minecraft.loot.function.ReferenceLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.registry.RegistryKey name() { return new yarnwrap.registry.RegistryKey(wrapperContained.name); }
// public void name(yarnwrap.registry.RegistryKey value) { wrapperContained.name = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public ReferenceLootFunction(java.util.List conditions,yarnwrap.registry.RegistryKey name) { this.wrapperContained = new net.minecraft.loot.function.ReferenceLootFunction(conditions,name.wrapperContained); }
public Object builder(yarnwrap.registry.RegistryKey name) { return wrapperContained.builder(name.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_51225(yarnwrap.registry.RegistryKey conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_51225(conditions.wrapperContained)); }
// public yarnwrap.registry.RegistryKey method_53340(yarnwrap.loot.function.ReferenceLootFunction function) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_53340(function.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53341(Object instance) { return wrapperContained.method_53341(instance); }

}