package yarnwrap.loot.function;
public class ReferenceLootFunction { public net.minecraft.loot.function.ReferenceLootFunction wrapperContained; public ReferenceLootFunction(net.minecraft.loot.function.ReferenceLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.registry.RegistryKey name() { return new yarnwrap.registry.RegistryKey(wrapperContained.name); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.registry.RegistryKey name) { return wrapperContained.builder(name.wrapperContained); }

}