package yarnwrap.client.render.model;
public class WeightedBakedModel { public net.minecraft.client.render.model.WeightedBakedModel wrapperContained; public WeightedBakedModel(net.minecraft.client.render.model.WeightedBakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public int totalWeight() { return wrapperContained.totalWeight; }
// public void totalWeight(int value) { wrapperContained.totalWeight = value; }
// public static int totalWeight() { return net.minecraft.client.render.model.WeightedBakedModel.totalWeight; }
// public static void totalWeight(int value, ) { net.minecraft.client.render.model.WeightedBakedModel.totalWeight = value; }

// public java.util.List models() { return wrapperContained.models; }
// public void models(java.util.List value) { wrapperContained.models = value; }
// public static java.util.List models() { return net.minecraft.client.render.model.WeightedBakedModel.models; }
// public static void models(java.util.List value, ) { net.minecraft.client.render.model.WeightedBakedModel.models = value; }

// public yarnwrap.client.render.model.BakedModel defaultModel() { return new yarnwrap.client.render.model.BakedModel(wrapperContained.defaultModel); }
// public void defaultModel(yarnwrap.client.render.model.BakedModel value) { wrapperContained.defaultModel = value.wrapperContained; }
// public static yarnwrap.client.render.model.BakedModel defaultModel() { return new yarnwrap.client.render.model.BakedModel(net.minecraft.client.render.model.WeightedBakedModel.defaultModel); }
// public static void defaultModel(yarnwrap.client.render.model.BakedModel value, ) { net.minecraft.client.render.model.WeightedBakedModel.defaultModel = value.wrapperContained; }

public WeightedBakedModel(java.util.List models) { this.wrapperContained = new net.minecraft.client.render.model.WeightedBakedModel(models); }

}