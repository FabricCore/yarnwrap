package yarnwrap.client.render.model;
public class WeightedBlockStateModel { public net.minecraft.client.render.model.WeightedBlockStateModel wrapperContained; public WeightedBlockStateModel(net.minecraft.client.render.model.WeightedBlockStateModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.Pool models() { return new yarnwrap.util.collection.Pool(wrapperContained.models); }
// public void models(yarnwrap.util.collection.Pool value) { wrapperContained.models = value.wrapperContained; }
// public static yarnwrap.util.collection.Pool models() { return new yarnwrap.util.collection.Pool(net.minecraft.client.render.model.WeightedBlockStateModel.models); }
// public static void models(yarnwrap.util.collection.Pool value, ) { net.minecraft.client.render.model.WeightedBlockStateModel.models = value.wrapperContained; }

// public yarnwrap.client.texture.Sprite particleSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.particleSprite); }
// public void particleSprite(yarnwrap.client.texture.Sprite value) { wrapperContained.particleSprite = value.wrapperContained; }
// public static yarnwrap.client.texture.Sprite particleSprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.WeightedBlockStateModel.particleSprite); }
// public static void particleSprite(yarnwrap.client.texture.Sprite value, ) { net.minecraft.client.render.model.WeightedBlockStateModel.particleSprite = value.wrapperContained; }

public WeightedBlockStateModel(yarnwrap.util.collection.Pool models) { this.wrapperContained = new net.minecraft.client.render.model.WeightedBlockStateModel(models.wrapperContained); }

}