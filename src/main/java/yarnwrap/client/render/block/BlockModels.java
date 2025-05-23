package yarnwrap.client.render.block;
public class BlockModels { public net.minecraft.client.render.block.BlockModels wrapperContained; public BlockModels(net.minecraft.client.render.block.BlockModels wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map models() { return wrapperContained.models; }
// public void models(java.util.Map value) { wrapperContained.models = value; }
// public static java.util.Map models() { return net.minecraft.client.render.block.BlockModels.models; }
// public static void models(java.util.Map value, ) { net.minecraft.client.render.block.BlockModels.models = value; }

// public yarnwrap.client.render.model.BakedModelManager modelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.modelManager); }
// public void modelManager(yarnwrap.client.render.model.BakedModelManager value) { wrapperContained.modelManager = value.wrapperContained; }
// public static yarnwrap.client.render.model.BakedModelManager modelManager() { return new yarnwrap.client.render.model.BakedModelManager(net.minecraft.client.render.block.BlockModels.modelManager); }
// public static void modelManager(yarnwrap.client.render.model.BakedModelManager value, ) { net.minecraft.client.render.block.BlockModels.modelManager = value.wrapperContained; }

public BlockModels(yarnwrap.client.render.model.BakedModelManager modelManager) { this.wrapperContained = new net.minecraft.client.render.block.BlockModels(modelManager.wrapperContained); }
public yarnwrap.client.render.model.BakedModelManager getModelManager() { return new yarnwrap.client.render.model.BakedModelManager(wrapperContained.getModelManager()); }
// public static yarnwrap.client.render.model.BakedModelManager getModelManager() { return new yarnwrap.client.render.model.BakedModelManager(net.minecraft.client.render.block.BlockModels.getModelManager()); }
public yarnwrap.client.render.model.BlockStateModel getModel(yarnwrap.block.BlockState state) { return new yarnwrap.client.render.model.BlockStateModel(wrapperContained.getModel(state.wrapperContained)); }
// public static yarnwrap.client.render.model.BlockStateModel getModel(yarnwrap.block.BlockState state, ) { return new yarnwrap.client.render.model.BlockStateModel(net.minecraft.client.render.block.BlockModels.getModel(state.wrapperContained)); }
public yarnwrap.client.texture.Sprite getModelParticleSprite(yarnwrap.block.BlockState state) { return new yarnwrap.client.texture.Sprite(wrapperContained.getModelParticleSprite(state.wrapperContained)); }
// public static yarnwrap.client.texture.Sprite getModelParticleSprite(yarnwrap.block.BlockState state, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.block.BlockModels.getModelParticleSprite(state.wrapperContained)); }
public void setModels(java.util.Map models) { wrapperContained.setModels(models); }
// public static void setModels(java.util.Map models, ) { net.minecraft.client.render.block.BlockModels.setModels(models); }

}