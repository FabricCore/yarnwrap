package yarnwrap.client.render.entity;
public class ProjectileEntityRenderer { public net.minecraft.client.render.entity.ProjectileEntityRenderer wrapperContained; public ProjectileEntityRenderer(net.minecraft.client.render.entity.ProjectileEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public void vertex(Object matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,int x,int y,int z,float u,float v,int normalX,int normalZ,int normalY,int light) { wrapperContained.vertex(matrix,vertexConsumer.wrapperContained,x,y,z,u,v,normalX,normalZ,normalY,light); }

}