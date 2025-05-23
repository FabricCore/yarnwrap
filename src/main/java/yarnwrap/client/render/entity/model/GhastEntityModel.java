package yarnwrap.client.render.entity.model;
public class GhastEntityModel { public net.minecraft.client.render.entity.model.GhastEntityModel wrapperContained; public GhastEntityModel(net.minecraft.client.render.entity.model.GhastEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.model.ModelPart[] tentacles() { return wrapperContained.tentacles; }
// public void tentacles(net.minecraft.client.model.ModelPart[] value) { wrapperContained.tentacles = value; }
// public static net.minecraft.client.model.ModelPart[] tentacles() { return net.minecraft.client.render.entity.model.GhastEntityModel.tentacles; }
// public static void tentacles(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.GhastEntityModel.tentacles = value; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.GhastEntityModel.getTexturedModelData()); }
// public void setTentacleAngles(yarnwrap.client.render.entity.state.EntityRenderState state,net.minecraft.client.model.ModelPart[] tentacles) { wrapperContained.setTentacleAngles(state.wrapperContained,tentacles); }
// public static void setTentacleAngles(yarnwrap.client.render.entity.state.EntityRenderState state,net.minecraft.client.model.ModelPart[] tentacles, ) { net.minecraft.client.render.entity.model.GhastEntityModel.setTentacleAngles(state.wrapperContained,tentacles); }

}