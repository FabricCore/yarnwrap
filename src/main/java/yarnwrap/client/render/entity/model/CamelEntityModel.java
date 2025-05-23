package yarnwrap.client.render.entity.model;
public class CamelEntityModel { public net.minecraft.client.render.entity.model.CamelEntityModel wrapperContained; public CamelEntityModel(net.minecraft.client.render.entity.model.CamelEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float LIMB_ANGLE_SCALE() { return wrapperContained.LIMB_ANGLE_SCALE; }
// public void LIMB_ANGLE_SCALE(float value) { wrapperContained.LIMB_ANGLE_SCALE = value; }
// public static float LIMB_ANGLE_SCALE() { return net.minecraft.client.render.entity.model.CamelEntityModel.LIMB_ANGLE_SCALE; }
// public static void LIMB_ANGLE_SCALE(float value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.LIMB_ANGLE_SCALE = value; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.CamelEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.head = value.wrapperContained; }

// public float LIMB_DISTANCE_SCALE() { return wrapperContained.LIMB_DISTANCE_SCALE; }
// public void LIMB_DISTANCE_SCALE(float value) { wrapperContained.LIMB_DISTANCE_SCALE = value; }
// public static float LIMB_DISTANCE_SCALE() { return net.minecraft.client.render.entity.model.CamelEntityModel.LIMB_DISTANCE_SCALE; }
// public static void LIMB_DISTANCE_SCALE(float value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.LIMB_DISTANCE_SCALE = value; }

// public yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.BABY_TRANSFORMER); }
// public void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value) { wrapperContained.BABY_TRANSFORMER = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.CamelEntityModel.BABY_TRANSFORMER); }
// public static void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value, ) { net.minecraft.client.render.entity.model.CamelEntityModel.BABY_TRANSFORMER = value.wrapperContained; }

// public void setHeadAngles(yarnwrap.client.render.entity.state.CamelEntityRenderState state,float headYaw,float headPitch) { wrapperContained.setHeadAngles(state.wrapperContained,headYaw,headPitch); }
// public static void setHeadAngles(yarnwrap.client.render.entity.state.CamelEntityRenderState state,float headYaw,float headPitch, ) { net.minecraft.client.render.entity.model.CamelEntityModel.setHeadAngles(state.wrapperContained,headYaw,headPitch); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.CamelEntityModel.getTexturedModelData()); }
// public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }
// public static yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.CamelEntityModel.getModelData()); }

}