package yarnwrap.client.render.entity.model;
public class SnifferEntityModel { public net.minecraft.client.render.entity.model.SnifferEntityModel wrapperContained; public SnifferEntityModel(net.minecraft.client.render.entity.model.SnifferEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SnifferEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SnifferEntityModel.head = value.wrapperContained; }

// public float LIMB_ANGLE_SCALE() { return wrapperContained.LIMB_ANGLE_SCALE; }
// public void LIMB_ANGLE_SCALE(float value) { wrapperContained.LIMB_ANGLE_SCALE = value; }
// public static float LIMB_ANGLE_SCALE() { return net.minecraft.client.render.entity.model.SnifferEntityModel.LIMB_ANGLE_SCALE; }
// public static void LIMB_ANGLE_SCALE(float value, ) { net.minecraft.client.render.entity.model.SnifferEntityModel.LIMB_ANGLE_SCALE = value; }

// public float LIMB_DISTANCE_SCALE() { return wrapperContained.LIMB_DISTANCE_SCALE; }
// public void LIMB_DISTANCE_SCALE(float value) { wrapperContained.LIMB_DISTANCE_SCALE = value; }
// public static float LIMB_DISTANCE_SCALE() { return net.minecraft.client.render.entity.model.SnifferEntityModel.LIMB_DISTANCE_SCALE; }
// public static void LIMB_DISTANCE_SCALE(float value, ) { net.minecraft.client.render.entity.model.SnifferEntityModel.LIMB_DISTANCE_SCALE = value; }

// public yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.BABY_TRANSFORMER); }
// public void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value) { wrapperContained.BABY_TRANSFORMER = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.SnifferEntityModel.BABY_TRANSFORMER); }
// public static void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value, ) { net.minecraft.client.render.entity.model.SnifferEntityModel.BABY_TRANSFORMER = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SnifferEntityModel.getTexturedModelData()); }

}