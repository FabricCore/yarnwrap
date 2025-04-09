package yarnwrap.client.render.entity;
public class PlayerEntityRenderer { public net.minecraft.client.render.entity.PlayerEntityRenderer wrapperContained; public PlayerEntityRenderer(net.minecraft.client.render.entity.PlayerEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public void renderArm(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.network.AbstractClientPlayerEntity player,yarnwrap.client.model.ModelPart arm,yarnwrap.client.model.ModelPart sleeve) { wrapperContained.renderArm(matrices.wrapperContained,vertexConsumers.wrapperContained,light,player.wrapperContained,arm.wrapperContained,sleeve.wrapperContained); }
// public Object getArmPose(yarnwrap.client.network.AbstractClientPlayerEntity player,yarnwrap.util.Hand hand) { return wrapperContained.getArmPose(player.wrapperContained,hand.wrapperContained); }
// public void setModelPose(yarnwrap.client.network.AbstractClientPlayerEntity player) { wrapperContained.setModelPose(player.wrapperContained); }
public void renderRightArm(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.network.AbstractClientPlayerEntity player) { wrapperContained.renderRightArm(matrices.wrapperContained,vertexConsumers.wrapperContained,light,player.wrapperContained); }
public void renderLeftArm(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.network.AbstractClientPlayerEntity player) { wrapperContained.renderLeftArm(matrices.wrapperContained,vertexConsumers.wrapperContained,light,player.wrapperContained); }

}