package yarnwrap.client.render.entity.model;
public class SheepWoolEntityModel { public net.minecraft.client.render.entity.model.SheepWoolEntityModel wrapperContained; public SheepWoolEntityModel(net.minecraft.client.render.entity.model.SheepWoolEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float headAngle() { return wrapperContained.headAngle; }
// public void headAngle(float value) { wrapperContained.headAngle = value; }
// public static float headAngle() { return net.minecraft.client.render.entity.model.SheepWoolEntityModel.headAngle; }
// public static void headAngle(float value, ) { net.minecraft.client.render.entity.model.SheepWoolEntityModel.headAngle = value; }

public SheepWoolEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SheepWoolEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.SheepWoolEntityModel.getTexturedModelData()); }

}