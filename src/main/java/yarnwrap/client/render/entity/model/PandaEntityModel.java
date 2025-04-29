package yarnwrap.client.render.entity.model;
public class PandaEntityModel { public net.minecraft.client.render.entity.model.PandaEntityModel wrapperContained; public PandaEntityModel(net.minecraft.client.render.entity.model.PandaEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float playAnimationProgress() { return wrapperContained.playAnimationProgress; }
// public void playAnimationProgress(float value) { wrapperContained.playAnimationProgress = value; }
// public static float playAnimationProgress() { return net.minecraft.client.render.entity.model.PandaEntityModel.playAnimationProgress; }
// public static void playAnimationProgress(float value, ) { net.minecraft.client.render.entity.model.PandaEntityModel.playAnimationProgress = value; }

// public float lieOnBackAnimationProgress() { return wrapperContained.lieOnBackAnimationProgress; }
// public void lieOnBackAnimationProgress(float value) { wrapperContained.lieOnBackAnimationProgress = value; }
// public static float lieOnBackAnimationProgress() { return net.minecraft.client.render.entity.model.PandaEntityModel.lieOnBackAnimationProgress; }
// public static void lieOnBackAnimationProgress(float value, ) { net.minecraft.client.render.entity.model.PandaEntityModel.lieOnBackAnimationProgress = value; }

// public float sittingAnimationProgress() { return wrapperContained.sittingAnimationProgress; }
// public void sittingAnimationProgress(float value) { wrapperContained.sittingAnimationProgress = value; }
// public static float sittingAnimationProgress() { return net.minecraft.client.render.entity.model.PandaEntityModel.sittingAnimationProgress; }
// public static void sittingAnimationProgress(float value, ) { net.minecraft.client.render.entity.model.PandaEntityModel.sittingAnimationProgress = value; }

public PandaEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.PandaEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.PandaEntityModel.getTexturedModelData()); }

}