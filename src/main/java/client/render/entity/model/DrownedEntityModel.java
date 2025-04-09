package yarnwrap.client.render.entity.model;
public class DrownedEntityModel { public net.minecraft.client.render.entity.model.DrownedEntityModel wrapperContained; public DrownedEntityModel(net.minecraft.client.render.entity.model.DrownedEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}