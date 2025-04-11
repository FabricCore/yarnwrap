package yarnwrap.client.render.entity.model;
public class BoatEntityModel { public net.minecraft.client.render.entity.model.BoatEntityModel wrapperContained; public BoatEntityModel(net.minecraft.client.render.entity.model.BoatEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList parts() { return wrapperContained.parts; }
// public void parts(com.google.common.collect.ImmutableList value) { wrapperContained.parts = value; }
// public yarnwrap.client.model.ModelPart leftPaddle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftPaddle); }
// public void leftPaddle(yarnwrap.client.model.ModelPart value) { wrapperContained.leftPaddle = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightPaddle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightPaddle); }
// public void rightPaddle(yarnwrap.client.model.ModelPart value) { wrapperContained.rightPaddle = value.wrapperContained; }
// public java.lang.String LEFT_PADDLE() { return wrapperContained.LEFT_PADDLE; }
// public void LEFT_PADDLE(java.lang.String value) { wrapperContained.LEFT_PADDLE = value; }
// public java.lang.String RIGHT_PADDLE() { return wrapperContained.RIGHT_PADDLE; }
// public void RIGHT_PADDLE(java.lang.String value) { wrapperContained.RIGHT_PADDLE = value; }
// public java.lang.String WATER_PATCH() { return wrapperContained.WATER_PATCH; }
// public void WATER_PATCH(java.lang.String value) { wrapperContained.WATER_PATCH = value; }
// public java.lang.String BOTTOM() { return wrapperContained.BOTTOM; }
// public void BOTTOM(java.lang.String value) { wrapperContained.BOTTOM = value; }
// public java.lang.String BACK() { return wrapperContained.BACK; }
// public void BACK(java.lang.String value) { wrapperContained.BACK = value; }
// public java.lang.String FRONT() { return wrapperContained.FRONT; }
// public void FRONT(java.lang.String value) { wrapperContained.FRONT = value; }
// public java.lang.String RIGHT() { return wrapperContained.RIGHT; }
// public void RIGHT(java.lang.String value) { wrapperContained.RIGHT = value; }
// public java.lang.String LEFT() { return wrapperContained.LEFT; }
// public void LEFT(java.lang.String value) { wrapperContained.LEFT = value; }
// public yarnwrap.client.model.ModelPart waterPatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.waterPatch); }
// public void waterPatch(yarnwrap.client.model.ModelPart value) { wrapperContained.waterPatch = value.wrapperContained; }
public BoatEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.BoatEntityModel(root.wrapperContained); }
// public void setPaddleAngle(yarnwrap.entity.vehicle.BoatEntity entity,int sigma,yarnwrap.client.model.ModelPart part,float angle) { wrapperContained.setPaddleAngle(entity.wrapperContained,sigma,part.wrapperContained,angle); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public Object getParts(yarnwrap.client.model.ModelPart root) { return wrapperContained.getParts(root.wrapperContained); }
public void addParts(yarnwrap.client.model.ModelPartData modelPartData) { wrapperContained.addParts(modelPartData.wrapperContained); }

}