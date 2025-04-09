package yarnwrap.client.render.entity;
public class ExperienceOrbEntityRenderer { public net.minecraft.client.render.entity.ExperienceOrbEntityRenderer wrapperContained; public ExperienceOrbEntityRenderer(net.minecraft.client.render.entity.ExperienceOrbEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.LAYER); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void vertex(yarnwrap.client.render.VertexConsumer vertexConsumer,Object matrix,float x,float y,int red,int green,int blue,float u,float v,int light) { wrapperContained.vertex(vertexConsumer.wrapperContained,matrix,x,y,red,green,blue,u,v,light); }

}