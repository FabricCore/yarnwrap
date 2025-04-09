package yarnwrap.registry;
public class RegistryKeys { public net.minecraft.registry.RegistryKeys wrapperContained; public RegistryKeys(net.minecraft.registry.RegistryKeys wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.RegistryKey MATERIAL_CONDITION() { return new yarnwrap.registry.RegistryKey(wrapperContained.MATERIAL_CONDITION); }
public yarnwrap.registry.RegistryKey MATERIAL_RULE() { return new yarnwrap.registry.RegistryKey(wrapperContained.MATERIAL_RULE); }
public yarnwrap.registry.RegistryKey SCREEN_HANDLER() { return new yarnwrap.registry.RegistryKey(wrapperContained.SCREEN_HANDLER); }
public yarnwrap.registry.RegistryKey STATUS_EFFECT() { return new yarnwrap.registry.RegistryKey(wrapperContained.STATUS_EFFECT); }
public yarnwrap.registry.RegistryKey PLACEMENT_MODIFIER_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PLACEMENT_MODIFIER_TYPE); }
public yarnwrap.registry.RegistryKey ROOT_PLACER_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.ROOT_PLACER_TYPE); }
public yarnwrap.registry.RegistryKey WORLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.WORLD); }
public yarnwrap.registry.RegistryKey DIMENSION() { return new yarnwrap.registry.RegistryKey(wrapperContained.DIMENSION); }
public yarnwrap.registry.RegistryKey STRUCTURE_PIECE() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE_PIECE); }
public yarnwrap.registry.RegistryKey STRUCTURE_PLACEMENT() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE_PLACEMENT); }
public yarnwrap.registry.RegistryKey STRUCTURE_POOL_ELEMENT() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE_POOL_ELEMENT); }
public yarnwrap.registry.RegistryKey STRUCTURE_PROCESSOR() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE_PROCESSOR); }
public yarnwrap.registry.RegistryKey STRUCTURE_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE_TYPE); }
public yarnwrap.registry.RegistryKey TREE_DECORATOR_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.TREE_DECORATOR_TYPE); }
public yarnwrap.registry.RegistryKey TRUNK_PLACER_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.TRUNK_PLACER_TYPE); }
public yarnwrap.registry.RegistryKey BIOME() { return new yarnwrap.registry.RegistryKey(wrapperContained.BIOME); }
public yarnwrap.registry.RegistryKey MESSAGE_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.MESSAGE_TYPE); }
public yarnwrap.registry.RegistryKey CONFIGURED_CARVER() { return new yarnwrap.registry.RegistryKey(wrapperContained.CONFIGURED_CARVER); }
public yarnwrap.registry.RegistryKey CONFIGURED_FEATURE() { return new yarnwrap.registry.RegistryKey(wrapperContained.CONFIGURED_FEATURE); }
public yarnwrap.registry.RegistryKey DENSITY_FUNCTION() { return new yarnwrap.registry.RegistryKey(wrapperContained.DENSITY_FUNCTION); }
public yarnwrap.registry.RegistryKey FLAT_LEVEL_GENERATOR_PRESET() { return new yarnwrap.registry.RegistryKey(wrapperContained.FLAT_LEVEL_GENERATOR_PRESET); }
public yarnwrap.registry.RegistryKey CHUNK_GENERATOR_SETTINGS() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHUNK_GENERATOR_SETTINGS); }
public yarnwrap.registry.RegistryKey NOISE_PARAMETERS() { return new yarnwrap.registry.RegistryKey(wrapperContained.NOISE_PARAMETERS); }
public yarnwrap.registry.RegistryKey PLACED_FEATURE() { return new yarnwrap.registry.RegistryKey(wrapperContained.PLACED_FEATURE); }
public yarnwrap.registry.RegistryKey STRUCTURE() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE); }
public yarnwrap.registry.RegistryKey PROCESSOR_LIST() { return new yarnwrap.registry.RegistryKey(wrapperContained.PROCESSOR_LIST); }
public yarnwrap.registry.RegistryKey STRUCTURE_SET() { return new yarnwrap.registry.RegistryKey(wrapperContained.STRUCTURE_SET); }
public yarnwrap.registry.RegistryKey TEMPLATE_POOL() { return new yarnwrap.registry.RegistryKey(wrapperContained.TEMPLATE_POOL); }
public yarnwrap.registry.RegistryKey WORLD_PRESET() { return new yarnwrap.registry.RegistryKey(wrapperContained.WORLD_PRESET); }
public yarnwrap.registry.RegistryKey BIOME_SOURCE() { return new yarnwrap.registry.RegistryKey(wrapperContained.BIOME_SOURCE); }
public yarnwrap.registry.RegistryKey BLOCK_STATE_PROVIDER_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.BLOCK_STATE_PROVIDER_TYPE); }
public yarnwrap.registry.RegistryKey CARVER() { return new yarnwrap.registry.RegistryKey(wrapperContained.CARVER); }
public yarnwrap.registry.RegistryKey CHUNK_GENERATOR() { return new yarnwrap.registry.RegistryKey(wrapperContained.CHUNK_GENERATOR); }
public yarnwrap.registry.RegistryKey DENSITY_FUNCTION_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.DENSITY_FUNCTION_TYPE); }
public yarnwrap.registry.RegistryKey FEATURE() { return new yarnwrap.registry.RegistryKey(wrapperContained.FEATURE); }
public yarnwrap.registry.RegistryKey FEATURE_SIZE_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.FEATURE_SIZE_TYPE); }
public yarnwrap.registry.RegistryKey FOLIAGE_PLACER_TYPE() { return new yarnwrap.registry.RegistryKey(wrapperContained.FOLIAGE_PLACER_TYPE); }
public yarnwrap.registry.RegistryKey MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST() { return new yarnwrap.registry.RegistryKey(wrapperContained.MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST); }
public yarnwrap.registry.RegistryKey ITEM_GROUP() { return new yarnwrap.registry.RegistryKey(wrapperContained.ITEM_GROUP); }
public yarnwrap.registry.RegistryKey POOL_ALIAS_BINDING() { return new yarnwrap.registry.RegistryKey(wrapperContained.POOL_ALIAS_BINDING); }
public yarnwrap.util.Identifier ROOT() { return new yarnwrap.util.Identifier(wrapperContained.ROOT); }
public yarnwrap.registry.RegistryKey CRITERION() { return new yarnwrap.registry.RegistryKey(wrapperContained.CRITERION); }
public yarnwrap.registry.RegistryKey toWorldKey(yarnwrap.registry.RegistryKey key) { return new yarnwrap.registry.RegistryKey(wrapperContained.toWorldKey(key.wrapperContained)); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public yarnwrap.registry.RegistryKey toDimensionKey(yarnwrap.registry.RegistryKey key) { return new yarnwrap.registry.RegistryKey(wrapperContained.toDimensionKey(key.wrapperContained)); }
public java.lang.String getPath(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getPath(registryRef.wrapperContained); }
public java.lang.String getTagPath(yarnwrap.registry.RegistryKey registryRef) { return wrapperContained.getTagPath(registryRef.wrapperContained); }

}