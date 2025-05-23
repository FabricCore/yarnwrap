package yarnwrap.client.render.entity.model;
public class ColdCowEntityModel { public net.minecraft.client.render.entity.model.ColdCowEntityModel wrapperContained; public ColdCowEntityModel(net.minecraft.client.render.entity.model.ColdCowEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ColdCowEntityModel.getTexturedModelData()); }

}