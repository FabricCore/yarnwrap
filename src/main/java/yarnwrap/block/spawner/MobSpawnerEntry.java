package yarnwrap.block.spawner;
public class MobSpawnerEntry { public net.minecraft.block.spawner.MobSpawnerEntry wrapperContained; public MobSpawnerEntry(net.minecraft.block.spawner.MobSpawnerEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound entity() { return new yarnwrap.nbt.NbtCompound(wrapperContained.entity); }
// public void entity(yarnwrap.nbt.NbtCompound value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound entity() { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.spawner.MobSpawnerEntry.entity); }
// public static void entity(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.block.spawner.MobSpawnerEntry.entity = value.wrapperContained; }

// public java.util.Optional customSpawnRules() { return wrapperContained.customSpawnRules; }
// public void customSpawnRules(java.util.Optional value) { wrapperContained.customSpawnRules = value; }
// public static java.util.Optional customSpawnRules() { return net.minecraft.block.spawner.MobSpawnerEntry.customSpawnRules; }
// public static void customSpawnRules(java.util.Optional value, ) { net.minecraft.block.spawner.MobSpawnerEntry.customSpawnRules = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.spawner.MobSpawnerEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.spawner.MobSpawnerEntry.CODEC = value; }

// public com.mojang.serialization.Codec DATA_POOL_CODEC() { return wrapperContained.DATA_POOL_CODEC; }
// public void DATA_POOL_CODEC(com.mojang.serialization.Codec value) { wrapperContained.DATA_POOL_CODEC = value; }
public static com.mojang.serialization.Codec DATA_POOL_CODEC() { return net.minecraft.block.spawner.MobSpawnerEntry.DATA_POOL_CODEC; }
// public static void DATA_POOL_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.spawner.MobSpawnerEntry.DATA_POOL_CODEC = value; }

// public java.lang.String ENTITY_KEY() { return wrapperContained.ENTITY_KEY; }
// public void ENTITY_KEY(java.lang.String value) { wrapperContained.ENTITY_KEY = value; }
public static java.lang.String ENTITY_KEY() { return net.minecraft.block.spawner.MobSpawnerEntry.ENTITY_KEY; }
// public static void ENTITY_KEY(java.lang.String value, ) { net.minecraft.block.spawner.MobSpawnerEntry.ENTITY_KEY = value; }

// public yarnwrap.nbt.NbtCompound entity() { return new yarnwrap.nbt.NbtCompound(wrapperContained.entity()); }
// // public static yarnwrap.nbt.NbtCompound entity() { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.spawner.MobSpawnerEntry.entity()); }
// public java.util.Optional customSpawnRules() { return wrapperContained.customSpawnRules(); }
// // public static java.util.Optional customSpawnRules() { return net.minecraft.block.spawner.MobSpawnerEntry.customSpawnRules(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.block.spawner.MobSpawnerEntry.equals(o); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
// public static yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.spawner.MobSpawnerEntry.getNbt()); }
// public java.util.Optional method_38094(yarnwrap.block.spawner.MobSpawnerEntry entry) { return wrapperContained.method_38094(entry.wrapperContained); }
// public static java.util.Optional method_38094(yarnwrap.block.spawner.MobSpawnerEntry entry, ) { return net.minecraft.block.spawner.MobSpawnerEntry.method_38094(entry.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_38095(Object instance) { return wrapperContained.method_38095(instance); }
// public static com.mojang.datafixers.kinds.App method_38095(Object instance, ) { return net.minecraft.block.spawner.MobSpawnerEntry.method_38095(instance); }
public java.util.Optional getCustomSpawnRules() { return wrapperContained.getCustomSpawnRules(); }
// public static java.util.Optional getCustomSpawnRules() { return net.minecraft.block.spawner.MobSpawnerEntry.getCustomSpawnRules(); }
// public yarnwrap.nbt.NbtCompound method_38098(yarnwrap.block.spawner.MobSpawnerEntry entry) { return new yarnwrap.nbt.NbtCompound(wrapperContained.method_38098(entry.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound method_38098(yarnwrap.block.spawner.MobSpawnerEntry entry, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.spawner.MobSpawnerEntry.method_38098(entry.wrapperContained)); }
// public java.util.Optional method_58679(yarnwrap.block.spawner.MobSpawnerEntry entry) { return wrapperContained.method_58679(entry.wrapperContained); }
// public static java.util.Optional method_58679(yarnwrap.block.spawner.MobSpawnerEntry entry, ) { return net.minecraft.block.spawner.MobSpawnerEntry.method_58679(entry.wrapperContained); }
public java.util.Optional getEquipment() { return wrapperContained.getEquipment(); }
// public static java.util.Optional getEquipment() { return net.minecraft.block.spawner.MobSpawnerEntry.getEquipment(); }

}