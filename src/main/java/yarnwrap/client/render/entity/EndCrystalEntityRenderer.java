package yarnwrap.client.render.entity;
public class EndCrystalEntityRenderer { public net.minecraft.client.render.entity.EndCrystalEntityRenderer wrapperContained; public EndCrystalEntityRenderer(net.minecraft.client.render.entity.EndCrystalEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float SINE_45_DEGREES() { return wrapperContained.SINE_45_DEGREES; }
// public void SINE_45_DEGREES(float value) { wrapperContained.SINE_45_DEGREES = value; }
// public yarnwrap.client.model.ModelPart core() { return new yarnwrap.client.model.ModelPart(wrapperContained.core); }
// public void core(yarnwrap.client.model.ModelPart value) { wrapperContained.core = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart frame() { return new yarnwrap.client.model.ModelPart(wrapperContained.frame); }
// public void frame(yarnwrap.client.model.ModelPart value) { wrapperContained.frame = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart bottom() { return new yarnwrap.client.model.ModelPart(wrapperContained.bottom); }
// public void bottom(yarnwrap.client.model.ModelPart value) { wrapperContained.bottom = value.wrapperContained; }
// public yarnwrap.client.render.RenderLayer END_CRYSTAL() { return new yarnwrap.client.render.RenderLayer(wrapperContained.END_CRYSTAL); }
// public void END_CRYSTAL(yarnwrap.client.render.RenderLayer value) { wrapperContained.END_CRYSTAL = value.wrapperContained; }
// public java.lang.String GLASS() { return wrapperContained.GLASS; }
// public void GLASS(java.lang.String value) { wrapperContained.GLASS = value; }
// public java.lang.String BASE() { return wrapperContained.BASE; }
// public void BASE(java.lang.String value) { wrapperContained.BASE = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public float getYOffset(yarnwrap.entity.decoration.EndCrystalEntity crystal,float tickDelta) { return wrapperContained.getYOffset(crystal.wrapperContained,tickDelta); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}