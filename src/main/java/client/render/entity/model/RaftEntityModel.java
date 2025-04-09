package yarnwrap.client.render.entity.model;
public class RaftEntityModel { public net.minecraft.client.render.entity.model.RaftEntityModel wrapperContained; public RaftEntityModel(net.minecraft.client.render.entity.model.RaftEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String LEFT_PADDLE() { return wrapperContained.LEFT_PADDLE; }
// public java.lang.String RIGHT_PADDLE() { return wrapperContained.RIGHT_PADDLE; }
// public java.lang.String BOTTOM() { return wrapperContained.BOTTOM; }
// public yarnwrap.client.model.ModelPart leftPaddle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftPaddle); }
// public yarnwrap.client.model.ModelPart rightPaddle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightPaddle); }
// public com.google.common.collect.ImmutableList parts() { return wrapperContained.parts; }
// public Object getParts(yarnwrap.client.model.ModelPart root) { return wrapperContained.getParts(root.wrapperContained); }
// public void setPaddleAngle(yarnwrap.entity.vehicle.BoatEntity entity,int sigma,yarnwrap.client.model.ModelPart part,float angle) { wrapperContained.setPaddleAngle(entity.wrapperContained,sigma,part.wrapperContained,angle); }
public void addParts(yarnwrap.client.model.ModelPartData modelPartData) { wrapperContained.addParts(modelPartData.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}