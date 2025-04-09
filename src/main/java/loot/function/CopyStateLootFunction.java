package yarnwrap.loot.function;
public class CopyStateLootFunction { public net.minecraft.loot.function.CopyStateLootFunction wrapperContained; public CopyStateLootFunction(net.minecraft.loot.function.CopyStateLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry block() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.block); }
// public java.util.Set properties() { return wrapperContained.properties; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.block.Block block) { return wrapperContained.builder(block.wrapperContained); }

}