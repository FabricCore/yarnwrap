package yarnwrap.client.render.debug;
public class BeeDebugRenderer { public net.minecraft.client.render.debug.BeeDebugRenderer wrapperContained; public BeeDebugRenderer(net.minecraft.client.render.debug.BeeDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.Map hives() { return wrapperContained.hives; }
// public java.util.Map bees() { return wrapperContained.bees; }
// public java.util.UUID targetedEntity() { return wrapperContained.targetedEntity; }
// public int HIVE_RANGE() { return wrapperContained.HIVE_RANGE; }
// public int BEE_RANGE() { return wrapperContained.BEE_RANGE; }
// public int TARGET_ENTITY_RANGE() { return wrapperContained.TARGET_ENTITY_RANGE; }
// public float DEFAULT_DRAWN_STRING_SIZE() { return wrapperContained.DEFAULT_DRAWN_STRING_SIZE; }
// public int WHITE() { return wrapperContained.WHITE; }
// public int YELLOW() { return wrapperContained.YELLOW; }
// public int ORANGE() { return wrapperContained.ORANGE; }
// public int GREEN() { return wrapperContained.GREEN; }
// public int GRAY() { return wrapperContained.GRAY; }
// public int PINK() { return wrapperContained.PINK; }
// public int RED() { return wrapperContained.RED; }
// public void addBee(Object bee) { wrapperContained.addBee(bee); }
// public java.lang.String getPositionString(Object bee,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPositionString(bee,pos.wrapperContained); }
// public void addHive(Object hive,long time) { wrapperContained.addHive(hive,time); }
// public void drawHive(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos) { wrapperContained.drawHive(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained); }
// public void drawHiveBees(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,java.util.List bees) { wrapperContained.drawHiveBees(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,bees); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Position pos,int line,java.lang.String string,int color,float size) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,line,string,color,size); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,Object hive,int line,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,hive,line,color); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,yarnwrap.util.math.BlockPos pos,int line,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,pos.wrapperContained,line,color); }
// public void removeOutdatedHives() { wrapperContained.removeOutdatedHives(); }
// public void drawPath(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object bee) { wrapperContained.drawPath(matrices.wrapperContained,vertexConsumers.wrapperContained,bee); }
// public void drawHiveInfo(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object hive,java.util.Collection blacklistingBees) { wrapperContained.drawHiveInfo(matrices.wrapperContained,vertexConsumers.wrapperContained,hive,blacklistingBees); }
// public java.util.Collection getBeesForHive(yarnwrap.util.math.BlockPos hivePos) { return wrapperContained.getBeesForHive(hivePos.wrapperContained); }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public void drawBee(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object bee) { wrapperContained.drawBee(matrices.wrapperContained,vertexConsumers.wrapperContained,bee); }
// public java.lang.String toString(java.util.Collection bees) { return wrapperContained.toString(bees); }
// public void drawFlowers(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.drawFlowers(matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public boolean isTargeted(Object bee) { return wrapperContained.isTargeted(bee); }
// public yarnwrap.client.render.Camera getCameraPos() { return new yarnwrap.client.render.Camera(wrapperContained.getCameraPos()); }
// public boolean isInRange(Object bee) { return wrapperContained.isInRange(bee); }
// public java.util.Map getBeesByHive() { return wrapperContained.getBeesByHive(); }
// public void updateTargetedEntity() { wrapperContained.updateTargetedEntity(); }
// public void removeInvalidBees() { wrapperContained.removeInvalidBees(); }
// public java.util.Map getBlacklistingBees() { return wrapperContained.getBlacklistingBees(); }
public void removeBee(int id) { wrapperContained.removeBee(id); }
// public java.util.Set getBeeNamesForHive(Object hive) { return wrapperContained.getBeeNamesForHive(hive); }

}