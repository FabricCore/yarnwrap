package yarnwrap.client.render.entity;
public class EnderDragonEntityRenderer { public net.minecraft.client.render.entity.EnderDragonEntityRenderer wrapperContained; public EnderDragonEntityRenderer(net.minecraft.client.render.entity.EnderDragonEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier EYE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EYE_TEXTURE); }
// public float HALF_SQRT_3() { return wrapperContained.HALF_SQRT_3; }
// public Object model() { return wrapperContained.model; }
// public yarnwrap.client.render.RenderLayer DRAGON_CUTOUT() { return new yarnwrap.client.render.RenderLayer(wrapperContained.DRAGON_CUTOUT); }
// public yarnwrap.client.render.RenderLayer DRAGON_DECAL() { return new yarnwrap.client.render.RenderLayer(wrapperContained.DRAGON_DECAL); }
// public yarnwrap.client.render.RenderLayer DRAGON_EYES() { return new yarnwrap.client.render.RenderLayer(wrapperContained.DRAGON_EYES); }
// public yarnwrap.client.render.RenderLayer CRYSTAL_BEAM_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.CRYSTAL_BEAM_LAYER); }
public yarnwrap.util.Identifier CRYSTAL_BEAM_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRYSTAL_BEAM_TEXTURE); }
// public yarnwrap.util.Identifier EXPLOSION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPLOSION_TEXTURE); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public void renderCrystalBeam(float dx,float dy,float dz,float tickDelta,int age,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderCrystalBeam(dx,dy,dz,tickDelta,age,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public void renderDeathAnimation(yarnwrap.client.util.math.MatrixStack matrices,float animationProgress,yarnwrap.client.render.VertexConsumer vertexCOnsumer) { wrapperContained.renderDeathAnimation(matrices.wrapperContained,animationProgress,vertexCOnsumer.wrapperContained); }

}