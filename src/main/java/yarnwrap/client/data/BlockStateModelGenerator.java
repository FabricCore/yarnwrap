package yarnwrap.client.data;
public class BlockStateModelGenerator { public net.minecraft.client.data.BlockStateModelGenerator wrapperContained; public BlockStateModelGenerator(net.minecraft.client.data.BlockStateModelGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Consumer blockStateCollector() { return wrapperContained.blockStateCollector; }
// public void blockStateCollector(java.util.function.Consumer value) { wrapperContained.blockStateCollector = value; }
// public static java.util.function.Consumer blockStateCollector() { return net.minecraft.client.data.BlockStateModelGenerator.blockStateCollector; }
// public static void blockStateCollector(java.util.function.Consumer value, ) { net.minecraft.client.data.BlockStateModelGenerator.blockStateCollector = value; }

public java.util.function.BiConsumer modelCollector() { return wrapperContained.modelCollector; }
// public void modelCollector(java.util.function.BiConsumer value) { wrapperContained.modelCollector = value; }
// public static java.util.function.BiConsumer modelCollector() { return net.minecraft.client.data.BlockStateModelGenerator.modelCollector; }
// public static void modelCollector(java.util.function.BiConsumer value, ) { net.minecraft.client.data.BlockStateModelGenerator.modelCollector = value; }

// public java.util.Map CONNECTION_VARIANT_FUNCTIONS() { return wrapperContained.CONNECTION_VARIANT_FUNCTIONS; }
// public void CONNECTION_VARIANT_FUNCTIONS(java.util.Map value) { wrapperContained.CONNECTION_VARIANT_FUNCTIONS = value; }
// public static java.util.Map CONNECTION_VARIANT_FUNCTIONS() { return net.minecraft.client.data.BlockStateModelGenerator.CONNECTION_VARIANT_FUNCTIONS; }
// public static void CONNECTION_VARIANT_FUNCTIONS(java.util.Map value, ) { net.minecraft.client.data.BlockStateModelGenerator.CONNECTION_VARIANT_FUNCTIONS = value; }

// public java.util.Map VARIANT_POOL_FUNCTIONS() { return wrapperContained.VARIANT_POOL_FUNCTIONS; }
// public void VARIANT_POOL_FUNCTIONS(java.util.Map value) { wrapperContained.VARIANT_POOL_FUNCTIONS = value; }
// public static java.util.Map VARIANT_POOL_FUNCTIONS() { return net.minecraft.client.data.BlockStateModelGenerator.VARIANT_POOL_FUNCTIONS; }
// public static void VARIANT_POOL_FUNCTIONS(java.util.Map value, ) { net.minecraft.client.data.BlockStateModelGenerator.VARIANT_POOL_FUNCTIONS = value; }

// public java.util.Map CHISELED_BOOKSHELF_MODEL_CACHE() { return wrapperContained.CHISELED_BOOKSHELF_MODEL_CACHE; }
// public void CHISELED_BOOKSHELF_MODEL_CACHE(java.util.Map value) { wrapperContained.CHISELED_BOOKSHELF_MODEL_CACHE = value; }
// public static java.util.Map CHISELED_BOOKSHELF_MODEL_CACHE() { return net.minecraft.client.data.BlockStateModelGenerator.CHISELED_BOOKSHELF_MODEL_CACHE; }
// public static void CHISELED_BOOKSHELF_MODEL_CACHE(java.util.Map value, ) { net.minecraft.client.data.BlockStateModelGenerator.CHISELED_BOOKSHELF_MODEL_CACHE = value; }

public yarnwrap.client.data.ItemModelOutput itemModelOutput() { return new yarnwrap.client.data.ItemModelOutput(wrapperContained.itemModelOutput); }
// public void itemModelOutput(yarnwrap.client.data.ItemModelOutput value) { wrapperContained.itemModelOutput = value.wrapperContained; }
// public static yarnwrap.client.data.ItemModelOutput itemModelOutput() { return new yarnwrap.client.data.ItemModelOutput(net.minecraft.client.data.BlockStateModelGenerator.itemModelOutput); }
// public static void itemModelOutput(yarnwrap.client.data.ItemModelOutput value, ) { net.minecraft.client.data.BlockStateModelGenerator.itemModelOutput = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelVariantOperator NO_OP() { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.NO_OP); }
// public void NO_OP(yarnwrap.client.render.model.json.ModelVariantOperator value) { wrapperContained.NO_OP = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelVariantOperator NO_OP() { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.NO_OP); }
// public static void NO_OP(yarnwrap.client.render.model.json.ModelVariantOperator value, ) { net.minecraft.client.data.BlockStateModelGenerator.NO_OP = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelVariantOperator UV_LOCK() { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.UV_LOCK); }
// public void UV_LOCK(yarnwrap.client.render.model.json.ModelVariantOperator value) { wrapperContained.UV_LOCK = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelVariantOperator UV_LOCK() { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.UV_LOCK); }
// public static void UV_LOCK(yarnwrap.client.render.model.json.ModelVariantOperator value, ) { net.minecraft.client.data.BlockStateModelGenerator.UV_LOCK = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_X_90() { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.ROTATE_X_90); }
// public void ROTATE_X_90(yarnwrap.client.render.model.json.ModelVariantOperator value) { wrapperContained.ROTATE_X_90 = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_X_90() { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.ROTATE_X_90); }
// public static void ROTATE_X_90(yarnwrap.client.render.model.json.ModelVariantOperator value, ) { net.minecraft.client.data.BlockStateModelGenerator.ROTATE_X_90 = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_X_180() { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.ROTATE_X_180); }
// public void ROTATE_X_180(yarnwrap.client.render.model.json.ModelVariantOperator value) { wrapperContained.ROTATE_X_180 = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_X_180() { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.ROTATE_X_180); }
// public static void ROTATE_X_180(yarnwrap.client.render.model.json.ModelVariantOperator value, ) { net.minecraft.client.data.BlockStateModelGenerator.ROTATE_X_180 = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_X_270() { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.ROTATE_X_270); }
// public void ROTATE_X_270(yarnwrap.client.render.model.json.ModelVariantOperator value) { wrapperContained.ROTATE_X_270 = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_X_270() { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.ROTATE_X_270); }
// public static void ROTATE_X_270(yarnwrap.client.render.model.json.ModelVariantOperator value, ) { net.minecraft.client.data.BlockStateModelGenerator.ROTATE_X_270 = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_Y_90() { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.ROTATE_Y_90); }
// public void ROTATE_Y_90(yarnwrap.client.render.model.json.ModelVariantOperator value) { wrapperContained.ROTATE_Y_90 = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_Y_90() { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.ROTATE_Y_90); }
// public static void ROTATE_Y_90(yarnwrap.client.render.model.json.ModelVariantOperator value, ) { net.minecraft.client.data.BlockStateModelGenerator.ROTATE_Y_90 = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_Y_180() { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.ROTATE_Y_180); }
// public void ROTATE_Y_180(yarnwrap.client.render.model.json.ModelVariantOperator value) { wrapperContained.ROTATE_Y_180 = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_Y_180() { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.ROTATE_Y_180); }
// public static void ROTATE_Y_180(yarnwrap.client.render.model.json.ModelVariantOperator value, ) { net.minecraft.client.data.BlockStateModelGenerator.ROTATE_Y_180 = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_Y_270() { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.ROTATE_Y_270); }
// public void ROTATE_Y_270(yarnwrap.client.render.model.json.ModelVariantOperator value) { wrapperContained.ROTATE_Y_270 = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelVariantOperator ROTATE_Y_270() { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.ROTATE_Y_270); }
// public static void ROTATE_Y_270(yarnwrap.client.render.model.json.ModelVariantOperator value, ) { net.minecraft.client.data.BlockStateModelGenerator.ROTATE_Y_270 = value.wrapperContained; }

// public java.util.List UNORIENTABLE_TRAPDOORS() { return wrapperContained.UNORIENTABLE_TRAPDOORS; }
// public void UNORIENTABLE_TRAPDOORS(java.util.List value) { wrapperContained.UNORIENTABLE_TRAPDOORS = value; }
// public static java.util.List UNORIENTABLE_TRAPDOORS() { return net.minecraft.client.data.BlockStateModelGenerator.UNORIENTABLE_TRAPDOORS; }
// public static void UNORIENTABLE_TRAPDOORS(java.util.List value, ) { net.minecraft.client.data.BlockStateModelGenerator.UNORIENTABLE_TRAPDOORS = value; }

// public java.util.Map BASE_WITH_CUSTOM_GENERATOR() { return wrapperContained.BASE_WITH_CUSTOM_GENERATOR; }
// public void BASE_WITH_CUSTOM_GENERATOR(java.util.Map value) { wrapperContained.BASE_WITH_CUSTOM_GENERATOR = value; }
// public static java.util.Map BASE_WITH_CUSTOM_GENERATOR() { return net.minecraft.client.data.BlockStateModelGenerator.BASE_WITH_CUSTOM_GENERATOR; }
// public static void BASE_WITH_CUSTOM_GENERATOR(java.util.Map value, ) { net.minecraft.client.data.BlockStateModelGenerator.BASE_WITH_CUSTOM_GENERATOR = value; }

// public yarnwrap.client.data.BlockStateVariantMap NORTH_DEFAULT_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(wrapperContained.NORTH_DEFAULT_ROTATION_OPERATIONS); }
// public void NORTH_DEFAULT_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value) { wrapperContained.NORTH_DEFAULT_ROTATION_OPERATIONS = value.wrapperContained; }
// public static yarnwrap.client.data.BlockStateVariantMap NORTH_DEFAULT_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(net.minecraft.client.data.BlockStateModelGenerator.NORTH_DEFAULT_ROTATION_OPERATIONS); }
// public static void NORTH_DEFAULT_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value, ) { net.minecraft.client.data.BlockStateModelGenerator.NORTH_DEFAULT_ROTATION_OPERATIONS = value.wrapperContained; }

// public yarnwrap.client.data.BlockStateVariantMap UP_DEFAULT_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(wrapperContained.UP_DEFAULT_ROTATION_OPERATIONS); }
// public void UP_DEFAULT_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value) { wrapperContained.UP_DEFAULT_ROTATION_OPERATIONS = value.wrapperContained; }
// public static yarnwrap.client.data.BlockStateVariantMap UP_DEFAULT_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(net.minecraft.client.data.BlockStateModelGenerator.UP_DEFAULT_ROTATION_OPERATIONS); }
// public static void UP_DEFAULT_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value, ) { net.minecraft.client.data.BlockStateModelGenerator.UP_DEFAULT_ROTATION_OPERATIONS = value.wrapperContained; }

// public yarnwrap.client.data.BlockStateVariantMap EAST_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(wrapperContained.EAST_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS); }
// public void EAST_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value) { wrapperContained.EAST_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS = value.wrapperContained; }
// public static yarnwrap.client.data.BlockStateVariantMap EAST_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(net.minecraft.client.data.BlockStateModelGenerator.EAST_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS); }
// public static void EAST_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value, ) { net.minecraft.client.data.BlockStateModelGenerator.EAST_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS = value.wrapperContained; }

// public yarnwrap.client.data.BlockStateVariantMap SOUTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(wrapperContained.SOUTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS); }
// public void SOUTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value) { wrapperContained.SOUTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS = value.wrapperContained; }
// public static yarnwrap.client.data.BlockStateVariantMap SOUTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(net.minecraft.client.data.BlockStateModelGenerator.SOUTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS); }
// public static void SOUTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value, ) { net.minecraft.client.data.BlockStateModelGenerator.SOUTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS = value.wrapperContained; }

// public yarnwrap.client.data.BlockStateVariantMap NORTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(wrapperContained.NORTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS); }
// public void NORTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value) { wrapperContained.NORTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS = value.wrapperContained; }
// public static yarnwrap.client.data.BlockStateVariantMap NORTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS() { return new yarnwrap.client.data.BlockStateVariantMap(net.minecraft.client.data.BlockStateModelGenerator.NORTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS); }
// public static void NORTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS(yarnwrap.client.data.BlockStateVariantMap value, ) { net.minecraft.client.data.BlockStateModelGenerator.NORTH_DEFAULT_HORIZONTAL_ROTATION_OPERATIONS = value.wrapperContained; }

// public java.util.Map TEXTURED_MODELS() { return wrapperContained.TEXTURED_MODELS; }
// public void TEXTURED_MODELS(java.util.Map value) { wrapperContained.TEXTURED_MODELS = value; }
// public static java.util.Map TEXTURED_MODELS() { return net.minecraft.client.data.BlockStateModelGenerator.TEXTURED_MODELS; }
// public static void TEXTURED_MODELS(java.util.Map value, ) { net.minecraft.client.data.BlockStateModelGenerator.TEXTURED_MODELS = value; }

// public java.util.function.Function FLOWERBED_MODEL_1_CONDITION_FUNCTION() { return wrapperContained.FLOWERBED_MODEL_1_CONDITION_FUNCTION; }
// public void FLOWERBED_MODEL_1_CONDITION_FUNCTION(java.util.function.Function value) { wrapperContained.FLOWERBED_MODEL_1_CONDITION_FUNCTION = value; }
// public static java.util.function.Function FLOWERBED_MODEL_1_CONDITION_FUNCTION() { return net.minecraft.client.data.BlockStateModelGenerator.FLOWERBED_MODEL_1_CONDITION_FUNCTION; }
// public static void FLOWERBED_MODEL_1_CONDITION_FUNCTION(java.util.function.Function value, ) { net.minecraft.client.data.BlockStateModelGenerator.FLOWERBED_MODEL_1_CONDITION_FUNCTION = value; }

// public java.util.function.Function FLOWERBED_MODEL_2_CONDITION_FUNCTION() { return wrapperContained.FLOWERBED_MODEL_2_CONDITION_FUNCTION; }
// public void FLOWERBED_MODEL_2_CONDITION_FUNCTION(java.util.function.Function value) { wrapperContained.FLOWERBED_MODEL_2_CONDITION_FUNCTION = value; }
// public static java.util.function.Function FLOWERBED_MODEL_2_CONDITION_FUNCTION() { return net.minecraft.client.data.BlockStateModelGenerator.FLOWERBED_MODEL_2_CONDITION_FUNCTION; }
// public static void FLOWERBED_MODEL_2_CONDITION_FUNCTION(java.util.function.Function value, ) { net.minecraft.client.data.BlockStateModelGenerator.FLOWERBED_MODEL_2_CONDITION_FUNCTION = value; }

// public java.util.function.Function FLOWERBED_MODEL_3_CONDITION_FUNCTION() { return wrapperContained.FLOWERBED_MODEL_3_CONDITION_FUNCTION; }
// public void FLOWERBED_MODEL_3_CONDITION_FUNCTION(java.util.function.Function value) { wrapperContained.FLOWERBED_MODEL_3_CONDITION_FUNCTION = value; }
// public static java.util.function.Function FLOWERBED_MODEL_3_CONDITION_FUNCTION() { return net.minecraft.client.data.BlockStateModelGenerator.FLOWERBED_MODEL_3_CONDITION_FUNCTION; }
// public static void FLOWERBED_MODEL_3_CONDITION_FUNCTION(java.util.function.Function value, ) { net.minecraft.client.data.BlockStateModelGenerator.FLOWERBED_MODEL_3_CONDITION_FUNCTION = value; }

// public java.util.function.Function FLOWERBED_MODEL_4_CONDITION_FUNCTION() { return wrapperContained.FLOWERBED_MODEL_4_CONDITION_FUNCTION; }
// public void FLOWERBED_MODEL_4_CONDITION_FUNCTION(java.util.function.Function value) { wrapperContained.FLOWERBED_MODEL_4_CONDITION_FUNCTION = value; }
// public static java.util.function.Function FLOWERBED_MODEL_4_CONDITION_FUNCTION() { return net.minecraft.client.data.BlockStateModelGenerator.FLOWERBED_MODEL_4_CONDITION_FUNCTION; }
// public static void FLOWERBED_MODEL_4_CONDITION_FUNCTION(java.util.function.Function value, ) { net.minecraft.client.data.BlockStateModelGenerator.FLOWERBED_MODEL_4_CONDITION_FUNCTION = value; }

// public java.util.function.Function LEAF_LITTER_MODEL_1_CONDITION_FUNCTION() { return wrapperContained.LEAF_LITTER_MODEL_1_CONDITION_FUNCTION; }
// public void LEAF_LITTER_MODEL_1_CONDITION_FUNCTION(java.util.function.Function value) { wrapperContained.LEAF_LITTER_MODEL_1_CONDITION_FUNCTION = value; }
// public static java.util.function.Function LEAF_LITTER_MODEL_1_CONDITION_FUNCTION() { return net.minecraft.client.data.BlockStateModelGenerator.LEAF_LITTER_MODEL_1_CONDITION_FUNCTION; }
// public static void LEAF_LITTER_MODEL_1_CONDITION_FUNCTION(java.util.function.Function value, ) { net.minecraft.client.data.BlockStateModelGenerator.LEAF_LITTER_MODEL_1_CONDITION_FUNCTION = value; }

// public java.util.function.Function LEAF_LITTER_MODEL_2_CONDITION_FUNCTION() { return wrapperContained.LEAF_LITTER_MODEL_2_CONDITION_FUNCTION; }
// public void LEAF_LITTER_MODEL_2_CONDITION_FUNCTION(java.util.function.Function value) { wrapperContained.LEAF_LITTER_MODEL_2_CONDITION_FUNCTION = value; }
// public static java.util.function.Function LEAF_LITTER_MODEL_2_CONDITION_FUNCTION() { return net.minecraft.client.data.BlockStateModelGenerator.LEAF_LITTER_MODEL_2_CONDITION_FUNCTION; }
// public static void LEAF_LITTER_MODEL_2_CONDITION_FUNCTION(java.util.function.Function value, ) { net.minecraft.client.data.BlockStateModelGenerator.LEAF_LITTER_MODEL_2_CONDITION_FUNCTION = value; }

// public java.util.function.Function LEAF_LITTER_MODEL_3_CONDITION_FUNCTION() { return wrapperContained.LEAF_LITTER_MODEL_3_CONDITION_FUNCTION; }
// public void LEAF_LITTER_MODEL_3_CONDITION_FUNCTION(java.util.function.Function value) { wrapperContained.LEAF_LITTER_MODEL_3_CONDITION_FUNCTION = value; }
// public static java.util.function.Function LEAF_LITTER_MODEL_3_CONDITION_FUNCTION() { return net.minecraft.client.data.BlockStateModelGenerator.LEAF_LITTER_MODEL_3_CONDITION_FUNCTION; }
// public static void LEAF_LITTER_MODEL_3_CONDITION_FUNCTION(java.util.function.Function value, ) { net.minecraft.client.data.BlockStateModelGenerator.LEAF_LITTER_MODEL_3_CONDITION_FUNCTION = value; }

// public java.util.function.Function LEAF_LITTER_MODEL_4_CONDITION_FUNCTION() { return wrapperContained.LEAF_LITTER_MODEL_4_CONDITION_FUNCTION; }
// public void LEAF_LITTER_MODEL_4_CONDITION_FUNCTION(java.util.function.Function value) { wrapperContained.LEAF_LITTER_MODEL_4_CONDITION_FUNCTION = value; }
// public static java.util.function.Function LEAF_LITTER_MODEL_4_CONDITION_FUNCTION() { return net.minecraft.client.data.BlockStateModelGenerator.LEAF_LITTER_MODEL_4_CONDITION_FUNCTION; }
// public static void LEAF_LITTER_MODEL_4_CONDITION_FUNCTION(java.util.function.Function value, ) { net.minecraft.client.data.BlockStateModelGenerator.LEAF_LITTER_MODEL_4_CONDITION_FUNCTION = value; }

public BlockStateModelGenerator(java.util.function.Consumer blockStateCollector,yarnwrap.client.data.ItemModelOutput itemModelOutput,java.util.function.BiConsumer modelCollector) { this.wrapperContained = new net.minecraft.client.data.BlockStateModelGenerator(blockStateCollector,itemModelOutput.wrapperContained,modelCollector); }
// public void registerChorusPlant() { wrapperContained.registerChorusPlant(); }
// public static void registerChorusPlant() { net.minecraft.client.data.BlockStateModelGenerator.registerChorusPlant(); }
// public void registerComposter() { wrapperContained.registerComposter(); }
// public static void registerComposter() { net.minecraft.client.data.BlockStateModelGenerator.registerComposter(); }
// public void registerDaylightDetector() { wrapperContained.registerDaylightDetector(); }
// public static void registerDaylightDetector() { net.minecraft.client.data.BlockStateModelGenerator.registerDaylightDetector(); }
// public void registerFarmland() { wrapperContained.registerFarmland(); }
// public static void registerFarmland() { net.minecraft.client.data.BlockStateModelGenerator.registerFarmland(); }
// public void registerFire() { wrapperContained.registerFire(); }
// public static void registerFire() { net.minecraft.client.data.BlockStateModelGenerator.registerFire(); }
// public void registerSoulFire() { wrapperContained.registerSoulFire(); }
// public static void registerSoulFire() { net.minecraft.client.data.BlockStateModelGenerator.registerSoulFire(); }
// public void registerFrostedIce() { wrapperContained.registerFrostedIce(); }
// public static void registerFrostedIce() { net.minecraft.client.data.BlockStateModelGenerator.registerFrostedIce(); }
// public void registerTopSoils() { wrapperContained.registerTopSoils(); }
// public static void registerTopSoils() { net.minecraft.client.data.BlockStateModelGenerator.registerTopSoils(); }
// public void registerCocoa() { wrapperContained.registerCocoa(); }
// public static void registerCocoa() { net.minecraft.client.data.BlockStateModelGenerator.registerCocoa(); }
// public void registerDirtPath() { wrapperContained.registerDirtPath(); }
// public static void registerDirtPath() { net.minecraft.client.data.BlockStateModelGenerator.registerDirtPath(); }
// public void registerHopper() { wrapperContained.registerHopper(); }
// public static void registerHopper() { net.minecraft.client.data.BlockStateModelGenerator.registerHopper(); }
// public void registerIronBars() { wrapperContained.registerIronBars(); }
// public static void registerIronBars() { net.minecraft.client.data.BlockStateModelGenerator.registerIronBars(); }
// public void registerLever() { wrapperContained.registerLever(); }
// public static void registerLever() { net.minecraft.client.data.BlockStateModelGenerator.registerLever(); }
// public void registerLilyPad() { wrapperContained.registerLilyPad(); }
// public static void registerLilyPad() { net.minecraft.client.data.BlockStateModelGenerator.registerLilyPad(); }
// public void registerNetherPortal() { wrapperContained.registerNetherPortal(); }
// public static void registerNetherPortal() { net.minecraft.client.data.BlockStateModelGenerator.registerNetherPortal(); }
// public void registerNetherrack() { wrapperContained.registerNetherrack(); }
// public static void registerNetherrack() { net.minecraft.client.data.BlockStateModelGenerator.registerNetherrack(); }
// public void registerObserver() { wrapperContained.registerObserver(); }
// public static void registerObserver() { net.minecraft.client.data.BlockStateModelGenerator.registerObserver(); }
// public void registerPistons() { wrapperContained.registerPistons(); }
// public static void registerPistons() { net.minecraft.client.data.BlockStateModelGenerator.registerPistons(); }
// public void registerPistonHead() { wrapperContained.registerPistonHead(); }
// public static void registerPistonHead() { net.minecraft.client.data.BlockStateModelGenerator.registerPistonHead(); }
// public void registerScaffolding() { wrapperContained.registerScaffolding(); }
// public static void registerScaffolding() { net.minecraft.client.data.BlockStateModelGenerator.registerScaffolding(); }
// public void registerRedstoneLamp() { wrapperContained.registerRedstoneLamp(); }
// public static void registerRedstoneLamp() { net.minecraft.client.data.BlockStateModelGenerator.registerRedstoneLamp(); }
// public void registerRedstoneTorch() { wrapperContained.registerRedstoneTorch(); }
// public static void registerRedstoneTorch() { net.minecraft.client.data.BlockStateModelGenerator.registerRedstoneTorch(); }
// public void registerRepeater() { wrapperContained.registerRepeater(); }
// public static void registerRepeater() { net.minecraft.client.data.BlockStateModelGenerator.registerRepeater(); }
// public void registerSeaPickle() { wrapperContained.registerSeaPickle(); }
// public static void registerSeaPickle() { net.minecraft.client.data.BlockStateModelGenerator.registerSeaPickle(); }
// public void registerSnows() { wrapperContained.registerSnows(); }
// public static void registerSnows() { net.minecraft.client.data.BlockStateModelGenerator.registerSnows(); }
public void register() { wrapperContained.register(); }
// public static void register() { net.minecraft.client.data.BlockStateModelGenerator.register(); }
// public yarnwrap.client.render.model.json.WeightedVariant getBambooBlockStateVariants(int age) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.getBambooBlockStateVariants(age)); }
// public static yarnwrap.client.render.model.json.WeightedVariant getBambooBlockStateVariants(int age, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.getBambooBlockStateVariants(age)); }
public yarnwrap.client.render.model.json.ModelVariant getTurtleEggModel(int eggs,java.lang.String prefix,yarnwrap.client.data.TextureMap textures) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.getTurtleEggModel(eggs,prefix,textures.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelVariant getTurtleEggModel(int eggs,java.lang.String prefix,yarnwrap.client.data.TextureMap textures, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.data.BlockStateModelGenerator.getTurtleEggModel(eggs,prefix,textures.wrapperContained)); }
public void registerItemModel(yarnwrap.item.Item item) { wrapperContained.registerItemModel(item.wrapperContained); }
// public static void registerItemModel(yarnwrap.item.Item item, ) { net.minecraft.client.data.BlockStateModelGenerator.registerItemModel(item.wrapperContained); }
public void registerBuiltinWithParticle(yarnwrap.block.Block block,yarnwrap.item.Item particleSource) { wrapperContained.registerBuiltinWithParticle(block.wrapperContained,particleSource.wrapperContained); }
// public static void registerBuiltinWithParticle(yarnwrap.block.Block block,yarnwrap.item.Item particleSource, ) { net.minecraft.client.data.BlockStateModelGenerator.registerBuiltinWithParticle(block.wrapperContained,particleSource.wrapperContained); }
public void registerStateWithModelReference(yarnwrap.block.Block block,yarnwrap.block.Block modelReference) { wrapperContained.registerStateWithModelReference(block.wrapperContained,modelReference.wrapperContained); }
// public static void registerStateWithModelReference(yarnwrap.block.Block block,yarnwrap.block.Block modelReference, ) { net.minecraft.client.data.BlockStateModelGenerator.registerStateWithModelReference(block.wrapperContained,modelReference.wrapperContained); }
public void registerCoral(yarnwrap.block.Block coral,yarnwrap.block.Block deadCoral,yarnwrap.block.Block coralBlock,yarnwrap.block.Block deadCoralBlock,yarnwrap.block.Block coralFan,yarnwrap.block.Block deadCoralFan,yarnwrap.block.Block coralWallFan,yarnwrap.block.Block deadCoralWallFan) { wrapperContained.registerCoral(coral.wrapperContained,deadCoral.wrapperContained,coralBlock.wrapperContained,deadCoralBlock.wrapperContained,coralFan.wrapperContained,deadCoralFan.wrapperContained,coralWallFan.wrapperContained,deadCoralWallFan.wrapperContained); }
// public static void registerCoral(yarnwrap.block.Block coral,yarnwrap.block.Block deadCoral,yarnwrap.block.Block coralBlock,yarnwrap.block.Block deadCoralBlock,yarnwrap.block.Block coralFan,yarnwrap.block.Block deadCoralFan,yarnwrap.block.Block coralWallFan,yarnwrap.block.Block deadCoralWallFan, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCoral(coral.wrapperContained,deadCoral.wrapperContained,coralBlock.wrapperContained,deadCoralBlock.wrapperContained,coralFan.wrapperContained,deadCoralFan.wrapperContained,coralWallFan.wrapperContained,deadCoralWallFan.wrapperContained); }
// public void registerFlowerPotPlant(yarnwrap.block.Block plantBlock,yarnwrap.block.Block flowerPotBlock,Object tintType) { wrapperContained.registerFlowerPotPlant(plantBlock.wrapperContained,flowerPotBlock.wrapperContained,tintType); }
// public static void registerFlowerPotPlant(yarnwrap.block.Block plantBlock,yarnwrap.block.Block flowerPotBlock,Object tintType, ) { net.minecraft.client.data.BlockStateModelGenerator.registerFlowerPotPlant(plantBlock.wrapperContained,flowerPotBlock.wrapperContained,tintType); }
public void registerCubeWithCustomTextures(yarnwrap.block.Block block,yarnwrap.block.Block otherTextureSource,java.util.function.BiFunction texturesFactory) { wrapperContained.registerCubeWithCustomTextures(block.wrapperContained,otherTextureSource.wrapperContained,texturesFactory); }
// public static void registerCubeWithCustomTextures(yarnwrap.block.Block block,yarnwrap.block.Block otherTextureSource,java.util.function.BiFunction texturesFactory, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCubeWithCustomTextures(block.wrapperContained,otherTextureSource.wrapperContained,texturesFactory); }
public void registerCrop(yarnwrap.block.Block crop,yarnwrap.state.property.Property ageProperty,int ageTextureIndices) { wrapperContained.registerCrop(crop.wrapperContained,ageProperty.wrapperContained,ageTextureIndices); }
// public static void registerCrop(yarnwrap.block.Block crop,yarnwrap.state.property.Property ageProperty,int ageTextureIndices, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCrop(crop.wrapperContained,ageProperty.wrapperContained,ageTextureIndices); }
// public void registerTintableCross(yarnwrap.block.Block block,Object crossType) { wrapperContained.registerTintableCross(block.wrapperContained,crossType); }
// public static void registerTintableCross(yarnwrap.block.Block block,Object crossType, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTintableCross(block.wrapperContained,crossType); }
// public void registerTintableCross(yarnwrap.block.Block block,Object tintType,yarnwrap.client.data.TextureMap texture) { wrapperContained.registerTintableCross(block.wrapperContained,tintType,texture.wrapperContained); }
// public static void registerTintableCross(yarnwrap.block.Block block,Object tintType,yarnwrap.client.data.TextureMap texture, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTintableCross(block.wrapperContained,tintType,texture.wrapperContained); }
public void registerNorthDefaultHorizontalRotatable(yarnwrap.block.Block block,yarnwrap.client.data.TextureMap texture) { wrapperContained.registerNorthDefaultHorizontalRotatable(block.wrapperContained,texture.wrapperContained); }
// public static void registerNorthDefaultHorizontalRotatable(yarnwrap.block.Block block,yarnwrap.client.data.TextureMap texture, ) { net.minecraft.client.data.BlockStateModelGenerator.registerNorthDefaultHorizontalRotatable(block.wrapperContained,texture.wrapperContained); }
// public void registerAxisRotated(yarnwrap.block.Block block,Object modelFactory) { wrapperContained.registerAxisRotated(block.wrapperContained,modelFactory); }
// public static void registerAxisRotated(yarnwrap.block.Block block,Object modelFactory, ) { net.minecraft.client.data.BlockStateModelGenerator.registerAxisRotated(block.wrapperContained,modelFactory); }
// // public void registerAxisRotated(yarnwrap.block.Block block,Object verticalModelFactory,Object horizontalModelFactory) { wrapperContained.registerAxisRotated(block.wrapperContained,verticalModelFactory,horizontalModelFactory); }
// public static void registerAxisRotated(yarnwrap.block.Block block,Object verticalModelFactory,Object horizontalModelFactory, ) { net.minecraft.client.data.BlockStateModelGenerator.registerAxisRotated(block.wrapperContained,verticalModelFactory,horizontalModelFactory); }
public void registerItemModel(yarnwrap.block.Block block,java.lang.String textureSuffix) { wrapperContained.registerItemModel(block.wrapperContained,textureSuffix); }
// public static void registerItemModel(yarnwrap.block.Block block,java.lang.String textureSuffix, ) { net.minecraft.client.data.BlockStateModelGenerator.registerItemModel(block.wrapperContained,textureSuffix); }
public yarnwrap.util.Identifier createSubModel(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.client.data.Model model,java.util.function.Function texturesFactory) { return new yarnwrap.util.Identifier(wrapperContained.createSubModel(block.wrapperContained,suffix,model.wrapperContained,texturesFactory)); }
// public static yarnwrap.util.Identifier createSubModel(yarnwrap.block.Block block,java.lang.String suffix,yarnwrap.client.data.Model model,java.util.function.Function texturesFactory, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.createSubModel(block.wrapperContained,suffix,model.wrapperContained,texturesFactory)); }
public void registerBeehive(yarnwrap.block.Block beehive,java.util.function.Function texturesFactory) { wrapperContained.registerBeehive(beehive.wrapperContained,texturesFactory); }
// public static void registerBeehive(yarnwrap.block.Block beehive,java.util.function.Function texturesFactory, ) { net.minecraft.client.data.BlockStateModelGenerator.registerBeehive(beehive.wrapperContained,texturesFactory); }
// public void registerTopSoil(yarnwrap.block.Block topSoil,yarnwrap.client.render.model.json.WeightedVariant snowyVariant) { wrapperContained.registerTopSoil(topSoil.wrapperContained,snowyVariant.wrapperContained); }
// public static void registerTopSoil(yarnwrap.block.Block topSoil,yarnwrap.client.render.model.json.WeightedVariant snowyVariant, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTopSoil(topSoil.wrapperContained,snowyVariant.wrapperContained); }
// public void registerPiston(yarnwrap.block.Block piston,yarnwrap.client.render.model.json.WeightedVariant textures) { wrapperContained.registerPiston(piston.wrapperContained,textures.wrapperContained); }
// public static void registerPiston(yarnwrap.block.Block piston,yarnwrap.client.render.model.json.WeightedVariant textures, ) { net.minecraft.client.data.BlockStateModelGenerator.registerPiston(piston.wrapperContained,textures.wrapperContained); }
// public yarnwrap.client.data.BlockStateVariantMap createBooleanModelMap(yarnwrap.state.property.BooleanProperty property,yarnwrap.client.render.model.json.WeightedVariant trueModel,yarnwrap.client.render.model.json.WeightedVariant falseModel) { return new yarnwrap.client.data.BlockStateVariantMap(wrapperContained.createBooleanModelMap(property.wrapperContained,trueModel.wrapperContained,falseModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockStateVariantMap createBooleanModelMap(yarnwrap.state.property.BooleanProperty property,yarnwrap.client.render.model.json.WeightedVariant trueModel,yarnwrap.client.render.model.json.WeightedVariant falseModel, ) { return new yarnwrap.client.data.BlockStateVariantMap(net.minecraft.client.data.BlockStateModelGenerator.createBooleanModelMap(property.wrapperContained,trueModel.wrapperContained,falseModel.wrapperContained)); }
// public yarnwrap.client.data.BlockStateVariantMap createValueFencedModelMap(yarnwrap.state.property.Property property,java.lang.Comparable fence,yarnwrap.client.render.model.json.WeightedVariant aboveFenceModel,yarnwrap.client.render.model.json.WeightedVariant belowFenceModel) { return new yarnwrap.client.data.BlockStateVariantMap(wrapperContained.createValueFencedModelMap(property.wrapperContained,fence,aboveFenceModel.wrapperContained,belowFenceModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockStateVariantMap createValueFencedModelMap(yarnwrap.state.property.Property property,java.lang.Comparable fence,yarnwrap.client.render.model.json.WeightedVariant aboveFenceModel,yarnwrap.client.render.model.json.WeightedVariant belowFenceModel, ) { return new yarnwrap.client.data.BlockStateVariantMap(net.minecraft.client.data.BlockStateModelGenerator.createValueFencedModelMap(property.wrapperContained,fence,aboveFenceModel.wrapperContained,belowFenceModel.wrapperContained)); }
// public void registerRandomHorizontalRotations(Object modelFactory,net.minecraft.block.Block[] blocks) { wrapperContained.registerRandomHorizontalRotations(modelFactory,blocks); }
// public static void registerRandomHorizontalRotations(Object modelFactory,net.minecraft.block.Block[] blocks, ) { net.minecraft.client.data.BlockStateModelGenerator.registerRandomHorizontalRotations(modelFactory,blocks); }
public yarnwrap.client.render.model.json.ModelVariant getTurtleEggModel(int eggs,int cracks) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.getTurtleEggModel(eggs,cracks)); }
// public static yarnwrap.client.render.model.json.ModelVariant getTurtleEggModel(int eggs,int cracks, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.data.BlockStateModelGenerator.getTurtleEggModel(eggs,cracks)); }
// public void registerStonecutter() { wrapperContained.registerStonecutter(); }
// public static void registerStonecutter() { net.minecraft.client.data.BlockStateModelGenerator.registerStonecutter(); }
// public void registerStructureBlock() { wrapperContained.registerStructureBlock(); }
// public static void registerStructureBlock() { net.minecraft.client.data.BlockStateModelGenerator.registerStructureBlock(); }
// public void registerSweetBerryBush() { wrapperContained.registerSweetBerryBush(); }
// public static void registerSweetBerryBush() { net.minecraft.client.data.BlockStateModelGenerator.registerSweetBerryBush(); }
// public void registerTripwire() { wrapperContained.registerTripwire(); }
// public static void registerTripwire() { net.minecraft.client.data.BlockStateModelGenerator.registerTripwire(); }
// public void registerTripwireHook() { wrapperContained.registerTripwireHook(); }
// public static void registerTripwireHook() { net.minecraft.client.data.BlockStateModelGenerator.registerTripwireHook(); }
// public void registerTurtleEgg() { wrapperContained.registerTurtleEgg(); }
// public static void registerTurtleEgg() { net.minecraft.client.data.BlockStateModelGenerator.registerTurtleEgg(); }
// public void registerMagmaBlock() { wrapperContained.registerMagmaBlock(); }
// public static void registerMagmaBlock() { net.minecraft.client.data.BlockStateModelGenerator.registerMagmaBlock(); }
// public void registerInfestedStone() { wrapperContained.registerInfestedStone(); }
// public static void registerInfestedStone() { net.minecraft.client.data.BlockStateModelGenerator.registerInfestedStone(); }
public void registerItemModel(yarnwrap.block.Block block) { wrapperContained.registerItemModel(block.wrapperContained); }
// public static void registerItemModel(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerItemModel(block.wrapperContained); }
public void registerCoralFan(yarnwrap.block.Block coralFanBlock,yarnwrap.block.Block coralWallFanBlock) { wrapperContained.registerCoralFan(coralFanBlock.wrapperContained,coralWallFanBlock.wrapperContained); }
// public static void registerCoralFan(yarnwrap.block.Block coralFanBlock,yarnwrap.block.Block coralWallFanBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCoralFan(coralFanBlock.wrapperContained,coralWallFanBlock.wrapperContained); }
// public void registerPlantPart(yarnwrap.block.Block plant,yarnwrap.block.Block plantStem,Object tintType) { wrapperContained.registerPlantPart(plant.wrapperContained,plantStem.wrapperContained,tintType); }
// public static void registerPlantPart(yarnwrap.block.Block plant,yarnwrap.block.Block plantStem,Object tintType, ) { net.minecraft.client.data.BlockStateModelGenerator.registerPlantPart(plant.wrapperContained,plantStem.wrapperContained,tintType); }
// public void registerTintableCrossBlockState(yarnwrap.block.Block block,Object tintType) { wrapperContained.registerTintableCrossBlockState(block.wrapperContained,tintType); }
// public static void registerTintableCrossBlockState(yarnwrap.block.Block block,Object tintType, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTintableCrossBlockState(block.wrapperContained,tintType); }
// public void registerTintableCrossBlockState(yarnwrap.block.Block block,Object tintType,yarnwrap.client.data.TextureMap crossTexture) { wrapperContained.registerTintableCrossBlockState(block.wrapperContained,tintType,crossTexture.wrapperContained); }
// public static void registerTintableCrossBlockState(yarnwrap.block.Block block,Object tintType,yarnwrap.client.data.TextureMap crossTexture, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTintableCrossBlockState(block.wrapperContained,tintType,crossTexture.wrapperContained); }
// public void registerNorthDefaultHorizontalRotated(yarnwrap.block.Block block,Object modelFactory) { wrapperContained.registerNorthDefaultHorizontalRotated(block.wrapperContained,modelFactory); }
// public static void registerNorthDefaultHorizontalRotated(yarnwrap.block.Block block,Object modelFactory, ) { net.minecraft.client.data.BlockStateModelGenerator.registerNorthDefaultHorizontalRotated(block.wrapperContained,modelFactory); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createDoorBlockState(yarnwrap.block.Block doorBlock,yarnwrap.client.render.model.json.WeightedVariant bottomLeftClosedModel,yarnwrap.client.render.model.json.WeightedVariant bottomLeftOpenModel,yarnwrap.client.render.model.json.WeightedVariant bottomRightClosedModel,yarnwrap.client.render.model.json.WeightedVariant bottomRightOpenModel,yarnwrap.client.render.model.json.WeightedVariant topLeftClosedModel,yarnwrap.client.render.model.json.WeightedVariant topLeftOpenModel,yarnwrap.client.render.model.json.WeightedVariant topRightClosedModel,yarnwrap.client.render.model.json.WeightedVariant topRightOpenModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createDoorBlockState(doorBlock.wrapperContained,bottomLeftClosedModel.wrapperContained,bottomLeftOpenModel.wrapperContained,bottomRightClosedModel.wrapperContained,bottomRightOpenModel.wrapperContained,topLeftClosedModel.wrapperContained,topLeftOpenModel.wrapperContained,topRightClosedModel.wrapperContained,topRightOpenModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createDoorBlockState(yarnwrap.block.Block doorBlock,yarnwrap.client.render.model.json.WeightedVariant bottomLeftClosedModel,yarnwrap.client.render.model.json.WeightedVariant bottomLeftOpenModel,yarnwrap.client.render.model.json.WeightedVariant bottomRightClosedModel,yarnwrap.client.render.model.json.WeightedVariant bottomRightOpenModel,yarnwrap.client.render.model.json.WeightedVariant topLeftClosedModel,yarnwrap.client.render.model.json.WeightedVariant topLeftOpenModel,yarnwrap.client.render.model.json.WeightedVariant topRightClosedModel,yarnwrap.client.render.model.json.WeightedVariant topRightOpenModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createDoorBlockState(doorBlock.wrapperContained,bottomLeftClosedModel.wrapperContained,bottomLeftOpenModel.wrapperContained,bottomRightClosedModel.wrapperContained,bottomRightOpenModel.wrapperContained,topLeftClosedModel.wrapperContained,topLeftOpenModel.wrapperContained,topRightClosedModel.wrapperContained,topRightOpenModel.wrapperContained)); }
// public void registerSouthDefaultHorizontalFacing(Object modelFactory,net.minecraft.block.Block[] blocks) { wrapperContained.registerSouthDefaultHorizontalFacing(modelFactory,blocks); }
// public static void registerSouthDefaultHorizontalFacing(Object modelFactory,net.minecraft.block.Block[] blocks, ) { net.minecraft.client.data.BlockStateModelGenerator.registerSouthDefaultHorizontalFacing(modelFactory,blocks); }
public void registerMirrorable(yarnwrap.block.Block block) { wrapperContained.registerMirrorable(block.wrapperContained); }
// public static void registerMirrorable(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerMirrorable(block.wrapperContained); }
public void registerGourd(yarnwrap.block.Block stemBlock,yarnwrap.block.Block attachedStemBlock) { wrapperContained.registerGourd(stemBlock.wrapperContained,attachedStemBlock.wrapperContained); }
// public static void registerGourd(yarnwrap.block.Block stemBlock,yarnwrap.block.Block attachedStemBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerGourd(stemBlock.wrapperContained,attachedStemBlock.wrapperContained); }
// public void registerDoubleBlock(yarnwrap.block.Block doubleBlock,Object tintType) { wrapperContained.registerDoubleBlock(doubleBlock.wrapperContained,tintType); }
// public static void registerDoubleBlock(yarnwrap.block.Block doubleBlock,Object tintType, ) { net.minecraft.client.data.BlockStateModelGenerator.registerDoubleBlock(doubleBlock.wrapperContained,tintType); }
// public void registerSingleton(yarnwrap.block.Block block,Object modelFactory) { wrapperContained.registerSingleton(block.wrapperContained,modelFactory); }
// public static void registerSingleton(yarnwrap.block.Block block,Object modelFactory, ) { net.minecraft.client.data.BlockStateModelGenerator.registerSingleton(block.wrapperContained,modelFactory); }
public void registerParentedItemModel(yarnwrap.block.Block block,yarnwrap.util.Identifier parentModelId) { wrapperContained.registerParentedItemModel(block.wrapperContained,parentModelId.wrapperContained); }
// public static void registerParentedItemModel(yarnwrap.block.Block block,yarnwrap.util.Identifier parentModelId, ) { net.minecraft.client.data.BlockStateModelGenerator.registerParentedItemModel(block.wrapperContained,parentModelId.wrapperContained); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createFenceGateBlockState(yarnwrap.block.Block fenceGateBlock,yarnwrap.client.render.model.json.WeightedVariant openModel,yarnwrap.client.render.model.json.WeightedVariant closedModel,yarnwrap.client.render.model.json.WeightedVariant openWallModel,yarnwrap.client.render.model.json.WeightedVariant closedWallModel,boolean uvlock) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createFenceGateBlockState(fenceGateBlock.wrapperContained,openModel.wrapperContained,closedModel.wrapperContained,openWallModel.wrapperContained,closedWallModel.wrapperContained,uvlock)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createFenceGateBlockState(yarnwrap.block.Block fenceGateBlock,yarnwrap.client.render.model.json.WeightedVariant openModel,yarnwrap.client.render.model.json.WeightedVariant closedModel,yarnwrap.client.render.model.json.WeightedVariant openWallModel,yarnwrap.client.render.model.json.WeightedVariant closedWallModel,boolean uvlock, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createFenceGateBlockState(fenceGateBlock.wrapperContained,openModel.wrapperContained,closedModel.wrapperContained,openWallModel.wrapperContained,closedWallModel.wrapperContained,uvlock)); }
public void registerRotatable(yarnwrap.block.Block block) { wrapperContained.registerRotatable(block.wrapperContained); }
// public static void registerRotatable(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerRotatable(block.wrapperContained); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createWallBlockState(yarnwrap.block.Block wallBlock,yarnwrap.client.render.model.json.WeightedVariant postModel,yarnwrap.client.render.model.json.WeightedVariant lowSideModel,yarnwrap.client.render.model.json.WeightedVariant tallSideModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createWallBlockState(wallBlock.wrapperContained,postModel.wrapperContained,lowSideModel.wrapperContained,tallSideModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createWallBlockState(yarnwrap.block.Block wallBlock,yarnwrap.client.render.model.json.WeightedVariant postModel,yarnwrap.client.render.model.json.WeightedVariant lowSideModel,yarnwrap.client.render.model.json.WeightedVariant tallSideModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createWallBlockState(wallBlock.wrapperContained,postModel.wrapperContained,lowSideModel.wrapperContained,tallSideModel.wrapperContained)); }
public void registerSimpleCubeAll(yarnwrap.block.Block block) { wrapperContained.registerSimpleCubeAll(block.wrapperContained); }
// public static void registerSimpleCubeAll(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerSimpleCubeAll(block.wrapperContained); }
public void registerWoolAndCarpet(yarnwrap.block.Block wool,yarnwrap.block.Block carpet) { wrapperContained.registerWoolAndCarpet(wool.wrapperContained,carpet.wrapperContained); }
// public static void registerWoolAndCarpet(yarnwrap.block.Block wool,yarnwrap.block.Block carpet, ) { net.minecraft.client.data.BlockStateModelGenerator.registerWoolAndCarpet(wool.wrapperContained,carpet.wrapperContained); }
// public yarnwrap.client.data.VariantsBlockModelDefinitionCreator createSingletonBlockState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant model) { return new yarnwrap.client.data.VariantsBlockModelDefinitionCreator(wrapperContained.createSingletonBlockState(block.wrapperContained,model.wrapperContained)); }
// public static yarnwrap.client.data.VariantsBlockModelDefinitionCreator createSingletonBlockState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant model, ) { return new yarnwrap.client.data.VariantsBlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createSingletonBlockState(block.wrapperContained,model.wrapperContained)); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createStairsBlockState(yarnwrap.block.Block stairsBlock,yarnwrap.client.render.model.json.WeightedVariant innerModel,yarnwrap.client.render.model.json.WeightedVariant straightModel,yarnwrap.client.render.model.json.WeightedVariant outerModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createStairsBlockState(stairsBlock.wrapperContained,innerModel.wrapperContained,straightModel.wrapperContained,outerModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createStairsBlockState(yarnwrap.block.Block stairsBlock,yarnwrap.client.render.model.json.WeightedVariant innerModel,yarnwrap.client.render.model.json.WeightedVariant straightModel,yarnwrap.client.render.model.json.WeightedVariant outerModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createStairsBlockState(stairsBlock.wrapperContained,innerModel.wrapperContained,straightModel.wrapperContained,outerModel.wrapperContained)); }
// public yarnwrap.client.data.BlockStateVariantMap createAxisRotatedVariantMap() { return new yarnwrap.client.data.BlockStateVariantMap(wrapperContained.createAxisRotatedVariantMap()); }
public static yarnwrap.client.data.BlockStateVariantMap createAxisRotatedVariantMap() { return new yarnwrap.client.data.BlockStateVariantMap(net.minecraft.client.data.BlockStateModelGenerator.createAxisRotatedVariantMap()); }
public Object registerCubeAllModelTexturePool(yarnwrap.block.Block block) { return wrapperContained.registerCubeAllModelTexturePool(block.wrapperContained); }
// public static Object registerCubeAllModelTexturePool(yarnwrap.block.Block block, ) { return net.minecraft.client.data.BlockStateModelGenerator.registerCubeAllModelTexturePool(block.wrapperContained); }
public void registerGlassAndPane(yarnwrap.block.Block glassBlock,yarnwrap.block.Block glassPane) { wrapperContained.registerGlassAndPane(glassBlock.wrapperContained,glassPane.wrapperContained); }
// public static void registerGlassAndPane(yarnwrap.block.Block glassBlock,yarnwrap.block.Block glassPane, ) { net.minecraft.client.data.BlockStateModelGenerator.registerGlassAndPane(glassBlock.wrapperContained,glassPane.wrapperContained); }
// public void registerCooker(yarnwrap.block.Block cooker,Object modelFactory) { wrapperContained.registerCooker(cooker.wrapperContained,modelFactory); }
// public static void registerCooker(yarnwrap.block.Block cooker,Object modelFactory, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCooker(cooker.wrapperContained,modelFactory); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createAxisRotatedBlockState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant model) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createAxisRotatedBlockState(block.wrapperContained,model.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createAxisRotatedBlockState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant model, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createAxisRotatedBlockState(block.wrapperContained,model.wrapperContained)); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createButtonBlockState(yarnwrap.block.Block buttonBlock,yarnwrap.client.render.model.json.WeightedVariant unpressedModel,yarnwrap.client.render.model.json.WeightedVariant pressedModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createButtonBlockState(buttonBlock.wrapperContained,unpressedModel.wrapperContained,pressedModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createButtonBlockState(yarnwrap.block.Block buttonBlock,yarnwrap.client.render.model.json.WeightedVariant unpressedModel,yarnwrap.client.render.model.json.WeightedVariant pressedModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createButtonBlockState(buttonBlock.wrapperContained,unpressedModel.wrapperContained,pressedModel.wrapperContained)); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createOrientableTrapdoorBlockState(yarnwrap.block.Block trapdoorBlock,yarnwrap.client.render.model.json.WeightedVariant topModel,yarnwrap.client.render.model.json.WeightedVariant bottomModel,yarnwrap.client.render.model.json.WeightedVariant openModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createOrientableTrapdoorBlockState(trapdoorBlock.wrapperContained,topModel.wrapperContained,bottomModel.wrapperContained,openModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createOrientableTrapdoorBlockState(yarnwrap.block.Block trapdoorBlock,yarnwrap.client.render.model.json.WeightedVariant topModel,yarnwrap.client.render.model.json.WeightedVariant bottomModel,yarnwrap.client.render.model.json.WeightedVariant openModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createOrientableTrapdoorBlockState(trapdoorBlock.wrapperContained,topModel.wrapperContained,bottomModel.wrapperContained,openModel.wrapperContained)); }
// public void registerSunflower() { wrapperContained.registerSunflower(); }
// public static void registerSunflower() { net.minecraft.client.data.BlockStateModelGenerator.registerSunflower(); }
public void registerDoor(yarnwrap.block.Block doorBlock) { wrapperContained.registerDoor(doorBlock.wrapperContained); }
// public static void registerDoor(yarnwrap.block.Block doorBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerDoor(doorBlock.wrapperContained); }
public void registerBuiltinWithParticle(yarnwrap.block.Block block,yarnwrap.util.Identifier particleSource) { wrapperContained.registerBuiltinWithParticle(block.wrapperContained,particleSource.wrapperContained); }
// public static void registerBuiltinWithParticle(yarnwrap.block.Block block,yarnwrap.util.Identifier particleSource, ) { net.minecraft.client.data.BlockStateModelGenerator.registerBuiltinWithParticle(block.wrapperContained,particleSource.wrapperContained); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createFenceBlockState(yarnwrap.block.Block fenceBlock,yarnwrap.client.render.model.json.WeightedVariant postModel,yarnwrap.client.render.model.json.WeightedVariant sideModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createFenceBlockState(fenceBlock.wrapperContained,postModel.wrapperContained,sideModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createFenceBlockState(yarnwrap.block.Block fenceBlock,yarnwrap.client.render.model.json.WeightedVariant postModel,yarnwrap.client.render.model.json.WeightedVariant sideModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createFenceBlockState(fenceBlock.wrapperContained,postModel.wrapperContained,sideModel.wrapperContained)); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createTrapdoorBlockState(yarnwrap.block.Block trapdoorBlock,yarnwrap.client.render.model.json.WeightedVariant topModel,yarnwrap.client.render.model.json.WeightedVariant bottomModel,yarnwrap.client.render.model.json.WeightedVariant openModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createTrapdoorBlockState(trapdoorBlock.wrapperContained,topModel.wrapperContained,bottomModel.wrapperContained,openModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createTrapdoorBlockState(yarnwrap.block.Block trapdoorBlock,yarnwrap.client.render.model.json.WeightedVariant topModel,yarnwrap.client.render.model.json.WeightedVariant bottomModel,yarnwrap.client.render.model.json.WeightedVariant openModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createTrapdoorBlockState(trapdoorBlock.wrapperContained,topModel.wrapperContained,bottomModel.wrapperContained,openModel.wrapperContained)); }
// public void registerTallSeagrass() { wrapperContained.registerTallSeagrass(); }
// public static void registerTallSeagrass() { net.minecraft.client.data.BlockStateModelGenerator.registerTallSeagrass(); }
public void registerOrientableTrapdoor(yarnwrap.block.Block trapdoorBlock) { wrapperContained.registerOrientableTrapdoor(trapdoorBlock.wrapperContained); }
// public static void registerOrientableTrapdoor(yarnwrap.block.Block trapdoorBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerOrientableTrapdoor(trapdoorBlock.wrapperContained); }
public void registerWeightedPressurePlate(yarnwrap.block.Block weightedPressurePlate,yarnwrap.block.Block textureSource) { wrapperContained.registerWeightedPressurePlate(weightedPressurePlate.wrapperContained,textureSource.wrapperContained); }
// public static void registerWeightedPressurePlate(yarnwrap.block.Block weightedPressurePlate,yarnwrap.block.Block textureSource, ) { net.minecraft.client.data.BlockStateModelGenerator.registerWeightedPressurePlate(weightedPressurePlate.wrapperContained,textureSource.wrapperContained); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createAxisRotatedBlockState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant verticalModel,yarnwrap.client.render.model.json.WeightedVariant horizontalModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createAxisRotatedBlockState(block.wrapperContained,verticalModel.wrapperContained,horizontalModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createAxisRotatedBlockState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant verticalModel,yarnwrap.client.render.model.json.WeightedVariant horizontalModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createAxisRotatedBlockState(block.wrapperContained,verticalModel.wrapperContained,horizontalModel.wrapperContained)); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createSlabBlockState(yarnwrap.block.Block slabBlock,yarnwrap.client.render.model.json.WeightedVariant bottomModel,yarnwrap.client.render.model.json.WeightedVariant topModel,yarnwrap.client.render.model.json.WeightedVariant doubleModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createSlabBlockState(slabBlock.wrapperContained,bottomModel.wrapperContained,topModel.wrapperContained,doubleModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createSlabBlockState(yarnwrap.block.Block slabBlock,yarnwrap.client.render.model.json.WeightedVariant bottomModel,yarnwrap.client.render.model.json.WeightedVariant topModel,yarnwrap.client.render.model.json.WeightedVariant doubleModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createSlabBlockState(slabBlock.wrapperContained,bottomModel.wrapperContained,topModel.wrapperContained,doubleModel.wrapperContained)); }
// public void registerBamboo() { wrapperContained.registerBamboo(); }
// public static void registerBamboo() { net.minecraft.client.data.BlockStateModelGenerator.registerBamboo(); }
public void registerTrapdoor(yarnwrap.block.Block trapdoorBlock) { wrapperContained.registerTrapdoor(trapdoorBlock.wrapperContained); }
// public static void registerTrapdoor(yarnwrap.block.Block trapdoorBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTrapdoor(trapdoorBlock.wrapperContained); }
public void registerParented(yarnwrap.block.Block modelSource,yarnwrap.block.Block child) { wrapperContained.registerParented(modelSource.wrapperContained,child.wrapperContained); }
// public static void registerParented(yarnwrap.block.Block modelSource,yarnwrap.block.Block child, ) { net.minecraft.client.data.BlockStateModelGenerator.registerParented(modelSource.wrapperContained,child.wrapperContained); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createPressurePlateBlockState(yarnwrap.block.Block pressurePlateBlock,yarnwrap.client.render.model.json.WeightedVariant upModel,yarnwrap.client.render.model.json.WeightedVariant downModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createPressurePlateBlockState(pressurePlateBlock.wrapperContained,upModel.wrapperContained,downModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createPressurePlateBlockState(yarnwrap.block.Block pressurePlateBlock,yarnwrap.client.render.model.json.WeightedVariant upModel,yarnwrap.client.render.model.json.WeightedVariant downModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createPressurePlateBlockState(pressurePlateBlock.wrapperContained,upModel.wrapperContained,downModel.wrapperContained)); }
public Object createLogTexturePool(yarnwrap.block.Block logBlock) { return wrapperContained.createLogTexturePool(logBlock.wrapperContained); }
// public static Object createLogTexturePool(yarnwrap.block.Block logBlock, ) { return net.minecraft.client.data.BlockStateModelGenerator.createLogTexturePool(logBlock.wrapperContained); }
public void registerTorch(yarnwrap.block.Block torch,yarnwrap.block.Block wallTorch) { wrapperContained.registerTorch(torch.wrapperContained,wallTorch.wrapperContained); }
// public static void registerTorch(yarnwrap.block.Block torch,yarnwrap.block.Block wallTorch, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTorch(torch.wrapperContained,wallTorch.wrapperContained); }
public void registerDoubleBlock(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant upperModel,yarnwrap.client.render.model.json.WeightedVariant lowerModel) { wrapperContained.registerDoubleBlock(block.wrapperContained,upperModel.wrapperContained,lowerModel.wrapperContained); }
// public static void registerDoubleBlock(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant upperModel,yarnwrap.client.render.model.json.WeightedVariant lowerModel, ) { net.minecraft.client.data.BlockStateModelGenerator.registerDoubleBlock(block.wrapperContained,upperModel.wrapperContained,lowerModel.wrapperContained); }
// public void registerBarrel() { wrapperContained.registerBarrel(); }
// public static void registerBarrel() { net.minecraft.client.data.BlockStateModelGenerator.registerBarrel(); }
public void registerSimpleState(yarnwrap.block.Block block) { wrapperContained.registerSimpleState(block.wrapperContained); }
// public static void registerSimpleState(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerSimpleState(block.wrapperContained); }
// public void registerBell() { wrapperContained.registerBell(); }
// public static void registerBell() { net.minecraft.client.data.BlockStateModelGenerator.registerBell(); }
public void registerTurnableRail(yarnwrap.block.Block rail) { wrapperContained.registerTurnableRail(rail.wrapperContained); }
// public static void registerTurnableRail(yarnwrap.block.Block rail, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTurnableRail(rail.wrapperContained); }
public void registerRoots(yarnwrap.block.Block root,yarnwrap.block.Block pottedRoot) { wrapperContained.registerRoots(root.wrapperContained,pottedRoot.wrapperContained); }
// public static void registerRoots(yarnwrap.block.Block root,yarnwrap.block.Block pottedRoot, ) { net.minecraft.client.data.BlockStateModelGenerator.registerRoots(root.wrapperContained,pottedRoot.wrapperContained); }
// public void registerGrindstone() { wrapperContained.registerGrindstone(); }
// public static void registerGrindstone() { net.minecraft.client.data.BlockStateModelGenerator.registerGrindstone(); }
public void registerStraightRail(yarnwrap.block.Block rail) { wrapperContained.registerStraightRail(rail.wrapperContained); }
// public static void registerStraightRail(yarnwrap.block.Block rail, ) { net.minecraft.client.data.BlockStateModelGenerator.registerStraightRail(rail.wrapperContained); }
public void registerCommandBlock(yarnwrap.block.Block commandBlock) { wrapperContained.registerCommandBlock(commandBlock.wrapperContained); }
// public static void registerCommandBlock(yarnwrap.block.Block commandBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCommandBlock(commandBlock.wrapperContained); }
// public void registerBookshelf() { wrapperContained.registerBookshelf(); }
// public static void registerBookshelf() { net.minecraft.client.data.BlockStateModelGenerator.registerBookshelf(); }
public void registerAnvil(yarnwrap.block.Block anvil) { wrapperContained.registerAnvil(anvil.wrapperContained); }
// public static void registerAnvil(yarnwrap.block.Block anvil, ) { net.minecraft.client.data.BlockStateModelGenerator.registerAnvil(anvil.wrapperContained); }
// public void registerRedstone() { wrapperContained.registerRedstone(); }
// public static void registerRedstone() { net.minecraft.client.data.BlockStateModelGenerator.registerRedstone(); }
public void registerMushroomBlock(yarnwrap.block.Block mushroomBlock) { wrapperContained.registerMushroomBlock(mushroomBlock.wrapperContained); }
// public static void registerMushroomBlock(yarnwrap.block.Block mushroomBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerMushroomBlock(mushroomBlock.wrapperContained); }
// public void registerComparator() { wrapperContained.registerComparator(); }
// public static void registerComparator() { net.minecraft.client.data.BlockStateModelGenerator.registerComparator(); }
public void registerDispenserLikeOrientable(yarnwrap.block.Block block) { wrapperContained.registerDispenserLikeOrientable(block.wrapperContained); }
// public static void registerDispenserLikeOrientable(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerDispenserLikeOrientable(block.wrapperContained); }
// public void registerSmoothStone() { wrapperContained.registerSmoothStone(); }
// public static void registerSmoothStone() { net.minecraft.client.data.BlockStateModelGenerator.registerSmoothStone(); }
public void registerNetherrackBottomCustomTop(yarnwrap.block.Block block) { wrapperContained.registerNetherrackBottomCustomTop(block.wrapperContained); }
// public static void registerNetherrackBottomCustomTop(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerNetherrackBottomCustomTop(block.wrapperContained); }
// public void registerBrewingStand() { wrapperContained.registerBrewingStand(); }
// public static void registerBrewingStand() { net.minecraft.client.data.BlockStateModelGenerator.registerBrewingStand(); }
public yarnwrap.client.render.model.json.WeightedVariant getFireFloorModels(yarnwrap.block.Block texture) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.getFireFloorModels(texture.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant getFireFloorModels(yarnwrap.block.Block texture, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.getFireFloorModels(texture.wrapperContained)); }
// public void registerCake() { wrapperContained.registerCake(); }
// public static void registerCake() { net.minecraft.client.data.BlockStateModelGenerator.registerCake(); }
public yarnwrap.client.render.model.json.WeightedVariant getFireSideModels(yarnwrap.block.Block texture) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.getFireSideModels(texture.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant getFireSideModels(yarnwrap.block.Block texture, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.getFireSideModels(texture.wrapperContained)); }
// public void registerCartographyTable() { wrapperContained.registerCartographyTable(); }
// public static void registerCartographyTable() { net.minecraft.client.data.BlockStateModelGenerator.registerCartographyTable(); }
public yarnwrap.client.render.model.json.WeightedVariant getFireUpModels(yarnwrap.block.Block texture) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.getFireUpModels(texture.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant getFireUpModels(yarnwrap.block.Block texture, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.getFireUpModels(texture.wrapperContained)); }
// public void registerSmithingTable() { wrapperContained.registerSmithingTable(); }
// public static void registerSmithingTable() { net.minecraft.client.data.BlockStateModelGenerator.registerSmithingTable(); }
public void registerLantern(yarnwrap.block.Block lantern) { wrapperContained.registerLantern(lantern.wrapperContained); }
// public static void registerLantern(yarnwrap.block.Block lantern, ) { net.minecraft.client.data.BlockStateModelGenerator.registerLantern(lantern.wrapperContained); }
// public void registerPumpkins() { wrapperContained.registerPumpkins(); }
// public static void registerPumpkins() { net.minecraft.client.data.BlockStateModelGenerator.registerPumpkins(); }
public void registerNorthDefaultHorizontalRotation(yarnwrap.block.Block block) { wrapperContained.registerNorthDefaultHorizontalRotation(block.wrapperContained); }
// public static void registerNorthDefaultHorizontalRotation(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerNorthDefaultHorizontalRotation(block.wrapperContained); }
// public void registerCauldrons() { wrapperContained.registerCauldrons(); }
// public static void registerCauldrons() { net.minecraft.client.data.BlockStateModelGenerator.registerCauldrons(); }
public void registerShulkerBox(yarnwrap.block.Block shulkerBox,yarnwrap.util.DyeColor color) { wrapperContained.registerShulkerBox(shulkerBox.wrapperContained,color.wrapperContained); }
// public static void registerShulkerBox(yarnwrap.block.Block shulkerBox,yarnwrap.util.DyeColor color, ) { net.minecraft.client.data.BlockStateModelGenerator.registerShulkerBox(shulkerBox.wrapperContained,color.wrapperContained); }
// public void registerChorusFlower() { wrapperContained.registerChorusFlower(); }
// public static void registerChorusFlower() { net.minecraft.client.data.BlockStateModelGenerator.registerChorusFlower(); }
// public void registerEndPortalFrame() { wrapperContained.registerEndPortalFrame(); }
// public static void registerEndPortalFrame() { net.minecraft.client.data.BlockStateModelGenerator.registerEndPortalFrame(); }
// public void registerRespawnAnchor() { wrapperContained.registerRespawnAnchor(); }
// public static void registerRespawnAnchor() { net.minecraft.client.data.BlockStateModelGenerator.registerRespawnAnchor(); }
// public yarnwrap.client.render.model.json.ModelVariantOperator addJigsawOrientationToVariant(yarnwrap.block.enums.Orientation orientation) { return new yarnwrap.client.render.model.json.ModelVariantOperator(wrapperContained.addJigsawOrientationToVariant(orientation.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelVariantOperator addJigsawOrientationToVariant(yarnwrap.block.enums.Orientation orientation, ) { return new yarnwrap.client.render.model.json.ModelVariantOperator(net.minecraft.client.data.BlockStateModelGenerator.addJigsawOrientationToVariant(orientation.wrapperContained)); }
// public void registerJigsaw() { wrapperContained.registerJigsaw(); }
// public static void registerJigsaw() { net.minecraft.client.data.BlockStateModelGenerator.registerJigsaw(); }
public void registerCampfire(net.minecraft.block.Block[] blocks) { wrapperContained.registerCampfire(blocks); }
// public static void registerCampfire(net.minecraft.block.Block[] blocks, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCampfire(blocks); }
public void registerAxisRotated(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant model) { wrapperContained.registerAxisRotated(block.wrapperContained,model.wrapperContained); }
// public static void registerAxisRotated(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant model, ) { net.minecraft.client.data.BlockStateModelGenerator.registerAxisRotated(block.wrapperContained,model.wrapperContained); }
public void registerRod(yarnwrap.block.Block block) { wrapperContained.registerRod(block.wrapperContained); }
// public static void registerRod(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerRod(block.wrapperContained); }
// public void registerAmethysts() { wrapperContained.registerAmethysts(); }
// public static void registerAmethysts() { net.minecraft.client.data.BlockStateModelGenerator.registerAmethysts(); }
public void registerCandle(yarnwrap.block.Block candle,yarnwrap.block.Block cake) { wrapperContained.registerCandle(candle.wrapperContained,cake.wrapperContained); }
// public static void registerCandle(yarnwrap.block.Block candle,yarnwrap.block.Block cake, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCandle(candle.wrapperContained,cake.wrapperContained); }
public void registerAmethyst(yarnwrap.block.Block block) { wrapperContained.registerAmethyst(block.wrapperContained); }
// public static void registerAmethyst(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerAmethyst(block.wrapperContained); }
// public void registerPointedDripstone() { wrapperContained.registerPointedDripstone(); }
// public static void registerPointedDripstone() { net.minecraft.client.data.BlockStateModelGenerator.registerPointedDripstone(); }
public yarnwrap.client.render.model.json.WeightedVariant getDripstoneVariant(yarnwrap.util.math.Direction direction,yarnwrap.block.enums.Thickness thickness) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.getDripstoneVariant(direction.wrapperContained,thickness.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant getDripstoneVariant(yarnwrap.util.math.Direction direction,yarnwrap.block.enums.Thickness thickness, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.getDripstoneVariant(direction.wrapperContained,thickness.wrapperContained)); }
// public void registerSculkSensor() { wrapperContained.registerSculkSensor(); }
// public static void registerSculkSensor() { net.minecraft.client.data.BlockStateModelGenerator.registerSculkSensor(); }
// public void registerPetrifiedOakSlab() { wrapperContained.registerPetrifiedOakSlab(); }
// public static void registerPetrifiedOakSlab() { net.minecraft.client.data.BlockStateModelGenerator.registerPetrifiedOakSlab(); }
public void registerMultifaceBlock(yarnwrap.block.Block block) { wrapperContained.registerMultifaceBlock(block.wrapperContained); }
// public static void registerMultifaceBlock(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerMultifaceBlock(block.wrapperContained); }
// public void registerCaveVines() { wrapperContained.registerCaveVines(); }
// public static void registerCaveVines() { net.minecraft.client.data.BlockStateModelGenerator.registerCaveVines(); }
// public void registerBigDripleaf() { wrapperContained.registerBigDripleaf(); }
// public static void registerBigDripleaf() { net.minecraft.client.data.BlockStateModelGenerator.registerBigDripleaf(); }
// public void registerSmallDripleaf() { wrapperContained.registerSmallDripleaf(); }
// public static void registerSmallDripleaf() { net.minecraft.client.data.BlockStateModelGenerator.registerSmallDripleaf(); }
public void registerAzalea(yarnwrap.block.Block block) { wrapperContained.registerAzalea(block.wrapperContained); }
// public static void registerAzalea(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerAzalea(block.wrapperContained); }
// public yarnwrap.util.Identifier method_34604(yarnwrap.block.Block stage) { return new yarnwrap.util.Identifier(wrapperContained.method_34604(stage.wrapperContained)); }
// public static yarnwrap.util.Identifier method_34604(yarnwrap.block.Block stage, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.method_34604(stage.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_34606(yarnwrap.block.Block age) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_34606(age.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_34606(yarnwrap.block.Block age, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_34606(age.wrapperContained)); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createStoneState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.ModelVariant variant,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createStoneState(block.wrapperContained,variant.wrapperContained,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createStoneState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.ModelVariant variant,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createStoneState(block.wrapperContained,variant.wrapperContained,textures.wrapperContained,modelCollector)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_34610(yarnwrap.block.enums.StructureBlockMode mode) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_34610(mode.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_34610(yarnwrap.block.enums.StructureBlockMode mode, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_34610(mode.wrapperContained)); }
// public void method_34612(yarnwrap.data.family.BlockFamily family) { wrapperContained.method_34612(family.wrapperContained); }
// public static void method_34612(yarnwrap.data.family.BlockFamily family, ) { net.minecraft.client.data.BlockStateModelGenerator.method_34612(family.wrapperContained); }
// public yarnwrap.client.render.model.json.WeightedVariant method_34617(java.lang.Comparable value) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_34617(value)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_34617(java.lang.Comparable value, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_34617(value)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_34618(java.lang.Integer stage) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_34618(stage)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_34618(java.lang.Integer stage, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_34618(stage)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_34619(java.lang.Integer tick,java.lang.Boolean locked,java.lang.Boolean on) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_34619(tick,locked,on)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_34619(java.lang.Integer tick,java.lang.Boolean locked,java.lang.Boolean on, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_34619(tick,locked,on)); }
// public yarnwrap.client.data.TextureMap method_34624(yarnwrap.client.data.TextureMap id) { return new yarnwrap.client.data.TextureMap(wrapperContained.method_34624(id.wrapperContained)); }
// public static yarnwrap.client.data.TextureMap method_34624(yarnwrap.client.data.TextureMap id, ) { return new yarnwrap.client.data.TextureMap(net.minecraft.client.data.BlockStateModelGenerator.method_34624(id.wrapperContained)); }
// public void method_34626(yarnwrap.util.Identifier textures) { wrapperContained.method_34626(textures.wrapperContained); }
// public static void method_34626(yarnwrap.util.Identifier textures, ) { net.minecraft.client.data.BlockStateModelGenerator.method_34626(textures.wrapperContained); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createDeepslateState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.ModelVariant variant,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createDeepslateState(block.wrapperContained,variant.wrapperContained,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createDeepslateState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.ModelVariant variant,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createDeepslateState(block.wrapperContained,variant.wrapperContained,textures.wrapperContained,modelCollector)); }
// public yarnwrap.client.data.TextureMap method_34637(yarnwrap.client.data.TextureMap id) { return new yarnwrap.client.data.TextureMap(wrapperContained.method_34637(id.wrapperContained)); }
// public static yarnwrap.client.data.TextureMap method_34637(yarnwrap.client.data.TextureMap id, ) { return new yarnwrap.client.data.TextureMap(net.minecraft.client.data.BlockStateModelGenerator.method_34637(id.wrapperContained)); }
// public void method_34639(yarnwrap.util.Identifier textures) { wrapperContained.method_34639(textures.wrapperContained); }
// public static void method_34639(yarnwrap.util.Identifier textures, ) { net.minecraft.client.data.BlockStateModelGenerator.method_34639(textures.wrapperContained); }
// public void method_34645(yarnwrap.util.Identifier textures) { wrapperContained.method_34645(textures.wrapperContained); }
// public static void method_34645(yarnwrap.util.Identifier textures, ) { net.minecraft.client.data.BlockStateModelGenerator.method_34645(textures.wrapperContained); }
// public void method_34650(yarnwrap.util.Identifier textureMap) { wrapperContained.method_34650(textureMap.wrapperContained); }
// public static void method_34650(yarnwrap.util.Identifier textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_34650(textureMap.wrapperContained); }
// public void registerLightningRod() { wrapperContained.registerLightningRod(); }
// public static void registerLightningRod() { net.minecraft.client.data.BlockStateModelGenerator.registerLightningRod(); }
// public void registerInfestedDeepslate() { wrapperContained.registerInfestedDeepslate(); }
// public static void registerInfestedDeepslate() { net.minecraft.client.data.BlockStateModelGenerator.registerInfestedDeepslate(); }
public void registerPottedAzaleaBush(yarnwrap.block.Block block) { wrapperContained.registerPottedAzaleaBush(block.wrapperContained); }
// public static void registerPottedAzaleaBush(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerPottedAzaleaBush(block.wrapperContained); }
// public void registerLightBlock() { wrapperContained.registerLightBlock(); }
// public static void registerLightBlock() { net.minecraft.client.data.BlockStateModelGenerator.registerLightBlock(); }
// public void registerMuddyMangroveRoots() { wrapperContained.registerMuddyMangroveRoots(); }
// public static void registerMuddyMangroveRoots() { net.minecraft.client.data.BlockStateModelGenerator.registerMuddyMangroveRoots(); }
// public void registerMangrovePropagule() { wrapperContained.registerMangrovePropagule(); }
// public static void registerMangrovePropagule() { net.minecraft.client.data.BlockStateModelGenerator.registerMangrovePropagule(); }
// public void registerFrogspawn() { wrapperContained.registerFrogspawn(); }
// public static void registerFrogspawn() { net.minecraft.client.data.BlockStateModelGenerator.registerFrogspawn(); }
// public void registerSculkShrieker() { wrapperContained.registerSculkShrieker(); }
// public static void registerSculkShrieker() { net.minecraft.client.data.BlockStateModelGenerator.registerSculkShrieker(); }
// public void registerSculkCatalyst() { wrapperContained.registerSculkCatalyst(); }
// public static void registerSculkCatalyst() { net.minecraft.client.data.BlockStateModelGenerator.registerSculkCatalyst(); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createMudBrickState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.ModelVariant variant,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createMudBrickState(block.wrapperContained,variant.wrapperContained,textures.wrapperContained,modelCollector)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createMudBrickState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.ModelVariant variant,yarnwrap.client.data.TextureMap textures,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createMudBrickState(block.wrapperContained,variant.wrapperContained,textures.wrapperContained,modelCollector)); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createCustomFenceBlockState(yarnwrap.block.Block customFenceBlock,yarnwrap.client.render.model.json.WeightedVariant postModel,yarnwrap.client.render.model.json.WeightedVariant northSideModel,yarnwrap.client.render.model.json.WeightedVariant eastSideModel,yarnwrap.client.render.model.json.WeightedVariant southSideModel,yarnwrap.client.render.model.json.WeightedVariant westSideModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createCustomFenceBlockState(customFenceBlock.wrapperContained,postModel.wrapperContained,northSideModel.wrapperContained,eastSideModel.wrapperContained,southSideModel.wrapperContained,westSideModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createCustomFenceBlockState(yarnwrap.block.Block customFenceBlock,yarnwrap.client.render.model.json.WeightedVariant postModel,yarnwrap.client.render.model.json.WeightedVariant northSideModel,yarnwrap.client.render.model.json.WeightedVariant eastSideModel,yarnwrap.client.render.model.json.WeightedVariant southSideModel,yarnwrap.client.render.model.json.WeightedVariant westSideModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createCustomFenceBlockState(customFenceBlock.wrapperContained,postModel.wrapperContained,northSideModel.wrapperContained,eastSideModel.wrapperContained,southSideModel.wrapperContained,westSideModel.wrapperContained)); }
public void registerHangingSign(yarnwrap.block.Block base,yarnwrap.block.Block hangingSign,yarnwrap.block.Block wallHangingSign) { wrapperContained.registerHangingSign(base.wrapperContained,hangingSign.wrapperContained,wallHangingSign.wrapperContained); }
// public static void registerHangingSign(yarnwrap.block.Block base,yarnwrap.block.Block hangingSign,yarnwrap.block.Block wallHangingSign, ) { net.minecraft.client.data.BlockStateModelGenerator.registerHangingSign(base.wrapperContained,hangingSign.wrapperContained,wallHangingSign.wrapperContained); }
// public void registerChiseledBookshelf() { wrapperContained.registerChiseledBookshelf(); }
// public static void registerChiseledBookshelf() { net.minecraft.client.data.BlockStateModelGenerator.registerChiseledBookshelf(); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createUvLockedColumnBlockState(yarnwrap.block.Block block,yarnwrap.client.data.TextureMap textureMap,java.util.function.BiConsumer modelCollector) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createUvLockedColumnBlockState(block.wrapperContained,textureMap.wrapperContained,modelCollector)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createUvLockedColumnBlockState(yarnwrap.block.Block block,yarnwrap.client.data.TextureMap textureMap,java.util.function.BiConsumer modelCollector, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createUvLockedColumnBlockState(block.wrapperContained,textureMap.wrapperContained,modelCollector)); }
public void supplyChiseledBookshelfModels(yarnwrap.client.data.MultipartBlockModelDefinitionCreator blockStateSupplier,yarnwrap.client.render.model.json.MultipartModelCondition facingCondition,yarnwrap.client.render.model.json.ModelVariantOperator rotation) { wrapperContained.supplyChiseledBookshelfModels(blockStateSupplier.wrapperContained,facingCondition.wrapperContained,rotation.wrapperContained); }
// public static void supplyChiseledBookshelfModels(yarnwrap.client.data.MultipartBlockModelDefinitionCreator blockStateSupplier,yarnwrap.client.render.model.json.MultipartModelCondition facingCondition,yarnwrap.client.render.model.json.ModelVariantOperator rotation, ) { net.minecraft.client.data.BlockStateModelGenerator.supplyChiseledBookshelfModels(blockStateSupplier.wrapperContained,facingCondition.wrapperContained,rotation.wrapperContained); }
// public void method_47813(yarnwrap.client.data.MultipartBlockModelDefinitionCreator pair) { wrapperContained.method_47813(pair.wrapperContained); }
// public static void method_47813(yarnwrap.client.data.MultipartBlockModelDefinitionCreator pair, ) { net.minecraft.client.data.BlockStateModelGenerator.method_47813(pair.wrapperContained); }
public void supplyChiseledBookshelfModel(yarnwrap.client.data.MultipartBlockModelDefinitionCreator blockStateSupplier,yarnwrap.client.render.model.json.MultipartModelCondition facingCondition,yarnwrap.client.render.model.json.ModelVariantOperator rotation,yarnwrap.state.property.BooleanProperty property,yarnwrap.client.data.Model model,boolean occupied) { wrapperContained.supplyChiseledBookshelfModel(blockStateSupplier.wrapperContained,facingCondition.wrapperContained,rotation.wrapperContained,property.wrapperContained,model.wrapperContained,occupied); }
// public static void supplyChiseledBookshelfModel(yarnwrap.client.data.MultipartBlockModelDefinitionCreator blockStateSupplier,yarnwrap.client.render.model.json.MultipartModelCondition facingCondition,yarnwrap.client.render.model.json.ModelVariantOperator rotation,yarnwrap.state.property.BooleanProperty property,yarnwrap.client.data.Model model,boolean occupied, ) { net.minecraft.client.data.BlockStateModelGenerator.supplyChiseledBookshelfModel(blockStateSupplier.wrapperContained,facingCondition.wrapperContained,rotation.wrapperContained,property.wrapperContained,model.wrapperContained,occupied); }
// public yarnwrap.util.Identifier method_47815(yarnwrap.client.data.Model key) { return new yarnwrap.util.Identifier(wrapperContained.method_47815(key.wrapperContained)); }
// public static yarnwrap.util.Identifier method_47815(yarnwrap.client.data.Model key, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.method_47815(key.wrapperContained)); }
// public void registerTintableCrossBlockStateWithStages(yarnwrap.block.Block block,Object tintType,yarnwrap.state.property.Property stageProperty,int stages) { wrapperContained.registerTintableCrossBlockStateWithStages(block.wrapperContained,tintType,stageProperty.wrapperContained,stages); }
// public static void registerTintableCrossBlockStateWithStages(yarnwrap.block.Block block,Object tintType,yarnwrap.state.property.Property stageProperty,int stages, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTintableCrossBlockStateWithStages(block.wrapperContained,tintType,stageProperty.wrapperContained,stages); }
// public yarnwrap.client.render.model.json.WeightedVariant method_49375(int stage) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_49375(stage)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_49375(int stage, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_49375(stage)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_49376(yarnwrap.block.Block dusted) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_49376(dusted.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_49376(yarnwrap.block.Block dusted, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_49376(dusted.wrapperContained)); }
public void registerBrushableBlock(yarnwrap.block.Block block) { wrapperContained.registerBrushableBlock(block.wrapperContained); }
// public static void registerBrushableBlock(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerBrushableBlock(block.wrapperContained); }
public void registerFlowerbed(yarnwrap.block.Block flowerbed) { wrapperContained.registerFlowerbed(flowerbed.wrapperContained); }
// public static void registerFlowerbed(yarnwrap.block.Block flowerbed, ) { net.minecraft.client.data.BlockStateModelGenerator.registerFlowerbed(flowerbed.wrapperContained); }
// public void registerCalibratedSculkSensor() { wrapperContained.registerCalibratedSculkSensor(); }
// public static void registerCalibratedSculkSensor() { net.minecraft.client.data.BlockStateModelGenerator.registerCalibratedSculkSensor(); }
// public void registerSnifferEgg() { wrapperContained.registerSnifferEgg(); }
// public static void registerSnifferEgg() { net.minecraft.client.data.BlockStateModelGenerator.registerSnifferEgg(); }
// public void registerPitcherPlant() { wrapperContained.registerPitcherPlant(); }
// public static void registerPitcherPlant() { net.minecraft.client.data.BlockStateModelGenerator.registerPitcherPlant(); }
// public void registerPitcherCrop() { wrapperContained.registerPitcherCrop(); }
// public static void registerPitcherCrop() { net.minecraft.client.data.BlockStateModelGenerator.registerPitcherCrop(); }
public void registerGeneric(yarnwrap.block.Block block) { wrapperContained.registerGeneric(block.wrapperContained); }
// public static void registerGeneric(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerGeneric(block.wrapperContained); }
// public void registerCrafter() { wrapperContained.registerCrafter(); }
// public static void registerCrafter() { net.minecraft.client.data.BlockStateModelGenerator.registerCrafter(); }
// public yarnwrap.client.data.BlockModelDefinitionCreator createCopperBulbBlockState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant unlitUnpoweredModel,yarnwrap.client.render.model.json.WeightedVariant litUnpoweredModel,yarnwrap.client.render.model.json.WeightedVariant unlitPoweredModel,yarnwrap.client.render.model.json.WeightedVariant litPoweredModel) { return new yarnwrap.client.data.BlockModelDefinitionCreator(wrapperContained.createCopperBulbBlockState(block.wrapperContained,unlitUnpoweredModel.wrapperContained,litUnpoweredModel.wrapperContained,unlitPoweredModel.wrapperContained,litPoweredModel.wrapperContained)); }
// public static yarnwrap.client.data.BlockModelDefinitionCreator createCopperBulbBlockState(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant unlitUnpoweredModel,yarnwrap.client.render.model.json.WeightedVariant litUnpoweredModel,yarnwrap.client.render.model.json.WeightedVariant unlitPoweredModel,yarnwrap.client.render.model.json.WeightedVariant litPoweredModel, ) { return new yarnwrap.client.data.BlockModelDefinitionCreator(net.minecraft.client.data.BlockStateModelGenerator.createCopperBulbBlockState(block.wrapperContained,unlitUnpoweredModel.wrapperContained,litUnpoweredModel.wrapperContained,unlitPoweredModel.wrapperContained,litPoweredModel.wrapperContained)); }
public void registerParentedDoor(yarnwrap.block.Block parent,yarnwrap.block.Block doorBlock) { wrapperContained.registerParentedDoor(parent.wrapperContained,doorBlock.wrapperContained); }
// public static void registerParentedDoor(yarnwrap.block.Block parent,yarnwrap.block.Block doorBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerParentedDoor(parent.wrapperContained,doorBlock.wrapperContained); }
public void registerParentedTrapdoor(yarnwrap.block.Block parent,yarnwrap.block.Block trapdoorBlock) { wrapperContained.registerParentedTrapdoor(parent.wrapperContained,trapdoorBlock.wrapperContained); }
// public static void registerParentedTrapdoor(yarnwrap.block.Block parent,yarnwrap.block.Block trapdoorBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerParentedTrapdoor(parent.wrapperContained,trapdoorBlock.wrapperContained); }
public void registerWaxedCopperBulb(yarnwrap.block.Block unwaxedCopperBulbBlock,yarnwrap.block.Block waxedCopperBulbBlock) { wrapperContained.registerWaxedCopperBulb(unwaxedCopperBulbBlock.wrapperContained,waxedCopperBulbBlock.wrapperContained); }
// public static void registerWaxedCopperBulb(yarnwrap.block.Block unwaxedCopperBulbBlock,yarnwrap.block.Block waxedCopperBulbBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerWaxedCopperBulb(unwaxedCopperBulbBlock.wrapperContained,waxedCopperBulbBlock.wrapperContained); }
public void registerCopperBulb(yarnwrap.block.Block copperBulbBlock) { wrapperContained.registerCopperBulb(copperBulbBlock.wrapperContained); }
// public static void registerCopperBulb(yarnwrap.block.Block copperBulbBlock, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCopperBulb(copperBulbBlock.wrapperContained); }
// public void registerTrialSpawner() { wrapperContained.registerTrialSpawner(); }
// public static void registerTrialSpawner() { net.minecraft.client.data.BlockStateModelGenerator.registerTrialSpawner(); }
// public void registerVault() { wrapperContained.registerVault(); }
// public static void registerVault() { net.minecraft.client.data.BlockStateModelGenerator.registerVault(); }
public void registerPaleMossCarpet(yarnwrap.block.Block block) { wrapperContained.registerPaleMossCarpet(block.wrapperContained); }
// public static void registerPaleMossCarpet(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerPaleMossCarpet(block.wrapperContained); }
public void registerHangingMoss(yarnwrap.block.Block block) { wrapperContained.registerHangingMoss(block.wrapperContained); }
// public static void registerHangingMoss(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerHangingMoss(block.wrapperContained); }
// public yarnwrap.client.render.model.json.WeightedVariant method_64942(yarnwrap.block.Block tip) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_64942(tip.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_64942(yarnwrap.block.Block tip, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_64942(tip.wrapperContained)); }
// public void method_64944(yarnwrap.block.Block textureMap) { wrapperContained.method_64944(textureMap.wrapperContained); }
// public static void method_64944(yarnwrap.block.Block textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_64944(textureMap.wrapperContained); }
// public void method_64945(yarnwrap.block.Block textureMap) { wrapperContained.method_64945(textureMap.wrapperContained); }
// public static void method_64945(yarnwrap.block.Block textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_64945(textureMap.wrapperContained); }
public void registerCreakingHeart(yarnwrap.block.Block block) { wrapperContained.registerCreakingHeart(block.wrapperContained); }
// public static void registerCreakingHeart(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerCreakingHeart(block.wrapperContained); }
public void registerMultifaceBlockModel(yarnwrap.block.Block block) { wrapperContained.registerMultifaceBlockModel(block.wrapperContained); }
// public static void registerMultifaceBlockModel(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerMultifaceBlockModel(block.wrapperContained); }
public void registerMultifaceBlock(yarnwrap.block.Block block,yarnwrap.item.Item item) { wrapperContained.registerMultifaceBlock(block.wrapperContained,item.wrapperContained); }
// public static void registerMultifaceBlock(yarnwrap.block.Block block,yarnwrap.item.Item item, ) { net.minecraft.client.data.BlockStateModelGenerator.registerMultifaceBlock(block.wrapperContained,item.wrapperContained); }
public yarnwrap.util.Identifier uploadItemModel(yarnwrap.item.Item item) { return new yarnwrap.util.Identifier(wrapperContained.uploadItemModel(item.wrapperContained)); }
// public static yarnwrap.util.Identifier uploadItemModel(yarnwrap.item.Item item, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.uploadItemModel(item.wrapperContained)); }
public void registerItemModel(yarnwrap.item.Item item,yarnwrap.util.Identifier modelId) { wrapperContained.registerItemModel(item.wrapperContained,modelId.wrapperContained); }
// public static void registerItemModel(yarnwrap.item.Item item,yarnwrap.util.Identifier modelId, ) { net.minecraft.client.data.BlockStateModelGenerator.registerItemModel(item.wrapperContained,modelId.wrapperContained); }
public yarnwrap.util.Identifier uploadBlockItemModel(yarnwrap.item.Item item,yarnwrap.block.Block block) { return new yarnwrap.util.Identifier(wrapperContained.uploadBlockItemModel(item.wrapperContained,block.wrapperContained)); }
// public static yarnwrap.util.Identifier uploadBlockItemModel(yarnwrap.item.Item item,yarnwrap.block.Block block, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.uploadBlockItemModel(item.wrapperContained,block.wrapperContained)); }
public yarnwrap.util.Identifier uploadBlockItemModel(yarnwrap.item.Item item,yarnwrap.block.Block block,java.lang.String textureSuffix) { return new yarnwrap.util.Identifier(wrapperContained.uploadBlockItemModel(item.wrapperContained,block.wrapperContained,textureSuffix)); }
// public static yarnwrap.util.Identifier uploadBlockItemModel(yarnwrap.item.Item item,yarnwrap.block.Block block,java.lang.String textureSuffix, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.uploadBlockItemModel(item.wrapperContained,block.wrapperContained,textureSuffix)); }
public void registerTintedItemModel(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId,yarnwrap.client.render.item.tint.TintSource tint) { wrapperContained.registerTintedItemModel(block.wrapperContained,modelId.wrapperContained,tint.wrapperContained); }
// public static void registerTintedItemModel(yarnwrap.block.Block block,yarnwrap.util.Identifier modelId,yarnwrap.client.render.item.tint.TintSource tint, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTintedItemModel(block.wrapperContained,modelId.wrapperContained,tint.wrapperContained); }
public void registerBuiltinWithParticle(yarnwrap.block.Block block,yarnwrap.block.Block particleSource) { wrapperContained.registerBuiltinWithParticle(block.wrapperContained,particleSource.wrapperContained); }
// public static void registerBuiltinWithParticle(yarnwrap.block.Block block,yarnwrap.block.Block particleSource, ) { net.minecraft.client.data.BlockStateModelGenerator.registerBuiltinWithParticle(block.wrapperContained,particleSource.wrapperContained); }
public void registerChest(yarnwrap.block.Block block,yarnwrap.block.Block particleSource,yarnwrap.util.Identifier texture,boolean christmas) { wrapperContained.registerChest(block.wrapperContained,particleSource.wrapperContained,texture.wrapperContained,christmas); }
// public static void registerChest(yarnwrap.block.Block block,yarnwrap.block.Block particleSource,yarnwrap.util.Identifier texture,boolean christmas, ) { net.minecraft.client.data.BlockStateModelGenerator.registerChest(block.wrapperContained,particleSource.wrapperContained,texture.wrapperContained,christmas); }
public void registerBanner(yarnwrap.block.Block block,yarnwrap.block.Block wallBlock,yarnwrap.util.DyeColor color) { wrapperContained.registerBanner(block.wrapperContained,wallBlock.wrapperContained,color.wrapperContained); }
// public static void registerBanner(yarnwrap.block.Block block,yarnwrap.block.Block wallBlock,yarnwrap.util.DyeColor color, ) { net.minecraft.client.data.BlockStateModelGenerator.registerBanner(block.wrapperContained,wallBlock.wrapperContained,color.wrapperContained); }
// public void registerSkull(yarnwrap.block.Block block,yarnwrap.block.Block wallBlock,Object type,yarnwrap.util.Identifier baseModelId) { wrapperContained.registerSkull(block.wrapperContained,wallBlock.wrapperContained,type,baseModelId.wrapperContained); }
// public static void registerSkull(yarnwrap.block.Block block,yarnwrap.block.Block wallBlock,Object type,yarnwrap.util.Identifier baseModelId, ) { net.minecraft.client.data.BlockStateModelGenerator.registerSkull(block.wrapperContained,wallBlock.wrapperContained,type,baseModelId.wrapperContained); }
// public void registerFlowerPotPlantAndItem(yarnwrap.block.Block block,yarnwrap.block.Block flowerPotBlock,Object crossType) { wrapperContained.registerFlowerPotPlantAndItem(block.wrapperContained,flowerPotBlock.wrapperContained,crossType); }
// public static void registerFlowerPotPlantAndItem(yarnwrap.block.Block block,yarnwrap.block.Block flowerPotBlock,Object crossType, ) { net.minecraft.client.data.BlockStateModelGenerator.registerFlowerPotPlantAndItem(block.wrapperContained,flowerPotBlock.wrapperContained,crossType); }
// public void registerTintedBlockAndItem(yarnwrap.block.Block block,Object texturedModelFactory,int tintColor) { wrapperContained.registerTintedBlockAndItem(block.wrapperContained,texturedModelFactory,tintColor); }
// public static void registerTintedBlockAndItem(yarnwrap.block.Block block,Object texturedModelFactory,int tintColor, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTintedBlockAndItem(block.wrapperContained,texturedModelFactory,tintColor); }
// public void registerSpecialItemModel(yarnwrap.block.Block block,Object specialModel) { wrapperContained.registerSpecialItemModel(block.wrapperContained,specialModel); }
// public static void registerSpecialItemModel(yarnwrap.block.Block block,Object specialModel, ) { net.minecraft.client.data.BlockStateModelGenerator.registerSpecialItemModel(block.wrapperContained,specialModel); }
// public void registerSkulls() { wrapperContained.registerSkulls(); }
// public static void registerSkulls() { net.minecraft.client.data.BlockStateModelGenerator.registerSkulls(); }
// public void registerBanners() { wrapperContained.registerBanners(); }
// public static void registerBanners() { net.minecraft.client.data.BlockStateModelGenerator.registerBanners(); }
// public void registerChests() { wrapperContained.registerChests(); }
// public static void registerChests() { net.minecraft.client.data.BlockStateModelGenerator.registerChests(); }
// public void registerBeds() { wrapperContained.registerBeds(); }
// public static void registerBeds() { net.minecraft.client.data.BlockStateModelGenerator.registerBeds(); }
public yarnwrap.util.Identifier uploadTwoLayerBlockItemModel(yarnwrap.item.Item item,yarnwrap.block.Block block,java.lang.String layer1Suffix) { return new yarnwrap.util.Identifier(wrapperContained.uploadTwoLayerBlockItemModel(item.wrapperContained,block.wrapperContained,layer1Suffix)); }
// public static yarnwrap.util.Identifier uploadTwoLayerBlockItemModel(yarnwrap.item.Item item,yarnwrap.block.Block block,java.lang.String layer1Suffix, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.uploadTwoLayerBlockItemModel(item.wrapperContained,block.wrapperContained,layer1Suffix)); }
public void registerBed(yarnwrap.block.Block block,yarnwrap.block.Block particleSource,yarnwrap.util.DyeColor color) { wrapperContained.registerBed(block.wrapperContained,particleSource.wrapperContained,color.wrapperContained); }
// public static void registerBed(yarnwrap.block.Block block,yarnwrap.block.Block particleSource,yarnwrap.util.DyeColor color, ) { net.minecraft.client.data.BlockStateModelGenerator.registerBed(block.wrapperContained,particleSource.wrapperContained,color.wrapperContained); }
public void registerTwoLayerItemModel(yarnwrap.block.Block block,java.lang.String layer1Suffix) { wrapperContained.registerTwoLayerItemModel(block.wrapperContained,layer1Suffix); }
// public static void registerTwoLayerItemModel(yarnwrap.block.Block block,java.lang.String layer1Suffix, ) { net.minecraft.client.data.BlockStateModelGenerator.registerTwoLayerItemModel(block.wrapperContained,layer1Suffix); }
// public void registerDoubleBlockAndItem(yarnwrap.block.Block block,Object crossType) { wrapperContained.registerDoubleBlockAndItem(block.wrapperContained,crossType); }
// public static void registerDoubleBlockAndItem(yarnwrap.block.Block block,Object crossType, ) { net.minecraft.client.data.BlockStateModelGenerator.registerDoubleBlockAndItem(block.wrapperContained,crossType); }
// public void registerVine() { wrapperContained.registerVine(); }
// public static void registerVine() { net.minecraft.client.data.BlockStateModelGenerator.registerVine(); }
public yarnwrap.client.render.model.json.WeightedVariant uploadParticleModel(yarnwrap.block.Block block,yarnwrap.block.Block particleSource) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.uploadParticleModel(block.wrapperContained,particleSource.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant uploadParticleModel(yarnwrap.block.Block block,yarnwrap.block.Block particleSource, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.uploadParticleModel(block.wrapperContained,particleSource.wrapperContained)); }
public void registerGrassTinted(yarnwrap.block.Block block) { wrapperContained.registerGrassTinted(block.wrapperContained); }
// public static void registerGrassTinted(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerGrassTinted(block.wrapperContained); }
public void registerGrassTintedDoubleBlockAndItem(yarnwrap.block.Block block) { wrapperContained.registerGrassTintedDoubleBlockAndItem(block.wrapperContained); }
// public static void registerGrassTintedDoubleBlockAndItem(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerGrassTintedDoubleBlockAndItem(block.wrapperContained); }
public void registerBuiltin(yarnwrap.block.Block block) { wrapperContained.registerBuiltin(block.wrapperContained); }
// public static void registerBuiltin(yarnwrap.block.Block block, ) { net.minecraft.client.data.BlockStateModelGenerator.registerBuiltin(block.wrapperContained); }
public void registerSegmentedBlock(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant model1,java.util.function.Function model1ConditionFunction,yarnwrap.client.render.model.json.WeightedVariant model2,java.util.function.Function model2ConditionFunction,yarnwrap.client.render.model.json.WeightedVariant model3,java.util.function.Function model3ConditionFunction,yarnwrap.client.render.model.json.WeightedVariant model4,java.util.function.Function model4ConditionFunction) { wrapperContained.registerSegmentedBlock(block.wrapperContained,model1.wrapperContained,model1ConditionFunction,model2.wrapperContained,model2ConditionFunction,model3.wrapperContained,model3ConditionFunction,model4.wrapperContained,model4ConditionFunction); }
// public static void registerSegmentedBlock(yarnwrap.block.Block block,yarnwrap.client.render.model.json.WeightedVariant model1,java.util.function.Function model1ConditionFunction,yarnwrap.client.render.model.json.WeightedVariant model2,java.util.function.Function model2ConditionFunction,yarnwrap.client.render.model.json.WeightedVariant model3,java.util.function.Function model3ConditionFunction,yarnwrap.client.render.model.json.WeightedVariant model4,java.util.function.Function model4ConditionFunction, ) { net.minecraft.client.data.BlockStateModelGenerator.registerSegmentedBlock(block.wrapperContained,model1.wrapperContained,model1ConditionFunction,model2.wrapperContained,model2ConditionFunction,model3.wrapperContained,model3ConditionFunction,model4.wrapperContained,model4ConditionFunction); }
// public void method_66527(yarnwrap.block.Block textureMap) { wrapperContained.method_66527(textureMap.wrapperContained); }
// public static void method_66527(yarnwrap.block.Block textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_66527(textureMap.wrapperContained); }
// public yarnwrap.util.Identifier createCreakingHeartModel(Object texturedModelFactory,yarnwrap.block.Block block,java.lang.String suffix) { return new yarnwrap.util.Identifier(wrapperContained.createCreakingHeartModel(texturedModelFactory,block.wrapperContained,suffix)); }
// public static yarnwrap.util.Identifier createCreakingHeartModel(Object texturedModelFactory,yarnwrap.block.Block block,java.lang.String suffix, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.createCreakingHeartModel(texturedModelFactory,block.wrapperContained,suffix)); }
public void registerLeafLitter(yarnwrap.block.Block leafLitter) { wrapperContained.registerLeafLitter(leafLitter.wrapperContained); }
// public static void registerLeafLitter(yarnwrap.block.Block leafLitter, ) { net.minecraft.client.data.BlockStateModelGenerator.registerLeafLitter(leafLitter.wrapperContained); }
// public void registerTestBlock() { wrapperContained.registerTestBlock(); }
// public static void registerTestBlock() { net.minecraft.client.data.BlockStateModelGenerator.registerTestBlock(); }
// public yarnwrap.client.render.model.json.ModelVariant createModelVariant(yarnwrap.util.Identifier id) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.createModelVariant(id.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelVariant createModelVariant(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.data.BlockStateModelGenerator.createModelVariant(id.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67807(yarnwrap.block.Block hanging,yarnwrap.client.render.model.json.WeightedVariant age) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67807(hanging.wrapperContained,age.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67807(yarnwrap.block.Block hanging,yarnwrap.client.render.model.json.WeightedVariant age, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67807(hanging.wrapperContained,age.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67808(yarnwrap.block.Block age,java.lang.Integer half) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67808(age.wrapperContained,half)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67808(yarnwrap.block.Block age,java.lang.Integer half, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67808(age.wrapperContained,half)); }
// public java.util.Map collectMultifaceOperators(yarnwrap.state.State state,java.util.function.Function propertyGetter) { return wrapperContained.collectMultifaceOperators(state.wrapperContained,propertyGetter); }
// public static java.util.Map collectMultifaceOperators(yarnwrap.state.State state,java.util.function.Function propertyGetter, ) { return net.minecraft.client.data.BlockStateModelGenerator.collectMultifaceOperators(state.wrapperContained,propertyGetter); }
// public void method_67810(yarnwrap.client.render.model.json.MultipartModelConditionBuilder property,yarnwrap.state.property.Property operator) { wrapperContained.method_67810(property.wrapperContained,operator.wrapperContained); }
// public static void method_67810(yarnwrap.client.render.model.json.MultipartModelConditionBuilder property,yarnwrap.state.property.Property operator, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67810(property.wrapperContained,operator.wrapperContained); }
// public void method_67812(yarnwrap.client.data.MultipartBlockModelDefinitionCreator property,yarnwrap.client.render.model.json.WeightedVariant operator) { wrapperContained.method_67812(property.wrapperContained,operator.wrapperContained); }
// public static void method_67812(yarnwrap.client.data.MultipartBlockModelDefinitionCreator property,yarnwrap.client.render.model.json.WeightedVariant operator, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67812(property.wrapperContained,operator.wrapperContained); }
// public void method_67813(yarnwrap.client.data.MultipartBlockModelDefinitionCreator property,yarnwrap.client.render.model.json.WeightedVariant operator) { wrapperContained.method_67813(property.wrapperContained,operator.wrapperContained); }
// public static void method_67813(yarnwrap.client.data.MultipartBlockModelDefinitionCreator property,yarnwrap.client.render.model.json.WeightedVariant operator, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67813(property.wrapperContained,operator.wrapperContained); }
// public void method_67814(yarnwrap.client.data.TextureMap textureMap) { wrapperContained.method_67814(textureMap.wrapperContained); }
// public static void method_67814(yarnwrap.client.data.TextureMap textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67814(textureMap.wrapperContained); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67815(yarnwrap.client.render.model.json.WeightedVariant phase) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67815(phase.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67815(yarnwrap.client.render.model.json.WeightedVariant phase, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67815(phase.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67816(yarnwrap.client.render.model.json.WeightedVariant state,yarnwrap.client.render.model.json.WeightedVariant ominous) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67816(state.wrapperContained,ominous.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67816(yarnwrap.client.render.model.json.WeightedVariant state,yarnwrap.client.render.model.json.WeightedVariant ominous, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67816(state.wrapperContained,ominous.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67817(yarnwrap.client.render.model.json.WeightedVariant state,yarnwrap.client.render.model.json.WeightedVariant ominous) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67817(state.wrapperContained,ominous.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67817(yarnwrap.client.render.model.json.WeightedVariant state,yarnwrap.client.render.model.json.WeightedVariant ominous, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67817(state.wrapperContained,ominous.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67818(yarnwrap.client.render.model.json.WeightedVariant powered,yarnwrap.client.render.model.json.WeightedVariant shape) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67818(powered.wrapperContained,shape.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67818(yarnwrap.client.render.model.json.WeightedVariant powered,yarnwrap.client.render.model.json.WeightedVariant shape, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67818(powered.wrapperContained,shape.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67819(yarnwrap.client.render.model.json.WeightedVariant lit,yarnwrap.client.render.model.json.WeightedVariant powered) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67819(lit.wrapperContained,powered.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67819(yarnwrap.client.render.model.json.WeightedVariant lit,yarnwrap.client.render.model.json.WeightedVariant powered, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67819(lit.wrapperContained,powered.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67820(yarnwrap.client.render.model.json.WeightedVariant bloom) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67820(bloom.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67820(yarnwrap.client.render.model.json.WeightedVariant bloom, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67820(bloom.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67821(yarnwrap.client.render.model.json.WeightedVariant layers) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67821(layers.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67821(yarnwrap.client.render.model.json.WeightedVariant layers, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67821(layers.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant createWeightedVariant(yarnwrap.client.render.model.json.ModelVariant variant) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.createWeightedVariant(variant.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant createWeightedVariant(yarnwrap.client.render.model.json.ModelVariant variant, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant(variant.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant modelWithMirroring(yarnwrap.client.render.model.json.ModelVariant variant,yarnwrap.client.render.model.json.ModelVariant mirroredVariant) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.modelWithMirroring(variant.wrapperContained,mirroredVariant.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant modelWithMirroring(yarnwrap.client.render.model.json.ModelVariant variant,yarnwrap.client.render.model.json.ModelVariant mirroredVariant, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.modelWithMirroring(variant.wrapperContained,mirroredVariant.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67824(java.lang.Boolean attached,java.lang.Boolean on) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67824(attached,on)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67824(java.lang.Boolean attached,java.lang.Boolean on, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67824(attached,on)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67825(java.lang.Integer hatch) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67825(hatch)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67825(java.lang.Integer hatch, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67825(hatch)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67826(java.lang.Integer eggs,java.lang.Integer hatch) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67826(eggs,hatch)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67826(java.lang.Integer eggs,java.lang.Integer hatch, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67826(eggs,hatch)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67828(java.util.Map mode) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67828(mode)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67828(java.util.Map mode, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67828(mode)); }
// public void method_67829(java.util.function.Function direction,yarnwrap.state.State operator) { wrapperContained.method_67829(direction,operator.wrapperContained); }
// public static void method_67829(java.util.function.Function direction,yarnwrap.state.State operator, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67829(direction,operator.wrapperContained); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67830(int age) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67830(age)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67830(int age, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67830(age)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67831(net.minecraft.util.Identifier[] charges) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67831(charges)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67831(net.minecraft.util.Identifier[] charges, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67831(charges)); }
// public yarnwrap.client.render.model.json.MultipartModelCondition or(net.minecraft.client.render.model.json.MultipartModelConditionBuilder[] conditionBuilders) { return new yarnwrap.client.render.model.json.MultipartModelCondition(wrapperContained.or(conditionBuilders)); }
// public static yarnwrap.client.render.model.json.MultipartModelCondition or(net.minecraft.client.render.model.json.MultipartModelConditionBuilder[] conditionBuilders, ) { return new yarnwrap.client.render.model.json.MultipartModelCondition(net.minecraft.client.data.BlockStateModelGenerator.or(conditionBuilders)); }
// public yarnwrap.client.render.model.json.WeightedVariant createWeightedVariant(net.minecraft.client.render.model.json.ModelVariant[] variants) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.createWeightedVariant(variants)); }
// public static yarnwrap.client.render.model.json.WeightedVariant createWeightedVariant(net.minecraft.client.render.model.json.ModelVariant[] variants, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant(variants)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder createMultipartConditionBuilder() { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.createMultipartConditionBuilder()); }
public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder createMultipartConditionBuilder() { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.createMultipartConditionBuilder()); }
// public yarnwrap.client.render.model.json.WeightedVariant createWeightedVariant(yarnwrap.util.Identifier id) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.createWeightedVariant(id.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant createWeightedVariant(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant(id.wrapperContained)); }
// public void method_67836(yarnwrap.client.render.model.json.MultipartModelConditionBuilder property,yarnwrap.state.property.Property operator) { wrapperContained.method_67836(property.wrapperContained,operator.wrapperContained); }
// public static void method_67836(yarnwrap.client.render.model.json.MultipartModelConditionBuilder property,yarnwrap.state.property.Property operator, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67836(property.wrapperContained,operator.wrapperContained); }
// public void method_67837(yarnwrap.client.data.TextureMap textureMap) { wrapperContained.method_67837(textureMap.wrapperContained); }
// public static void method_67837(yarnwrap.client.data.TextureMap textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67837(textureMap.wrapperContained); }
// public yarnwrap.client.render.model.json.WeightedVariant method_67838(yarnwrap.client.render.model.json.WeightedVariant phase) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_67838(phase.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_67838(yarnwrap.client.render.model.json.WeightedVariant phase, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67838(phase.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant modelWithYRotation(yarnwrap.client.render.model.json.ModelVariant variant) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.modelWithYRotation(variant.wrapperContained)); }
// public static yarnwrap.client.render.model.json.WeightedVariant modelWithYRotation(yarnwrap.client.render.model.json.ModelVariant variant, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.modelWithYRotation(variant.wrapperContained)); }
// public void method_67840(yarnwrap.client.data.TextureMap textureMap) { wrapperContained.method_67840(textureMap.wrapperContained); }
// public static void method_67840(yarnwrap.client.data.TextureMap textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67840(textureMap.wrapperContained); }
// public yarnwrap.client.render.model.json.ModelVariant method_67841(yarnwrap.client.render.model.json.ModelVariant variant) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.method_67841(variant.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelVariant method_67841(yarnwrap.client.render.model.json.ModelVariant variant, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.data.BlockStateModelGenerator.method_67841(variant.wrapperContained)); }
// public void method_67842(yarnwrap.client.data.TextureMap textureMap) { wrapperContained.method_67842(textureMap.wrapperContained); }
// public static void method_67842(yarnwrap.client.data.TextureMap textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67842(textureMap.wrapperContained); }
// public void method_67843(yarnwrap.client.data.TextureMap textureMap) { wrapperContained.method_67843(textureMap.wrapperContained); }
// public static void method_67843(yarnwrap.client.data.TextureMap textureMap, ) { net.minecraft.client.data.BlockStateModelGenerator.method_67843(textureMap.wrapperContained); }
// public yarnwrap.util.collection.Weighted method_68470(yarnwrap.client.render.model.json.ModelVariant variant) { return new yarnwrap.util.collection.Weighted(wrapperContained.method_68470(variant.wrapperContained)); }
// public static yarnwrap.util.collection.Weighted method_68470(yarnwrap.client.render.model.json.ModelVariant variant, ) { return new yarnwrap.util.collection.Weighted(net.minecraft.client.data.BlockStateModelGenerator.method_68470(variant.wrapperContained)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68815(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.method_68815(builder.wrapperContained)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68815(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.method_68815(builder.wrapperContained)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68816(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.method_68816(builder.wrapperContained)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68816(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.method_68816(builder.wrapperContained)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68817(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.method_68817(builder.wrapperContained)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68817(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.method_68817(builder.wrapperContained)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68818(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.method_68818(builder.wrapperContained)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68818(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.method_68818(builder.wrapperContained)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68819(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.method_68819(builder.wrapperContained)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68819(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.method_68819(builder.wrapperContained)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68820(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.method_68820(builder.wrapperContained)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68820(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.method_68820(builder.wrapperContained)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68821(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.method_68821(builder.wrapperContained)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68821(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.method_68821(builder.wrapperContained)); }
// public yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68822(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(wrapperContained.method_68822(builder.wrapperContained)); }
// public static yarnwrap.client.render.model.json.MultipartModelConditionBuilder method_68822(yarnwrap.client.render.model.json.MultipartModelConditionBuilder builder, ) { return new yarnwrap.client.render.model.json.MultipartModelConditionBuilder(net.minecraft.client.data.BlockStateModelGenerator.method_68822(builder.wrapperContained)); }
// public yarnwrap.client.render.model.json.WeightedVariant method_70820(java.util.function.Function hydration) { return new yarnwrap.client.render.model.json.WeightedVariant(wrapperContained.method_70820(hydration)); }
// public static yarnwrap.client.render.model.json.WeightedVariant method_70820(java.util.function.Function hydration, ) { return new yarnwrap.client.render.model.json.WeightedVariant(net.minecraft.client.data.BlockStateModelGenerator.method_70820(hydration)); }
// public void registerDriedGhast() { wrapperContained.registerDriedGhast(); }
// public static void registerDriedGhast() { net.minecraft.client.data.BlockStateModelGenerator.registerDriedGhast(); }
// public yarnwrap.util.Identifier method_70822(java.lang.Integer hydration) { return new yarnwrap.util.Identifier(wrapperContained.method_70822(hydration)); }
// public static yarnwrap.util.Identifier method_70822(java.lang.Integer hydration, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.BlockStateModelGenerator.method_70822(hydration)); }

}