package yarnwrap.client.render.entity.model;
public class SkeletonEntityModel { public net.minecraft.client.render.entity.model.SkeletonEntityModel wrapperContained; public SkeletonEntityModel(net.minecraft.client.render.entity.model.SkeletonEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public void addLimbs(yarnwrap.client.model.ModelPartData data) { wrapperContained.addLimbs(data.wrapperContained); }

}