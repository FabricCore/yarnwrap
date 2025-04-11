package yarnwrap.client.render.entity.model;
public class PandaEntityModel { public net.minecraft.client.render.entity.model.PandaEntityModel wrapperContained; public PandaEntityModel(net.minecraft.client.render.entity.model.PandaEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float playAnimationProgress() { return wrapperContained.playAnimationProgress; }
// public void playAnimationProgress(float value) { wrapperContained.playAnimationProgress = value; }
// public float lieOnBackAnimationProgress() { return wrapperContained.lieOnBackAnimationProgress; }
// public void lieOnBackAnimationProgress(float value) { wrapperContained.lieOnBackAnimationProgress = value; }
// public float sittingAnimationProgress() { return wrapperContained.sittingAnimationProgress; }
// public void sittingAnimationProgress(float value) { wrapperContained.sittingAnimationProgress = value; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}