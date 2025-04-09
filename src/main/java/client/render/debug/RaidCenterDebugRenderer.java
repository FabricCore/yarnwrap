package yarnwrap.client.render.debug;
public class RaidCenterDebugRenderer { public net.minecraft.client.render.debug.RaidCenterDebugRenderer wrapperContained; public RaidCenterDebugRenderer(net.minecraft.client.render.debug.RaidCenterDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.Collection raidCenters() { return wrapperContained.raidCenters; }
// public int RANGE() { return wrapperContained.RANGE; }
// public float DRAWN_STRING_SIZE() { return wrapperContained.DRAWN_STRING_SIZE; }
public void setRaidCenters(java.util.Collection raidCenters) { wrapperContained.setRaidCenters(raidCenters); }
// public void drawRaidCenter(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos) { wrapperContained.drawRaidCenter(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,yarnwrap.util.math.BlockPos pos,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,pos.wrapperContained,color); }
// public yarnwrap.client.render.Camera getCamera() { return new yarnwrap.client.render.Camera(wrapperContained.getCamera()); }

}