package yarnwrap.client.render.block;
public class BlockModels { public net.minecraft.client.render.block.BlockModels wrapperContained; public BlockModels(net.minecraft.client.render.block.BlockModels wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map models() { return wrapperContained.models; }
// public void models(java.util.Map value) { wrapperContained.models = value; }
// public yarnwrap.client.render.model.BakedModelManager modelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.modelManager); }
// public void modelManager(yarnwrap.client.render.model.BakedModelManager value) { wrapperContained.modelManager = value.wrapperContained; }
public yarnwrap.client.render.model.BakedModelManager getModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.getModelManager()); }
// public java.lang.String propertyValueToString(yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.propertyValueToString(property.wrapperContained,value); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.block.BlockState state) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(state.wrapperContained)); }
public yarnwrap.client.util.ModelIdentifier getModelId(yarnwrap.util.Identifier id,yarnwrap.block.BlockState state) { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.getModelId(id.wrapperContained,state.wrapperContained)); }
public java.lang.String propertyMapToString(java.util.Map map) { return wrapperContained.propertyMapToString(map); }
public yarnwrap.client.texture.Sprite getModelParticleSprite(yarnwrap.block.BlockState state) { return new yarnwrap.client.texture.Sprite(wrapperContained.getModelParticleSprite(state.wrapperContained)); }
public yarnwrap.client.util.ModelIdentifier getModelId(yarnwrap.block.BlockState state) { return new yarnwrap.client.util.ModelIdentifier(wrapperContained.getModelId(state.wrapperContained)); }
public void setModels(java.util.Map models) { wrapperContained.setModels(models); }

}