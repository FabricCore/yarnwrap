package yarnwrap.client.render.entity.model;
public class CreakingEntityModel { public net.minecraft.client.render.entity.model.CreakingEntityModel wrapperContained; public CreakingEntityModel(net.minecraft.client.render.entity.model.CreakingEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List INACTIVE_EMISSIVE_PARTS() { return wrapperContained.INACTIVE_EMISSIVE_PARTS; }
// public void INACTIVE_EMISSIVE_PARTS(java.util.List value) { wrapperContained.INACTIVE_EMISSIVE_PARTS = value; }
public static java.util.List INACTIVE_EMISSIVE_PARTS() { return net.minecraft.client.render.entity.model.CreakingEntityModel.INACTIVE_EMISSIVE_PARTS; }
// public static void INACTIVE_EMISSIVE_PARTS(java.util.List value, ) { net.minecraft.client.render.entity.model.CreakingEntityModel.INACTIVE_EMISSIVE_PARTS = value; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.CreakingEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.CreakingEntityModel.head = value.wrapperContained; }

// public java.util.List activeEmissiveParts() { return wrapperContained.activeEmissiveParts; }
// public void activeEmissiveParts(java.util.List value) { wrapperContained.activeEmissiveParts = value; }
// public static java.util.List activeEmissiveParts() { return net.minecraft.client.render.entity.model.CreakingEntityModel.activeEmissiveParts; }
// public static void activeEmissiveParts(java.util.List value, ) { net.minecraft.client.render.entity.model.CreakingEntityModel.activeEmissiveParts = value; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.CreakingEntityModel.getTexturedModelData()); }
// public yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData()); }
// public static yarnwrap.client.model.ModelData getModelData() { return new yarnwrap.client.model.ModelData(net.minecraft.client.render.entity.model.CreakingEntityModel.getModelData()); }
public java.util.List getEmissiveParts(yarnwrap.client.render.entity.state.CreakingEntityRenderState state) { return wrapperContained.getEmissiveParts(state.wrapperContained); }
// public static java.util.List getEmissiveParts(yarnwrap.client.render.entity.state.CreakingEntityRenderState state, ) { return net.minecraft.client.render.entity.model.CreakingEntityModel.getEmissiveParts(state.wrapperContained); }

}