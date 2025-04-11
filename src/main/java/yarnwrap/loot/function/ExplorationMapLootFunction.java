package yarnwrap.loot.function;
public class ExplorationMapLootFunction { public net.minecraft.loot.function.ExplorationMapLootFunction wrapperContained; public ExplorationMapLootFunction(net.minecraft.loot.function.ExplorationMapLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public int searchRadius() { return wrapperContained.searchRadius; }
// public void searchRadius(int value) { wrapperContained.searchRadius = value; }
// public boolean skipExistingChunks() { return wrapperContained.skipExistingChunks; }
// public void skipExistingChunks(boolean value) { wrapperContained.skipExistingChunks = value; }
public yarnwrap.registry.entry.RegistryEntry DEFAULT_DECORATION() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.DEFAULT_DECORATION); }
// public void DEFAULT_DECORATION(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.DEFAULT_DECORATION = value.wrapperContained; }
// public yarnwrap.registry.tag.TagKey destination() { return new yarnwrap.registry.tag.TagKey(wrapperContained.destination); }
// public void destination(yarnwrap.registry.tag.TagKey value) { wrapperContained.destination = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry decoration() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.decoration); }
// public void decoration(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.decoration = value.wrapperContained; }
// public byte zoom() { return wrapperContained.zoom; }
// public void zoom(byte value) { wrapperContained.zoom = value; }
public yarnwrap.registry.tag.TagKey DEFAULT_DESTINATION() { return new yarnwrap.registry.tag.TagKey(wrapperContained.DEFAULT_DESTINATION); }
// public void DEFAULT_DESTINATION(yarnwrap.registry.tag.TagKey value) { wrapperContained.DEFAULT_DESTINATION = value.wrapperContained; }
public byte DEFAULT_ZOOM() { return wrapperContained.DEFAULT_ZOOM; }
// public void DEFAULT_ZOOM(byte value) { wrapperContained.DEFAULT_ZOOM = value; }
public int DEFAULT_SEARCH_RADIUS() { return wrapperContained.DEFAULT_SEARCH_RADIUS; }
// public void DEFAULT_SEARCH_RADIUS(int value) { wrapperContained.DEFAULT_SEARCH_RADIUS = value; }
public boolean DEFAULT_SKIP_EXISTING_CHUNKS() { return wrapperContained.DEFAULT_SKIP_EXISTING_CHUNKS; }
// public void DEFAULT_SKIP_EXISTING_CHUNKS(boolean value) { wrapperContained.DEFAULT_SKIP_EXISTING_CHUNKS = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder() { return wrapperContained.builder(); }

}