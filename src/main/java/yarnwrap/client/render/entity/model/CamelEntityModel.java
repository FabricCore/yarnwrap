package yarnwrap.client.render.entity.model;
public class CamelEntityModel { public net.minecraft.client.render.entity.model.CamelEntityModel wrapperContained; public CamelEntityModel(net.minecraft.client.render.entity.model.CamelEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float LIMB_ANGLE_SCALE() { return wrapperContained.LIMB_ANGLE_SCALE; }
// public void LIMB_ANGLE_SCALE(float value) { wrapperContained.LIMB_ANGLE_SCALE = value; }
// public static float LIMB_ANGLE_SCALE() { return net.minecraft.client.render.entity.model.CamelEntityModel.LIMB_ANGLE_SCALE; }
// public static void LIMB_ANGLE_SCALE(float value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.LIMB_ANGLE_SCALE = value; }

// public java.lang.String SADDLE() { return wrapperContained.SADDLE; }
// public void SADDLE(java.lang.String value) { wrapperContained.SADDLE = value; }
// public static java.lang.String SADDLE() { return net.minecraft.client.render.entity.model.CamelEntityModel.SADDLE; }
// public static void SADDLE(java.lang.String value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.SADDLE = value; }

// public java.lang.String BRIDLE() { return wrapperContained.BRIDLE; }
// public void BRIDLE(java.lang.String value) { wrapperContained.BRIDLE = value; }
// public static java.lang.String BRIDLE() { return net.minecraft.client.render.entity.model.CamelEntityModel.BRIDLE; }
// public static void BRIDLE(java.lang.String value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.BRIDLE = value; }

// public java.lang.String REINS() { return wrapperContained.REINS; }
// public void REINS(java.lang.String value) { wrapperContained.REINS = value; }
// public static java.lang.String REINS() { return net.minecraft.client.render.entity.model.CamelEntityModel.REINS; }
// public static void REINS(java.lang.String value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.REINS = value; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.CamelEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.CamelEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.head = value.wrapperContained; }

// public net.minecraft.client.model.ModelPart[] saddleAndBridle() { return wrapperContained.saddleAndBridle; }
// public void saddleAndBridle(net.minecraft.client.model.ModelPart[] value) { wrapperContained.saddleAndBridle = value; }
// public static net.minecraft.client.model.ModelPart[] saddleAndBridle() { return net.minecraft.client.render.entity.model.CamelEntityModel.saddleAndBridle; }
// public static void saddleAndBridle(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.saddleAndBridle = value; }

// public net.minecraft.client.model.ModelPart[] reins() { return wrapperContained.reins; }
// public void reins(net.minecraft.client.model.ModelPart[] value) { wrapperContained.reins = value; }
// public static net.minecraft.client.model.ModelPart[] reins() { return net.minecraft.client.render.entity.model.CamelEntityModel.reins; }
// public static void reins(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.reins = value; }

// public float LIMB_DISTANCE_SCALE() { return wrapperContained.LIMB_DISTANCE_SCALE; }
// public void LIMB_DISTANCE_SCALE(float value) { wrapperContained.LIMB_DISTANCE_SCALE = value; }
// public static float LIMB_DISTANCE_SCALE() { return net.minecraft.client.render.entity.model.CamelEntityModel.LIMB_DISTANCE_SCALE; }
// public static void LIMB_DISTANCE_SCALE(float value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.LIMB_DISTANCE_SCALE = value; }

public CamelEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.CamelEntityModel(root.wrapperContained); }
// public void updateVisibleParts(yarnwrap.entity.passive.CamelEntity camel) { wrapperContained.updateVisibleParts(camel.wrapperContained); }
// public static void updateVisibleParts(yarnwrap.entity.passive.CamelEntity camel, ) { net.minecraft.client.render.entity.model.CamelEntityModel.updateVisibleParts(camel.wrapperContained); }
// public void setHeadAngles(yarnwrap.entity.passive.CamelEntity entity,float headYaw,float headPitch,float animationProgress) { wrapperContained.setHeadAngles(entity.wrapperContained,headYaw,headPitch,animationProgress); }
// public static void setHeadAngles(yarnwrap.entity.passive.CamelEntity entity,float headYaw,float headPitch,float animationProgress, ) { net.minecraft.client.render.entity.model.CamelEntityModel.setHeadAngles(entity.wrapperContained,headYaw,headPitch,animationProgress); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.CamelEntityModel.getTexturedModelData()); }

}