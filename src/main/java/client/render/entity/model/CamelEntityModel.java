package yarnwrap.client.render.entity.model;
public class CamelEntityModel { public net.minecraft.client.render.entity.model.CamelEntityModel wrapperContained; public CamelEntityModel(net.minecraft.client.render.entity.model.CamelEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float LIMB_ANGLE_SCALE() { return wrapperContained.LIMB_ANGLE_SCALE; }
// public java.lang.String SADDLE() { return wrapperContained.SADDLE; }
// public java.lang.String BRIDLE() { return wrapperContained.BRIDLE; }
// public java.lang.String REINS() { return wrapperContained.REINS; }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public net.minecraft.client.model.ModelPart[] saddleAndBridle() { return wrapperContained.saddleAndBridle; }
// public net.minecraft.client.model.ModelPart[] reins() { return wrapperContained.reins; }
// public float LIMB_DISTANCE_SCALE() { return wrapperContained.LIMB_DISTANCE_SCALE; }
// public void updateVisibleParts(yarnwrap.entity.passive.CamelEntity camel) { wrapperContained.updateVisibleParts(camel.wrapperContained); }
// public void setHeadAngles(yarnwrap.entity.passive.CamelEntity entity,float headYaw,float headPitch,float animationProgress) { wrapperContained.setHeadAngles(entity.wrapperContained,headYaw,headPitch,animationProgress); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}