package yarnwrap.client.render.model;
public class ModelLoader { public net.minecraft.client.render.model.ModelLoader wrapperContained; public ModelLoader(net.minecraft.client.render.model.ModelLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return wrapperContained.stateLookup; }
// public void stateLookup(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.stateLookup = value; }
public yarnwrap.client.util.SpriteIdentifier BANNER_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BANNER_BASE); }
// public void BANNER_BASE(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.BANNER_BASE = value.wrapperContained; }
public java.util.List BLOCK_DESTRUCTION_STAGES() { return wrapperContained.BLOCK_DESTRUCTION_STAGES; }
// public void BLOCK_DESTRUCTION_STAGES(java.util.List value) { wrapperContained.BLOCK_DESTRUCTION_STAGES = value; }
public java.util.List BLOCK_DESTRUCTION_STAGE_TEXTURES() { return wrapperContained.BLOCK_DESTRUCTION_STAGE_TEXTURES; }
// public void BLOCK_DESTRUCTION_STAGE_TEXTURES(java.util.List value) { wrapperContained.BLOCK_DESTRUCTION_STAGE_TEXTURES = value; }
public yarnwrap.client.util.SpriteIdentifier SHIELD_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.SHIELD_BASE); }
// public void SHIELD_BASE(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.SHIELD_BASE = value.wrapperContained; }
public yarnwrap.client.util.SpriteIdentifier SHIELD_BASE_NO_PATTERN() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.SHIELD_BASE_NO_PATTERN); }
// public void SHIELD_BASE_NO_PATTERN(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.SHIELD_BASE_NO_PATTERN = value.wrapperContained; }
public java.util.List BLOCK_DESTRUCTION_RENDER_LAYERS() { return wrapperContained.BLOCK_DESTRUCTION_RENDER_LAYERS; }
// public void BLOCK_DESTRUCTION_RENDER_LAYERS(java.util.List value) { wrapperContained.BLOCK_DESTRUCTION_RENDER_LAYERS = value; }
// public java.lang.String BUILTIN() { return wrapperContained.BUILTIN; }
// public void BUILTIN(java.lang.String value) { wrapperContained.BUILTIN = value; }
// public java.lang.String BUILTIN_GENERATED() { return wrapperContained.BUILTIN_GENERATED; }
// public void BUILTIN_GENERATED(java.lang.String value) { wrapperContained.BUILTIN_GENERATED = value; }
// public java.lang.String BUILTIN_ENTITY() { return wrapperContained.BUILTIN_ENTITY; }
// public void BUILTIN_ENTITY(java.lang.String value) { wrapperContained.BUILTIN_ENTITY = value; }
// public java.lang.String MISSING() { return wrapperContained.MISSING; }
// public void MISSING(java.lang.String value) { wrapperContained.MISSING = value; }
// public java.util.Map jsonUnbakedModels() { return wrapperContained.jsonUnbakedModels; }
// public void jsonUnbakedModels(java.util.Map value) { wrapperContained.jsonUnbakedModels = value; }
public yarnwrap.resource.ResourceFinder MODELS_FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.MODELS_FINDER); }
// public void MODELS_FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.MODELS_FINDER = value.wrapperContained; }
// public yarnwrap.client.render.model.UnbakedModel missingModel() { return new yarnwrap.client.render.model.UnbakedModel(wrapperContained.missingModel); }
// public void missingModel(yarnwrap.client.render.model.UnbakedModel value) { wrapperContained.missingModel = value.wrapperContained; }
public yarnwrap.client.util.ModelIdentifier MISSING_MODEL_ID() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.MISSING_MODEL_ID); }
// public void MISSING_MODEL_ID(yarnwrap.client.util.ModelIdentifier value) { wrapperContained.MISSING_MODEL_ID = value.wrapperContained; }
public yarnwrap.client.util.SpriteIdentifier FIRE_1() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.FIRE_1); }
// public void FIRE_1(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.FIRE_1 = value.wrapperContained; }
public java.lang.String MISSING_DEFINITION() { return wrapperContained.MISSING_DEFINITION; }
// public void MISSING_DEFINITION(java.lang.String value) { wrapperContained.MISSING_DEFINITION = value; }
public yarnwrap.util.Identifier MISSING_ID() { return new yarnwrap.util.Identifier(wrapperContained.MISSING_ID); }
// public void MISSING_ID(yarnwrap.util.Identifier value) { wrapperContained.MISSING_ID = value.wrapperContained; }
// public java.util.Map unbakedModels() { return wrapperContained.unbakedModels; }
// public void unbakedModels(java.util.Map value) { wrapperContained.unbakedModels = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.client.util.SpriteIdentifier LAVA_FLOW() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.LAVA_FLOW); }
// public void LAVA_FLOW(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.LAVA_FLOW = value.wrapperContained; }
// public yarnwrap.client.render.model.json.ItemModelGenerator ITEM_MODEL_GENERATOR() { return new yarnwrap.client.render.model.json.ItemModelGenerator(wrapperContained.ITEM_MODEL_GENERATOR); }
// public void ITEM_MODEL_GENERATOR(yarnwrap.client.render.model.json.ItemModelGenerator value) { wrapperContained.ITEM_MODEL_GENERATOR = value.wrapperContained; }
// public java.util.Map bakedModels() { return wrapperContained.bakedModels; }
// public void bakedModels(java.util.Map value) { wrapperContained.bakedModels = value; }
public yarnwrap.client.util.SpriteIdentifier WATER_OVERLAY() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.WATER_OVERLAY); }
// public void WATER_OVERLAY(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.WATER_OVERLAY = value.wrapperContained; }
public yarnwrap.client.render.model.json.JsonUnbakedModel BLOCK_ENTITY_MARKER() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.BLOCK_ENTITY_MARKER); }
// public void BLOCK_ENTITY_MARKER(yarnwrap.client.render.model.json.JsonUnbakedModel value) { wrapperContained.BLOCK_ENTITY_MARKER = value.wrapperContained; }
// public java.util.Set modelsToLoad() { return wrapperContained.modelsToLoad; }
// public void modelsToLoad(java.util.Set value) { wrapperContained.modelsToLoad = value; }
public yarnwrap.client.util.SpriteIdentifier WATER_FLOW() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.WATER_FLOW); }
// public void WATER_FLOW(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.WATER_FLOW = value.wrapperContained; }
// public java.util.Map modelsToBake() { return wrapperContained.modelsToBake; }
// public void modelsToBake(java.util.Map value) { wrapperContained.modelsToBake = value; }
// public java.util.Map BUILTIN_MODEL_DEFINITIONS() { return wrapperContained.BUILTIN_MODEL_DEFINITIONS; }
// public void BUILTIN_MODEL_DEFINITIONS(java.util.Map value) { wrapperContained.BUILTIN_MODEL_DEFINITIONS = value; }
public yarnwrap.client.util.SpriteIdentifier FIRE_0() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.FIRE_0); }
// public void FIRE_0(yarnwrap.client.util.SpriteIdentifier value) { wrapperContained.FIRE_0 = value.wrapperContained; }
// public java.util.Map bakedModelCache() { return wrapperContained.bakedModelCache; }
// public void bakedModelCache(java.util.Map value) { wrapperContained.bakedModelCache = value; }
public yarnwrap.client.render.model.json.JsonUnbakedModel GENERATION_MARKER() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.GENERATION_MARKER); }
// public void GENERATION_MARKER(yarnwrap.client.render.model.json.JsonUnbakedModel value) { wrapperContained.GENERATION_MARKER = value.wrapperContained; }
public it.unimi.dsi.fastutil.objects.Object2IntMap getStateLookup() { return wrapperContained.getStateLookup(); }
// public void bake(Object spliteGetter) { wrapperContained.bake(spliteGetter); }
// public yarnwrap.client.render.model.json.JsonUnbakedModel loadModelFromJson(yarnwrap.util.Identifier id) { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.loadModelFromJson(id.wrapperContained)); }
// public yarnwrap.client.render.model.UnbakedModel getOrLoadModel(yarnwrap.util.Identifier id) { return new yarnwrap.client.render.model.UnbakedModel(wrapperContained.getOrLoadModel(id.wrapperContained)); }
public java.util.Map getBakedModelMap() { return wrapperContained.getBakedModelMap(); }
// public void loadItemModel(yarnwrap.client.util.ModelIdentifier id) { wrapperContained.loadItemModel(id.wrapperContained); }
// public void add(yarnwrap.client.util.ModelIdentifier id,yarnwrap.client.render.model.UnbakedModel model) { wrapperContained.add(id.wrapperContained,model.wrapperContained); }
// public void loadInventoryVariantItemModel(yarnwrap.util.Identifier id) { wrapperContained.loadInventoryVariantItemModel(id.wrapperContained); }
// public void addModelToBake(yarnwrap.client.util.ModelIdentifier id,yarnwrap.client.render.model.UnbakedModel model) { wrapperContained.addModelToBake(id.wrapperContained,model.wrapperContained); }

}