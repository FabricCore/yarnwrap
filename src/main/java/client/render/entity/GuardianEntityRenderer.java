package yarnwrap.client.render.entity;
public class GuardianEntityRenderer { public net.minecraft.client.render.entity.GuardianEntityRenderer wrapperContained; public GuardianEntityRenderer(net.minecraft.client.render.entity.GuardianEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.LAYER); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.util.Identifier EXPLOSION_BEAM_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPLOSION_BEAM_TEXTURE); }
// public void vertex(yarnwrap.client.render.VertexConsumer vertexConsumer,Object matrix,float x,float y,float z,int red,int green,int blue,float u,float v) { wrapperContained.vertex(vertexConsumer.wrapperContained,matrix,x,y,z,red,green,blue,u,v); }
// public yarnwrap.util.math.Vec3d fromLerpedPosition(yarnwrap.entity.LivingEntity entity,double yOffset,float delta) { return new yarnwrap.util.math.Vec3d(wrapperContained.fromLerpedPosition(entity.wrapperContained,yOffset,delta)); }

}