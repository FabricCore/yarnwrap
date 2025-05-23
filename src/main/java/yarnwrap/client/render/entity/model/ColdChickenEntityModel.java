package yarnwrap.client.render.entity.model;
public class ColdChickenEntityModel { public net.minecraft.client.render.entity.model.ColdChickenEntityModel wrapperContained; public ColdChickenEntityModel(net.minecraft.client.render.entity.model.ColdChickenEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ColdChickenEntityModel.getTexturedModelData()); }

}