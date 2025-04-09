package yarnwrap.client.render.entity.model;
public class SheepWoolEntityModel { public net.minecraft.client.render.entity.model.SheepWoolEntityModel wrapperContained; public SheepWoolEntityModel(net.minecraft.client.render.entity.model.SheepWoolEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float headAngle() { return wrapperContained.headAngle; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}