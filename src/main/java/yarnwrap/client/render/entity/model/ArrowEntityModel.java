package yarnwrap.client.render.entity.model;
public class ArrowEntityModel { public net.minecraft.client.render.entity.model.ArrowEntityModel wrapperContained; public ArrowEntityModel(net.minecraft.client.render.entity.model.ArrowEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ArrowEntityModel.getTexturedModelData()); }

}