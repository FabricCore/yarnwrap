package yarnwrap.client.render.block.entity;
public class SkullBlockEntityModel { public net.minecraft.client.render.block.entity.SkullBlockEntityModel wrapperContained; public SkullBlockEntityModel(net.minecraft.client.render.block.entity.SkullBlockEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public SkullBlockEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.block.entity.SkullBlockEntityModel(root.wrapperContained); }
public void setHeadRotation(float animationProgress,float yaw,float pitch) { wrapperContained.setHeadRotation(animationProgress,yaw,pitch); }
// public static void setHeadRotation(float animationProgress,float yaw,float pitch, ) { net.minecraft.client.render.block.entity.SkullBlockEntityModel.setHeadRotation(animationProgress,yaw,pitch); }

}