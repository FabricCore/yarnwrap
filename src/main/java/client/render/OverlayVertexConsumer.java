package yarnwrap.client.render;
public class OverlayVertexConsumer { public net.minecraft.client.render.OverlayVertexConsumer wrapperContained; public OverlayVertexConsumer(net.minecraft.client.render.OverlayVertexConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.VertexConsumer delegate() { return new yarnwrap.client.render.VertexConsumer(wrapperContained.delegate); }
// public float x() { return wrapperContained.x; }
// public float y() { return wrapperContained.y; }
// public float z() { return wrapperContained.z; }
// public org.joml.Matrix4f inverseTextureMatrix() { return wrapperContained.inverseTextureMatrix; }
// public org.joml.Matrix3f inverseNormalMatrix() { return wrapperContained.inverseNormalMatrix; }
// public float textureScale() { return wrapperContained.textureScale; }
// public org.joml.Vector3f normal() { return wrapperContained.normal; }
// public org.joml.Vector3f pos() { return wrapperContained.pos; }

}