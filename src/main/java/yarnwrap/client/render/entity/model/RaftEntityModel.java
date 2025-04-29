package yarnwrap.client.render.entity.model;
public class RaftEntityModel { public net.minecraft.client.render.entity.model.RaftEntityModel wrapperContained; public RaftEntityModel(net.minecraft.client.render.entity.model.RaftEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String LEFT_PADDLE() { return wrapperContained.LEFT_PADDLE; }
// public void LEFT_PADDLE(java.lang.String value) { wrapperContained.LEFT_PADDLE = value; }
// public static java.lang.String LEFT_PADDLE() { return net.minecraft.client.render.entity.model.RaftEntityModel.LEFT_PADDLE; }
// public static void LEFT_PADDLE(java.lang.String value, ) { net.minecraft.client.render.entity.model.RaftEntityModel.LEFT_PADDLE = value; }

// public java.lang.String RIGHT_PADDLE() { return wrapperContained.RIGHT_PADDLE; }
// public void RIGHT_PADDLE(java.lang.String value) { wrapperContained.RIGHT_PADDLE = value; }
// public static java.lang.String RIGHT_PADDLE() { return net.minecraft.client.render.entity.model.RaftEntityModel.RIGHT_PADDLE; }
// public static void RIGHT_PADDLE(java.lang.String value, ) { net.minecraft.client.render.entity.model.RaftEntityModel.RIGHT_PADDLE = value; }

// public java.lang.String BOTTOM() { return wrapperContained.BOTTOM; }
// public void BOTTOM(java.lang.String value) { wrapperContained.BOTTOM = value; }
// public static java.lang.String BOTTOM() { return net.minecraft.client.render.entity.model.RaftEntityModel.BOTTOM; }
// public static void BOTTOM(java.lang.String value, ) { net.minecraft.client.render.entity.model.RaftEntityModel.BOTTOM = value; }

// public yarnwrap.client.model.ModelPart leftPaddle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftPaddle); }
// public void leftPaddle(yarnwrap.client.model.ModelPart value) { wrapperContained.leftPaddle = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftPaddle() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.RaftEntityModel.leftPaddle); }
// public static void leftPaddle(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.RaftEntityModel.leftPaddle = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightPaddle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightPaddle); }
// public void rightPaddle(yarnwrap.client.model.ModelPart value) { wrapperContained.rightPaddle = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightPaddle() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.RaftEntityModel.rightPaddle); }
// public static void rightPaddle(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.RaftEntityModel.rightPaddle = value.wrapperContained; }

// public com.google.common.collect.ImmutableList parts() { return wrapperContained.parts; }
// public void parts(com.google.common.collect.ImmutableList value) { wrapperContained.parts = value; }
// public static com.google.common.collect.ImmutableList parts() { return net.minecraft.client.render.entity.model.RaftEntityModel.parts; }
// public static void parts(com.google.common.collect.ImmutableList value, ) { net.minecraft.client.render.entity.model.RaftEntityModel.parts = value; }

public RaftEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.RaftEntityModel(root.wrapperContained); }
// public Object getParts(yarnwrap.client.model.ModelPart root) { return wrapperContained.getParts(root.wrapperContained); }
// public static Object getParts(yarnwrap.client.model.ModelPart root, ) { return net.minecraft.client.render.entity.model.RaftEntityModel.getParts(root.wrapperContained); }
// public void setPaddleAngle(yarnwrap.entity.vehicle.BoatEntity entity,int sigma,yarnwrap.client.model.ModelPart part,float angle) { wrapperContained.setPaddleAngle(entity.wrapperContained,sigma,part.wrapperContained,angle); }
// public static void setPaddleAngle(yarnwrap.entity.vehicle.BoatEntity entity,int sigma,yarnwrap.client.model.ModelPart part,float angle, ) { net.minecraft.client.render.entity.model.RaftEntityModel.setPaddleAngle(entity.wrapperContained,sigma,part.wrapperContained,angle); }
// public void addParts(yarnwrap.client.model.ModelPartData modelPartData) { wrapperContained.addParts(modelPartData.wrapperContained); }
// public static void addParts(yarnwrap.client.model.ModelPartData modelPartData, ) { net.minecraft.client.render.entity.model.RaftEntityModel.addParts(modelPartData.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.RaftEntityModel.getTexturedModelData()); }

}