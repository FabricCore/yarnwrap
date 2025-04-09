package yarnwrap.registry;
public class Registries { public net.minecraft.registry.Registries wrapperContained; public Registries(net.minecraft.registry.Registries wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.Registry POINT_OF_INTEREST_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.POINT_OF_INTEREST_TYPE); }
public yarnwrap.registry.DefaultedRegistry MEMORY_MODULE_TYPE() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.MEMORY_MODULE_TYPE); }
public yarnwrap.registry.DefaultedRegistry SENSOR_TYPE() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.SENSOR_TYPE); }
public yarnwrap.registry.Registry SCHEDULE() { return new yarnwrap.registry.Registry(wrapperContained.SCHEDULE); }
public yarnwrap.registry.Registry ACTIVITY() { return new yarnwrap.registry.Registry(wrapperContained.ACTIVITY); }
public yarnwrap.registry.Registry LOOT_POOL_ENTRY_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_POOL_ENTRY_TYPE); }
public yarnwrap.registry.Registry LOOT_FUNCTION_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_FUNCTION_TYPE); }
public yarnwrap.registry.Registry LOOT_CONDITION_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_CONDITION_TYPE); }
public yarnwrap.registry.Registry LOOT_NUMBER_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_NUMBER_PROVIDER_TYPE); }
public yarnwrap.registry.Registry LOOT_NBT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_NBT_PROVIDER_TYPE); }
public yarnwrap.registry.Registry LOOT_SCORE_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_SCORE_PROVIDER_TYPE); }
public yarnwrap.registry.Registry FLOAT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.FLOAT_PROVIDER_TYPE); }
public yarnwrap.registry.Registry INT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.INT_PROVIDER_TYPE); }
public yarnwrap.registry.Registry HEIGHT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.HEIGHT_PROVIDER_TYPE); }
public yarnwrap.registry.Registry BLOCK_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.BLOCK_PREDICATE_TYPE); }
public yarnwrap.registry.Registry CARVER() { return new yarnwrap.registry.Registry(wrapperContained.CARVER); }
public yarnwrap.registry.Registry FEATURE() { return new yarnwrap.registry.Registry(wrapperContained.FEATURE); }
public yarnwrap.registry.Registry STRUCTURE_PLACEMENT() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_PLACEMENT); }
public yarnwrap.registry.Registry STRUCTURE_PIECE() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_PIECE); }
public yarnwrap.registry.Registry STRUCTURE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_TYPE); }
public yarnwrap.registry.Registry PLACEMENT_MODIFIER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.PLACEMENT_MODIFIER_TYPE); }
public yarnwrap.registry.Registry BLOCK_STATE_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.BLOCK_STATE_PROVIDER_TYPE); }
public yarnwrap.registry.Registry FOLIAGE_PLACER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.FOLIAGE_PLACER_TYPE); }
public yarnwrap.registry.Registry TRUNK_PLACER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.TRUNK_PLACER_TYPE); }
public yarnwrap.registry.Registry ROOT_PLACER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ROOT_PLACER_TYPE); }
public yarnwrap.registry.Registry TREE_DECORATOR_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.TREE_DECORATOR_TYPE); }
public yarnwrap.registry.Registry FEATURE_SIZE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.FEATURE_SIZE_TYPE); }
public yarnwrap.registry.Registry BIOME_SOURCE() { return new yarnwrap.registry.Registry(wrapperContained.BIOME_SOURCE); }
public yarnwrap.registry.Registry CHUNK_GENERATOR() { return new yarnwrap.registry.Registry(wrapperContained.CHUNK_GENERATOR); }
public yarnwrap.registry.Registry MATERIAL_CONDITION() { return new yarnwrap.registry.Registry(wrapperContained.MATERIAL_CONDITION); }
public yarnwrap.registry.Registry MATERIAL_RULE() { return new yarnwrap.registry.Registry(wrapperContained.MATERIAL_RULE); }
public yarnwrap.registry.Registry DENSITY_FUNCTION_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.DENSITY_FUNCTION_TYPE); }
public yarnwrap.registry.Registry STRUCTURE_PROCESSOR() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_PROCESSOR); }
public yarnwrap.registry.Registry STRUCTURE_POOL_ELEMENT() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_POOL_ELEMENT); }
public yarnwrap.registry.Registry CAT_VARIANT() { return new yarnwrap.registry.Registry(wrapperContained.CAT_VARIANT); }
public yarnwrap.registry.Registry FROG_VARIANT() { return new yarnwrap.registry.Registry(wrapperContained.FROG_VARIANT); }
public yarnwrap.registry.Registry INSTRUMENT() { return new yarnwrap.registry.Registry(wrapperContained.INSTRUMENT); }
public yarnwrap.registry.Registry REGISTRIES() { return new yarnwrap.registry.Registry(wrapperContained.REGISTRIES); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map DEFAULT_ENTRIES() { return wrapperContained.DEFAULT_ENTRIES; }
// public yarnwrap.registry.MutableRegistry ROOT() { return new yarnwrap.registry.MutableRegistry(wrapperContained.ROOT); }
public yarnwrap.registry.DefaultedRegistry GAME_EVENT() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.GAME_EVENT); }
public yarnwrap.registry.Registry SOUND_EVENT() { return new yarnwrap.registry.Registry(wrapperContained.SOUND_EVENT); }
public yarnwrap.registry.DefaultedRegistry FLUID() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.FLUID); }
public yarnwrap.registry.Registry STATUS_EFFECT() { return new yarnwrap.registry.Registry(wrapperContained.STATUS_EFFECT); }
public yarnwrap.registry.DefaultedRegistry BLOCK() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.BLOCK); }
public yarnwrap.registry.DefaultedRegistry ENTITY_TYPE() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.ENTITY_TYPE); }
public yarnwrap.registry.DefaultedRegistry ITEM() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.ITEM); }
public yarnwrap.registry.Registry POTION() { return new yarnwrap.registry.Registry(wrapperContained.POTION); }
public yarnwrap.registry.Registry PARTICLE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.PARTICLE_TYPE); }
public yarnwrap.registry.Registry BLOCK_ENTITY_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.BLOCK_ENTITY_TYPE); }
public yarnwrap.registry.Registry CUSTOM_STAT() { return new yarnwrap.registry.Registry(wrapperContained.CUSTOM_STAT); }
public yarnwrap.registry.DefaultedRegistry CHUNK_STATUS() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.CHUNK_STATUS); }
public yarnwrap.registry.Registry RULE_TEST() { return new yarnwrap.registry.Registry(wrapperContained.RULE_TEST); }
public yarnwrap.registry.Registry POS_RULE_TEST() { return new yarnwrap.registry.Registry(wrapperContained.POS_RULE_TEST); }
public yarnwrap.registry.Registry SCREEN_HANDLER() { return new yarnwrap.registry.Registry(wrapperContained.SCREEN_HANDLER); }
public yarnwrap.registry.Registry RECIPE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.RECIPE_TYPE); }
public yarnwrap.registry.Registry RECIPE_SERIALIZER() { return new yarnwrap.registry.Registry(wrapperContained.RECIPE_SERIALIZER); }
public yarnwrap.registry.Registry ATTRIBUTE() { return new yarnwrap.registry.Registry(wrapperContained.ATTRIBUTE); }
public yarnwrap.registry.Registry POSITION_SOURCE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.POSITION_SOURCE_TYPE); }
public yarnwrap.registry.Registry COMMAND_ARGUMENT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.COMMAND_ARGUMENT_TYPE); }
public yarnwrap.registry.Registry STAT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.STAT_TYPE); }
public yarnwrap.registry.DefaultedRegistry VILLAGER_TYPE() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.VILLAGER_TYPE); }
public yarnwrap.registry.DefaultedRegistry VILLAGER_PROFESSION() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.VILLAGER_PROFESSION); }
public yarnwrap.registry.Registry DECORATED_POT_PATTERN() { return new yarnwrap.registry.Registry(wrapperContained.DECORATED_POT_PATTERN); }
public yarnwrap.registry.Registry RULE_BLOCK_ENTITY_MODIFIER() { return new yarnwrap.registry.Registry(wrapperContained.RULE_BLOCK_ENTITY_MODIFIER); }
public yarnwrap.registry.Registry ITEM_GROUP() { return new yarnwrap.registry.Registry(wrapperContained.ITEM_GROUP); }
public yarnwrap.registry.Registry BLOCK_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.BLOCK_TYPE); }
public yarnwrap.registry.Registry POOL_ALIAS_BINDING() { return new yarnwrap.registry.Registry(wrapperContained.POOL_ALIAS_BINDING); }
public yarnwrap.registry.Registry CRITERION() { return new yarnwrap.registry.Registry(wrapperContained.CRITERION); }
public yarnwrap.registry.Registry NUMBER_FORMAT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.NUMBER_FORMAT_TYPE); }
public yarnwrap.registry.Registry ARMOR_MATERIAL() { return new yarnwrap.registry.Registry(wrapperContained.ARMOR_MATERIAL); }
public yarnwrap.registry.Registry DATA_COMPONENT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.DATA_COMPONENT_TYPE); }
public yarnwrap.registry.Registry ENTITY_SUB_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENTITY_SUB_PREDICATE_TYPE); }
public yarnwrap.registry.Registry ITEM_SUB_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ITEM_SUB_PREDICATE_TYPE); }
public yarnwrap.registry.Registry MAP_DECORATION_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.MAP_DECORATION_TYPE); }
public yarnwrap.registry.Registry ENCHANTMENT_EFFECT_COMPONENT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_EFFECT_COMPONENT_TYPE); }
public yarnwrap.registry.Registry ENCHANTMENT_LEVEL_BASED_VALUE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_LEVEL_BASED_VALUE_TYPE); }
public yarnwrap.registry.Registry ENCHANTMENT_ENTITY_EFFECT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_ENTITY_EFFECT_TYPE); }
public yarnwrap.registry.Registry ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE); }
public yarnwrap.registry.Registry ENCHANTMENT_VALUE_EFFECT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_VALUE_EFFECT_TYPE); }
public yarnwrap.registry.Registry ENCHANTMENT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_PROVIDER_TYPE); }
public void bootstrap() { wrapperContained.bootstrap(); }
// public yarnwrap.registry.MutableRegistry create(yarnwrap.registry.RegistryKey key,yarnwrap.registry.MutableRegistry registry,Object initializer) { return new yarnwrap.registry.MutableRegistry(wrapperContained.create(key.wrapperContained,registry.wrapperContained,initializer)); }
// public yarnwrap.registry.Registry create(yarnwrap.registry.RegistryKey key,Object initializer) { return new yarnwrap.registry.Registry(wrapperContained.create(key.wrapperContained,initializer)); }
// public yarnwrap.registry.DefaultedRegistry create(yarnwrap.registry.RegistryKey key,java.lang.String defaultId,Object initializer) { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.create(key.wrapperContained,defaultId,initializer)); }
// public void validate(yarnwrap.registry.Registry registries) { wrapperContained.validate(registries.wrapperContained); }
// public void init() { wrapperContained.init(); }
// public yarnwrap.registry.DefaultedRegistry createIntrusive(yarnwrap.registry.RegistryKey key,java.lang.String defaultId,Object initializer) { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.createIntrusive(key.wrapperContained,defaultId,initializer)); }
// public void freezeRegistries() { wrapperContained.freezeRegistries(); }
// public yarnwrap.registry.Registry createIntrusive(yarnwrap.registry.RegistryKey key,Object initializer) { return new yarnwrap.registry.Registry(wrapperContained.createIntrusive(key.wrapperContained,initializer)); }

}