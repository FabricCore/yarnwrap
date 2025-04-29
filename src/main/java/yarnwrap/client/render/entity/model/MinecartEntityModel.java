package yarnwrap.client.render.entity.model;
public class MinecartEntityModel { public net.minecraft.client.render.entity.model.MinecartEntityModel wrapperContained; public MinecartEntityModel(net.minecraft.client.render.entity.model.MinecartEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.MinecartEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.MinecartEntityModel.root = value.wrapperContained; }

public MinecartEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.MinecartEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.MinecartEntityModel.getTexturedModelData()); }

}