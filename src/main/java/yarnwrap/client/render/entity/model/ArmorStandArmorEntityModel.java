package yarnwrap.client.render.entity.model;
public class ArmorStandArmorEntityModel { public net.minecraft.client.render.entity.model.ArmorStandArmorEntityModel wrapperContained; public ArmorStandArmorEntityModel(net.minecraft.client.render.entity.model.ArmorStandArmorEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.TexturedModelData getTexturedModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData(dilation.wrapperContained)); }

}