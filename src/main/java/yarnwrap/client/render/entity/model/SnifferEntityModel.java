package yarnwrap.client.render.entity.model;
public class SnifferEntityModel { public net.minecraft.client.render.entity.model.SnifferEntityModel wrapperContained; public SnifferEntityModel(net.minecraft.client.render.entity.model.SnifferEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public float LIMB_ANGLE_SCALE() { return wrapperContained.LIMB_ANGLE_SCALE; }
// public void LIMB_ANGLE_SCALE(float value) { wrapperContained.LIMB_ANGLE_SCALE = value; }
// public float LIMB_DISTANCE_SCALE() { return wrapperContained.LIMB_DISTANCE_SCALE; }
// public void LIMB_DISTANCE_SCALE(float value) { wrapperContained.LIMB_DISTANCE_SCALE = value; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}