package yarnwrap.client.render.entity.model;
public class PandaEntityModel { public net.minecraft.client.render.entity.model.PandaEntityModel wrapperContained; public PandaEntityModel(net.minecraft.client.render.entity.model.PandaEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float playAnimationProgress() { return wrapperContained.playAnimationProgress; }
// public float lieOnBackAnimationProgress() { return wrapperContained.lieOnBackAnimationProgress; }
// public float sittingAnimationProgress() { return wrapperContained.sittingAnimationProgress; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}