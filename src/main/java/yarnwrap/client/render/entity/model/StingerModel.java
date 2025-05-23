package yarnwrap.client.render.entity.model;
public class StingerModel { public net.minecraft.client.render.entity.model.StingerModel wrapperContained; public StingerModel(net.minecraft.client.render.entity.model.StingerModel wrapperContained) { this.wrapperContained = wrapperContained; }

public StingerModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.StingerModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.StingerModel.getTexturedModelData()); }

}