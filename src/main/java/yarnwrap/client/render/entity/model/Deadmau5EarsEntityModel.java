package yarnwrap.client.render.entity.model;
public class Deadmau5EarsEntityModel { public net.minecraft.client.render.entity.model.Deadmau5EarsEntityModel wrapperContained; public Deadmau5EarsEntityModel(net.minecraft.client.render.entity.model.Deadmau5EarsEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.Deadmau5EarsEntityModel.getTexturedModelData()); }

}