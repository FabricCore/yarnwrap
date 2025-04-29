package yarnwrap.client.render.entity.model;
public class BlazeEntityModel { public net.minecraft.client.render.entity.model.BlazeEntityModel wrapperContained; public BlazeEntityModel(net.minecraft.client.render.entity.model.BlazeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.BlazeEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.BlazeEntityModel.root = value.wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.BlazeEntityModel.head); }
// public static void head(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.BlazeEntityModel.head = value.wrapperContained; }

// public net.minecraft.client.model.ModelPart[] rods() { return wrapperContained.rods; }
// public void rods(net.minecraft.client.model.ModelPart[] value) { wrapperContained.rods = value; }
// public static net.minecraft.client.model.ModelPart[] rods() { return net.minecraft.client.render.entity.model.BlazeEntityModel.rods; }
// public static void rods(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.BlazeEntityModel.rods = value; }

public BlazeEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.BlazeEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.BlazeEntityModel.getTexturedModelData()); }
// public java.lang.String getRodName(int index) { return wrapperContained.getRodName(index); }
// public static java.lang.String getRodName(int index, ) { return net.minecraft.client.render.entity.model.BlazeEntityModel.getRodName(index); }
// public yarnwrap.client.model.ModelPart method_31984(yarnwrap.client.model.ModelPart index) { return new yarnwrap.client.model.ModelPart(wrapperContained.method_31984(index.wrapperContained)); }
// public static yarnwrap.client.model.ModelPart method_31984(yarnwrap.client.model.ModelPart index, ) { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.BlazeEntityModel.method_31984(index.wrapperContained)); }

}