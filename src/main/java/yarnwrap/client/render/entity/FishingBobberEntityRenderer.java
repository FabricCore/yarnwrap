package yarnwrap.client.render.entity;
public class FishingBobberEntityRenderer { public net.minecraft.client.render.entity.FishingBobberEntityRenderer wrapperContained; public FishingBobberEntityRenderer(net.minecraft.client.render.entity.FishingBobberEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.LAYER); }
// public void LAYER(yarnwrap.client.render.RenderLayer value) { wrapperContained.LAYER = value.wrapperContained; }
// public static yarnwrap.client.render.RenderLayer LAYER() { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.render.entity.FishingBobberEntityRenderer.LAYER); }
// public static void LAYER(yarnwrap.client.render.RenderLayer value, ) { net.minecraft.client.render.entity.FishingBobberEntityRenderer.LAYER = value.wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.FishingBobberEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.FishingBobberEntityRenderer.TEXTURE = value.wrapperContained; }

// public void renderFishingLine(float x,float y,float z,yarnwrap.client.render.VertexConsumer buffer,Object matrices,float segmentStart,float segmentEnd) { wrapperContained.renderFishingLine(x,y,z,buffer.wrapperContained,matrices,segmentStart,segmentEnd); }
// public static void renderFishingLine(float x,float y,float z,yarnwrap.client.render.VertexConsumer buffer,Object matrices,float segmentStart,float segmentEnd, ) { net.minecraft.client.render.entity.FishingBobberEntityRenderer.renderFishingLine(x,y,z,buffer.wrapperContained,matrices,segmentStart,segmentEnd); }
// public void vertex(yarnwrap.client.render.VertexConsumer buffer,Object matrix,int light,float x,int y,int u,int v) { wrapperContained.vertex(buffer.wrapperContained,matrix,light,x,y,u,v); }
// public static void vertex(yarnwrap.client.render.VertexConsumer buffer,Object matrix,int light,float x,int y,int u,int v, ) { net.minecraft.client.render.entity.FishingBobberEntityRenderer.vertex(buffer.wrapperContained,matrix,light,x,y,u,v); }
// public float percentage(int value,int max) { return wrapperContained.percentage(value,max); }
// public static float percentage(int value,int max, ) { return net.minecraft.client.render.entity.FishingBobberEntityRenderer.percentage(value,max); }
// public yarnwrap.util.math.Vec3d getHandPos(yarnwrap.entity.player.PlayerEntity player,float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getHandPos(player.wrapperContained,tickDelta)); }
// public static yarnwrap.util.math.Vec3d getHandPos(yarnwrap.entity.player.PlayerEntity player,float tickDelta, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.FishingBobberEntityRenderer.getHandPos(player.wrapperContained,tickDelta)); }

}