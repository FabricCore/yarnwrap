package yarnwrap.client.render.debug;
public class ChunkDebugRenderer { public net.minecraft.client.render.debug.ChunkDebugRenderer wrapperContained; public ChunkDebugRenderer(net.minecraft.client.render.debug.ChunkDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.client.render.debug.ChunkDebugRenderer.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.client.render.debug.ChunkDebugRenderer.DIRECTIONS = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.ChunkDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.ChunkDebugRenderer.client = value.wrapperContained; }

public ChunkDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.ChunkDebugRenderer(client.wrapperContained); }
// public void addEndpoint(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f positionMatrix,org.joml.Vector4f vertex) { wrapperContained.addEndpoint(vertexConsumer.wrapperContained,positionMatrix,vertex); }
// public static void addEndpoint(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f positionMatrix,org.joml.Vector4f vertex, ) { net.minecraft.client.render.debug.ChunkDebugRenderer.addEndpoint(vertexConsumer.wrapperContained,positionMatrix,vertex); }
// public void addFace(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f positionMatrix,org.joml.Vector4f[] vertices,int i1,int i2,int i3,int i4,int r,int g,int b) { wrapperContained.addFace(vertexConsumer.wrapperContained,positionMatrix,vertices,i1,i2,i3,i4,r,g,b); }
// public static void addFace(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f positionMatrix,org.joml.Vector4f[] vertices,int i1,int i2,int i3,int i4,int r,int g,int b, ) { net.minecraft.client.render.debug.ChunkDebugRenderer.addFace(vertexConsumer.wrapperContained,positionMatrix,vertices,i1,i2,i3,i4,r,g,b); }

}