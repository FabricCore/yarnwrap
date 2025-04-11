package yarnwrap.client.render.debug;
public class BeeDebugRenderer { public net.minecraft.client.render.debug.BeeDebugRenderer wrapperContained; public BeeDebugRenderer(net.minecraft.client.render.debug.BeeDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Map hives() { return wrapperContained.hives; }
// public void hives(java.util.Map value) { wrapperContained.hives = value; }
// public java.util.Map bees() { return wrapperContained.bees; }
// public void bees(java.util.Map value) { wrapperContained.bees = value; }
// public java.util.UUID targetedEntity() { return wrapperContained.targetedEntity; }
// public void targetedEntity(java.util.UUID value) { wrapperContained.targetedEntity = value; }
// public int HIVE_RANGE() { return wrapperContained.HIVE_RANGE; }
// public void HIVE_RANGE(int value) { wrapperContained.HIVE_RANGE = value; }
// public int BEE_RANGE() { return wrapperContained.BEE_RANGE; }
// public void BEE_RANGE(int value) { wrapperContained.BEE_RANGE = value; }
// public int TARGET_ENTITY_RANGE() { return wrapperContained.TARGET_ENTITY_RANGE; }
// public void TARGET_ENTITY_RANGE(int value) { wrapperContained.TARGET_ENTITY_RANGE = value; }
// public float DEFAULT_DRAWN_STRING_SIZE() { return wrapperContained.DEFAULT_DRAWN_STRING_SIZE; }
// public void DEFAULT_DRAWN_STRING_SIZE(float value) { wrapperContained.DEFAULT_DRAWN_STRING_SIZE = value; }
// public int WHITE() { return wrapperContained.WHITE; }
// public void WHITE(int value) { wrapperContained.WHITE = value; }
// public int YELLOW() { return wrapperContained.YELLOW; }
// public void YELLOW(int value) { wrapperContained.YELLOW = value; }
// public int ORANGE() { return wrapperContained.ORANGE; }
// public void ORANGE(int value) { wrapperContained.ORANGE = value; }
// public int GREEN() { return wrapperContained.GREEN; }
// public void GREEN(int value) { wrapperContained.GREEN = value; }
// public int GRAY() { return wrapperContained.GRAY; }
// public void GRAY(int value) { wrapperContained.GRAY = value; }
// public int PINK() { return wrapperContained.PINK; }
// public void PINK(int value) { wrapperContained.PINK = value; }
// public int RED() { return wrapperContained.RED; }
// public void RED(int value) { wrapperContained.RED = value; }
public BeeDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.BeeDebugRenderer(client.wrapperContained); }
// public boolean method_23803(long hive) { return wrapperContained.method_23803(hive); }
// public void method_23804(yarnwrap.entity.Entity entity) { wrapperContained.method_23804(entity.wrapperContained); }
// public void addBee(Object bee) { wrapperContained.addBee(bee); }
// public java.lang.String getPositionString(Object bee,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPositionString(bee,pos.wrapperContained); }
// public void addHive(Object hive,long time) { wrapperContained.addHive(hive,time); }
// public void drawHive(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos) { wrapperContained.drawHive(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained); }
// public boolean method_23810(yarnwrap.util.math.BlockPos bee) { return wrapperContained.method_23810(bee.wrapperContained); }
// public void method_23811(yarnwrap.util.math.BlockPos hive) { wrapperContained.method_23811(hive.wrapperContained); }
// public void method_23812(yarnwrap.util.math.BlockPos hive,yarnwrap.client.util.math.MatrixStack bees) { wrapperContained.method_23812(hive.wrapperContained,bees.wrapperContained); }
// public void drawHiveBees(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,java.util.List bees) { wrapperContained.drawHiveBees(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,bees); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Position pos,int line,java.lang.String string,int color,float size) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,line,string,color,size); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,Object hive,int line,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,hive,line,color); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,yarnwrap.util.math.BlockPos pos,int line,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,pos.wrapperContained,line,color); }
// public void method_23817(yarnwrap.client.util.math.MatrixStack flowerPos,yarnwrap.client.render.VertexConsumerProvider bees) { wrapperContained.method_23817(flowerPos.wrapperContained,bees.wrapperContained); }
// public void method_23818(java.util.Map bee) { wrapperContained.method_23818(bee); }
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
// public void method_23831(yarnwrap.client.util.math.MatrixStack bee) { wrapperContained.method_23831(bee.wrapperContained); }
// public void updateTargetedEntity() { wrapperContained.updateTargetedEntity(); }
// public void removeInvalidBees() { wrapperContained.removeInvalidBees(); }
// public boolean method_23953(Object bee) { return wrapperContained.method_23953(bee); }
// public void method_24082(java.util.Map bee) { wrapperContained.method_24082(bee); }
// public void method_24083(java.util.Map pos) { wrapperContained.method_24083(pos); }
// public java.util.Map getBlacklistingBees() { return wrapperContained.getBlacklistingBees(); }
// public java.util.List method_30109(yarnwrap.util.math.BlockPos hive) { return wrapperContained.method_30109(hive.wrapperContained); }
// public java.util.Set method_30110(yarnwrap.util.math.BlockPos flower) { return wrapperContained.method_30110(flower.wrapperContained); }
// public java.util.Set method_30111(yarnwrap.util.math.BlockPos pos2) { return wrapperContained.method_30111(pos2.wrapperContained); }
public void removeBee(int id) { wrapperContained.removeBee(id); }
// public boolean method_35795(int bee) { return wrapperContained.method_35795(bee); }
// public java.util.Set getBeeNamesForHive(Object hive) { return wrapperContained.getBeeNamesForHive(hive); }

}