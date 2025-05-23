package yarnwrap.client.render.entity.model;
public class ColdPigEntityModel { public net.minecraft.client.render.entity.model.ColdPigEntityModel wrapperContained; public ColdPigEntityModel(net.minecraft.client.render.entity.model.ColdPigEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }
// public static yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation, ) { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.ColdPigEntityModel.getTexturedModelData(dilation.wrapperContained)); }

}