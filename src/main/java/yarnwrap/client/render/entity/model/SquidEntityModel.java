package yarnwrap.client.render.entity.model;
public class SquidEntityModel { public net.minecraft.client.render.entity.model.SquidEntityModel wrapperContained; public SquidEntityModel(net.minecraft.client.render.entity.model.SquidEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SquidEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.SquidEntityModel.root = value.wrapperContained; }

// public net.minecraft.client.model.ModelPart[] tentacles() { return wrapperContained.tentacles; }
// public void tentacles(net.minecraft.client.model.ModelPart[] value) { wrapperContained.tentacles = value; }
// public static net.minecraft.client.model.ModelPart[] tentacles() { return net.minecraft.client.render.entity.model.SquidEntityModel.tentacles; }
// public static void tentacles(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.SquidEntityModel.tentacles = value; }

public SquidEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SquidEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SquidEntityModel.getTexturedModelData()); }
// public java.lang.String getTentacleName(int index) { return wrapperContained.getTentacleName(index); }
// public static java.lang.String getTentacleName(int index, ) { return net.minecraft.client.render.entity.model.SquidEntityModel.getTentacleName(index); }
// public yarnwrap.client.model.ModelPart method_32057(yarnwrap.client.model.ModelPart index) { return new yarnwrap.client.model.ModelPart(wrapperContained.method_32057(index.wrapperContained)); }
// public static yarnwrap.client.model.ModelPart method_32057(yarnwrap.client.model.ModelPart index, ) { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.SquidEntityModel.method_32057(index.wrapperContained)); }

}