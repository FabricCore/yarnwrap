package yarnwrap.client.render.model;
public class ModelLoader { public net.minecraft.client.render.model.ModelLoader wrapperContained; public ModelLoader(net.minecraft.client.render.model.ModelLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return wrapperContained.stateLookup; }
// public void stateLookup(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.stateLookup = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return net.minecraft.client.render.model.ModelLoader.stateLookup; }
// public static void stateLookup(it.unimi.dsi.fastutil.objects.Object2IntMap value, ) { net.minecraft.client.render.model.ModelLoader.stateLookup = value; }

// public yarnwrap.client.util.SpriteIdentifier BANNER_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BANNER_BASE); }
// public void BANNER_BASE(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.BANNER_BASE = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier BANNER_BASE() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelLoader.BANNER_BASE); }
// public static void BANNER_BASE(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.BANNER_BASE = value.wrapperContained; }

// public java.util.List BLOCK_DESTRUCTION_STAGES() { return wrapperContained.BLOCK_DESTRUCTION_STAGES; }
// public void BLOCK_DESTRUCTION_STAGES(java.util.List value) { wrapperContained.BLOCK_DESTRUCTION_STAGES = value; }
public static java.util.List BLOCK_DESTRUCTION_STAGES() { return net.minecraft.client.render.model.ModelLoader.BLOCK_DESTRUCTION_STAGES; }
// public static void BLOCK_DESTRUCTION_STAGES(java.util.List value, ) { net.minecraft.client.render.model.ModelLoader.BLOCK_DESTRUCTION_STAGES = value; }

// public java.util.List BLOCK_DESTRUCTION_STAGE_TEXTURES() { return wrapperContained.BLOCK_DESTRUCTION_STAGE_TEXTURES; }
// public void BLOCK_DESTRUCTION_STAGE_TEXTURES(java.util.List value) { wrapperContained.BLOCK_DESTRUCTION_STAGE_TEXTURES = value; }
public static java.util.List BLOCK_DESTRUCTION_STAGE_TEXTURES() { return net.minecraft.client.render.model.ModelLoader.BLOCK_DESTRUCTION_STAGE_TEXTURES; }
// public static void BLOCK_DESTRUCTION_STAGE_TEXTURES(java.util.List value, ) { net.minecraft.client.render.model.ModelLoader.BLOCK_DESTRUCTION_STAGE_TEXTURES = value; }

// public yarnwrap.client.util.SpriteIdentifier SHIELD_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.SHIELD_BASE); }
// public void SHIELD_BASE(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.SHIELD_BASE = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier SHIELD_BASE() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelLoader.SHIELD_BASE); }
// public static void SHIELD_BASE(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.SHIELD_BASE = value.wrapperContained; }

// public yarnwrap.client.util.SpriteIdentifier SHIELD_BASE_NO_PATTERN() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.SHIELD_BASE_NO_PATTERN); }
// public void SHIELD_BASE_NO_PATTERN(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.SHIELD_BASE_NO_PATTERN = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier SHIELD_BASE_NO_PATTERN() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelLoader.SHIELD_BASE_NO_PATTERN); }
// public static void SHIELD_BASE_NO_PATTERN(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.SHIELD_BASE_NO_PATTERN = value.wrapperContained; }

// public java.util.List BLOCK_DESTRUCTION_RENDER_LAYERS() { return wrapperContained.BLOCK_DESTRUCTION_RENDER_LAYERS; }
// public void BLOCK_DESTRUCTION_RENDER_LAYERS(java.util.List value) { wrapperContained.BLOCK_DESTRUCTION_RENDER_LAYERS = value; }
public static java.util.List BLOCK_DESTRUCTION_RENDER_LAYERS() { return net.minecraft.client.render.model.ModelLoader.BLOCK_DESTRUCTION_RENDER_LAYERS; }
// public static void BLOCK_DESTRUCTION_RENDER_LAYERS(java.util.List value, ) { net.minecraft.client.render.model.ModelLoader.BLOCK_DESTRUCTION_RENDER_LAYERS = value; }

// public java.lang.String BUILTIN() { return wrapperContained.BUILTIN; }
// public void BUILTIN(java.lang.String value) { wrapperContained.BUILTIN = value; }
// public static java.lang.String BUILTIN() { return net.minecraft.client.render.model.ModelLoader.BUILTIN; }
// public static void BUILTIN(java.lang.String value, ) { net.minecraft.client.render.model.ModelLoader.BUILTIN = value; }

// public java.lang.String BUILTIN_GENERATED() { return wrapperContained.BUILTIN_GENERATED; }
// public void BUILTIN_GENERATED(java.lang.String value) { wrapperContained.BUILTIN_GENERATED = value; }
// public static java.lang.String BUILTIN_GENERATED() { return net.minecraft.client.render.model.ModelLoader.BUILTIN_GENERATED; }
// public static void BUILTIN_GENERATED(java.lang.String value, ) { net.minecraft.client.render.model.ModelLoader.BUILTIN_GENERATED = value; }

// public java.lang.String BUILTIN_ENTITY() { return wrapperContained.BUILTIN_ENTITY; }
// public void BUILTIN_ENTITY(java.lang.String value) { wrapperContained.BUILTIN_ENTITY = value; }
// public static java.lang.String BUILTIN_ENTITY() { return net.minecraft.client.render.model.ModelLoader.BUILTIN_ENTITY; }
// public static void BUILTIN_ENTITY(java.lang.String value, ) { net.minecraft.client.render.model.ModelLoader.BUILTIN_ENTITY = value; }

// public java.lang.String MISSING() { return wrapperContained.MISSING; }
// public void MISSING(java.lang.String value) { wrapperContained.MISSING = value; }
// public static java.lang.String MISSING() { return net.minecraft.client.render.model.ModelLoader.MISSING; }
// public static void MISSING(java.lang.String value, ) { net.minecraft.client.render.model.ModelLoader.MISSING = value; }

// public java.util.Map jsonUnbakedModels() { return wrapperContained.jsonUnbakedModels; }
// public void jsonUnbakedModels(java.util.Map value) { wrapperContained.jsonUnbakedModels = value; }
// public static java.util.Map jsonUnbakedModels() { return net.minecraft.client.render.model.ModelLoader.jsonUnbakedModels; }
// public static void jsonUnbakedModels(java.util.Map value, ) { net.minecraft.client.render.model.ModelLoader.jsonUnbakedModels = value; }

// public yarnwrap.resource.ResourceFinder MODELS_FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.MODELS_FINDER); }
// public void MODELS_FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.MODELS_FINDER = value.wrapperContained; }
public static yarnwrap.resource.ResourceFinder MODELS_FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.client.render.model.ModelLoader.MODELS_FINDER); }
// public static void MODELS_FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.client.render.model.ModelLoader.MODELS_FINDER = value.wrapperContained; }

// public yarnwrap.client.render.model.UnbakedModel missingModel() { return new yarnwrap.client.render.model.UnbakedModel(wrapperContained.missingModel); }
// public void missingModel(yarnwrap.client.render.model.UnbakedModel value) { wrapperContained.missingModel = value.wrapperContained; }
// public static yarnwrap.client.render.model.UnbakedModel missingModel() { return new yarnwrap.client.render.model.UnbakedModel(net.minecraft.client.render.model.ModelLoader.missingModel); }
// public static void missingModel(yarnwrap.client.render.model.UnbakedModel value, ) { net.minecraft.client.render.model.ModelLoader.missingModel = value.wrapperContained; }

// public yarnwrap.client.util.ModelIdentifier MISSING_MODEL_ID() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.MISSING_MODEL_ID); }
// public void MISSING_MODEL_ID(yarnwrap.client.util.ModelIdentifier value) { wrapperContained.MISSING_MODEL_ID = value.wrapperContained; }
public static yarnwrap.client.util.ModelIdentifier MISSING_MODEL_ID() { return new yarnwrap.client.util.ModelIdentifier(net.minecraft.client.render.model.ModelLoader.MISSING_MODEL_ID); }
// public static void MISSING_MODEL_ID(yarnwrap.client.util.ModelIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.MISSING_MODEL_ID = value.wrapperContained; }

// public yarnwrap.client.util.SpriteIdentifier FIRE_1() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.FIRE_1); }
// public void FIRE_1(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.FIRE_1 = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier FIRE_1() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelLoader.FIRE_1); }
// public static void FIRE_1(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.FIRE_1 = value.wrapperContained; }

// public java.lang.String MISSING_DEFINITION() { return wrapperContained.MISSING_DEFINITION; }
// public void MISSING_DEFINITION(java.lang.String value) { wrapperContained.MISSING_DEFINITION = value; }
public static java.lang.String MISSING_DEFINITION() { return net.minecraft.client.render.model.ModelLoader.MISSING_DEFINITION; }
// public static void MISSING_DEFINITION(java.lang.String value, ) { net.minecraft.client.render.model.ModelLoader.MISSING_DEFINITION = value; }

// public yarnwrap.util.Identifier MISSING_ID() { return new yarnwrap.util.Identifier(wrapperContained.MISSING_ID); }
// public void MISSING_ID(yarnwrap.util.Identifier value) { wrapperContained.MISSING_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier MISSING_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.ModelLoader.MISSING_ID); }
// public static void MISSING_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.model.ModelLoader.MISSING_ID = value.wrapperContained; }

// public java.util.Map unbakedModels() { return wrapperContained.unbakedModels; }
// public void unbakedModels(java.util.Map value) { wrapperContained.unbakedModels = value; }
// public static java.util.Map unbakedModels() { return net.minecraft.client.render.model.ModelLoader.unbakedModels; }
// public static void unbakedModels(java.util.Map value, ) { net.minecraft.client.render.model.ModelLoader.unbakedModels = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.model.ModelLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.model.ModelLoader.LOGGER = value; }

// public yarnwrap.client.util.SpriteIdentifier LAVA_FLOW() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.LAVA_FLOW); }
// public void LAVA_FLOW(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.LAVA_FLOW = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier LAVA_FLOW() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelLoader.LAVA_FLOW); }
// public static void LAVA_FLOW(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.LAVA_FLOW = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ItemModelGenerator ITEM_MODEL_GENERATOR() { return new yarnwrap.client.render.model.json.ItemModelGenerator(wrapperContained.ITEM_MODEL_GENERATOR); }
// public void ITEM_MODEL_GENERATOR(yarnwrap.client.render.model.json.ItemModelGenerator value) { wrapperContained.ITEM_MODEL_GENERATOR = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.ItemModelGenerator ITEM_MODEL_GENERATOR() { return new yarnwrap.client.render.model.json.ItemModelGenerator(net.minecraft.client.render.model.ModelLoader.ITEM_MODEL_GENERATOR); }
// public static void ITEM_MODEL_GENERATOR(yarnwrap.client.render.model.json.ItemModelGenerator value, ) { net.minecraft.client.render.model.ModelLoader.ITEM_MODEL_GENERATOR = value.wrapperContained; }

// public java.util.Map bakedModels() { return wrapperContained.bakedModels; }
// public void bakedModels(java.util.Map value) { wrapperContained.bakedModels = value; }
// public static java.util.Map bakedModels() { return net.minecraft.client.render.model.ModelLoader.bakedModels; }
// public static void bakedModels(java.util.Map value, ) { net.minecraft.client.render.model.ModelLoader.bakedModels = value; }

// public yarnwrap.client.util.SpriteIdentifier WATER_OVERLAY() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.WATER_OVERLAY); }
// public void WATER_OVERLAY(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.WATER_OVERLAY = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier WATER_OVERLAY() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelLoader.WATER_OVERLAY); }
// public static void WATER_OVERLAY(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.WATER_OVERLAY = value.wrapperContained; }

// public yarnwrap.client.render.model.json.JsonUnbakedModel BLOCK_ENTITY_MARKER() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.BLOCK_ENTITY_MARKER); }
// public void BLOCK_ENTITY_MARKER(yarnwrap.client.render.model.json.JsonUnbakedModel value) { wrapperContained.BLOCK_ENTITY_MARKER = value.wrapperContained; }
public static yarnwrap.client.render.model.json.JsonUnbakedModel BLOCK_ENTITY_MARKER() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(net.minecraft.client.render.model.ModelLoader.BLOCK_ENTITY_MARKER); }
// public static void BLOCK_ENTITY_MARKER(yarnwrap.client.render.model.json.JsonUnbakedModel value, ) { net.minecraft.client.render.model.ModelLoader.BLOCK_ENTITY_MARKER = value.wrapperContained; }

// public java.util.Set modelsToLoad() { return wrapperContained.modelsToLoad; }
// public void modelsToLoad(java.util.Set value) { wrapperContained.modelsToLoad = value; }
// public static java.util.Set modelsToLoad() { return net.minecraft.client.render.model.ModelLoader.modelsToLoad; }
// public static void modelsToLoad(java.util.Set value, ) { net.minecraft.client.render.model.ModelLoader.modelsToLoad = value; }

// public yarnwrap.client.util.SpriteIdentifier WATER_FLOW() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.WATER_FLOW); }
// public void WATER_FLOW(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.WATER_FLOW = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier WATER_FLOW() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelLoader.WATER_FLOW); }
// public static void WATER_FLOW(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.WATER_FLOW = value.wrapperContained; }

// public java.util.Map modelsToBake() { return wrapperContained.modelsToBake; }
// public void modelsToBake(java.util.Map value) { wrapperContained.modelsToBake = value; }
// public static java.util.Map modelsToBake() { return net.minecraft.client.render.model.ModelLoader.modelsToBake; }
// public static void modelsToBake(java.util.Map value, ) { net.minecraft.client.render.model.ModelLoader.modelsToBake = value; }

// public java.util.Map BUILTIN_MODEL_DEFINITIONS() { return wrapperContained.BUILTIN_MODEL_DEFINITIONS; }
// public void BUILTIN_MODEL_DEFINITIONS(java.util.Map value) { wrapperContained.BUILTIN_MODEL_DEFINITIONS = value; }
// public static java.util.Map BUILTIN_MODEL_DEFINITIONS() { return net.minecraft.client.render.model.ModelLoader.BUILTIN_MODEL_DEFINITIONS; }
// public static void BUILTIN_MODEL_DEFINITIONS(java.util.Map value, ) { net.minecraft.client.render.model.ModelLoader.BUILTIN_MODEL_DEFINITIONS = value; }

// public yarnwrap.client.util.SpriteIdentifier FIRE_0() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.FIRE_0); }
// public void FIRE_0(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.FIRE_0 = value.wrapperContained; }
public static yarnwrap.client.util.SpriteIdentifier FIRE_0() { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.render.model.ModelLoader.FIRE_0); }
// public static void FIRE_0(yarnwrap.client.util.SpriteIdentifier value, ) { net.minecraft.client.render.model.ModelLoader.FIRE_0 = value.wrapperContained; }

// public java.util.Map bakedModelCache() { return wrapperContained.bakedModelCache; }
// public void bakedModelCache(java.util.Map value) { wrapperContained.bakedModelCache = value; }
// public static java.util.Map bakedModelCache() { return net.minecraft.client.render.model.ModelLoader.bakedModelCache; }
// public static void bakedModelCache(java.util.Map value, ) { net.minecraft.client.render.model.ModelLoader.bakedModelCache = value; }

// public yarnwrap.client.render.model.json.JsonUnbakedModel GENERATION_MARKER() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.GENERATION_MARKER); }
// public void GENERATION_MARKER(yarnwrap.client.render.model.json.JsonUnbakedModel value) { wrapperContained.GENERATION_MARKER = value.wrapperContained; }
public static yarnwrap.client.render.model.json.JsonUnbakedModel GENERATION_MARKER() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(net.minecraft.client.render.model.ModelLoader.GENERATION_MARKER); }
// public static void GENERATION_MARKER(yarnwrap.client.render.model.json.JsonUnbakedModel value, ) { net.minecraft.client.render.model.ModelLoader.GENERATION_MARKER = value.wrapperContained; }

public ModelLoader(yarnwrap.client.color.block.BlockColors blockColors,yarnwrap.util.profiler.Profiler profiler,java.util.Map jsonUnbakedModels,java.util.Map blockStates) { this.wrapperContained = new net.minecraft.client.render.model.ModelLoader(blockColors.wrapperContained,profiler.wrapperContained,jsonUnbakedModels,blockStates); }
public it.unimi.dsi.fastutil.objects.Object2IntMap getStateLookup() { return wrapperContained.getStateLookup(); }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap getStateLookup() { return net.minecraft.client.render.model.ModelLoader.getStateLookup(); }
// public yarnwrap.util.Identifier method_22820(int stage) { return new yarnwrap.util.Identifier(wrapperContained.method_22820(stage)); }
// public static yarnwrap.util.Identifier method_22820(int stage, ) { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.ModelLoader.method_22820(stage)); }
// public yarnwrap.util.Identifier method_23216(yarnwrap.util.Identifier id) { return new yarnwrap.util.Identifier(wrapperContained.method_23216(id.wrapperContained)); }
// public static yarnwrap.util.Identifier method_23216(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.ModelLoader.method_23216(id.wrapperContained)); }
// public void method_45875(yarnwrap.client.render.model.UnbakedModel model) { wrapperContained.method_45875(model.wrapperContained); }
// public static void method_45875(yarnwrap.client.render.model.UnbakedModel model, ) { net.minecraft.client.render.model.ModelLoader.method_45875(model.wrapperContained); }
// public void bake(Object spliteGetter) { wrapperContained.bake(spliteGetter); }
// public static void bake(Object spliteGetter, ) { net.minecraft.client.render.model.ModelLoader.bake(spliteGetter); }
// public yarnwrap.client.render.model.json.JsonUnbakedModel loadModelFromJson(yarnwrap.util.Identifier id) { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.loadModelFromJson(id.wrapperContained)); }
// public static yarnwrap.client.render.model.json.JsonUnbakedModel loadModelFromJson(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.render.model.json.JsonUnbakedModel(net.minecraft.client.render.model.ModelLoader.loadModelFromJson(id.wrapperContained)); }
// public void method_4719(yarnwrap.client.render.model.json.JsonUnbakedModel model) { wrapperContained.method_4719(model.wrapperContained); }
// public static void method_4719(yarnwrap.client.render.model.json.JsonUnbakedModel model, ) { net.minecraft.client.render.model.ModelLoader.method_4719(model.wrapperContained); }
// public void method_4721(yarnwrap.client.render.model.json.JsonUnbakedModel model) { wrapperContained.method_4721(model.wrapperContained); }
// public static void method_4721(yarnwrap.client.render.model.json.JsonUnbakedModel model, ) { net.minecraft.client.render.model.ModelLoader.method_4721(model.wrapperContained); }
// public yarnwrap.client.render.model.UnbakedModel getOrLoadModel(yarnwrap.util.Identifier id) { return new yarnwrap.client.render.model.UnbakedModel(wrapperContained.getOrLoadModel(id.wrapperContained)); }
// public static yarnwrap.client.render.model.UnbakedModel getOrLoadModel(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.render.model.UnbakedModel(net.minecraft.client.render.model.ModelLoader.getOrLoadModel(id.wrapperContained)); }
public java.util.Map getBakedModelMap() { return wrapperContained.getBakedModelMap(); }
// public static java.util.Map getBakedModelMap() { return net.minecraft.client.render.model.ModelLoader.getBakedModelMap(); }
// public java.lang.String method_60912(java.lang.String path) { return wrapperContained.method_60912(path); }
// public static java.lang.String method_60912(java.lang.String path, ) { return net.minecraft.client.render.model.ModelLoader.method_60912(path); }
// public void method_61072(Object id,yarnwrap.client.util.ModelIdentifier model) { wrapperContained.method_61072(id,model.wrapperContained); }
// public static void method_61072(Object id,yarnwrap.client.util.ModelIdentifier model, ) { net.minecraft.client.render.model.ModelLoader.method_61072(id,model.wrapperContained); }
// public void loadItemModel(yarnwrap.client.util.ModelIdentifier id) { wrapperContained.loadItemModel(id.wrapperContained); }
// public static void loadItemModel(yarnwrap.client.util.ModelIdentifier id, ) { net.minecraft.client.render.model.ModelLoader.loadItemModel(id.wrapperContained); }
// public void add(yarnwrap.client.util.ModelIdentifier id,yarnwrap.client.render.model.UnbakedModel model) { wrapperContained.add(id.wrapperContained,model.wrapperContained); }
// public static void add(yarnwrap.client.util.ModelIdentifier id,yarnwrap.client.render.model.UnbakedModel model, ) { net.minecraft.client.render.model.ModelLoader.add(id.wrapperContained,model.wrapperContained); }
// public void loadInventoryVariantItemModel(yarnwrap.util.Identifier id) { wrapperContained.loadInventoryVariantItemModel(id.wrapperContained); }
// public static void loadInventoryVariantItemModel(yarnwrap.util.Identifier id, ) { net.minecraft.client.render.model.ModelLoader.loadInventoryVariantItemModel(id.wrapperContained); }
// public void addModelToBake(yarnwrap.client.util.ModelIdentifier id,yarnwrap.client.render.model.UnbakedModel model) { wrapperContained.addModelToBake(id.wrapperContained,model.wrapperContained); }
// public static void addModelToBake(yarnwrap.client.util.ModelIdentifier id,yarnwrap.client.render.model.UnbakedModel model, ) { net.minecraft.client.render.model.ModelLoader.addModelToBake(id.wrapperContained,model.wrapperContained); }

}