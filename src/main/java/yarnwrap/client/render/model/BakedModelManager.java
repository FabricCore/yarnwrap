package yarnwrap.client.render.model;
public class BakedModelManager { public net.minecraft.client.render.model.BakedModelManager wrapperContained; public BakedModelManager(net.minecraft.client.render.model.BakedModelManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.color.block.BlockColors colorMap() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.colorMap); }
// public void colorMap(yarnwrap.client.color.block.BlockColors value) { wrapperContained.colorMap = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return wrapperContained.stateLookup; }
// public void stateLookup(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.stateLookup = value; }
// public yarnwrap.client.render.model.SpriteAtlasManager atlasManager() { return new yarnwrap.client.render.model.SpriteAtlasManager(wrapperContained.atlasManager); }
// public void atlasManager(yarnwrap.client.render.model.SpriteAtlasManager value) { wrapperContained.atlasManager = value.wrapperContained; }
// public int mipmapLevels() { return wrapperContained.mipmapLevels; }
// public void mipmapLevels(int value) { wrapperContained.mipmapLevels = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map LAYERS_TO_LOADERS() { return wrapperContained.LAYERS_TO_LOADERS; }
// public void LAYERS_TO_LOADERS(java.util.Map value) { wrapperContained.LAYERS_TO_LOADERS = value; }
// public yarnwrap.client.render.model.BakedModel missingModel() { return new yarnwrap.client.render.model.BakedModel(wrapperContained.missingModel); }
// public void missingModel(yarnwrap.client.render.model.BakedModel value) { wrapperContained.missingModel = value.wrapperContained; }
// public java.util.Map models() { return wrapperContained.models; }
// public void models(java.util.Map value) { wrapperContained.models = value; }
// public yarnwrap.client.render.block.BlockModels blockModelCache() { return new yarnwrap.client.render.block.BlockModels(wrapperContained.blockModelCache); }
// public void blockModelCache(yarnwrap.client.render.block.BlockModels value) { wrapperContained.blockModelCache = value.wrapperContained; }
public BakedModelManager(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.client.color.block.BlockColors colorMap,int mipmap) { this.wrapperContained = new net.minecraft.client.render.model.BakedModelManager(textureManager.wrapperContained,colorMap.wrapperContained,mipmap); }
// public void upload(Object bakingResult,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.upload(bakingResult,profiler.wrapperContained); }
public boolean shouldRerender(yarnwrap.block.BlockState from,yarnwrap.block.BlockState to) { return wrapperContained.shouldRerender(from.wrapperContained,to.wrapperContained); }
public void setMipmapLevels(int mipmapLevels) { wrapperContained.setMipmapLevels(mipmapLevels); }
public yarnwrap.client.texture.SpriteAtlasTexture getAtlas(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.SpriteAtlasTexture(wrapperContained.getAtlas(id.wrapperContained)); }
// public void method_45879(yarnwrap.client.util.ModelIdentifier spriteIds) { wrapperContained.method_45879(spriteIds.wrapperContained); }
// public java.util.concurrent.CompletableFuture reloadModels(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.reloadModels(resourceManager.wrapperContained,executor); }
// public void method_45882(yarnwrap.util.profiler.Profiler result) { wrapperContained.method_45882(result.wrapperContained); }
// public Object bake(yarnwrap.util.profiler.Profiler profiler,java.util.Map preparations,yarnwrap.client.render.model.ModelLoader modelLoader) { return wrapperContained.bake(profiler.wrapperContained,preparations,modelLoader.wrapperContained); }
// public yarnwrap.client.render.model.ModelLoader method_45884(yarnwrap.util.profiler.Profiler jsonUnbakedModels,java.util.Map blockStates) { return new yarnwrap.client.render.model.ModelLoader(wrapperContained.method_45884(jsonUnbakedModels.wrapperContained,blockStates)); }
// public Object method_45885(yarnwrap.util.profiler.Profiler void_) { return wrapperContained.method_45885(void_.wrapperContained); }
// public java.util.concurrent.CompletionStage method_45887(Object result) { return wrapperContained.method_45887(result); }
// public Object method_45888(Object void_) { return wrapperContained.method_45888(void_); }
// public java.util.Map method_45889(java.util.List blockStates) { return wrapperContained.method_45889(blockStates); }
// public yarnwrap.client.texture.Sprite method_45891(java.util.Map spriteId) { return new yarnwrap.client.texture.Sprite(wrapperContained.method_45891(spriteId)); }
// public void method_45892(java.util.Map state) { wrapperContained.method_45892(state); }
// public java.util.concurrent.CompletionStage method_45893(java.util.concurrent.Executor blockStates) { return wrapperContained.method_45893(blockStates); }
// public java.util.concurrent.CompletableFuture reloadBlockStates(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.reloadBlockStates(resourceManager.wrapperContained,executor); }
// public java.util.Map method_45897(java.util.List models) { return wrapperContained.method_45897(models); }
// public java.util.concurrent.CompletionStage method_45899(java.util.concurrent.Executor models) { return wrapperContained.method_45899(models); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.client.util.ModelIdentifier id) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(id.wrapperContained)); }
public yarnwrap.client.render.block.BlockModels getBlockModels() { return new yarnwrap.client.render.block.BlockModels(wrapperContained.getBlockModels()); }
public yarnwrap.client.render.model.BakedModel getMissingModel() { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getMissingModel()); }

}