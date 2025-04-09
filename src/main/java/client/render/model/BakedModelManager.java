package yarnwrap.client.render.model;
public class BakedModelManager { public net.minecraft.client.render.model.BakedModelManager wrapperContained; public BakedModelManager(net.minecraft.client.render.model.BakedModelManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.color.block.BlockColors colorMap() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.colorMap); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return wrapperContained.stateLookup; }
// public yarnwrap.client.render.model.SpriteAtlasManager atlasManager() { return new yarnwrap.client.render.model.SpriteAtlasManager(wrapperContained.atlasManager); }
// public int mipmapLevels() { return wrapperContained.mipmapLevels; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map LAYERS_TO_LOADERS() { return wrapperContained.LAYERS_TO_LOADERS; }
// public yarnwrap.client.render.model.BakedModel missingModel() { return new yarnwrap.client.render.model.BakedModel(wrapperContained.missingModel); }
// public java.util.Map models() { return wrapperContained.models; }
// public yarnwrap.client.render.block.BlockModels blockModelCache() { return new yarnwrap.client.render.block.BlockModels(wrapperContained.blockModelCache); }
// public void upload(Object bakingResult,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.upload(bakingResult,profiler.wrapperContained); }
public boolean shouldRerender(yarnwrap.block.BlockState from,yarnwrap.block.BlockState to) { return wrapperContained.shouldRerender(from.wrapperContained,to.wrapperContained); }
public void setMipmapLevels(int mipmapLevels) { wrapperContained.setMipmapLevels(mipmapLevels); }
public yarnwrap.client.texture.SpriteAtlasTexture getAtlas(yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.SpriteAtlasTexture(wrapperContained.getAtlas(id.wrapperContained)); }
// public java.util.concurrent.CompletableFuture reloadModels(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.reloadModels(resourceManager.wrapperContained,executor); }
// public Object bake(yarnwrap.util.profiler.Profiler profiler,java.util.Map preparations,yarnwrap.client.render.model.ModelLoader modelLoader) { return wrapperContained.bake(profiler.wrapperContained,preparations,modelLoader.wrapperContained); }
// public java.util.concurrent.CompletableFuture reloadBlockStates(yarnwrap.resource.ResourceManager resourceManager,java.util.concurrent.Executor executor) { return wrapperContained.reloadBlockStates(resourceManager.wrapperContained,executor); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.client.util.ModelIdentifier id) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(id.wrapperContained)); }
public yarnwrap.client.render.block.BlockModels getBlockModels() { return new yarnwrap.client.render.block.BlockModels(wrapperContained.getBlockModels()); }
public yarnwrap.client.render.model.BakedModel getMissingModel() { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getMissingModel()); }

}