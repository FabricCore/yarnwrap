package yarnwrap.client.render.entity.model;
public class GhastEntityModel { public net.minecraft.client.render.entity.model.GhastEntityModel wrapperContained; public GhastEntityModel(net.minecraft.client.render.entity.model.GhastEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.GhastEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.GhastEntityModel.root = value.wrapperContained; }

// public net.minecraft.client.model.ModelPart[] tentacles() { return wrapperContained.tentacles; }
// public void tentacles(net.minecraft.client.model.ModelPart[] value) { wrapperContained.tentacles = value; }
// public static net.minecraft.client.model.ModelPart[] tentacles() { return net.minecraft.client.render.entity.model.GhastEntityModel.tentacles; }
// public static void tentacles(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.GhastEntityModel.tentacles = value; }

public GhastEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.GhastEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.GhastEntityModel.getTexturedModelData()); }
// public java.lang.String getTentacleName(int index) { return wrapperContained.getTentacleName(index); }
// public static java.lang.String getTentacleName(int index, ) { return net.minecraft.client.render.entity.model.GhastEntityModel.getTentacleName(index); }

}