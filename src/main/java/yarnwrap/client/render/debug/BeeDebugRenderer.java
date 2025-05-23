package yarnwrap.client.render.debug;
public class BeeDebugRenderer { public net.minecraft.client.render.debug.BeeDebugRenderer wrapperContained; public BeeDebugRenderer(net.minecraft.client.render.debug.BeeDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.BeeDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.client = value.wrapperContained; }

// public java.util.Map hives() { return wrapperContained.hives; }
// public void hives(java.util.Map value) { wrapperContained.hives = value; }
// public static java.util.Map hives() { return net.minecraft.client.render.debug.BeeDebugRenderer.hives; }
// public static void hives(java.util.Map value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.hives = value; }

// public java.util.Map bees() { return wrapperContained.bees; }
// public void bees(java.util.Map value) { wrapperContained.bees = value; }
// public static java.util.Map bees() { return net.minecraft.client.render.debug.BeeDebugRenderer.bees; }
// public static void bees(java.util.Map value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.bees = value; }

// public java.util.UUID targetedEntity() { return wrapperContained.targetedEntity; }
// public void targetedEntity(java.util.UUID value) { wrapperContained.targetedEntity = value; }
// public static java.util.UUID targetedEntity() { return net.minecraft.client.render.debug.BeeDebugRenderer.targetedEntity; }
// public static void targetedEntity(java.util.UUID value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.targetedEntity = value; }

// public int HIVE_RANGE() { return wrapperContained.HIVE_RANGE; }
// public void HIVE_RANGE(int value) { wrapperContained.HIVE_RANGE = value; }
// public static int HIVE_RANGE() { return net.minecraft.client.render.debug.BeeDebugRenderer.HIVE_RANGE; }
// public static void HIVE_RANGE(int value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.HIVE_RANGE = value; }

// public int BEE_RANGE() { return wrapperContained.BEE_RANGE; }
// public void BEE_RANGE(int value) { wrapperContained.BEE_RANGE = value; }
// public static int BEE_RANGE() { return net.minecraft.client.render.debug.BeeDebugRenderer.BEE_RANGE; }
// public static void BEE_RANGE(int value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.BEE_RANGE = value; }

// public int TARGET_ENTITY_RANGE() { return wrapperContained.TARGET_ENTITY_RANGE; }
// public void TARGET_ENTITY_RANGE(int value) { wrapperContained.TARGET_ENTITY_RANGE = value; }
// public static int TARGET_ENTITY_RANGE() { return net.minecraft.client.render.debug.BeeDebugRenderer.TARGET_ENTITY_RANGE; }
// public static void TARGET_ENTITY_RANGE(int value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.TARGET_ENTITY_RANGE = value; }

// public float DEFAULT_DRAWN_STRING_SIZE() { return wrapperContained.DEFAULT_DRAWN_STRING_SIZE; }
// public void DEFAULT_DRAWN_STRING_SIZE(float value) { wrapperContained.DEFAULT_DRAWN_STRING_SIZE = value; }
// public static float DEFAULT_DRAWN_STRING_SIZE() { return net.minecraft.client.render.debug.BeeDebugRenderer.DEFAULT_DRAWN_STRING_SIZE; }
// public static void DEFAULT_DRAWN_STRING_SIZE(float value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.DEFAULT_DRAWN_STRING_SIZE = value; }

// public int ORANGE() { return wrapperContained.ORANGE; }
// public void ORANGE(int value) { wrapperContained.ORANGE = value; }
// public static int ORANGE() { return net.minecraft.client.render.debug.BeeDebugRenderer.ORANGE; }
// public static void ORANGE(int value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.ORANGE = value; }

// public int GRAY() { return wrapperContained.GRAY; }
// public void GRAY(int value) { wrapperContained.GRAY = value; }
// public static int GRAY() { return net.minecraft.client.render.debug.BeeDebugRenderer.GRAY; }
// public static void GRAY(int value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.GRAY = value; }

// public int PINK() { return wrapperContained.PINK; }
// public void PINK(int value) { wrapperContained.PINK = value; }
// public static int PINK() { return net.minecraft.client.render.debug.BeeDebugRenderer.PINK; }
// public static void PINK(int value, ) { net.minecraft.client.render.debug.BeeDebugRenderer.PINK = value; }

public BeeDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.BeeDebugRenderer(client.wrapperContained); }
// public boolean method_23803(long hive) { return wrapperContained.method_23803(hive); }
// public static boolean method_23803(long hive, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.method_23803(hive); }
// public void method_23804(yarnwrap.entity.Entity entity) { wrapperContained.method_23804(entity.wrapperContained); }
// public static void method_23804(yarnwrap.entity.Entity entity, ) { net.minecraft.client.render.debug.BeeDebugRenderer.method_23804(entity.wrapperContained); }
// public void addBee(Object bee) { wrapperContained.addBee(bee); }
// public static void addBee(Object bee, ) { net.minecraft.client.render.debug.BeeDebugRenderer.addBee(bee); }
// public java.lang.String getPositionString(Object bee,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPositionString(bee,pos.wrapperContained); }
// public static java.lang.String getPositionString(Object bee,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.getPositionString(bee,pos.wrapperContained); }
// public void addHive(Object hive,long time) { wrapperContained.addHive(hive,time); }
// public static void addHive(Object hive,long time, ) { net.minecraft.client.render.debug.BeeDebugRenderer.addHive(hive,time); }
// public void drawHive(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos) { wrapperContained.drawHive(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained); }
// public static void drawHive(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawHive(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained); }
// public boolean method_23810(yarnwrap.util.math.BlockPos bee) { return wrapperContained.method_23810(bee.wrapperContained); }
// public static boolean method_23810(yarnwrap.util.math.BlockPos bee, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.method_23810(bee.wrapperContained); }
// public void method_23811(yarnwrap.util.math.BlockPos hive) { wrapperContained.method_23811(hive.wrapperContained); }
// public static void method_23811(yarnwrap.util.math.BlockPos hive, ) { net.minecraft.client.render.debug.BeeDebugRenderer.method_23811(hive.wrapperContained); }
// public void method_23812(yarnwrap.util.math.BlockPos hive,yarnwrap.client.util.math.MatrixStack bees) { wrapperContained.method_23812(hive.wrapperContained,bees.wrapperContained); }
// public static void method_23812(yarnwrap.util.math.BlockPos hive,yarnwrap.client.util.math.MatrixStack bees, ) { net.minecraft.client.render.debug.BeeDebugRenderer.method_23812(hive.wrapperContained,bees.wrapperContained); }
// public void drawHiveBees(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,java.util.List bees) { wrapperContained.drawHiveBees(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,bees); }
// public static void drawHiveBees(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,java.util.List bees, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawHiveBees(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,bees); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Position pos,int line,java.lang.String string,int color,float size) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,line,string,color,size); }
// public static void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Position pos,int line,java.lang.String string,int color,float size, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,line,string,color,size); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,Object hive,int line,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,hive,line,color); }
// public static void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,Object hive,int line,int color, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,hive,line,color); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,yarnwrap.util.math.BlockPos pos,int line,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,pos.wrapperContained,line,color); }
// public static void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,yarnwrap.util.math.BlockPos pos,int line,int color, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,pos.wrapperContained,line,color); }
// public void method_23817(yarnwrap.client.util.math.MatrixStack flowerPos,yarnwrap.client.render.VertexConsumerProvider bees) { wrapperContained.method_23817(flowerPos.wrapperContained,bees.wrapperContained); }
// public static void method_23817(yarnwrap.client.util.math.MatrixStack flowerPos,yarnwrap.client.render.VertexConsumerProvider bees, ) { net.minecraft.client.render.debug.BeeDebugRenderer.method_23817(flowerPos.wrapperContained,bees.wrapperContained); }
// public void method_23818(java.util.Map bee) { wrapperContained.method_23818(bee); }
// public static void method_23818(java.util.Map bee, ) { net.minecraft.client.render.debug.BeeDebugRenderer.method_23818(bee); }
// public void removeOutdatedHives() { wrapperContained.removeOutdatedHives(); }
// public static void removeOutdatedHives() { net.minecraft.client.render.debug.BeeDebugRenderer.removeOutdatedHives(); }
// public void drawPath(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object bee) { wrapperContained.drawPath(matrices.wrapperContained,vertexConsumers.wrapperContained,bee); }
// public static void drawPath(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object bee, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawPath(matrices.wrapperContained,vertexConsumers.wrapperContained,bee); }
// public void drawHiveInfo(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object hive,java.util.Collection blacklistingBees) { wrapperContained.drawHiveInfo(matrices.wrapperContained,vertexConsumers.wrapperContained,hive,blacklistingBees); }
// public static void drawHiveInfo(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object hive,java.util.Collection blacklistingBees, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawHiveInfo(matrices.wrapperContained,vertexConsumers.wrapperContained,hive,blacklistingBees); }
// public java.util.Collection getBeesForHive(yarnwrap.util.math.BlockPos hivePos) { return wrapperContained.getBeesForHive(hivePos.wrapperContained); }
// public static java.util.Collection getBeesForHive(yarnwrap.util.math.BlockPos hivePos, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.getBeesForHive(hivePos.wrapperContained); }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.render.debug.BeeDebugRenderer.render(matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public void drawBee(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object bee) { wrapperContained.drawBee(matrices.wrapperContained,vertexConsumers.wrapperContained,bee); }
// public static void drawBee(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object bee, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawBee(matrices.wrapperContained,vertexConsumers.wrapperContained,bee); }
// public java.lang.String toString(java.util.Collection bees) { return wrapperContained.toString(bees); }
// public static java.lang.String toString(java.util.Collection bees, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.toString(bees); }
// public void drawFlowers(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.drawFlowers(matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void drawFlowers(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.render.debug.BeeDebugRenderer.drawFlowers(matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public boolean isTargeted(Object bee) { return wrapperContained.isTargeted(bee); }
// public static boolean isTargeted(Object bee, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.isTargeted(bee); }
// public yarnwrap.client.render.Camera getCameraPos() { return new yarnwrap.client.render.Camera(wrapperContained.getCameraPos()); }
// public static yarnwrap.client.render.Camera getCameraPos() { return new yarnwrap.client.render.Camera(net.minecraft.client.render.debug.BeeDebugRenderer.getCameraPos()); }
// public boolean isInRange(Object bee) { return wrapperContained.isInRange(bee); }
// public static boolean isInRange(Object bee, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.isInRange(bee); }
// public java.util.Map getBeesByHive() { return wrapperContained.getBeesByHive(); }
// public static java.util.Map getBeesByHive() { return net.minecraft.client.render.debug.BeeDebugRenderer.getBeesByHive(); }
// public void method_23831(yarnwrap.client.util.math.MatrixStack bee) { wrapperContained.method_23831(bee.wrapperContained); }
// public static void method_23831(yarnwrap.client.util.math.MatrixStack bee, ) { net.minecraft.client.render.debug.BeeDebugRenderer.method_23831(bee.wrapperContained); }
// public void updateTargetedEntity() { wrapperContained.updateTargetedEntity(); }
// public static void updateTargetedEntity() { net.minecraft.client.render.debug.BeeDebugRenderer.updateTargetedEntity(); }
// public void removeInvalidBees() { wrapperContained.removeInvalidBees(); }
// public static void removeInvalidBees() { net.minecraft.client.render.debug.BeeDebugRenderer.removeInvalidBees(); }
// public boolean method_23953(Object bee) { return wrapperContained.method_23953(bee); }
// public static boolean method_23953(Object bee, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.method_23953(bee); }
// public void method_24082(java.util.Map bee) { wrapperContained.method_24082(bee); }
// public static void method_24082(java.util.Map bee, ) { net.minecraft.client.render.debug.BeeDebugRenderer.method_24082(bee); }
// public void method_24083(java.util.Map pos) { wrapperContained.method_24083(pos); }
// public static void method_24083(java.util.Map pos, ) { net.minecraft.client.render.debug.BeeDebugRenderer.method_24083(pos); }
// public java.util.Map getBlacklistingBees() { return wrapperContained.getBlacklistingBees(); }
// public static java.util.Map getBlacklistingBees() { return net.minecraft.client.render.debug.BeeDebugRenderer.getBlacklistingBees(); }
// public java.util.List method_30109(yarnwrap.util.math.BlockPos hive) { return wrapperContained.method_30109(hive.wrapperContained); }
// public static java.util.List method_30109(yarnwrap.util.math.BlockPos hive, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.method_30109(hive.wrapperContained); }
// public java.util.Set method_30110(yarnwrap.util.math.BlockPos flower) { return wrapperContained.method_30110(flower.wrapperContained); }
// public static java.util.Set method_30110(yarnwrap.util.math.BlockPos flower, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.method_30110(flower.wrapperContained); }
// public java.util.Set method_30111(yarnwrap.util.math.BlockPos pos2) { return wrapperContained.method_30111(pos2.wrapperContained); }
// public static java.util.Set method_30111(yarnwrap.util.math.BlockPos pos2, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.method_30111(pos2.wrapperContained); }
public void removeBee(int id) { wrapperContained.removeBee(id); }
// public static void removeBee(int id, ) { net.minecraft.client.render.debug.BeeDebugRenderer.removeBee(id); }
// public boolean method_35795(int bee) { return wrapperContained.method_35795(bee); }
// public static boolean method_35795(int bee, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.method_35795(bee); }
// public java.util.Set getBeeNamesForHive(Object hive) { return wrapperContained.getBeeNamesForHive(hive); }
// public static java.util.Set getBeeNamesForHive(Object hive, ) { return net.minecraft.client.render.debug.BeeDebugRenderer.getBeeNamesForHive(hive); }

}