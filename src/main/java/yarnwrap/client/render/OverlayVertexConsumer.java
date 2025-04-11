package yarnwrap.client.render;
public class OverlayVertexConsumer { public net.minecraft.client.render.OverlayVertexConsumer wrapperContained; public OverlayVertexConsumer(net.minecraft.client.render.OverlayVertexConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.VertexConsumer delegate() { return new yarnwrap.client.render.VertexConsumer(wrapperContained.delegate); }
// public void delegate(yarnwrap.client.render.VertexConsumer value) { wrapperContained.delegate = value.wrapperContained; }
// public float x() { return wrapperContained.x; }
// public void x(float value) { wrapperContained.x = value; }
// public float y() { return wrapperContained.y; }
// public void y(float value) { wrapperContained.y = value; }
// public float z() { return wrapperContained.z; }
// public void z(float value) { wrapperContained.z = value; }
// public org.joml.Matrix4f inverseTextureMatrix() { return wrapperContained.inverseTextureMatrix; }
// public void inverseTextureMatrix(org.joml.Matrix4f value) { wrapperContained.inverseTextureMatrix = value; }
// public org.joml.Matrix3f inverseNormalMatrix() { return wrapperContained.inverseNormalMatrix; }
// public void inverseNormalMatrix(org.joml.Matrix3f value) { wrapperContained.inverseNormalMatrix = value; }
// public float textureScale() { return wrapperContained.textureScale; }
// public void textureScale(float value) { wrapperContained.textureScale = value; }
// public org.joml.Vector3f normal() { return wrapperContained.normal; }
// public void normal(org.joml.Vector3f value) { wrapperContained.normal = value; }
// public org.joml.Vector3f pos() { return wrapperContained.pos; }
// public void pos(org.joml.Vector3f value) { wrapperContained.pos = value; }
// public OverlayVertexConsumer(yarnwrap.client.render.VertexConsumer delegate,Object matrix,float textureScale) { this.wrapperContained = new net.minecraft.client.render.OverlayVertexConsumer(delegate.wrapperContained,matrix,textureScale); }

}