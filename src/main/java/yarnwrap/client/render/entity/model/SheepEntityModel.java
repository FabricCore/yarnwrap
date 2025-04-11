package yarnwrap.client.render.entity.model;
public class SheepEntityModel { public net.minecraft.client.render.entity.model.SheepEntityModel wrapperContained; public SheepEntityModel(net.minecraft.client.render.entity.model.SheepEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float headPitchModifier() { return wrapperContained.headPitchModifier; }
// public void headPitchModifier(float value) { wrapperContained.headPitchModifier = value; }
public SheepEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.SheepEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}