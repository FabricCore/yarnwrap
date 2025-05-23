package yarnwrap.client.render.entity.model;
public class ElytraEntityModel { public net.minecraft.client.render.entity.model.ElytraEntityModel wrapperContained; public ElytraEntityModel(net.minecraft.client.render.entity.model.ElytraEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWing = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ElytraEntityModel.leftWing); }
// public static void leftWing(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ElytraEntityModel.leftWing = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ElytraEntityModel.rightWing); }
// public static void rightWing(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.ElytraEntityModel.rightWing = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(wrapperContained.BABY_TRANSFORMER); }
// public void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value) { wrapperContained.BABY_TRANSFORMER = value.wrapperContained; }
public static yarnwrap.client.render.entity.model.ModelTransformer BABY_TRANSFORMER() { return new yarnwrap.client.render.entity.model.ModelTransformer(net.minecraft.client.render.entity.model.ElytraEntityModel.BABY_TRANSFORMER); }
// public static void BABY_TRANSFORMER(yarnwrap.client.render.entity.model.ModelTransformer value, ) { net.minecraft.client.render.entity.model.ElytraEntityModel.BABY_TRANSFORMER = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ElytraEntityModel.getTexturedModelData()); }

}