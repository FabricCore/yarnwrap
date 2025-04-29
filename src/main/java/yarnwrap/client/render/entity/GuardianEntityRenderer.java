package yarnwrap.client.render.entity;
public class GuardianEntityRenderer { public net.minecraft.client.render.entity.GuardianEntityRenderer wrapperContained; public GuardianEntityRenderer(net.minecraft.client.render.entity.GuardianEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.LAYER); }
// public void LAYER(yarnwrap.client.render.RenderLayer value) { wrapperContained.LAYER = value.wrapperContained; }
// public static yarnwrap.client.render.RenderLayer LAYER() { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.render.entity.GuardianEntityRenderer.LAYER); }
// public static void LAYER(yarnwrap.client.render.RenderLayer value, ) { net.minecraft.client.render.entity.GuardianEntityRenderer.LAYER = value.wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.GuardianEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.GuardianEntityRenderer.TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EXPLOSION_BEAM_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPLOSION_BEAM_TEXTURE); }
// public void EXPLOSION_BEAM_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EXPLOSION_BEAM_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EXPLOSION_BEAM_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.GuardianEntityRenderer.EXPLOSION_BEAM_TEXTURE); }
// public static void EXPLOSION_BEAM_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.GuardianEntityRenderer.EXPLOSION_BEAM_TEXTURE = value.wrapperContained; }

// public GuardianEntityRenderer(Object ctx,float shadowRadius,yarnwrap.client.render.entity.model.EntityModelLayer layer) { this.wrapperContained = new net.minecraft.client.render.entity.GuardianEntityRenderer(ctx,shadowRadius,layer.wrapperContained); }
// public void vertex(yarnwrap.client.render.VertexConsumer vertexConsumer,Object matrix,float x,float y,float z,int red,int green,int blue,float u,float v) { wrapperContained.vertex(vertexConsumer.wrapperContained,matrix,x,y,z,red,green,blue,u,v); }
// public static void vertex(yarnwrap.client.render.VertexConsumer vertexConsumer,Object matrix,float x,float y,float z,int red,int green,int blue,float u,float v, ) { net.minecraft.client.render.entity.GuardianEntityRenderer.vertex(vertexConsumer.wrapperContained,matrix,x,y,z,red,green,blue,u,v); }
// public yarnwrap.util.math.Vec3d fromLerpedPosition(yarnwrap.entity.LivingEntity entity,double yOffset,float delta) { return new yarnwrap.util.math.Vec3d(wrapperContained.fromLerpedPosition(entity.wrapperContained,yOffset,delta)); }
// public static yarnwrap.util.math.Vec3d fromLerpedPosition(yarnwrap.entity.LivingEntity entity,double yOffset,float delta, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.GuardianEntityRenderer.fromLerpedPosition(entity.wrapperContained,yOffset,delta)); }

}