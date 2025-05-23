package yarnwrap.client.render.entity.model;
public class DragonHeadEntityModel { public net.minecraft.client.render.entity.model.DragonHeadEntityModel wrapperContained; public DragonHeadEntityModel(net.minecraft.client.render.entity.model.DragonHeadEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.DragonHeadEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.DragonHeadEntityModel.head = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart jaw() { return new yarnwrap.client.model.ModelPart(wrapperContained.jaw); }
// public void jaw(yarnwrap.client.model.ModelPart value) { wrapperContained.jaw = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart jaw() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.DragonHeadEntityModel.jaw); }
// public static void jaw(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.DragonHeadEntityModel.jaw = value.wrapperContained; }

// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.DragonHeadEntityModel.getTexturedModelData()); }

}