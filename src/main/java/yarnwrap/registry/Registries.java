package yarnwrap.registry;
public class Registries { public net.minecraft.registry.Registries wrapperContained; public Registries(net.minecraft.registry.Registries wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.Registry POINT_OF_INTEREST_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.POINT_OF_INTEREST_TYPE); }
// public void POINT_OF_INTEREST_TYPE(yarnwrap.registry.Registry value) { wrapperContained.POINT_OF_INTEREST_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry POINT_OF_INTEREST_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.POINT_OF_INTEREST_TYPE); }
// public static void POINT_OF_INTEREST_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.POINT_OF_INTEREST_TYPE = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry MEMORY_MODULE_TYPE() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.MEMORY_MODULE_TYPE); }
// public void MEMORY_MODULE_TYPE(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.MEMORY_MODULE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry MEMORY_MODULE_TYPE() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.MEMORY_MODULE_TYPE); }
// public static void MEMORY_MODULE_TYPE(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.MEMORY_MODULE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry SENSOR_TYPE() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.SENSOR_TYPE); }
// public void SENSOR_TYPE(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.SENSOR_TYPE = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry SENSOR_TYPE() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.SENSOR_TYPE); }
// public static void SENSOR_TYPE(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.SENSOR_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry SCHEDULE() { return new yarnwrap.registry.Registry(wrapperContained.SCHEDULE); }
// public void SCHEDULE(yarnwrap.registry.Registry value) { wrapperContained.SCHEDULE = value.wrapperContained; }
public static yarnwrap.registry.Registry SCHEDULE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.SCHEDULE); }
// public static void SCHEDULE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.SCHEDULE = value.wrapperContained; }

// public yarnwrap.registry.Registry ACTIVITY() { return new yarnwrap.registry.Registry(wrapperContained.ACTIVITY); }
// public void ACTIVITY(yarnwrap.registry.Registry value) { wrapperContained.ACTIVITY = value.wrapperContained; }
public static yarnwrap.registry.Registry ACTIVITY() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ACTIVITY); }
// public static void ACTIVITY(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ACTIVITY = value.wrapperContained; }

// public yarnwrap.registry.Registry LOOT_POOL_ENTRY_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_POOL_ENTRY_TYPE); }
// public void LOOT_POOL_ENTRY_TYPE(yarnwrap.registry.Registry value) { wrapperContained.LOOT_POOL_ENTRY_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry LOOT_POOL_ENTRY_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.LOOT_POOL_ENTRY_TYPE); }
// public static void LOOT_POOL_ENTRY_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.LOOT_POOL_ENTRY_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry LOOT_FUNCTION_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_FUNCTION_TYPE); }
// public void LOOT_FUNCTION_TYPE(yarnwrap.registry.Registry value) { wrapperContained.LOOT_FUNCTION_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry LOOT_FUNCTION_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.LOOT_FUNCTION_TYPE); }
// public static void LOOT_FUNCTION_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.LOOT_FUNCTION_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry LOOT_CONDITION_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_CONDITION_TYPE); }
// public void LOOT_CONDITION_TYPE(yarnwrap.registry.Registry value) { wrapperContained.LOOT_CONDITION_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry LOOT_CONDITION_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.LOOT_CONDITION_TYPE); }
// public static void LOOT_CONDITION_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.LOOT_CONDITION_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry LOOT_NUMBER_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_NUMBER_PROVIDER_TYPE); }
// public void LOOT_NUMBER_PROVIDER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.LOOT_NUMBER_PROVIDER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry LOOT_NUMBER_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.LOOT_NUMBER_PROVIDER_TYPE); }
// public static void LOOT_NUMBER_PROVIDER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.LOOT_NUMBER_PROVIDER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry LOOT_NBT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_NBT_PROVIDER_TYPE); }
// public void LOOT_NBT_PROVIDER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.LOOT_NBT_PROVIDER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry LOOT_NBT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.LOOT_NBT_PROVIDER_TYPE); }
// public static void LOOT_NBT_PROVIDER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.LOOT_NBT_PROVIDER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry LOOT_SCORE_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.LOOT_SCORE_PROVIDER_TYPE); }
// public void LOOT_SCORE_PROVIDER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.LOOT_SCORE_PROVIDER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry LOOT_SCORE_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.LOOT_SCORE_PROVIDER_TYPE); }
// public static void LOOT_SCORE_PROVIDER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.LOOT_SCORE_PROVIDER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry FLOAT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.FLOAT_PROVIDER_TYPE); }
// public void FLOAT_PROVIDER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.FLOAT_PROVIDER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry FLOAT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.FLOAT_PROVIDER_TYPE); }
// public static void FLOAT_PROVIDER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.FLOAT_PROVIDER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry INT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.INT_PROVIDER_TYPE); }
// public void INT_PROVIDER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.INT_PROVIDER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry INT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.INT_PROVIDER_TYPE); }
// public static void INT_PROVIDER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.INT_PROVIDER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry HEIGHT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.HEIGHT_PROVIDER_TYPE); }
// public void HEIGHT_PROVIDER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.HEIGHT_PROVIDER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry HEIGHT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.HEIGHT_PROVIDER_TYPE); }
// public static void HEIGHT_PROVIDER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.HEIGHT_PROVIDER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry BLOCK_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.BLOCK_PREDICATE_TYPE); }
// public void BLOCK_PREDICATE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.BLOCK_PREDICATE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry BLOCK_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.BLOCK_PREDICATE_TYPE); }
// public static void BLOCK_PREDICATE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.BLOCK_PREDICATE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry CARVER() { return new yarnwrap.registry.Registry(wrapperContained.CARVER); }
// public void CARVER(yarnwrap.registry.Registry value) { wrapperContained.CARVER = value.wrapperContained; }
public static yarnwrap.registry.Registry CARVER() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.CARVER); }
// public static void CARVER(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.CARVER = value.wrapperContained; }

// public yarnwrap.registry.Registry FEATURE() { return new yarnwrap.registry.Registry(wrapperContained.FEATURE); }
// public void FEATURE(yarnwrap.registry.Registry value) { wrapperContained.FEATURE = value.wrapperContained; }
public static yarnwrap.registry.Registry FEATURE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.FEATURE); }
// public static void FEATURE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.FEATURE = value.wrapperContained; }

// public yarnwrap.registry.Registry STRUCTURE_PLACEMENT() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_PLACEMENT); }
// public void STRUCTURE_PLACEMENT(yarnwrap.registry.Registry value) { wrapperContained.STRUCTURE_PLACEMENT = value.wrapperContained; }
public static yarnwrap.registry.Registry STRUCTURE_PLACEMENT() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.STRUCTURE_PLACEMENT); }
// public static void STRUCTURE_PLACEMENT(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.STRUCTURE_PLACEMENT = value.wrapperContained; }

// public yarnwrap.registry.Registry STRUCTURE_PIECE() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_PIECE); }
// public void STRUCTURE_PIECE(yarnwrap.registry.Registry value) { wrapperContained.STRUCTURE_PIECE = value.wrapperContained; }
public static yarnwrap.registry.Registry STRUCTURE_PIECE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.STRUCTURE_PIECE); }
// public static void STRUCTURE_PIECE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.STRUCTURE_PIECE = value.wrapperContained; }

// public yarnwrap.registry.Registry STRUCTURE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_TYPE); }
// public void STRUCTURE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.STRUCTURE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry STRUCTURE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.STRUCTURE_TYPE); }
// public static void STRUCTURE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.STRUCTURE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry PLACEMENT_MODIFIER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.PLACEMENT_MODIFIER_TYPE); }
// public void PLACEMENT_MODIFIER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.PLACEMENT_MODIFIER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry PLACEMENT_MODIFIER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.PLACEMENT_MODIFIER_TYPE); }
// public static void PLACEMENT_MODIFIER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.PLACEMENT_MODIFIER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry BLOCK_STATE_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.BLOCK_STATE_PROVIDER_TYPE); }
// public void BLOCK_STATE_PROVIDER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.BLOCK_STATE_PROVIDER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry BLOCK_STATE_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.BLOCK_STATE_PROVIDER_TYPE); }
// public static void BLOCK_STATE_PROVIDER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.BLOCK_STATE_PROVIDER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry FOLIAGE_PLACER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.FOLIAGE_PLACER_TYPE); }
// public void FOLIAGE_PLACER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.FOLIAGE_PLACER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry FOLIAGE_PLACER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.FOLIAGE_PLACER_TYPE); }
// public static void FOLIAGE_PLACER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.FOLIAGE_PLACER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry TRUNK_PLACER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.TRUNK_PLACER_TYPE); }
// public void TRUNK_PLACER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.TRUNK_PLACER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry TRUNK_PLACER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.TRUNK_PLACER_TYPE); }
// public static void TRUNK_PLACER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.TRUNK_PLACER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ROOT_PLACER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ROOT_PLACER_TYPE); }
// public void ROOT_PLACER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ROOT_PLACER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ROOT_PLACER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ROOT_PLACER_TYPE); }
// public static void ROOT_PLACER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ROOT_PLACER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry TREE_DECORATOR_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.TREE_DECORATOR_TYPE); }
// public void TREE_DECORATOR_TYPE(yarnwrap.registry.Registry value) { wrapperContained.TREE_DECORATOR_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry TREE_DECORATOR_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.TREE_DECORATOR_TYPE); }
// public static void TREE_DECORATOR_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.TREE_DECORATOR_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry FEATURE_SIZE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.FEATURE_SIZE_TYPE); }
// public void FEATURE_SIZE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.FEATURE_SIZE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry FEATURE_SIZE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.FEATURE_SIZE_TYPE); }
// public static void FEATURE_SIZE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.FEATURE_SIZE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry BIOME_SOURCE() { return new yarnwrap.registry.Registry(wrapperContained.BIOME_SOURCE); }
// public void BIOME_SOURCE(yarnwrap.registry.Registry value) { wrapperContained.BIOME_SOURCE = value.wrapperContained; }
public static yarnwrap.registry.Registry BIOME_SOURCE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.BIOME_SOURCE); }
// public static void BIOME_SOURCE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.BIOME_SOURCE = value.wrapperContained; }

// public yarnwrap.registry.Registry CHUNK_GENERATOR() { return new yarnwrap.registry.Registry(wrapperContained.CHUNK_GENERATOR); }
// public void CHUNK_GENERATOR(yarnwrap.registry.Registry value) { wrapperContained.CHUNK_GENERATOR = value.wrapperContained; }
public static yarnwrap.registry.Registry CHUNK_GENERATOR() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.CHUNK_GENERATOR); }
// public static void CHUNK_GENERATOR(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.CHUNK_GENERATOR = value.wrapperContained; }

// public yarnwrap.registry.Registry MATERIAL_CONDITION() { return new yarnwrap.registry.Registry(wrapperContained.MATERIAL_CONDITION); }
// public void MATERIAL_CONDITION(yarnwrap.registry.Registry value) { wrapperContained.MATERIAL_CONDITION = value.wrapperContained; }
public static yarnwrap.registry.Registry MATERIAL_CONDITION() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.MATERIAL_CONDITION); }
// public static void MATERIAL_CONDITION(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.MATERIAL_CONDITION = value.wrapperContained; }

// public yarnwrap.registry.Registry MATERIAL_RULE() { return new yarnwrap.registry.Registry(wrapperContained.MATERIAL_RULE); }
// public void MATERIAL_RULE(yarnwrap.registry.Registry value) { wrapperContained.MATERIAL_RULE = value.wrapperContained; }
public static yarnwrap.registry.Registry MATERIAL_RULE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.MATERIAL_RULE); }
// public static void MATERIAL_RULE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.MATERIAL_RULE = value.wrapperContained; }

// public yarnwrap.registry.Registry DENSITY_FUNCTION_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.DENSITY_FUNCTION_TYPE); }
// public void DENSITY_FUNCTION_TYPE(yarnwrap.registry.Registry value) { wrapperContained.DENSITY_FUNCTION_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry DENSITY_FUNCTION_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.DENSITY_FUNCTION_TYPE); }
// public static void DENSITY_FUNCTION_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.DENSITY_FUNCTION_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry STRUCTURE_PROCESSOR() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_PROCESSOR); }
// public void STRUCTURE_PROCESSOR(yarnwrap.registry.Registry value) { wrapperContained.STRUCTURE_PROCESSOR = value.wrapperContained; }
public static yarnwrap.registry.Registry STRUCTURE_PROCESSOR() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.STRUCTURE_PROCESSOR); }
// public static void STRUCTURE_PROCESSOR(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.STRUCTURE_PROCESSOR = value.wrapperContained; }

// public yarnwrap.registry.Registry STRUCTURE_POOL_ELEMENT() { return new yarnwrap.registry.Registry(wrapperContained.STRUCTURE_POOL_ELEMENT); }
// public void STRUCTURE_POOL_ELEMENT(yarnwrap.registry.Registry value) { wrapperContained.STRUCTURE_POOL_ELEMENT = value.wrapperContained; }
public static yarnwrap.registry.Registry STRUCTURE_POOL_ELEMENT() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.STRUCTURE_POOL_ELEMENT); }
// public static void STRUCTURE_POOL_ELEMENT(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.STRUCTURE_POOL_ELEMENT = value.wrapperContained; }

// public yarnwrap.registry.Registry CAT_VARIANT() { return new yarnwrap.registry.Registry(wrapperContained.CAT_VARIANT); }
// public void CAT_VARIANT(yarnwrap.registry.Registry value) { wrapperContained.CAT_VARIANT = value.wrapperContained; }
public static yarnwrap.registry.Registry CAT_VARIANT() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.CAT_VARIANT); }
// public static void CAT_VARIANT(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.CAT_VARIANT = value.wrapperContained; }

// public yarnwrap.registry.Registry FROG_VARIANT() { return new yarnwrap.registry.Registry(wrapperContained.FROG_VARIANT); }
// public void FROG_VARIANT(yarnwrap.registry.Registry value) { wrapperContained.FROG_VARIANT = value.wrapperContained; }
public static yarnwrap.registry.Registry FROG_VARIANT() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.FROG_VARIANT); }
// public static void FROG_VARIANT(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.FROG_VARIANT = value.wrapperContained; }

// public yarnwrap.registry.Registry INSTRUMENT() { return new yarnwrap.registry.Registry(wrapperContained.INSTRUMENT); }
// public void INSTRUMENT(yarnwrap.registry.Registry value) { wrapperContained.INSTRUMENT = value.wrapperContained; }
public static yarnwrap.registry.Registry INSTRUMENT() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.INSTRUMENT); }
// public static void INSTRUMENT(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.INSTRUMENT = value.wrapperContained; }

// public yarnwrap.registry.Registry REGISTRIES() { return new yarnwrap.registry.Registry(wrapperContained.REGISTRIES); }
// public void REGISTRIES(yarnwrap.registry.Registry value) { wrapperContained.REGISTRIES = value.wrapperContained; }
public static yarnwrap.registry.Registry REGISTRIES() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.REGISTRIES); }
// public static void REGISTRIES(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.REGISTRIES = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.registry.Registries.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.registry.Registries.LOGGER = value; }

// public java.util.Map DEFAULT_ENTRIES() { return wrapperContained.DEFAULT_ENTRIES; }
// public void DEFAULT_ENTRIES(java.util.Map value) { wrapperContained.DEFAULT_ENTRIES = value; }
// public static java.util.Map DEFAULT_ENTRIES() { return net.minecraft.registry.Registries.DEFAULT_ENTRIES; }
// public static void DEFAULT_ENTRIES(java.util.Map value, ) { net.minecraft.registry.Registries.DEFAULT_ENTRIES = value; }

// public yarnwrap.registry.MutableRegistry ROOT() { return new yarnwrap.registry.MutableRegistry(wrapperContained.ROOT); }
// public void ROOT(yarnwrap.registry.MutableRegistry value) { wrapperContained.ROOT = value.wrapperContained; }
// public static yarnwrap.registry.MutableRegistry ROOT() { return new yarnwrap.registry.MutableRegistry(net.minecraft.registry.Registries.ROOT); }
// public static void ROOT(yarnwrap.registry.MutableRegistry value, ) { net.minecraft.registry.Registries.ROOT = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry GAME_EVENT() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.GAME_EVENT); }
// public void GAME_EVENT(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.GAME_EVENT = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry GAME_EVENT() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.GAME_EVENT); }
// public static void GAME_EVENT(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.GAME_EVENT = value.wrapperContained; }

// public yarnwrap.registry.Registry SOUND_EVENT() { return new yarnwrap.registry.Registry(wrapperContained.SOUND_EVENT); }
// public void SOUND_EVENT(yarnwrap.registry.Registry value) { wrapperContained.SOUND_EVENT = value.wrapperContained; }
public static yarnwrap.registry.Registry SOUND_EVENT() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.SOUND_EVENT); }
// public static void SOUND_EVENT(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.SOUND_EVENT = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry FLUID() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.FLUID); }
// public void FLUID(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.FLUID = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry FLUID() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.FLUID); }
// public static void FLUID(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.FLUID = value.wrapperContained; }

// public yarnwrap.registry.Registry STATUS_EFFECT() { return new yarnwrap.registry.Registry(wrapperContained.STATUS_EFFECT); }
// public void STATUS_EFFECT(yarnwrap.registry.Registry value) { wrapperContained.STATUS_EFFECT = value.wrapperContained; }
public static yarnwrap.registry.Registry STATUS_EFFECT() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.STATUS_EFFECT); }
// public static void STATUS_EFFECT(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.STATUS_EFFECT = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry BLOCK() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.BLOCK); }
// public void BLOCK(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.BLOCK = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry BLOCK() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.BLOCK); }
// public static void BLOCK(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.BLOCK = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry ENTITY_TYPE() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.ENTITY_TYPE); }
// public void ENTITY_TYPE(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.ENTITY_TYPE = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry ENTITY_TYPE() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.ENTITY_TYPE); }
// public static void ENTITY_TYPE(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.ENTITY_TYPE = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry ITEM() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.ITEM = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry ITEM() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.ITEM); }
// public static void ITEM(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.ITEM = value.wrapperContained; }

// public yarnwrap.registry.Registry POTION() { return new yarnwrap.registry.Registry(wrapperContained.POTION); }
// public void POTION(yarnwrap.registry.Registry value) { wrapperContained.POTION = value.wrapperContained; }
public static yarnwrap.registry.Registry POTION() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.POTION); }
// public static void POTION(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.POTION = value.wrapperContained; }

// public yarnwrap.registry.Registry PARTICLE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.PARTICLE_TYPE); }
// public void PARTICLE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.PARTICLE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry PARTICLE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.PARTICLE_TYPE); }
// public static void PARTICLE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.PARTICLE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry BLOCK_ENTITY_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.BLOCK_ENTITY_TYPE); }
// public void BLOCK_ENTITY_TYPE(yarnwrap.registry.Registry value) { wrapperContained.BLOCK_ENTITY_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry BLOCK_ENTITY_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.BLOCK_ENTITY_TYPE); }
// public static void BLOCK_ENTITY_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.BLOCK_ENTITY_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry CUSTOM_STAT() { return new yarnwrap.registry.Registry(wrapperContained.CUSTOM_STAT); }
// public void CUSTOM_STAT(yarnwrap.registry.Registry value) { wrapperContained.CUSTOM_STAT = value.wrapperContained; }
public static yarnwrap.registry.Registry CUSTOM_STAT() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.CUSTOM_STAT); }
// public static void CUSTOM_STAT(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.CUSTOM_STAT = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry CHUNK_STATUS() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.CHUNK_STATUS); }
// public void CHUNK_STATUS(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.CHUNK_STATUS = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry CHUNK_STATUS() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.CHUNK_STATUS); }
// public static void CHUNK_STATUS(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.CHUNK_STATUS = value.wrapperContained; }

// public yarnwrap.registry.Registry RULE_TEST() { return new yarnwrap.registry.Registry(wrapperContained.RULE_TEST); }
// public void RULE_TEST(yarnwrap.registry.Registry value) { wrapperContained.RULE_TEST = value.wrapperContained; }
public static yarnwrap.registry.Registry RULE_TEST() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.RULE_TEST); }
// public static void RULE_TEST(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.RULE_TEST = value.wrapperContained; }

// public yarnwrap.registry.Registry POS_RULE_TEST() { return new yarnwrap.registry.Registry(wrapperContained.POS_RULE_TEST); }
// public void POS_RULE_TEST(yarnwrap.registry.Registry value) { wrapperContained.POS_RULE_TEST = value.wrapperContained; }
public static yarnwrap.registry.Registry POS_RULE_TEST() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.POS_RULE_TEST); }
// public static void POS_RULE_TEST(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.POS_RULE_TEST = value.wrapperContained; }

// public yarnwrap.registry.Registry SCREEN_HANDLER() { return new yarnwrap.registry.Registry(wrapperContained.SCREEN_HANDLER); }
// public void SCREEN_HANDLER(yarnwrap.registry.Registry value) { wrapperContained.SCREEN_HANDLER = value.wrapperContained; }
public static yarnwrap.registry.Registry SCREEN_HANDLER() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.SCREEN_HANDLER); }
// public static void SCREEN_HANDLER(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.SCREEN_HANDLER = value.wrapperContained; }

// public yarnwrap.registry.Registry RECIPE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.RECIPE_TYPE); }
// public void RECIPE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.RECIPE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry RECIPE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.RECIPE_TYPE); }
// public static void RECIPE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.RECIPE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry RECIPE_SERIALIZER() { return new yarnwrap.registry.Registry(wrapperContained.RECIPE_SERIALIZER); }
// public void RECIPE_SERIALIZER(yarnwrap.registry.Registry value) { wrapperContained.RECIPE_SERIALIZER = value.wrapperContained; }
public static yarnwrap.registry.Registry RECIPE_SERIALIZER() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.RECIPE_SERIALIZER); }
// public static void RECIPE_SERIALIZER(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.RECIPE_SERIALIZER = value.wrapperContained; }

// public yarnwrap.registry.Registry ATTRIBUTE() { return new yarnwrap.registry.Registry(wrapperContained.ATTRIBUTE); }
// public void ATTRIBUTE(yarnwrap.registry.Registry value) { wrapperContained.ATTRIBUTE = value.wrapperContained; }
public static yarnwrap.registry.Registry ATTRIBUTE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ATTRIBUTE); }
// public static void ATTRIBUTE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ATTRIBUTE = value.wrapperContained; }

// public yarnwrap.registry.Registry POSITION_SOURCE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.POSITION_SOURCE_TYPE); }
// public void POSITION_SOURCE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.POSITION_SOURCE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry POSITION_SOURCE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.POSITION_SOURCE_TYPE); }
// public static void POSITION_SOURCE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.POSITION_SOURCE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry COMMAND_ARGUMENT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.COMMAND_ARGUMENT_TYPE); }
// public void COMMAND_ARGUMENT_TYPE(yarnwrap.registry.Registry value) { wrapperContained.COMMAND_ARGUMENT_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry COMMAND_ARGUMENT_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.COMMAND_ARGUMENT_TYPE); }
// public static void COMMAND_ARGUMENT_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.COMMAND_ARGUMENT_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry STAT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.STAT_TYPE); }
// public void STAT_TYPE(yarnwrap.registry.Registry value) { wrapperContained.STAT_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry STAT_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.STAT_TYPE); }
// public static void STAT_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.STAT_TYPE = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry VILLAGER_TYPE() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.VILLAGER_TYPE); }
// public void VILLAGER_TYPE(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.VILLAGER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry VILLAGER_TYPE() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.VILLAGER_TYPE); }
// public static void VILLAGER_TYPE(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.VILLAGER_TYPE = value.wrapperContained; }

// public yarnwrap.registry.DefaultedRegistry VILLAGER_PROFESSION() { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.VILLAGER_PROFESSION); }
// public void VILLAGER_PROFESSION(yarnwrap.registry.DefaultedRegistry value) { wrapperContained.VILLAGER_PROFESSION = value.wrapperContained; }
public static yarnwrap.registry.DefaultedRegistry VILLAGER_PROFESSION() { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.VILLAGER_PROFESSION); }
// public static void VILLAGER_PROFESSION(yarnwrap.registry.DefaultedRegistry value, ) { net.minecraft.registry.Registries.VILLAGER_PROFESSION = value.wrapperContained; }

// public yarnwrap.registry.Registry DECORATED_POT_PATTERN() { return new yarnwrap.registry.Registry(wrapperContained.DECORATED_POT_PATTERN); }
// public void DECORATED_POT_PATTERN(yarnwrap.registry.Registry value) { wrapperContained.DECORATED_POT_PATTERN = value.wrapperContained; }
public static yarnwrap.registry.Registry DECORATED_POT_PATTERN() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.DECORATED_POT_PATTERN); }
// public static void DECORATED_POT_PATTERN(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.DECORATED_POT_PATTERN = value.wrapperContained; }

// public yarnwrap.registry.Registry RULE_BLOCK_ENTITY_MODIFIER() { return new yarnwrap.registry.Registry(wrapperContained.RULE_BLOCK_ENTITY_MODIFIER); }
// public void RULE_BLOCK_ENTITY_MODIFIER(yarnwrap.registry.Registry value) { wrapperContained.RULE_BLOCK_ENTITY_MODIFIER = value.wrapperContained; }
public static yarnwrap.registry.Registry RULE_BLOCK_ENTITY_MODIFIER() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.RULE_BLOCK_ENTITY_MODIFIER); }
// public static void RULE_BLOCK_ENTITY_MODIFIER(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.RULE_BLOCK_ENTITY_MODIFIER = value.wrapperContained; }

// public yarnwrap.registry.Registry ITEM_GROUP() { return new yarnwrap.registry.Registry(wrapperContained.ITEM_GROUP); }
// public void ITEM_GROUP(yarnwrap.registry.Registry value) { wrapperContained.ITEM_GROUP = value.wrapperContained; }
public static yarnwrap.registry.Registry ITEM_GROUP() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ITEM_GROUP); }
// public static void ITEM_GROUP(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ITEM_GROUP = value.wrapperContained; }

// public yarnwrap.registry.Registry BLOCK_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.BLOCK_TYPE); }
// public void BLOCK_TYPE(yarnwrap.registry.Registry value) { wrapperContained.BLOCK_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry BLOCK_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.BLOCK_TYPE); }
// public static void BLOCK_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.BLOCK_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry POOL_ALIAS_BINDING() { return new yarnwrap.registry.Registry(wrapperContained.POOL_ALIAS_BINDING); }
// public void POOL_ALIAS_BINDING(yarnwrap.registry.Registry value) { wrapperContained.POOL_ALIAS_BINDING = value.wrapperContained; }
public static yarnwrap.registry.Registry POOL_ALIAS_BINDING() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.POOL_ALIAS_BINDING); }
// public static void POOL_ALIAS_BINDING(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.POOL_ALIAS_BINDING = value.wrapperContained; }

// public yarnwrap.registry.Registry CRITERION() { return new yarnwrap.registry.Registry(wrapperContained.CRITERION); }
// public void CRITERION(yarnwrap.registry.Registry value) { wrapperContained.CRITERION = value.wrapperContained; }
public static yarnwrap.registry.Registry CRITERION() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.CRITERION); }
// public static void CRITERION(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.CRITERION = value.wrapperContained; }

// public yarnwrap.registry.Registry NUMBER_FORMAT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.NUMBER_FORMAT_TYPE); }
// public void NUMBER_FORMAT_TYPE(yarnwrap.registry.Registry value) { wrapperContained.NUMBER_FORMAT_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry NUMBER_FORMAT_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.NUMBER_FORMAT_TYPE); }
// public static void NUMBER_FORMAT_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.NUMBER_FORMAT_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ARMOR_MATERIAL() { return new yarnwrap.registry.Registry(wrapperContained.ARMOR_MATERIAL); }
// public void ARMOR_MATERIAL(yarnwrap.registry.Registry value) { wrapperContained.ARMOR_MATERIAL = value.wrapperContained; }
public static yarnwrap.registry.Registry ARMOR_MATERIAL() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ARMOR_MATERIAL); }
// public static void ARMOR_MATERIAL(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ARMOR_MATERIAL = value.wrapperContained; }

// public yarnwrap.registry.Registry DATA_COMPONENT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.DATA_COMPONENT_TYPE); }
// public void DATA_COMPONENT_TYPE(yarnwrap.registry.Registry value) { wrapperContained.DATA_COMPONENT_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry DATA_COMPONENT_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.DATA_COMPONENT_TYPE); }
// public static void DATA_COMPONENT_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.DATA_COMPONENT_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ENTITY_SUB_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENTITY_SUB_PREDICATE_TYPE); }
// public void ENTITY_SUB_PREDICATE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ENTITY_SUB_PREDICATE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ENTITY_SUB_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ENTITY_SUB_PREDICATE_TYPE); }
// public static void ENTITY_SUB_PREDICATE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ENTITY_SUB_PREDICATE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ITEM_SUB_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ITEM_SUB_PREDICATE_TYPE); }
// public void ITEM_SUB_PREDICATE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ITEM_SUB_PREDICATE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ITEM_SUB_PREDICATE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ITEM_SUB_PREDICATE_TYPE); }
// public static void ITEM_SUB_PREDICATE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ITEM_SUB_PREDICATE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry MAP_DECORATION_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.MAP_DECORATION_TYPE); }
// public void MAP_DECORATION_TYPE(yarnwrap.registry.Registry value) { wrapperContained.MAP_DECORATION_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry MAP_DECORATION_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.MAP_DECORATION_TYPE); }
// public static void MAP_DECORATION_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.MAP_DECORATION_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ENCHANTMENT_EFFECT_COMPONENT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_EFFECT_COMPONENT_TYPE); }
// public void ENCHANTMENT_EFFECT_COMPONENT_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ENCHANTMENT_EFFECT_COMPONENT_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ENCHANTMENT_EFFECT_COMPONENT_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ENCHANTMENT_EFFECT_COMPONENT_TYPE); }
// public static void ENCHANTMENT_EFFECT_COMPONENT_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ENCHANTMENT_EFFECT_COMPONENT_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ENCHANTMENT_LEVEL_BASED_VALUE_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_LEVEL_BASED_VALUE_TYPE); }
// public void ENCHANTMENT_LEVEL_BASED_VALUE_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ENCHANTMENT_LEVEL_BASED_VALUE_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ENCHANTMENT_LEVEL_BASED_VALUE_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ENCHANTMENT_LEVEL_BASED_VALUE_TYPE); }
// public static void ENCHANTMENT_LEVEL_BASED_VALUE_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ENCHANTMENT_LEVEL_BASED_VALUE_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ENCHANTMENT_ENTITY_EFFECT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_ENTITY_EFFECT_TYPE); }
// public void ENCHANTMENT_ENTITY_EFFECT_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ENCHANTMENT_ENTITY_EFFECT_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ENCHANTMENT_ENTITY_EFFECT_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE); }
// public static void ENCHANTMENT_ENTITY_EFFECT_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE); }
// public void ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE); }
// public static void ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ENCHANTMENT_LOCATION_BASED_EFFECT_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ENCHANTMENT_VALUE_EFFECT_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_VALUE_EFFECT_TYPE); }
// public void ENCHANTMENT_VALUE_EFFECT_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ENCHANTMENT_VALUE_EFFECT_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ENCHANTMENT_VALUE_EFFECT_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ENCHANTMENT_VALUE_EFFECT_TYPE); }
// public static void ENCHANTMENT_VALUE_EFFECT_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ENCHANTMENT_VALUE_EFFECT_TYPE = value.wrapperContained; }

// public yarnwrap.registry.Registry ENCHANTMENT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(wrapperContained.ENCHANTMENT_PROVIDER_TYPE); }
// public void ENCHANTMENT_PROVIDER_TYPE(yarnwrap.registry.Registry value) { wrapperContained.ENCHANTMENT_PROVIDER_TYPE = value.wrapperContained; }
public static yarnwrap.registry.Registry ENCHANTMENT_PROVIDER_TYPE() { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.ENCHANTMENT_PROVIDER_TYPE); }
// public static void ENCHANTMENT_PROVIDER_TYPE(yarnwrap.registry.Registry value, ) { net.minecraft.registry.Registries.ENCHANTMENT_PROVIDER_TYPE = value.wrapperContained; }

// public java.lang.Object method_47450(yarnwrap.registry.Registry registry) { return wrapperContained.method_47450(registry.wrapperContained); }
// public static java.lang.Object method_47450(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47450(registry.wrapperContained); }
// public java.lang.Object method_47451(yarnwrap.registry.Registry registry) { return wrapperContained.method_47451(registry.wrapperContained); }
// public static java.lang.Object method_47451(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47451(registry.wrapperContained); }
// public java.lang.Object method_47452(yarnwrap.registry.Registry registry) { return wrapperContained.method_47452(registry.wrapperContained); }
// public static java.lang.Object method_47452(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47452(registry.wrapperContained); }
// public java.lang.Object method_47453(yarnwrap.registry.Registry registry) { return wrapperContained.method_47453(registry.wrapperContained); }
// public static java.lang.Object method_47453(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47453(registry.wrapperContained); }
// public java.lang.Object method_47454(yarnwrap.registry.Registry registry) { return wrapperContained.method_47454(registry.wrapperContained); }
// public static java.lang.Object method_47454(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47454(registry.wrapperContained); }
// public java.lang.Object method_47455(yarnwrap.registry.Registry registry) { return wrapperContained.method_47455(registry.wrapperContained); }
// public static java.lang.Object method_47455(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47455(registry.wrapperContained); }
// public java.lang.Object method_47456(yarnwrap.registry.Registry registry) { return wrapperContained.method_47456(registry.wrapperContained); }
// public static java.lang.Object method_47456(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47456(registry.wrapperContained); }
// public java.lang.Object method_47457(yarnwrap.registry.Registry registry) { return wrapperContained.method_47457(registry.wrapperContained); }
// public static java.lang.Object method_47457(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47457(registry.wrapperContained); }
// public java.lang.Object method_47459(yarnwrap.registry.Registry registry) { return wrapperContained.method_47459(registry.wrapperContained); }
// public static java.lang.Object method_47459(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47459(registry.wrapperContained); }
// public java.lang.Object method_47460(yarnwrap.registry.Registry registry) { return wrapperContained.method_47460(registry.wrapperContained); }
// public static java.lang.Object method_47460(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47460(registry.wrapperContained); }
// public java.lang.Object method_47461(yarnwrap.registry.Registry registry) { return wrapperContained.method_47461(registry.wrapperContained); }
// public static java.lang.Object method_47461(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47461(registry.wrapperContained); }
// public java.lang.Object method_47462(yarnwrap.registry.Registry registry) { return wrapperContained.method_47462(registry.wrapperContained); }
// public static java.lang.Object method_47462(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47462(registry.wrapperContained); }
// public java.lang.Object method_47465(yarnwrap.registry.Registry registry) { return wrapperContained.method_47465(registry.wrapperContained); }
// public static java.lang.Object method_47465(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47465(registry.wrapperContained); }
// public java.lang.Object method_47466(yarnwrap.registry.Registry registry) { return wrapperContained.method_47466(registry.wrapperContained); }
// public static java.lang.Object method_47466(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47466(registry.wrapperContained); }
// public java.lang.Object method_47467(yarnwrap.registry.Registry registry) { return wrapperContained.method_47467(registry.wrapperContained); }
// public static java.lang.Object method_47467(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47467(registry.wrapperContained); }
// public java.lang.Object method_47469(yarnwrap.registry.Registry registry) { return wrapperContained.method_47469(registry.wrapperContained); }
// public static java.lang.Object method_47469(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47469(registry.wrapperContained); }
// public java.lang.Object method_47470(yarnwrap.registry.Registry registry) { return wrapperContained.method_47470(registry.wrapperContained); }
// public static java.lang.Object method_47470(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47470(registry.wrapperContained); }
// public java.lang.Object method_47471(yarnwrap.registry.Registry registry) { return wrapperContained.method_47471(registry.wrapperContained); }
// public static java.lang.Object method_47471(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47471(registry.wrapperContained); }
// public java.lang.Object method_47472(yarnwrap.registry.Registry registry) { return wrapperContained.method_47472(registry.wrapperContained); }
// public static java.lang.Object method_47472(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47472(registry.wrapperContained); }
// public java.lang.Object method_47474(yarnwrap.registry.Registry registry) { return wrapperContained.method_47474(registry.wrapperContained); }
// public static java.lang.Object method_47474(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47474(registry.wrapperContained); }
// public java.lang.Object method_47475(yarnwrap.registry.Registry registry) { return wrapperContained.method_47475(registry.wrapperContained); }
// public static java.lang.Object method_47475(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47475(registry.wrapperContained); }
// public void bootstrap() { wrapperContained.bootstrap(); }
public static void bootstrap() { net.minecraft.registry.Registries.bootstrap(); }
// public yarnwrap.registry.MutableRegistry create(yarnwrap.registry.RegistryKey key,yarnwrap.registry.MutableRegistry registry,Object initializer) { return new yarnwrap.registry.MutableRegistry(wrapperContained.create(key.wrapperContained,registry.wrapperContained,initializer)); }
// public static yarnwrap.registry.MutableRegistry create(yarnwrap.registry.RegistryKey key,yarnwrap.registry.MutableRegistry registry,Object initializer, ) { return new yarnwrap.registry.MutableRegistry(net.minecraft.registry.Registries.create(key.wrapperContained,registry.wrapperContained,initializer)); }
// public yarnwrap.registry.Registry create(yarnwrap.registry.RegistryKey key,Object initializer) { return new yarnwrap.registry.Registry(wrapperContained.create(key.wrapperContained,initializer)); }
// public static yarnwrap.registry.Registry create(yarnwrap.registry.RegistryKey key,Object initializer, ) { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.create(key.wrapperContained,initializer)); }
// public yarnwrap.registry.DefaultedRegistry create(yarnwrap.registry.RegistryKey key,java.lang.String defaultId,Object initializer) { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.create(key.wrapperContained,defaultId,initializer)); }
// public static yarnwrap.registry.DefaultedRegistry create(yarnwrap.registry.RegistryKey key,java.lang.String defaultId,Object initializer, ) { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.create(key.wrapperContained,defaultId,initializer)); }
// public void method_47482(yarnwrap.util.Identifier id,java.util.function.Supplier initializer) { wrapperContained.method_47482(id.wrapperContained,initializer); }
// public static void method_47482(yarnwrap.util.Identifier id,java.util.function.Supplier initializer, ) { net.minecraft.registry.Registries.method_47482(id.wrapperContained,initializer); }
// public void validate(yarnwrap.registry.Registry registries) { wrapperContained.validate(registries.wrapperContained); }
// public static void validate(yarnwrap.registry.Registry registries, ) { net.minecraft.registry.Registries.validate(registries.wrapperContained); }
// public void method_47484(yarnwrap.registry.Registry registry) { wrapperContained.method_47484(registry.wrapperContained); }
// public static void method_47484(yarnwrap.registry.Registry registry, ) { net.minecraft.registry.Registries.method_47484(registry.wrapperContained); }
// public void init() { wrapperContained.init(); }
// public static void init() { net.minecraft.registry.Registries.init(); }
// public yarnwrap.registry.DefaultedRegistry createIntrusive(yarnwrap.registry.RegistryKey key,java.lang.String defaultId,Object initializer) { return new yarnwrap.registry.DefaultedRegistry(wrapperContained.createIntrusive(key.wrapperContained,defaultId,initializer)); }
// public static yarnwrap.registry.DefaultedRegistry createIntrusive(yarnwrap.registry.RegistryKey key,java.lang.String defaultId,Object initializer, ) { return new yarnwrap.registry.DefaultedRegistry(net.minecraft.registry.Registries.createIntrusive(key.wrapperContained,defaultId,initializer)); }
// public void freezeRegistries() { wrapperContained.freezeRegistries(); }
// public static void freezeRegistries() { net.minecraft.registry.Registries.freezeRegistries(); }
// public java.lang.Object method_47492(yarnwrap.registry.Registry registry) { return wrapperContained.method_47492(registry.wrapperContained); }
// public static java.lang.Object method_47492(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47492(registry.wrapperContained); }
// public java.lang.Object method_47493(yarnwrap.registry.Registry registry) { return wrapperContained.method_47493(registry.wrapperContained); }
// public static java.lang.Object method_47493(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47493(registry.wrapperContained); }
// public java.lang.Object method_47494(yarnwrap.registry.Registry registry) { return wrapperContained.method_47494(registry.wrapperContained); }
// public static java.lang.Object method_47494(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47494(registry.wrapperContained); }
// public java.lang.Object method_47495(yarnwrap.registry.Registry registry) { return wrapperContained.method_47495(registry.wrapperContained); }
// public static java.lang.Object method_47495(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47495(registry.wrapperContained); }
// public java.lang.Object method_47496(yarnwrap.registry.Registry registry) { return wrapperContained.method_47496(registry.wrapperContained); }
// public static java.lang.Object method_47496(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47496(registry.wrapperContained); }
// public java.lang.Object method_47497(yarnwrap.registry.Registry registry) { return wrapperContained.method_47497(registry.wrapperContained); }
// public static java.lang.Object method_47497(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47497(registry.wrapperContained); }
// public java.lang.Object method_47498(yarnwrap.registry.Registry registry) { return wrapperContained.method_47498(registry.wrapperContained); }
// public static java.lang.Object method_47498(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47498(registry.wrapperContained); }
// public java.lang.Object method_47499(yarnwrap.registry.Registry registry) { return wrapperContained.method_47499(registry.wrapperContained); }
// public static java.lang.Object method_47499(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47499(registry.wrapperContained); }
// public java.lang.Object method_47500(yarnwrap.registry.Registry registry) { return wrapperContained.method_47500(registry.wrapperContained); }
// public static java.lang.Object method_47500(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47500(registry.wrapperContained); }
// public java.lang.Object method_47501(yarnwrap.registry.Registry registry) { return wrapperContained.method_47501(registry.wrapperContained); }
// public static java.lang.Object method_47501(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47501(registry.wrapperContained); }
// public java.lang.Object method_47502(yarnwrap.registry.Registry registry) { return wrapperContained.method_47502(registry.wrapperContained); }
// public static java.lang.Object method_47502(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47502(registry.wrapperContained); }
// public java.lang.Object method_47503(yarnwrap.registry.Registry registry) { return wrapperContained.method_47503(registry.wrapperContained); }
// public static java.lang.Object method_47503(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47503(registry.wrapperContained); }
// public java.lang.Object method_47504(yarnwrap.registry.Registry registry) { return wrapperContained.method_47504(registry.wrapperContained); }
// public static java.lang.Object method_47504(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47504(registry.wrapperContained); }
// public java.lang.Object method_47505(yarnwrap.registry.Registry registry) { return wrapperContained.method_47505(registry.wrapperContained); }
// public static java.lang.Object method_47505(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47505(registry.wrapperContained); }
// public java.lang.Object method_47506(yarnwrap.registry.Registry registry) { return wrapperContained.method_47506(registry.wrapperContained); }
// public static java.lang.Object method_47506(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47506(registry.wrapperContained); }
// public java.lang.Object method_47507(yarnwrap.registry.Registry registry) { return wrapperContained.method_47507(registry.wrapperContained); }
// public static java.lang.Object method_47507(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47507(registry.wrapperContained); }
// public java.lang.Object method_47508(yarnwrap.registry.Registry registry) { return wrapperContained.method_47508(registry.wrapperContained); }
// public static java.lang.Object method_47508(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47508(registry.wrapperContained); }
// public java.lang.Object method_47509(yarnwrap.registry.Registry registry) { return wrapperContained.method_47509(registry.wrapperContained); }
// public static java.lang.Object method_47509(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47509(registry.wrapperContained); }
// public java.lang.Object method_47510(yarnwrap.registry.Registry registry) { return wrapperContained.method_47510(registry.wrapperContained); }
// public static java.lang.Object method_47510(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47510(registry.wrapperContained); }
// public java.lang.Object method_47511(yarnwrap.registry.Registry registry) { return wrapperContained.method_47511(registry.wrapperContained); }
// public static java.lang.Object method_47511(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47511(registry.wrapperContained); }
// public java.lang.Object method_47512(yarnwrap.registry.Registry registry) { return wrapperContained.method_47512(registry.wrapperContained); }
// public static java.lang.Object method_47512(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47512(registry.wrapperContained); }
// public java.lang.Object method_47513(yarnwrap.registry.Registry registry) { return wrapperContained.method_47513(registry.wrapperContained); }
// public static java.lang.Object method_47513(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47513(registry.wrapperContained); }
// public java.lang.Object method_47514(yarnwrap.registry.Registry registry) { return wrapperContained.method_47514(registry.wrapperContained); }
// public static java.lang.Object method_47514(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47514(registry.wrapperContained); }
// public java.lang.Object method_47515(yarnwrap.registry.Registry registry) { return wrapperContained.method_47515(registry.wrapperContained); }
// public static java.lang.Object method_47515(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_47515(registry.wrapperContained); }
// public java.lang.Object method_49927(yarnwrap.registry.Registry registry) { return wrapperContained.method_49927(registry.wrapperContained); }
// public static java.lang.Object method_49927(yarnwrap.registry.Registry registry, ) { return net.minecraft.registry.Registries.method_49927(registry.wrapperContained); }
// public yarnwrap.registry.Registry createIntrusive(yarnwrap.registry.RegistryKey key,Object initializer) { return new yarnwrap.registry.Registry(wrapperContained.createIntrusive(key.wrapperContained,initializer)); }
// public static yarnwrap.registry.Registry createIntrusive(yarnwrap.registry.RegistryKey key,Object initializer, ) { return new yarnwrap.registry.Registry(net.minecraft.registry.Registries.createIntrusive(key.wrapperContained,initializer)); }

}