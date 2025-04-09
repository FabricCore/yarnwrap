package yarnwrap.client.render.model;
public class ModelLoader { public net.minecraft.client.render.model.ModelLoader wrapperContained; public ModelLoader(net.minecraft.client.render.model.ModelLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return wrapperContained.stateLookup; }
public yarnwrap.client.util.SpriteIdentifier BANNER_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BANNER_BASE); }
public java.util.List BLOCK_DESTRUCTION_STAGES() { return wrapperContained.BLOCK_DESTRUCTION_STAGES; }
public java.util.List BLOCK_DESTRUCTION_STAGE_TEXTURES() { return wrapperContained.BLOCK_DESTRUCTION_STAGE_TEXTURES; }
public yarnwrap.client.util.SpriteIdentifier SHIELD_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.SHIELD_BASE); }
public yarnwrap.client.util.SpriteIdentifier SHIELD_BASE_NO_PATTERN() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.SHIELD_BASE_NO_PATTERN); }
public java.util.List BLOCK_DESTRUCTION_RENDER_LAYERS() { return wrapperContained.BLOCK_DESTRUCTION_RENDER_LAYERS; }
// public java.lang.String BUILTIN() { return wrapperContained.BUILTIN; }
// public java.lang.String BUILTIN_GENERATED() { return wrapperContained.BUILTIN_GENERATED; }
// public java.lang.String BUILTIN_ENTITY() { return wrapperContained.BUILTIN_ENTITY; }
// public java.lang.String MISSING() { return wrapperContained.MISSING; }
// public java.util.Map jsonUnbakedModels() { return wrapperContained.jsonUnbakedModels; }
public yarnwrap.resource.ResourceFinder MODELS_FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.MODELS_FINDER); }
// public yarnwrap.client.render.model.UnbakedModel missingModel() { return new yarnwrap.client.render.model.UnbakedModel(wrapperContained.missingModel); }
public yarnwrap.client.util.ModelIdentifier MISSING_MODEL_ID() { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.MISSING_MODEL_ID); }
public yarnwrap.client.util.SpriteIdentifier FIRE_1() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.FIRE_1); }
public java.lang.String MISSING_DEFINITION() { return wrapperContained.MISSING_DEFINITION; }
public yarnwrap.util.Identifier MISSING_ID() { return new yarnwrap.util.Identifier(wrapperContained.MISSING_ID); }
// public java.util.Map unbakedModels() { return wrapperContained.unbakedModels; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.util.SpriteIdentifier LAVA_FLOW() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.LAVA_FLOW); }
// public yarnwrap.client.render.model.json.ItemModelGenerator ITEM_MODEL_GENERATOR() { return new yarnwrap.client.render.model.json.ItemModelGenerator(wrapperContained.ITEM_MODEL_GENERATOR); }
// public java.util.Map bakedModels() { return wrapperContained.bakedModels; }
public yarnwrap.client.util.SpriteIdentifier WATER_OVERLAY() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.WATER_OVERLAY); }
public yarnwrap.client.render.model.json.JsonUnbakedModel BLOCK_ENTITY_MARKER() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.BLOCK_ENTITY_MARKER); }
// public java.util.Set modelsToLoad() { return wrapperContained.modelsToLoad; }
public yarnwrap.client.util.SpriteIdentifier WATER_FLOW() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.WATER_FLOW); }
// public java.util.Map modelsToBake() { return wrapperContained.modelsToBake; }
// public java.util.Map BUILTIN_MODEL_DEFINITIONS() { return wrapperContained.BUILTIN_MODEL_DEFINITIONS; }
public yarnwrap.client.util.SpriteIdentifier FIRE_0() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.FIRE_0); }
// public java.util.Map bakedModelCache() { return wrapperContained.bakedModelCache; }
public yarnwrap.client.render.model.json.JsonUnbakedModel GENERATION_MARKER() { return new yarnwrap.client.render.model.json.JsonUnbakedModel(wrapperContained.GENERATION_MARKER); }
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