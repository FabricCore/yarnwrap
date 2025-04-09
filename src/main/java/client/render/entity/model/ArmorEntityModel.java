package yarnwrap.client.render.entity.model;
public class ArmorEntityModel { public net.minecraft.client.render.entity.model.ArmorEntityModel wrapperContained; public ArmorEntityModel(net.minecraft.client.render.entity.model.ArmorEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelData getModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData(dilation.wrapperContained)); }

}