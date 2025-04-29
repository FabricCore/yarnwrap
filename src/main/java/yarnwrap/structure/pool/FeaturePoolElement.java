package yarnwrap.structure.pool;
public class FeaturePoolElement { public net.minecraft.structure.pool.FeaturePoolElement wrapperContained; public FeaturePoolElement(net.minecraft.structure.pool.FeaturePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
// public void feature(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.feature = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.structure.pool.FeaturePoolElement.feature); }
// public static void feature(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.structure.pool.FeaturePoolElement.feature = value.wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.structure.pool.FeaturePoolElement.nbt); }
// public static void nbt(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.structure.pool.FeaturePoolElement.nbt = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.pool.FeaturePoolElement.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.pool.FeaturePoolElement.CODEC = value; }

// public FeaturePoolElement(yarnwrap.registry.entry.RegistryEntry feature,Object projection) { this.wrapperContained = new net.minecraft.structure.pool.FeaturePoolElement(feature.wrapperContained,projection); }
// public yarnwrap.nbt.NbtCompound createDefaultJigsawNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.createDefaultJigsawNbt()); }
// public static yarnwrap.nbt.NbtCompound createDefaultJigsawNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.structure.pool.FeaturePoolElement.createDefaultJigsawNbt()); }
// public com.mojang.datafixers.kinds.App method_28871(Object instance) { return wrapperContained.method_28871(instance); }
// public static com.mojang.datafixers.kinds.App method_28871(Object instance, ) { return net.minecraft.structure.pool.FeaturePoolElement.method_28871(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_28872(yarnwrap.structure.pool.FeaturePoolElement pool) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28872(pool.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28872(yarnwrap.structure.pool.FeaturePoolElement pool, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.structure.pool.FeaturePoolElement.method_28872(pool.wrapperContained)); }

}