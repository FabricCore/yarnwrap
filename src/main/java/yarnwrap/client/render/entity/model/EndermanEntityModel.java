package yarnwrap.client.render.entity.model;
public class EndermanEntityModel { public net.minecraft.client.render.entity.model.EndermanEntityModel wrapperContained; public EndermanEntityModel(net.minecraft.client.render.entity.model.EndermanEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.EndermanEntityModel.getTexturedModelData()); }

}