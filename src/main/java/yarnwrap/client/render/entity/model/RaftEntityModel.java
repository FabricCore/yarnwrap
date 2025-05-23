package yarnwrap.client.render.entity.model;
public class RaftEntityModel { public net.minecraft.client.render.entity.model.RaftEntityModel wrapperContained; public RaftEntityModel(net.minecraft.client.render.entity.model.RaftEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public void addParts(yarnwrap.client.model.ModelPartData modelPartData) { wrapperContained.addParts(modelPartData.wrapperContained); }
// public static void addParts(yarnwrap.client.model.ModelPartData modelPartData, ) { net.minecraft.client.render.entity.model.RaftEntityModel.addParts(modelPartData.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.RaftEntityModel.getTexturedModelData()); }
// public yarnwrap.client.model.TexturedModelData getChestTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getChestTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getChestTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.RaftEntityModel.getChestTexturedModelData()); }

}