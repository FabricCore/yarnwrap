package yarnwrap.client.render.entity.model;
public class MinecartEntityModel { public net.minecraft.client.render.entity.model.MinecartEntityModel wrapperContained; public MinecartEntityModel(net.minecraft.client.render.entity.model.MinecartEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}