package yarnwrap.village;
public class VillagerType { public net.minecraft.village.VillagerType wrapperContained; public VillagerType(net.minecraft.village.VillagerType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.village.VillagerType DESERT() { return new yarnwrap.village.VillagerType(wrapperContained.DESERT); }
public yarnwrap.village.VillagerType JUNGLE() { return new yarnwrap.village.VillagerType(wrapperContained.JUNGLE); }
public yarnwrap.village.VillagerType PLAINS() { return new yarnwrap.village.VillagerType(wrapperContained.PLAINS); }
public yarnwrap.village.VillagerType SAVANNA() { return new yarnwrap.village.VillagerType(wrapperContained.SAVANNA); }
public yarnwrap.village.VillagerType SNOW() { return new yarnwrap.village.VillagerType(wrapperContained.SNOW); }
public yarnwrap.village.VillagerType SWAMP() { return new yarnwrap.village.VillagerType(wrapperContained.SWAMP); }
public yarnwrap.village.VillagerType TAIGA() { return new yarnwrap.village.VillagerType(wrapperContained.TAIGA); }
// public java.util.Map BIOME_TO_TYPE() { return wrapperContained.BIOME_TO_TYPE; }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.village.VillagerType forBiome(yarnwrap.registry.entry.RegistryEntry biomeEntry) { return new yarnwrap.village.VillagerType(wrapperContained.forBiome(biomeEntry.wrapperContained)); }
// public yarnwrap.village.VillagerType create(java.lang.String id) { return new yarnwrap.village.VillagerType(wrapperContained.create(id)); }

}