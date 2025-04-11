package yarnwrap.client.render.entity;
public class PaintingEntityRenderer { public net.minecraft.client.render.entity.PaintingEntityRenderer wrapperContained; public PaintingEntityRenderer(net.minecraft.client.render.entity.PaintingEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public void vertex(Object matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,float x,float y,float u,float v,float z,int normalX,int normalY,int normalZ,int light) { wrapperContained.vertex(matrix,vertexConsumer.wrapperContained,x,y,u,v,z,normalX,normalY,normalZ,light); }
// public void renderPainting(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.entity.decoration.painting.PaintingEntity entity,int width,int height,yarnwrap.client.texture.Sprite paintingSprite,yarnwrap.client.texture.Sprite backSprite) { wrapperContained.renderPainting(matrices.wrapperContained,vertexConsumer.wrapperContained,entity.wrapperContained,width,height,paintingSprite.wrapperContained,backSprite.wrapperContained); }

}