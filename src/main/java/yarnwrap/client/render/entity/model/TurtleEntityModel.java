package yarnwrap.client.render.entity.model;
public class TurtleEntityModel { public net.minecraft.client.render.entity.model.TurtleEntityModel wrapperContained; public TurtleEntityModel(net.minecraft.client.render.entity.model.TurtleEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String EGG_BELLY() { return wrapperContained.EGG_BELLY; }
// public void EGG_BELLY(java.lang.String value) { wrapperContained.EGG_BELLY = value; }
// public static java.lang.String EGG_BELLY() { return net.minecraft.client.render.entity.model.TurtleEntityModel.EGG_BELLY; }
// public static void EGG_BELLY(java.lang.String value, ) { net.minecraft.client.render.entity.model.TurtleEntityModel.EGG_BELLY = value; }

// public yarnwrap.client.model.ModelPart plastron() { return new yarnwrap.client.model.ModelPart(wrapperContained.plastron); }
// public void plastron(yarnwrap.client.model.ModelPart value) { wrapperContained.plastron = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart plastron() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.TurtleEntityModel.plastron); }
// public static void plastron(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.TurtleEntityModel.plastron = value.wrapperContained; }

public TurtleEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.TurtleEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.TurtleEntityModel.getTexturedModelData()); }

}