package yarnwrap.structure.pool;
public class FeaturePoolElement { public net.minecraft.structure.pool.FeaturePoolElement wrapperContained; public FeaturePoolElement(net.minecraft.structure.pool.FeaturePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
// public void feature(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.feature = value.wrapperContained; }
// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public FeaturePoolElement(yarnwrap.registry.entry.RegistryEntry feature,Object projection) { this.wrapperContained = new net.minecraft.structure.pool.FeaturePoolElement(feature.wrapperContained,projection); }
// public yarnwrap.nbt.NbtCompound createDefaultJigsawNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.createDefaultJigsawNbt()); }
// public com.mojang.datafixers.kinds.App method_28871(Object instance) { return wrapperContained.method_28871(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_28872(yarnwrap.structure.pool.FeaturePoolElement pool) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28872(pool.wrapperContained)); }

}