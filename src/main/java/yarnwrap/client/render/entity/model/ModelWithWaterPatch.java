package yarnwrap.client.render.entity.model;
public class ModelWithWaterPatch { public net.minecraft.client.render.entity.model.ModelWithWaterPatch wrapperContained; public ModelWithWaterPatch(net.minecraft.client.render.entity.model.ModelWithWaterPatch wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelPart getWaterPatch() { return new yarnwrap.client.model.ModelPart(wrapperContained.getWaterPatch()); }
// public static yarnwrap.client.model.ModelPart getWaterPatch() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.ModelWithWaterPatch.getWaterPatch()); }

}