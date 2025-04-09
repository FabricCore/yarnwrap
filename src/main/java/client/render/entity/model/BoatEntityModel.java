package yarnwrap.client.render.entity.model;
public class BoatEntityModel { public net.minecraft.client.render.entity.model.BoatEntityModel wrapperContained; public BoatEntityModel(net.minecraft.client.render.entity.model.BoatEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList parts() { return wrapperContained.parts; }
// public yarnwrap.client.model.ModelPart leftPaddle() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftPaddle); }
// public yarnwrap.client.model.ModelPart rightPaddle() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightPaddle); }
// public java.lang.String LEFT_PADDLE() { return wrapperContained.LEFT_PADDLE; }
// public java.lang.String RIGHT_PADDLE() { return wrapperContained.RIGHT_PADDLE; }
// public java.lang.String WATER_PATCH() { return wrapperContained.WATER_PATCH; }
// public java.lang.String BOTTOM() { return wrapperContained.BOTTOM; }
// public java.lang.String BACK() { return wrapperContained.BACK; }
// public java.lang.String FRONT() { return wrapperContained.FRONT; }
// public java.lang.String RIGHT() { return wrapperContained.RIGHT; }
// public java.lang.String LEFT() { return wrapperContained.LEFT; }
// public yarnwrap.client.model.ModelPart waterPatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.waterPatch); }
// public void setPaddleAngle(yarnwrap.entity.vehicle.BoatEntity entity,int sigma,yarnwrap.client.model.ModelPart part,float angle) { wrapperContained.setPaddleAngle(entity.wrapperContained,sigma,part.wrapperContained,angle); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public Object getParts(yarnwrap.client.model.ModelPart root) { return wrapperContained.getParts(root.wrapperContained); }
public void addParts(yarnwrap.client.model.ModelPartData modelPartData) { wrapperContained.addParts(modelPartData.wrapperContained); }

}