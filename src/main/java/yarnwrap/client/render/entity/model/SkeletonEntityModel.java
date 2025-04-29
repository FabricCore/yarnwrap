package yarnwrap.client.render.entity.model;
public class SkeletonEntityModel { public net.minecraft.client.render.entity.model.SkeletonEntityModel wrapperContained; public SkeletonEntityModel(net.minecraft.client.render.entity.model.SkeletonEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SkeletonEntityModel.getTexturedModelData()); }
// public void addLimbs(yarnwrap.client.model.ModelPartData data) { wrapperContained.addLimbs(data.wrapperContained); }
// public static void addLimbs(yarnwrap.client.model.ModelPartData data, ) { net.minecraft.client.render.entity.model.SkeletonEntityModel.addLimbs(data.wrapperContained); }

}