package yarnwrap.client.render.entity.model;
public class DragonHeadEntityModel { public net.minecraft.client.render.entity.model.DragonHeadEntityModel wrapperContained; public DragonHeadEntityModel(net.minecraft.client.render.entity.model.DragonHeadEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart jaw() { return new yarnwrap.client.model.ModelPart(wrapperContained.jaw); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}