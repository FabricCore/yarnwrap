package yarnwrap.client.render.entity.model;
public class CamelEntityModel { public net.minecraft.client.render.entity.model.CamelEntityModel wrapperContained; public CamelEntityModel(net.minecraft.client.render.entity.model.CamelEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float LIMB_ANGLE_SCALE() { return wrapperContained.LIMB_ANGLE_SCALE; }
// public void LIMB_ANGLE_SCALE(float value) { wrapperContained.LIMB_ANGLE_SCALE = value; }
// public java.lang.String SADDLE() { return wrapperContained.SADDLE; }
// public void SADDLE(java.lang.String value) { wrapperContained.SADDLE = value; }
// public java.lang.String BRIDLE() { return wrapperContained.BRIDLE; }
// public void BRIDLE(java.lang.String value) { wrapperContained.BRIDLE = value; }
// public java.lang.String REINS() { return wrapperContained.REINS; }
// public void REINS(java.lang.String value) { wrapperContained.REINS = value; }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public net.minecraft.client.model.ModelPart[] saddleAndBridle() { return wrapperContained.saddleAndBridle; }
// public void saddleAndBridle(net.minecraft.client.model.ModelPart[] value) { wrapperContained.saddleAndBridle = value; }
// public net.minecraft.client.model.ModelPart[] reins() { return wrapperContained.reins; }
// public void reins(net.minecraft.client.model.ModelPart[] value) { wrapperContained.reins = value; }
// public float LIMB_DISTANCE_SCALE() { return wrapperContained.LIMB_DISTANCE_SCALE; }
// public void LIMB_DISTANCE_SCALE(float value) { wrapperContained.LIMB_DISTANCE_SCALE = value; }
// public void updateVisibleParts(yarnwrap.entity.passive.CamelEntity camel) { wrapperContained.updateVisibleParts(camel.wrapperContained); }
// public void setHeadAngles(yarnwrap.entity.passive.CamelEntity entity,float headYaw,float headPitch,float animationProgress) { wrapperContained.setHeadAngles(entity.wrapperContained,headYaw,headPitch,animationProgress); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}