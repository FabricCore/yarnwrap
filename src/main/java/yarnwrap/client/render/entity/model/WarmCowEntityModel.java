package yarnwrap.client.render.entity.model;
public class WarmCowEntityModel { public net.minecraft.client.render.entity.model.WarmCowEntityModel wrapperContained; public WarmCowEntityModel(net.minecraft.client.render.entity.model.WarmCowEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.WarmCowEntityModel.getTexturedModelData()); }

}