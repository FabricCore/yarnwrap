package yarnwrap.client.render;
public class VertexConsumer { public net.minecraft.client.render.VertexConsumer wrapperContained; public VertexConsumer(net.minecraft.client.render.VertexConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.VertexConsumer color(int red,int green,int blue,int alpha) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.color(red,green,blue,alpha)); }
// public static yarnwrap.client.render.VertexConsumer color(int red,int green,int blue,int alpha, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.color(red,green,blue,alpha)); }
public yarnwrap.client.render.VertexConsumer vertex(float x,float y,float z) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.vertex(x,y,z)); }
// public static yarnwrap.client.render.VertexConsumer vertex(float x,float y,float z, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.vertex(x,y,z)); }
public yarnwrap.client.render.VertexConsumer texture(float u,float v) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.texture(u,v)); }
// public static yarnwrap.client.render.VertexConsumer texture(float u,float v, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.texture(u,v)); }
public yarnwrap.client.render.VertexConsumer normal(float x,float y,float z) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.normal(x,y,z)); }
// public static yarnwrap.client.render.VertexConsumer normal(float x,float y,float z, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.normal(x,y,z)); }
public yarnwrap.client.render.VertexConsumer color(float red,float green,float blue,float alpha) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.color(red,green,blue,alpha)); }
// public static yarnwrap.client.render.VertexConsumer color(float red,float green,float blue,float alpha, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.color(red,green,blue,alpha)); }
public yarnwrap.client.render.VertexConsumer vertex(org.joml.Matrix4f matrix,float x,float y,float z) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.vertex(matrix,x,y,z)); }
// public static yarnwrap.client.render.VertexConsumer vertex(org.joml.Matrix4f matrix,float x,float y,float z, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.vertex(matrix,x,y,z)); }
// public void quad(Object matrixEntry,yarnwrap.client.render.model.BakedQuad quad,float red,float green,float blue) { wrapperContained.quad(matrixEntry,quad.wrapperContained,red,green,blue); }
// public static void quad(Object matrixEntry,yarnwrap.client.render.model.BakedQuad quad,float red,float green,float blue, ) { net.minecraft.client.render.VertexConsumer.quad(matrixEntry,quad.wrapperContained,red,green,blue); }
// public void quad(Object matrixEntry,yarnwrap.client.render.model.BakedQuad quad,float brightnesses,float red,float green,float blue) { wrapperContained.quad(matrixEntry,quad.wrapperContained,brightnesses,red,green,blue); }
// public static void quad(Object matrixEntry,yarnwrap.client.render.model.BakedQuad quad,float brightnesses,float red,float green,float blue, ) { net.minecraft.client.render.VertexConsumer.quad(matrixEntry,quad.wrapperContained,brightnesses,red,green,blue); }
public yarnwrap.client.render.VertexConsumer light(int u,int v) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.light(u,v)); }
// public static yarnwrap.client.render.VertexConsumer light(int u,int v, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.light(u,v)); }
public yarnwrap.client.render.VertexConsumer overlay(int uv) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.overlay(uv)); }
// public static yarnwrap.client.render.VertexConsumer overlay(int uv, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.overlay(uv)); }
public void vertex(float x,float y,float z,int color,float u,float v,int overlay,int light,float normalX,float normalY,float normalZ) { wrapperContained.vertex(x,y,z,color,u,v,overlay,light,normalX,normalY,normalZ); }
// public static void vertex(float x,float y,float z,int color,float u,float v,int overlay,int light,float normalX,float normalY,float normalZ, ) { net.minecraft.client.render.VertexConsumer.vertex(x,y,z,color,u,v,overlay,light,normalX,normalY,normalZ); }
public yarnwrap.client.render.VertexConsumer color(int argb) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.color(argb)); }
// public static yarnwrap.client.render.VertexConsumer color(int argb, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.color(argb)); }
// public yarnwrap.client.render.VertexConsumer vertex(Object matrix,float x,float y,float z) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.vertex(matrix,x,y,z)); }
// public static yarnwrap.client.render.VertexConsumer vertex(Object matrix,float x,float y,float z, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.vertex(matrix,x,y,z)); }
public yarnwrap.client.render.VertexConsumer overlay(int u,int v) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.overlay(u,v)); }
// public static yarnwrap.client.render.VertexConsumer overlay(int u,int v, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.overlay(u,v)); }
public yarnwrap.client.render.VertexConsumer light(int uv) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.light(uv)); }
// public static yarnwrap.client.render.VertexConsumer light(int uv, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.light(uv)); }
public yarnwrap.client.render.VertexConsumer vertex(org.joml.Vector3f vec) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.vertex(vec)); }
// public static yarnwrap.client.render.VertexConsumer vertex(org.joml.Vector3f vec, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.vertex(vec)); }
// public yarnwrap.client.render.VertexConsumer normal(Object matrix,float x,float y,float z) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.normal(matrix,x,y,z)); }
// public static yarnwrap.client.render.VertexConsumer normal(Object matrix,float x,float y,float z, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.normal(matrix,x,y,z)); }
public yarnwrap.client.render.VertexConsumer colorRgb(int rgb) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.colorRgb(rgb)); }
// public static yarnwrap.client.render.VertexConsumer colorRgb(int rgb, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.colorRgb(rgb)); }
// public yarnwrap.client.render.VertexConsumer vertex(Object matrix,org.joml.Vector3f vec) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.vertex(matrix,vec)); }
// public static yarnwrap.client.render.VertexConsumer vertex(Object matrix,org.joml.Vector3f vec, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.vertex(matrix,vec)); }
// public yarnwrap.client.render.VertexConsumer normal(Object matrix,org.joml.Vector3f vec) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.normal(matrix,vec)); }
// public static yarnwrap.client.render.VertexConsumer normal(Object matrix,org.joml.Vector3f vec, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.normal(matrix,vec)); }
// public yarnwrap.client.render.VertexConsumer vertex(org.joml.Matrix3x2f matrix,float x,float y,float z) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.vertex(matrix,x,y,z)); }
// public static yarnwrap.client.render.VertexConsumer vertex(org.joml.Matrix3x2f matrix,float x,float y,float z, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.VertexConsumer.vertex(matrix,x,y,z)); }

}