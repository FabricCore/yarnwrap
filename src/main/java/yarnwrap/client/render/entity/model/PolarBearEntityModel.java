package yarnwrap.client.render.entity.model;
public class PolarBearEntityModel { public net.minecraft.client.render.entity.model.PolarBearEntityModel wrapperContained; public PolarBearEntityModel(net.minecraft.client.render.entity.model.PolarBearEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}