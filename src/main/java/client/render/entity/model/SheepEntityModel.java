package yarnwrap.client.render.entity.model;
public class SheepEntityModel { public net.minecraft.client.render.entity.model.SheepEntityModel wrapperContained; public SheepEntityModel(net.minecraft.client.render.entity.model.SheepEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float headPitchModifier() { return wrapperContained.headPitchModifier; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}