package yarnwrap.village;
public class VillagerType { public net.minecraft.village.VillagerType wrapperContained; public VillagerType(net.minecraft.village.VillagerType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.VillagerType DESERT() { return new yarnwrap.village.VillagerType(wrapperContained.DESERT); }
// public void DESERT(yarnwrap.village.VillagerType value) { wrapperContained.DESERT = value.wrapperContained; }
public static yarnwrap.village.VillagerType DESERT() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.DESERT); }
// public static void DESERT(yarnwrap.village.VillagerType value, ) { net.minecraft.village.VillagerType.DESERT = value.wrapperContained; }

// public yarnwrap.village.VillagerType JUNGLE() { return new yarnwrap.village.VillagerType(wrapperContained.JUNGLE); }
// public void JUNGLE(yarnwrap.village.VillagerType value) { wrapperContained.JUNGLE = value.wrapperContained; }
public static yarnwrap.village.VillagerType JUNGLE() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.JUNGLE); }
// public static void JUNGLE(yarnwrap.village.VillagerType value, ) { net.minecraft.village.VillagerType.JUNGLE = value.wrapperContained; }

// public yarnwrap.village.VillagerType PLAINS() { return new yarnwrap.village.VillagerType(wrapperContained.PLAINS); }
// public void PLAINS(yarnwrap.village.VillagerType value) { wrapperContained.PLAINS = value.wrapperContained; }
public static yarnwrap.village.VillagerType PLAINS() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.PLAINS); }
// public static void PLAINS(yarnwrap.village.VillagerType value, ) { net.minecraft.village.VillagerType.PLAINS = value.wrapperContained; }

// public yarnwrap.village.VillagerType SAVANNA() { return new yarnwrap.village.VillagerType(wrapperContained.SAVANNA); }
// public void SAVANNA(yarnwrap.village.VillagerType value) { wrapperContained.SAVANNA = value.wrapperContained; }
public static yarnwrap.village.VillagerType SAVANNA() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.SAVANNA); }
// public static void SAVANNA(yarnwrap.village.VillagerType value, ) { net.minecraft.village.VillagerType.SAVANNA = value.wrapperContained; }

// public yarnwrap.village.VillagerType SNOW() { return new yarnwrap.village.VillagerType(wrapperContained.SNOW); }
// public void SNOW(yarnwrap.village.VillagerType value) { wrapperContained.SNOW = value.wrapperContained; }
public static yarnwrap.village.VillagerType SNOW() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.SNOW); }
// public static void SNOW(yarnwrap.village.VillagerType value, ) { net.minecraft.village.VillagerType.SNOW = value.wrapperContained; }

// public yarnwrap.village.VillagerType SWAMP() { return new yarnwrap.village.VillagerType(wrapperContained.SWAMP); }
// public void SWAMP(yarnwrap.village.VillagerType value) { wrapperContained.SWAMP = value.wrapperContained; }
public static yarnwrap.village.VillagerType SWAMP() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.SWAMP); }
// public static void SWAMP(yarnwrap.village.VillagerType value, ) { net.minecraft.village.VillagerType.SWAMP = value.wrapperContained; }

// public yarnwrap.village.VillagerType TAIGA() { return new yarnwrap.village.VillagerType(wrapperContained.TAIGA); }
// public void TAIGA(yarnwrap.village.VillagerType value) { wrapperContained.TAIGA = value.wrapperContained; }
public static yarnwrap.village.VillagerType TAIGA() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.TAIGA); }
// public static void TAIGA(yarnwrap.village.VillagerType value, ) { net.minecraft.village.VillagerType.TAIGA = value.wrapperContained; }

// public java.util.Map BIOME_TO_TYPE() { return wrapperContained.BIOME_TO_TYPE; }
// public void BIOME_TO_TYPE(java.util.Map value) { wrapperContained.BIOME_TO_TYPE = value; }
public static java.util.Map BIOME_TO_TYPE() { return net.minecraft.village.VillagerType.BIOME_TO_TYPE; }
// public static void BIOME_TO_TYPE(java.util.Map value, ) { net.minecraft.village.VillagerType.BIOME_TO_TYPE = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.village.VillagerType.name; }
// public static void name(java.lang.String value, ) { net.minecraft.village.VillagerType.name = value; }

public VillagerType(java.lang.String name) { this.wrapperContained = new net.minecraft.village.VillagerType(name); }
// public yarnwrap.village.VillagerType forBiome(yarnwrap.registry.entry.RegistryEntry biomeEntry) { return new yarnwrap.village.VillagerType(wrapperContained.forBiome(biomeEntry.wrapperContained)); }
// public static yarnwrap.village.VillagerType forBiome(yarnwrap.registry.entry.RegistryEntry biomeEntry, ) { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.forBiome(biomeEntry.wrapperContained)); }
// public yarnwrap.village.VillagerType create(java.lang.String id) { return new yarnwrap.village.VillagerType(wrapperContained.create(id)); }
// public static yarnwrap.village.VillagerType create(java.lang.String id, ) { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerType.create(id)); }
// public void method_16932(java.util.HashMap map) { wrapperContained.method_16932(map); }
// public static void method_16932(java.util.HashMap map, ) { net.minecraft.village.VillagerType.method_16932(map); }

}