package yarnwrap.loot.function;
public class ReferenceLootFunction { public net.minecraft.loot.function.ReferenceLootFunction wrapperContained; public ReferenceLootFunction(net.minecraft.loot.function.ReferenceLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.registry.RegistryKey name() { return new yarnwrap.registry.RegistryKey(wrapperContained.name); }
// public void name(yarnwrap.registry.RegistryKey value) { wrapperContained.name = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder(yarnwrap.registry.RegistryKey name) { return wrapperContained.builder(name.wrapperContained); }

}