package yarnwrap.client.render;
public class SkyRendering { public net.minecraft.client.render.SkyRendering wrapperContained; public SkyRendering(net.minecraft.client.render.SkyRendering wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier SUN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SUN_TEXTURE); }
// public void SUN_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SUN_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier SUN_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.SkyRendering.SUN_TEXTURE); }
// public static void SUN_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.SkyRendering.SUN_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier MOON_PHASES_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MOON_PHASES_TEXTURE); }
// public void MOON_PHASES_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.MOON_PHASES_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier MOON_PHASES_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.SkyRendering.MOON_PHASES_TEXTURE); }
// public static void MOON_PHASES_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.SkyRendering.MOON_PHASES_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier END_SKY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.END_SKY_TEXTURE); }
// public void END_SKY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.END_SKY_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier END_SKY_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.SkyRendering.END_SKY_TEXTURE); }
// public static void END_SKY_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.SkyRendering.END_SKY_TEXTURE = value.wrapperContained; }

// public com.mojang.blaze3d.buffers.GpuBuffer starVertexBuffer() { return wrapperContained.starVertexBuffer; }
// public void starVertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value) { wrapperContained.starVertexBuffer = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer starVertexBuffer() { return net.minecraft.client.render.SkyRendering.starVertexBuffer; }
// public static void starVertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value, ) { net.minecraft.client.render.SkyRendering.starVertexBuffer = value; }

// public com.mojang.blaze3d.buffers.GpuBuffer topSkyVertexBuffer() { return wrapperContained.topSkyVertexBuffer; }
// public void topSkyVertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value) { wrapperContained.topSkyVertexBuffer = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer topSkyVertexBuffer() { return net.minecraft.client.render.SkyRendering.topSkyVertexBuffer; }
// public static void topSkyVertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value, ) { net.minecraft.client.render.SkyRendering.topSkyVertexBuffer = value; }

// public com.mojang.blaze3d.buffers.GpuBuffer bottomSkyVertexBuffer() { return wrapperContained.bottomSkyVertexBuffer; }
// public void bottomSkyVertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value) { wrapperContained.bottomSkyVertexBuffer = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer bottomSkyVertexBuffer() { return net.minecraft.client.render.SkyRendering.bottomSkyVertexBuffer; }
// public static void bottomSkyVertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value, ) { net.minecraft.client.render.SkyRendering.bottomSkyVertexBuffer = value; }

// public com.mojang.blaze3d.buffers.GpuBuffer endSkyVertexBuffer() { return wrapperContained.endSkyVertexBuffer; }
// public void endSkyVertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value) { wrapperContained.endSkyVertexBuffer = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer endSkyVertexBuffer() { return net.minecraft.client.render.SkyRendering.endSkyVertexBuffer; }
// public static void endSkyVertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value, ) { net.minecraft.client.render.SkyRendering.endSkyVertexBuffer = value; }

// public Object indexBuffer() { return wrapperContained.indexBuffer; }
// // public void indexBuffer(Object value) { wrapperContained.indexBuffer = value; }
// // public static Object indexBuffer() { return net.minecraft.client.render.SkyRendering.indexBuffer; }
// // public static void indexBuffer(Object value, ) { net.minecraft.client.render.SkyRendering.indexBuffer = value; }

// public int starIndexCount() { return wrapperContained.starIndexCount; }
// public void starIndexCount(int value) { wrapperContained.starIndexCount = value; }
// public static int starIndexCount() { return net.minecraft.client.render.SkyRendering.starIndexCount; }
// public static void starIndexCount(int value, ) { net.minecraft.client.render.SkyRendering.starIndexCount = value; }

public void renderTopSky(float red,float green,float blue) { wrapperContained.renderTopSky(red,green,blue); }
// public static void renderTopSky(float red,float green,float blue, ) { net.minecraft.client.render.SkyRendering.renderTopSky(red,green,blue); }
// public void renderSun(float alpha,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderSun(alpha,vertexConsumers.wrapperContained,matrices.wrapperContained); }
// public static void renderSun(float alpha,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.render.SkyRendering.renderSun(alpha,vertexConsumers.wrapperContained,matrices.wrapperContained); }
// public void renderMoon(int phase,float alpha,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderMoon(phase,alpha,vertexConsumers.wrapperContained,matrices.wrapperContained); }
// public static void renderMoon(int phase,float alpha,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.render.SkyRendering.renderMoon(phase,alpha,vertexConsumers.wrapperContained,matrices.wrapperContained); }
public void renderSkyDark() { wrapperContained.renderSkyDark(); }
// public static void renderSkyDark() { net.minecraft.client.render.SkyRendering.renderSkyDark(); }
// public void renderGlowingSky(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,float angleRadians,int color) { wrapperContained.renderGlowingSky(matrices.wrapperContained,vertexConsumers,angleRadians,color); }
// public static void renderGlowingSky(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,float angleRadians,int color, ) { net.minecraft.client.render.SkyRendering.renderGlowingSky(matrices.wrapperContained,vertexConsumers,angleRadians,color); }
// public void renderCelestialBodies(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,float rot,int phase,float alpha,float starBrightness) { wrapperContained.renderCelestialBodies(matrices.wrapperContained,vertexConsumers,rot,phase,alpha,starBrightness); }
// public static void renderCelestialBodies(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,float rot,int phase,float alpha,float starBrightness, ) { net.minecraft.client.render.SkyRendering.renderCelestialBodies(matrices.wrapperContained,vertexConsumers,rot,phase,alpha,starBrightness); }
// public void createSky(yarnwrap.client.render.VertexConsumer vertexConsumer,float height) { wrapperContained.createSky(vertexConsumer.wrapperContained,height); }
// public static void createSky(yarnwrap.client.render.VertexConsumer vertexConsumer,float height, ) { net.minecraft.client.render.SkyRendering.createSky(vertexConsumer.wrapperContained,height); }
// public void renderStars() { wrapperContained.renderStars(); }
// public static void renderStars() { net.minecraft.client.render.SkyRendering.renderStars(); }
public void renderEndSky() { wrapperContained.renderEndSky(); }
// public static void renderEndSky() { net.minecraft.client.render.SkyRendering.renderEndSky(); }
// public com.mojang.blaze3d.buffers.GpuBuffer createStars() { return wrapperContained.createStars(); }
// public static com.mojang.blaze3d.buffers.GpuBuffer createStars() { return net.minecraft.client.render.SkyRendering.createStars(); }
// public com.mojang.blaze3d.buffers.GpuBuffer createEndSky() { return wrapperContained.createEndSky(); }
// public static com.mojang.blaze3d.buffers.GpuBuffer createEndSky() { return net.minecraft.client.render.SkyRendering.createEndSky(); }

}