package yarnwrap.client.render.model;
public class BakedQuadFactory { public net.minecraft.client.render.model.BakedQuadFactory wrapperContained; public BakedQuadFactory(net.minecraft.client.render.model.BakedQuadFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public void transformVertex(org.joml.Vector3f vertex,yarnwrap.util.math.AffineTransformation transformation) { wrapperContained.transformVertex(vertex,transformation.wrapperContained); }
// public static void transformVertex(org.joml.Vector3f vertex,yarnwrap.util.math.AffineTransformation transformation, ) { net.minecraft.client.render.model.BakedQuadFactory.transformVertex(vertex,transformation.wrapperContained); }
// public int[] packVertexData(Object texture,yarnwrap.util.math.AxisRotation rotation,org.joml.Matrix4fc sprite,yarnwrap.client.texture.Sprite facing,yarnwrap.util.math.Direction transform,float modelRotation) { return wrapperContained.packVertexData(texture,rotation.wrapperContained,sprite,facing.wrapperContained,transform.wrapperContained,modelRotation); }
// public static int[] packVertexData(Object texture,yarnwrap.util.math.AxisRotation rotation,org.joml.Matrix4fc sprite,yarnwrap.client.texture.Sprite facing,yarnwrap.util.math.Direction transform,float modelRotation, ) { return net.minecraft.client.render.model.BakedQuadFactory.packVertexData(texture,rotation.wrapperContained,sprite,facing.wrapperContained,transform.wrapperContained,modelRotation); }
// public float[] getPositionMatrix(org.joml.Vector3fc from,org.joml.Vector3fc to) { return wrapperContained.getPositionMatrix(from,to); }
// public static float[] getPositionMatrix(org.joml.Vector3fc from,org.joml.Vector3fc to, ) { return net.minecraft.client.render.model.BakedQuadFactory.getPositionMatrix(from,to); }
// public void packVertexData(int vertices,int cornerIndex,org.joml.Vector3f[] pos,yarnwrap.client.texture.Sprite sprite) { wrapperContained.packVertexData(vertices,cornerIndex,pos,sprite.wrapperContained); }
// public static void packVertexData(int vertices,int cornerIndex,org.joml.Vector3f[] pos,yarnwrap.client.texture.Sprite sprite, ) { net.minecraft.client.render.model.BakedQuadFactory.packVertexData(vertices,cornerIndex,pos,sprite.wrapperContained); }
// public void packVertexData(int vertices,int cornerIndex,net.minecraft.client.render.model.CubeFace[] texture) { wrapperContained.packVertexData(vertices,cornerIndex,texture); }
// public static void packVertexData(int vertices,int cornerIndex,net.minecraft.client.render.model.CubeFace[] texture, ) { net.minecraft.client.render.model.BakedQuadFactory.packVertexData(vertices,cornerIndex,texture); }
// public void encodeDirection(int rotationMatrix,net.minecraft.util.math.Direction[] direction) { wrapperContained.encodeDirection(rotationMatrix,direction); }
// public static void encodeDirection(int rotationMatrix,net.minecraft.util.math.Direction[] direction, ) { net.minecraft.client.render.model.BakedQuadFactory.encodeDirection(rotationMatrix,direction); }
// public void rotateVertex(org.joml.Vector3f vertex,yarnwrap.client.render.model.json.ModelRotation rotation) { wrapperContained.rotateVertex(vertex,rotation.wrapperContained); }
// public static void rotateVertex(org.joml.Vector3f vertex,yarnwrap.client.render.model.json.ModelRotation rotation, ) { net.minecraft.client.render.model.BakedQuadFactory.rotateVertex(vertex,rotation.wrapperContained); }
// public void transformVertex(org.joml.Vector3f vertex) { wrapperContained.transformVertex(vertex); }
// public static void transformVertex(org.joml.Vector3f vertex, ) { net.minecraft.client.render.model.BakedQuadFactory.transformVertex(vertex); }
// public yarnwrap.util.math.Direction decodeDirection(int rotationMatrix) { return new yarnwrap.util.math.Direction(wrapperContained.decodeDirection(rotationMatrix)); }
// public static yarnwrap.util.math.Direction decodeDirection(int rotationMatrix, ) { return new yarnwrap.util.math.Direction(net.minecraft.client.render.model.BakedQuadFactory.decodeDirection(rotationMatrix)); }
// public yarnwrap.client.render.model.BakedQuad bake(org.joml.Vector3fc from,org.joml.Vector3fc to,yarnwrap.client.render.model.json.ModelElementFace facing,yarnwrap.client.texture.Sprite sprite,yarnwrap.util.math.Direction direction,yarnwrap.client.render.model.ModelBakeSettings settings,yarnwrap.client.render.model.json.ModelRotation rotation,boolean shade,int lightEmission) { return new yarnwrap.client.render.model.BakedQuad(wrapperContained.bake(from,to,facing.wrapperContained,sprite.wrapperContained,direction.wrapperContained,settings.wrapperContained,rotation.wrapperContained,shade,lightEmission)); }
// public static yarnwrap.client.render.model.BakedQuad bake(org.joml.Vector3fc from,org.joml.Vector3fc to,yarnwrap.client.render.model.json.ModelElementFace facing,yarnwrap.client.texture.Sprite sprite,yarnwrap.util.math.Direction direction,yarnwrap.client.render.model.ModelBakeSettings settings,yarnwrap.client.render.model.json.ModelRotation rotation,boolean shade,int lightEmission, ) { return new yarnwrap.client.render.model.BakedQuad(net.minecraft.client.render.model.BakedQuadFactory.bake(from,to,facing.wrapperContained,sprite.wrapperContained,direction.wrapperContained,settings.wrapperContained,rotation.wrapperContained,shade,lightEmission)); }
// public float setCenterBack() { return wrapperContained.setCenterBack(); }
// public static float setCenterBack() { return net.minecraft.client.render.model.BakedQuadFactory.setCenterBack(); }
// public Object compactUV(yarnwrap.client.texture.Sprite sprite,Object uv) { return wrapperContained.compactUV(sprite.wrapperContained,uv); }
// public static Object compactUV(yarnwrap.client.texture.Sprite sprite,Object uv, ) { return net.minecraft.client.render.model.BakedQuadFactory.compactUV(sprite.wrapperContained,uv); }
// public Object setDefaultUV(org.joml.Vector3fc from,org.joml.Vector3fc to,yarnwrap.util.math.Direction facing) { return wrapperContained.setDefaultUV(from,to,facing.wrapperContained); }
// public static Object setDefaultUV(org.joml.Vector3fc from,org.joml.Vector3fc to,yarnwrap.util.math.Direction facing, ) { return net.minecraft.client.render.model.BakedQuadFactory.setDefaultUV(from,to,facing.wrapperContained); }
// public float bakeVectorX() { return wrapperContained.bakeVectorX(); }
// public static float bakeVectorX() { return net.minecraft.client.render.model.BakedQuadFactory.bakeVectorX(); }
// public void calculatePosition() { wrapperContained.calculatePosition(); }
// public static void calculatePosition() { net.minecraft.client.render.model.BakedQuadFactory.calculatePosition(); }
// public float setCenterForward() { return wrapperContained.setCenterForward(); }
// public static float setCenterForward() { return net.minecraft.client.render.model.BakedQuadFactory.setCenterForward(); }
// public float bakeVectorY() { return wrapperContained.bakeVectorY(); }
// public static float bakeVectorY() { return net.minecraft.client.render.model.BakedQuadFactory.bakeVectorY(); }
// public float bakeVectorZ() { return wrapperContained.bakeVectorZ(); }
// public static float bakeVectorZ() { return net.minecraft.client.render.model.BakedQuadFactory.bakeVectorZ(); }
// public org.joml.Vector3f bakeVectors() { return wrapperContained.bakeVectors(); }
// public static org.joml.Vector3f bakeVectors() { return net.minecraft.client.render.model.BakedQuadFactory.bakeVectors(); }

}