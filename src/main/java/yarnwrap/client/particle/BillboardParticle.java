package yarnwrap.client.particle;
public class BillboardParticle { public net.minecraft.client.particle.BillboardParticle wrapperContained; public BillboardParticle(net.minecraft.client.particle.BillboardParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scale() { return wrapperContained.scale; }
// public void scale(float value) { wrapperContained.scale = value; }
// public static float scale() { return net.minecraft.client.particle.BillboardParticle.scale; }
// public static void scale(float value, ) { net.minecraft.client.particle.BillboardParticle.scale = value; }

public float getSize(float tickProgress) { return wrapperContained.getSize(tickProgress); }
// public static float getSize(float tickProgress, ) { return net.minecraft.client.particle.BillboardParticle.getSize(tickProgress); }
// public float getMinU() { return wrapperContained.getMinU(); }
// public static float getMinU() { return net.minecraft.client.particle.BillboardParticle.getMinU(); }
// public float getMaxU() { return wrapperContained.getMaxU(); }
// public static float getMaxU() { return net.minecraft.client.particle.BillboardParticle.getMaxU(); }
// public float getMinV() { return wrapperContained.getMinV(); }
// public static float getMinV() { return net.minecraft.client.particle.BillboardParticle.getMinV(); }
// public float getMaxV() { return wrapperContained.getMaxV(); }
// public static float getMaxV() { return net.minecraft.client.particle.BillboardParticle.getMaxV(); }
public Object getRotator() { return wrapperContained.getRotator(); }
// public static Object getRotator() { return net.minecraft.client.particle.BillboardParticle.getRotator(); }
// public void render(yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.client.render.Camera camera,org.joml.Quaternionf tickProgress) { wrapperContained.render(vertexConsumer.wrapperContained,camera.wrapperContained,tickProgress); }
// public static void render(yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.client.render.Camera camera,org.joml.Quaternionf tickProgress, ) { net.minecraft.client.particle.BillboardParticle.render(vertexConsumer.wrapperContained,camera.wrapperContained,tickProgress); }
// public void render(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Quaternionf x,float y,float z,float tickProgress) { wrapperContained.render(vertexConsumer.wrapperContained,x,y,z,tickProgress); }
// public static void render(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Quaternionf x,float y,float z,float tickProgress, ) { net.minecraft.client.particle.BillboardParticle.render(vertexConsumer.wrapperContained,x,y,z,tickProgress); }
// public void renderVertex(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Quaternionf x,float y,float z,float size,float u,float v,float light) { wrapperContained.renderVertex(vertexConsumer.wrapperContained,x,y,z,size,u,v,light); }
// public static void renderVertex(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Quaternionf x,float y,float z,float size,float u,float v,float light, ) { net.minecraft.client.particle.BillboardParticle.renderVertex(vertexConsumer.wrapperContained,x,y,z,size,u,v,light); }

}