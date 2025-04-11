package yarnwrap.client.render.entity;
public class WindChargeEntityRenderer { public net.minecraft.client.render.entity.WindChargeEntityRenderer wrapperContained; public WindChargeEntityRenderer(net.minecraft.client.render.entity.WindChargeEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.client.render.entity.model.WindChargeEntityModel model() { return new yarnwrap.client.render.entity.model.WindChargeEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.WindChargeEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public float getXOffset(float tickDelta) { return wrapperContained.getXOffset(tickDelta); }

}