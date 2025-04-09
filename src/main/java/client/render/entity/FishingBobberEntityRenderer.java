package yarnwrap.client.render.entity;
public class FishingBobberEntityRenderer { public net.minecraft.client.render.entity.FishingBobberEntityRenderer wrapperContained; public FishingBobberEntityRenderer(net.minecraft.client.render.entity.FishingBobberEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.LAYER); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void renderFishingLine(float x,float y,float z,yarnwrap.client.render.VertexConsumer buffer,Object matrices,float segmentStart,float segmentEnd) { wrapperContained.renderFishingLine(x,y,z,buffer.wrapperContained,matrices,segmentStart,segmentEnd); }
// public void vertex(yarnwrap.client.render.VertexConsumer buffer,Object matrix,int light,float x,int y,int u,int v) { wrapperContained.vertex(buffer.wrapperContained,matrix,light,x,y,u,v); }
// public float percentage(int value,int max) { return wrapperContained.percentage(value,max); }
// public yarnwrap.util.math.Vec3d getHandPos(yarnwrap.entity.player.PlayerEntity player,float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getHandPos(player.wrapperContained,tickDelta)); }

}