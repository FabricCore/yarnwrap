package yarnwrap.loot.function;
public class ExplorationMapLootFunction { public net.minecraft.loot.function.ExplorationMapLootFunction wrapperContained; public ExplorationMapLootFunction(net.minecraft.loot.function.ExplorationMapLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public int searchRadius() { return wrapperContained.searchRadius; }
// public boolean skipExistingChunks() { return wrapperContained.skipExistingChunks; }
public yarnwrap.registry.entry.RegistryEntry DEFAULT_DECORATION() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.DEFAULT_DECORATION); }
// public yarnwrap.registry.tag.TagKey destination() { return new yarnwrap.registry.tag.TagKey(wrapperContained.destination); }
// public yarnwrap.registry.entry.RegistryEntry decoration() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.decoration); }
// public byte zoom() { return wrapperContained.zoom; }
public yarnwrap.registry.tag.TagKey DEFAULT_DESTINATION() { return new yarnwrap.registry.tag.TagKey(wrapperContained.DEFAULT_DESTINATION); }
public byte DEFAULT_ZOOM() { return wrapperContained.DEFAULT_ZOOM; }
public int DEFAULT_SEARCH_RADIUS() { return wrapperContained.DEFAULT_SEARCH_RADIUS; }
public boolean DEFAULT_SKIP_EXISTING_CHUNKS() { return wrapperContained.DEFAULT_SKIP_EXISTING_CHUNKS; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder() { return wrapperContained.builder(); }

}