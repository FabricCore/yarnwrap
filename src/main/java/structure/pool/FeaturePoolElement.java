package yarnwrap.structure.pool;
public class FeaturePoolElement { public net.minecraft.structure.pool.FeaturePoolElement wrapperContained; public FeaturePoolElement(net.minecraft.structure.pool.FeaturePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.nbt.NbtCompound createDefaultJigsawNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.createDefaultJigsawNbt()); }

}