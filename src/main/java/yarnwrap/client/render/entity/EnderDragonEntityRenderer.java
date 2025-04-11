package yarnwrap.client.render.entity;
public class EnderDragonEntityRenderer { public net.minecraft.client.render.entity.EnderDragonEntityRenderer wrapperContained; public EnderDragonEntityRenderer(net.minecraft.client.render.entity.EnderDragonEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier EYE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EYE_TEXTURE); }
// public void EYE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EYE_TEXTURE = value.wrapperContained; }
// public float HALF_SQRT_3() { return wrapperContained.HALF_SQRT_3; }
// public void HALF_SQRT_3(float value) { wrapperContained.HALF_SQRT_3 = value; }
// public Object model() { return wrapperContained.model; }
// // public void model(Object value) { wrapperContained.model = value; }
// public yarnwrap.client.render.RenderLayer DRAGON_CUTOUT() { return new yarnwrap.client.render.RenderLayer(wrapperContained.DRAGON_CUTOUT); }
// public void DRAGON_CUTOUT(yarnwrap.client.render.RenderLayer value) { wrapperContained.DRAGON_CUTOUT = value.wrapperContained; }
// public yarnwrap.client.render.RenderLayer DRAGON_DECAL() { return new yarnwrap.client.render.RenderLayer(wrapperContained.DRAGON_DECAL); }
// public void DRAGON_DECAL(yarnwrap.client.render.RenderLayer value) { wrapperContained.DRAGON_DECAL = value.wrapperContained; }
// public yarnwrap.client.render.RenderLayer DRAGON_EYES() { return new yarnwrap.client.render.RenderLayer(wrapperContained.DRAGON_EYES); }
// public void DRAGON_EYES(yarnwrap.client.render.RenderLayer value) { wrapperContained.DRAGON_EYES = value.wrapperContained; }
// public yarnwrap.client.render.RenderLayer CRYSTAL_BEAM_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.CRYSTAL_BEAM_LAYER); }
// public void CRYSTAL_BEAM_LAYER(yarnwrap.client.render.RenderLayer value) { wrapperContained.CRYSTAL_BEAM_LAYER = value.wrapperContained; }
public yarnwrap.util.Identifier CRYSTAL_BEAM_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRYSTAL_BEAM_TEXTURE); }
// public void CRYSTAL_BEAM_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CRYSTAL_BEAM_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier EXPLOSION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPLOSION_TEXTURE); }
// public void EXPLOSION_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EXPLOSION_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public void renderCrystalBeam(float dx,float dy,float dz,float tickDelta,int age,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderCrystalBeam(dx,dy,dz,tickDelta,age,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public void renderDeathAnimation(yarnwrap.client.util.math.MatrixStack matrices,float animationProgress,yarnwrap.client.render.VertexConsumer vertexCOnsumer) { wrapperContained.renderDeathAnimation(matrices.wrapperContained,animationProgress,vertexCOnsumer.wrapperContained); }

}