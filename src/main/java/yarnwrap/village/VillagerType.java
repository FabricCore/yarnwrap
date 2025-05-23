package yarnwrap.village;
public class VillagerType { public net.minecraft.village.VillagerType wrapperContained; public VillagerType(net.minecraft.village.VillagerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey DESERT() { return new yarnwrap.registry.RegistryKey(wrapperContained.DESERT); }
// public void DESERT(yarnwrap.registry.RegistryKey value) { wrapperContained.DESERT = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey DESERT() { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.DESERT); }
// public static void DESERT(yarnwrap.registry.RegistryKey value, ) { net.minecraft.village.VillagerType.DESERT = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey JUNGLE() { return new yarnwrap.registry.RegistryKey(wrapperContained.JUNGLE); }
// public void JUNGLE(yarnwrap.registry.RegistryKey value) { wrapperContained.JUNGLE = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey JUNGLE() { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.JUNGLE); }
// public static void JUNGLE(yarnwrap.registry.RegistryKey value, ) { net.minecraft.village.VillagerType.JUNGLE = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey PLAINS() { return new yarnwrap.registry.RegistryKey(wrapperContained.PLAINS); }
// public void PLAINS(yarnwrap.registry.RegistryKey value) { wrapperContained.PLAINS = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey PLAINS() { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.PLAINS); }
// public static void PLAINS(yarnwrap.registry.RegistryKey value, ) { net.minecraft.village.VillagerType.PLAINS = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey SAVANNA() { return new yarnwrap.registry.RegistryKey(wrapperContained.SAVANNA); }
// public void SAVANNA(yarnwrap.registry.RegistryKey value) { wrapperContained.SAVANNA = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey SAVANNA() { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.SAVANNA); }
// public static void SAVANNA(yarnwrap.registry.RegistryKey value, ) { net.minecraft.village.VillagerType.SAVANNA = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey SNOW() { return new yarnwrap.registry.RegistryKey(wrapperContained.SNOW); }
// public void SNOW(yarnwrap.registry.RegistryKey value) { wrapperContained.SNOW = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey SNOW() { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.SNOW); }
// public static void SNOW(yarnwrap.registry.RegistryKey value, ) { net.minecraft.village.VillagerType.SNOW = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey SWAMP() { return new yarnwrap.registry.RegistryKey(wrapperContained.SWAMP); }
// public void SWAMP(yarnwrap.registry.RegistryKey value) { wrapperContained.SWAMP = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey SWAMP() { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.SWAMP); }
// public static void SWAMP(yarnwrap.registry.RegistryKey value, ) { net.minecraft.village.VillagerType.SWAMP = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey TAIGA() { return new yarnwrap.registry.RegistryKey(wrapperContained.TAIGA); }
// public void TAIGA(yarnwrap.registry.RegistryKey value) { wrapperContained.TAIGA = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey TAIGA() { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.TAIGA); }
// public static void TAIGA(yarnwrap.registry.RegistryKey value, ) { net.minecraft.village.VillagerType.TAIGA = value.wrapperContained; }

// public java.util.Map BIOME_TO_TYPE() { return wrapperContained.BIOME_TO_TYPE; }
// public void BIOME_TO_TYPE(java.util.Map value) { wrapperContained.BIOME_TO_TYPE = value; }
public static java.util.Map BIOME_TO_TYPE() { return net.minecraft.village.VillagerType.BIOME_TO_TYPE; }
// public static void BIOME_TO_TYPE(java.util.Map value, ) { net.minecraft.village.VillagerType.BIOME_TO_TYPE = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.VillagerType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.VillagerType.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.village.VillagerType.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.village.VillagerType.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey forBiome(yarnwrap.registry.entry.RegistryEntry biomeEntry) { return new yarnwrap.registry.RegistryKey(wrapperContained.forBiome(biomeEntry.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey forBiome(yarnwrap.registry.entry.RegistryEntry biomeEntry, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.forBiome(biomeEntry.wrapperContained)); }
// public yarnwrap.village.VillagerType create(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key) { return new yarnwrap.village.VillagerType(wrapperContained.create(registry.wrapperContained,key.wrapperContained)); }
// public static yarnwrap.village.VillagerType create(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.create(registry.wrapperContained,key.wrapperContained)); }
// public void method_16932(java.util.HashMap map) { wrapperContained.method_16932(map); }
// public static void method_16932(java.util.HashMap map, ) { net.minecraft.village.VillagerType.method_16932(map); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.village.VillagerType.of(id)); }
// public yarnwrap.village.VillagerType registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.village.VillagerType(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public static yarnwrap.village.VillagerType registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.registerAndGetDefault(registry.wrapperContained)); }

}