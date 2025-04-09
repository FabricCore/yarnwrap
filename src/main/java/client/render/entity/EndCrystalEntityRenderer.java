package yarnwrap.client.render.entity;
public class EndCrystalEntityRenderer { public net.minecraft.client.render.entity.EndCrystalEntityRenderer wrapperContained; public EndCrystalEntityRenderer(net.minecraft.client.render.entity.EndCrystalEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float SINE_45_DEGREES() { return wrapperContained.SINE_45_DEGREES; }
// public yarnwrap.client.model.ModelPart core() { return new yarnwrap.client.model.ModelPart(wrapperContained.core); }
// public yarnwrap.client.model.ModelPart frame() { return new yarnwrap.client.model.ModelPart(wrapperContained.frame); }
// public yarnwrap.client.model.ModelPart bottom() { return new yarnwrap.client.model.ModelPart(wrapperContained.bottom); }
// public yarnwrap.client.render.RenderLayer END_CRYSTAL() { return new yarnwrap.client.render.RenderLayer(wrapperContained.END_CRYSTAL); }
// public java.lang.String GLASS() { return wrapperContained.GLASS; }
// public java.lang.String BASE() { return wrapperContained.BASE; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
public float getYOffset(yarnwrap.entity.decoration.EndCrystalEntity crystal,float tickDelta) { return wrapperContained.getYOffset(crystal.wrapperContained,tickDelta); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}