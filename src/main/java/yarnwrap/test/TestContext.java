package yarnwrap.test;
public class TestContext { public net.minecraft.test.TestContext wrapperContained; public TestContext(net.minecraft.test.TestContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.test.GameTestState test() { return new yarnwrap.test.GameTestState(wrapperContained.test); }
// public void test(yarnwrap.test.GameTestState value) { wrapperContained.test = value.wrapperContained; }
// public static yarnwrap.test.GameTestState test() { return new yarnwrap.test.GameTestState(net.minecraft.test.TestContext.test); }
// public static void test(yarnwrap.test.GameTestState value, ) { net.minecraft.test.TestContext.test = value.wrapperContained; }

// public boolean hasFinalClause() { return wrapperContained.hasFinalClause; }
// public void hasFinalClause(boolean value) { wrapperContained.hasFinalClause = value; }
// public static boolean hasFinalClause() { return net.minecraft.test.TestContext.hasFinalClause; }
// public static void hasFinalClause(boolean value, ) { net.minecraft.test.TestContext.hasFinalClause = value; }

public TestContext(yarnwrap.test.GameTestState test) { this.wrapperContained = new net.minecraft.test.TestContext(test.wrapperContained); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
// public static yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.test.TestContext.getWorld()); }
public void setTime(int timeOfDay) { wrapperContained.setTime(timeOfDay); }
// public static void setTime(int timeOfDay, ) { net.minecraft.test.TestContext.setTime(timeOfDay); }
public void pushButton(int x,int y,int z) { wrapperContained.pushButton(x,y,z); }
// public static void pushButton(int x,int y,int z, ) { net.minecraft.test.TestContext.pushButton(x,y,z); }
public void setBlockState(int x,int y,int z,yarnwrap.block.Block block) { wrapperContained.setBlockState(x,y,z,block.wrapperContained); }
// public static void setBlockState(int x,int y,int z,yarnwrap.block.Block block, ) { net.minecraft.test.TestContext.setBlockState(x,y,z,block.wrapperContained); }
public void setBlockState(int x,int y,int z,yarnwrap.block.BlockState state) { wrapperContained.setBlockState(x,y,z,state.wrapperContained); }
// public static void setBlockState(int x,int y,int z,yarnwrap.block.BlockState state, ) { net.minecraft.test.TestContext.setBlockState(x,y,z,state.wrapperContained); }
public void addFinalTaskWithDuration(int duration,java.lang.Runnable runnable) { wrapperContained.addFinalTaskWithDuration(duration,runnable); }
// public static void addFinalTaskWithDuration(int duration,java.lang.Runnable runnable, ) { net.minecraft.test.TestContext.addFinalTaskWithDuration(duration,runnable); }
public void expectEmptyContainer(long delay,yarnwrap.util.math.BlockPos pos) { wrapperContained.expectEmptyContainer(delay,pos.wrapperContained); }
// public static void expectEmptyContainer(long delay,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.expectEmptyContainer(delay,pos.wrapperContained); }
public void expectContainerWith(long delay,yarnwrap.util.math.BlockPos pos,yarnwrap.item.Item item) { wrapperContained.expectContainerWith(delay,pos.wrapperContained,item.wrapperContained); }
// public static void expectContainerWith(long delay,yarnwrap.util.math.BlockPos pos,yarnwrap.item.Item item, ) { net.minecraft.test.TestContext.expectContainerWith(delay,pos.wrapperContained,item.wrapperContained); }
public void runAtTick(long tick,java.lang.Runnable runnable) { wrapperContained.runAtTick(tick,runnable); }
// public static void runAtTick(long tick,java.lang.Runnable runnable, ) { net.minecraft.test.TestContext.runAtTick(tick,runnable); }
public void expectEntityAt(yarnwrap.entity.Entity entity,int x,int y,int z) { wrapperContained.expectEntityAt(entity.wrapperContained,x,y,z); }
// public static void expectEntityAt(yarnwrap.entity.Entity entity,int x,int y,int z, ) { net.minecraft.test.TestContext.expectEntityAt(entity.wrapperContained,x,y,z); }
// public boolean method_35954(yarnwrap.entity.Entity e) { return wrapperContained.method_35954(e.wrapperContained); }
// public static boolean method_35954(yarnwrap.entity.Entity e, ) { return net.minecraft.test.TestContext.method_35954(e.wrapperContained); }
public void expectEntityAt(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { wrapperContained.expectEntityAt(entity.wrapperContained,pos.wrapperContained); }
// public static void expectEntityAt(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.expectEntityAt(entity.wrapperContained,pos.wrapperContained); }
public void testEntityProperty(yarnwrap.entity.Entity entity,java.util.function.Function propertyGetter,java.lang.String propertyName,java.lang.Object expectedValue) { wrapperContained.testEntityProperty(entity.wrapperContained,propertyGetter,propertyName,expectedValue); }
// public static void testEntityProperty(yarnwrap.entity.Entity entity,java.util.function.Function propertyGetter,java.lang.String propertyName,java.lang.Object expectedValue, ) { net.minecraft.test.TestContext.testEntityProperty(entity.wrapperContained,propertyGetter,propertyName,expectedValue); }
public void testEntity(yarnwrap.entity.Entity entity,java.util.function.Predicate predicate,java.lang.String testName) { wrapperContained.testEntity(entity.wrapperContained,predicate,testName); }
// public static void testEntity(yarnwrap.entity.Entity entity,java.util.function.Predicate predicate,java.lang.String testName, ) { net.minecraft.test.TestContext.testEntity(entity.wrapperContained,predicate,testName); }
public void expectEntity(yarnwrap.entity.EntityType type) { wrapperContained.expectEntity(type.wrapperContained); }
// public static void expectEntity(yarnwrap.entity.EntityType type, ) { net.minecraft.test.TestContext.expectEntity(type.wrapperContained); }
public void expectEntityToTouch(yarnwrap.entity.EntityType type,double x,double y,double z) { wrapperContained.expectEntityToTouch(type.wrapperContained,x,y,z); }
// public static void expectEntityToTouch(yarnwrap.entity.EntityType type,double x,double y,double z, ) { net.minecraft.test.TestContext.expectEntityToTouch(type.wrapperContained,x,y,z); }
public yarnwrap.entity.Entity spawnEntity(yarnwrap.entity.EntityType type,float x,float y,float z) { return new yarnwrap.entity.Entity(wrapperContained.spawnEntity(type.wrapperContained,x,y,z)); }
// public static yarnwrap.entity.Entity spawnEntity(yarnwrap.entity.EntityType type,float x,float y,float z, ) { return new yarnwrap.entity.Entity(net.minecraft.test.TestContext.spawnEntity(type.wrapperContained,x,y,z)); }
public yarnwrap.entity.Entity spawnEntity(yarnwrap.entity.EntityType type,int x,int y,int z) { return new yarnwrap.entity.Entity(wrapperContained.spawnEntity(type.wrapperContained,x,y,z)); }
// public static yarnwrap.entity.Entity spawnEntity(yarnwrap.entity.EntityType type,int x,int y,int z, ) { return new yarnwrap.entity.Entity(net.minecraft.test.TestContext.spawnEntity(type.wrapperContained,x,y,z)); }
public yarnwrap.entity.Entity spawnEntity(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.entity.Entity(wrapperContained.spawnEntity(type.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.Entity spawnEntity(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.entity.Entity(net.minecraft.test.TestContext.spawnEntity(type.wrapperContained,pos.wrapperContained)); }
public yarnwrap.entity.Entity spawnEntity(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.Entity(wrapperContained.spawnEntity(type.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.Entity spawnEntity(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.Entity(net.minecraft.test.TestContext.spawnEntity(type.wrapperContained,pos.wrapperContained)); }
public void expectEntityAround(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos,double radius) { wrapperContained.expectEntityAround(type.wrapperContained,pos.wrapperContained,radius); }
// public static void expectEntityAround(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos,double radius, ) { net.minecraft.test.TestContext.expectEntityAround(type.wrapperContained,pos.wrapperContained,radius); }
public yarnwrap.entity.LivingEntity drown(yarnwrap.entity.LivingEntity entity) { return new yarnwrap.entity.LivingEntity(wrapperContained.drown(entity.wrapperContained)); }
// public static yarnwrap.entity.LivingEntity drown(yarnwrap.entity.LivingEntity entity, ) { return new yarnwrap.entity.LivingEntity(net.minecraft.test.TestContext.drown(entity.wrapperContained)); }
public yarnwrap.test.TimedTaskRunner startMovingTowards(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos,float speed) { return new yarnwrap.test.TimedTaskRunner(wrapperContained.startMovingTowards(entity.wrapperContained,pos.wrapperContained,speed)); }
// public static yarnwrap.test.TimedTaskRunner startMovingTowards(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos,float speed, ) { return new yarnwrap.test.TimedTaskRunner(net.minecraft.test.TestContext.startMovingTowards(entity.wrapperContained,pos.wrapperContained,speed)); }
public yarnwrap.entity.ItemEntity spawnItem(yarnwrap.item.Item item,float x,float y,float z) { return new yarnwrap.entity.ItemEntity(wrapperContained.spawnItem(item.wrapperContained,x,y,z)); }
// public static yarnwrap.entity.ItemEntity spawnItem(yarnwrap.item.Item item,float x,float y,float z, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.test.TestContext.spawnItem(item.wrapperContained,x,y,z)); }
public void expectItemAt(yarnwrap.item.Item item,yarnwrap.util.math.BlockPos pos,double radius) { wrapperContained.expectItemAt(item.wrapperContained,pos.wrapperContained,radius); }
// public static void expectItemAt(yarnwrap.item.Item item,yarnwrap.util.math.BlockPos pos,double radius, ) { net.minecraft.test.TestContext.expectItemAt(item.wrapperContained,pos.wrapperContained,radius); }
public void expectItemsAt(yarnwrap.item.Item item,yarnwrap.util.math.BlockPos pos,double radius,int amount) { wrapperContained.expectItemsAt(item.wrapperContained,pos.wrapperContained,radius,amount); }
// public static void expectItemsAt(yarnwrap.item.Item item,yarnwrap.util.math.BlockPos pos,double radius,int amount, ) { net.minecraft.test.TestContext.expectItemsAt(item.wrapperContained,pos.wrapperContained,radius,amount); }
public void expectBlock(yarnwrap.block.Block block,int x,int y,int z) { wrapperContained.expectBlock(block.wrapperContained,x,y,z); }
// public static void expectBlock(yarnwrap.block.Block block,int x,int y,int z, ) { net.minecraft.test.TestContext.expectBlock(block.wrapperContained,x,y,z); }
public void expectBlock(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos) { wrapperContained.expectBlock(block.wrapperContained,pos.wrapperContained); }
// public static void expectBlock(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.expectBlock(block.wrapperContained,pos.wrapperContained); }
// public boolean method_35973(yarnwrap.block.BlockState state) { return wrapperContained.method_35973(state.wrapperContained); }
// public static boolean method_35973(yarnwrap.block.BlockState state, ) { return net.minecraft.test.TestContext.method_35973(state.wrapperContained); }
// public boolean method_35974(yarnwrap.block.BlockState block1) { return wrapperContained.method_35974(block1.wrapperContained); }
// public static boolean method_35974(yarnwrap.block.BlockState block1, ) { return net.minecraft.test.TestContext.method_35974(block1.wrapperContained); }
public void expectSameStates(yarnwrap.util.math.BlockBox checkedBlockBox,yarnwrap.util.math.BlockPos correctStatePos) { wrapperContained.expectSameStates(checkedBlockBox.wrapperContained,correctStatePos.wrapperContained); }
// public static void expectSameStates(yarnwrap.util.math.BlockBox checkedBlockBox,yarnwrap.util.math.BlockPos correctStatePos, ) { net.minecraft.test.TestContext.expectSameStates(checkedBlockBox.wrapperContained,correctStatePos.wrapperContained); }
public yarnwrap.util.math.Vec3d getAbsolute(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getAbsolute(pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getAbsolute(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.test.TestContext.getAbsolute(pos.wrapperContained)); }
// public boolean method_35979(yarnwrap.util.math.Vec3d entity) { return wrapperContained.method_35979(entity.wrapperContained); }
// public static boolean method_35979(yarnwrap.util.math.Vec3d entity, ) { return net.minecraft.test.TestContext.method_35979(entity.wrapperContained); }
public yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.test.TestContext.getBlockState(pos.wrapperContained)); }
public void putAndRemoveRedstoneBlock(yarnwrap.util.math.BlockPos pos,long delay) { wrapperContained.putAndRemoveRedstoneBlock(pos.wrapperContained,delay); }
// public static void putAndRemoveRedstoneBlock(yarnwrap.util.math.BlockPos pos,long delay, ) { net.minecraft.test.TestContext.putAndRemoveRedstoneBlock(pos.wrapperContained,delay); }
public void expectEntityWithData(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type,java.util.function.Function entityDataGetter,java.lang.Object data) { wrapperContained.expectEntityWithData(pos.wrapperContained,type.wrapperContained,entityDataGetter,data); }
// public static void expectEntityWithData(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type,java.util.function.Function entityDataGetter,java.lang.Object data, ) { net.minecraft.test.TestContext.expectEntityWithData(pos.wrapperContained,type.wrapperContained,entityDataGetter,data); }
public void expectContainerWith(yarnwrap.util.math.BlockPos pos,yarnwrap.item.Item item) { wrapperContained.expectContainerWith(pos.wrapperContained,item.wrapperContained); }
// public static void expectContainerWith(yarnwrap.util.math.BlockPos pos,yarnwrap.item.Item item, ) { net.minecraft.test.TestContext.expectContainerWith(pos.wrapperContained,item.wrapperContained); }
public void setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block) { wrapperContained.setBlockState(pos.wrapperContained,block.wrapperContained); }
// public static void setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block, ) { net.minecraft.test.TestContext.setBlockState(pos.wrapperContained,block.wrapperContained); }
// public boolean method_35985(yarnwrap.util.math.BlockPos block1) { return wrapperContained.method_35985(block1.wrapperContained); }
// public static boolean method_35985(yarnwrap.util.math.BlockPos block1, ) { return net.minecraft.test.TestContext.method_35985(block1.wrapperContained); }
public void setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setBlockState(pos.wrapperContained,state.wrapperContained); }
// public static void setBlockState(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.test.TestContext.setBlockState(pos.wrapperContained,state.wrapperContained); }
public void expectBlockProperty(yarnwrap.util.math.BlockPos pos,yarnwrap.state.property.Property property,java.lang.Comparable value) { wrapperContained.expectBlockProperty(pos.wrapperContained,property.wrapperContained,value); }
// public static void expectBlockProperty(yarnwrap.util.math.BlockPos pos,yarnwrap.state.property.Property property,java.lang.Comparable value, ) { net.minecraft.test.TestContext.expectBlockProperty(pos.wrapperContained,property.wrapperContained,value); }
public void checkBlockProperty(yarnwrap.util.math.BlockPos pos,yarnwrap.state.property.Property property,java.util.function.Predicate predicate,java.lang.String errorMessage) { wrapperContained.checkBlockProperty(pos.wrapperContained,property.wrapperContained,predicate,errorMessage); }
// public static void checkBlockProperty(yarnwrap.util.math.BlockPos pos,yarnwrap.state.property.Property property,java.util.function.Predicate predicate,java.lang.String errorMessage, ) { net.minecraft.test.TestContext.checkBlockProperty(pos.wrapperContained,property.wrapperContained,predicate,errorMessage); }
// public void method_35989(yarnwrap.util.math.BlockPos checkedPos) { wrapperContained.method_35989(checkedPos.wrapperContained); }
// public static void method_35989(yarnwrap.util.math.BlockPos checkedPos, ) { net.minecraft.test.TestContext.method_35989(checkedPos.wrapperContained); }
public void expectSameStates(yarnwrap.util.math.BlockPos checkedPos,yarnwrap.util.math.BlockPos correctStatePos) { wrapperContained.expectSameStates(checkedPos.wrapperContained,correctStatePos.wrapperContained); }
// public static void expectSameStates(yarnwrap.util.math.BlockPos checkedPos,yarnwrap.util.math.BlockPos correctStatePos, ) { net.minecraft.test.TestContext.expectSameStates(checkedPos.wrapperContained,correctStatePos.wrapperContained); }
public void checkBlock(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate,java.lang.String errorMessage) { wrapperContained.checkBlock(pos.wrapperContained,predicate,errorMessage); }
// public static void checkBlock(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate,java.lang.String errorMessage, ) { net.minecraft.test.TestContext.checkBlock(pos.wrapperContained,predicate,errorMessage); }
public void checkBlock(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate,java.util.function.Supplier errorMessageSupplier) { wrapperContained.checkBlock(pos.wrapperContained,predicate,errorMessageSupplier); }
// public static void checkBlock(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate,java.util.function.Supplier errorMessageSupplier, ) { net.minecraft.test.TestContext.checkBlock(pos.wrapperContained,predicate,errorMessageSupplier); }
public void addFinalTask(java.lang.Runnable runnable) { wrapperContained.addFinalTask(runnable); }
// public static void addFinalTask(java.lang.Runnable runnable, ) { net.minecraft.test.TestContext.addFinalTask(runnable); }
// public void method_35994(java.lang.Runnable tick) { wrapperContained.method_35994(tick); }
// public static void method_35994(java.lang.Runnable tick, ) { net.minecraft.test.TestContext.method_35994(tick); }
public void throwGameTestException(java.lang.String message) { wrapperContained.throwGameTestException(message); }
// public static void throwGameTestException(java.lang.String message, ) { net.minecraft.test.TestContext.throwGameTestException(message); }
public void throwPositionedException(java.lang.String message,yarnwrap.entity.Entity entity) { wrapperContained.throwPositionedException(message,entity.wrapperContained); }
// public static void throwPositionedException(java.lang.String message,yarnwrap.entity.Entity entity, ) { net.minecraft.test.TestContext.throwPositionedException(message,entity.wrapperContained); }
public void throwPositionedException(java.lang.String message,yarnwrap.util.math.BlockPos pos) { wrapperContained.throwPositionedException(message,pos.wrapperContained); }
// public static void throwPositionedException(java.lang.String message,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.throwPositionedException(message,pos.wrapperContained); }
public void forEachRelativePos(java.util.function.Consumer posConsumer) { wrapperContained.forEachRelativePos(posConsumer); }
// public static void forEachRelativePos(java.util.function.Consumer posConsumer, ) { net.minecraft.test.TestContext.forEachRelativePos(posConsumer); }
// public boolean method_35999(java.util.function.Predicate state) { return wrapperContained.method_35999(state); }
// public static boolean method_35999(java.util.function.Predicate state, ) { return net.minecraft.test.TestContext.method_35999(state); }
// public boolean method_36000(yarnwrap.state.property.Property state) { return wrapperContained.method_36000(state.wrapperContained); }
// public static boolean method_36000(yarnwrap.state.property.Property state, ) { return net.minecraft.test.TestContext.method_36000(state.wrapperContained); }
public void killAllEntities() { wrapperContained.killAllEntities(); }
// public static void killAllEntities() { net.minecraft.test.TestContext.killAllEntities(); }
public void toggleLever(int x,int y,int z) { wrapperContained.toggleLever(x,y,z); }
// public static void toggleLever(int x,int y,int z, ) { net.minecraft.test.TestContext.toggleLever(x,y,z); }
public void waitAndRun(long ticks,java.lang.Runnable runnable) { wrapperContained.waitAndRun(ticks,runnable); }
// public static void waitAndRun(long ticks,java.lang.Runnable runnable, ) { net.minecraft.test.TestContext.waitAndRun(ticks,runnable); }
public void dontExpectEntity(yarnwrap.entity.EntityType type) { wrapperContained.dontExpectEntity(type.wrapperContained); }
// public static void dontExpectEntity(yarnwrap.entity.EntityType type, ) { net.minecraft.test.TestContext.dontExpectEntity(type.wrapperContained); }
public void dontExpectEntityToTouch(yarnwrap.entity.EntityType type,double x,double y,double z) { wrapperContained.dontExpectEntityToTouch(type.wrapperContained,x,y,z); }
// public static void dontExpectEntityToTouch(yarnwrap.entity.EntityType type,double x,double y,double z, ) { net.minecraft.test.TestContext.dontExpectEntityToTouch(type.wrapperContained,x,y,z); }
public yarnwrap.entity.mob.MobEntity spawnMob(yarnwrap.entity.EntityType type,float x,float y,float z) { return new yarnwrap.entity.mob.MobEntity(wrapperContained.spawnMob(type.wrapperContained,x,y,z)); }
// public static yarnwrap.entity.mob.MobEntity spawnMob(yarnwrap.entity.EntityType type,float x,float y,float z, ) { return new yarnwrap.entity.mob.MobEntity(net.minecraft.test.TestContext.spawnMob(type.wrapperContained,x,y,z)); }
public yarnwrap.entity.mob.MobEntity spawnMob(yarnwrap.entity.EntityType type,int x,int y,int z) { return new yarnwrap.entity.mob.MobEntity(wrapperContained.spawnMob(type.wrapperContained,x,y,z)); }
// public static yarnwrap.entity.mob.MobEntity spawnMob(yarnwrap.entity.EntityType type,int x,int y,int z, ) { return new yarnwrap.entity.mob.MobEntity(net.minecraft.test.TestContext.spawnMob(type.wrapperContained,x,y,z)); }
public yarnwrap.entity.mob.MobEntity spawnMob(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.entity.mob.MobEntity(wrapperContained.spawnMob(type.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.mob.MobEntity spawnMob(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.entity.mob.MobEntity(net.minecraft.test.TestContext.spawnMob(type.wrapperContained,pos.wrapperContained)); }
public yarnwrap.entity.mob.MobEntity spawnMob(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.mob.MobEntity(wrapperContained.spawnMob(type.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.mob.MobEntity spawnMob(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.mob.MobEntity(net.minecraft.test.TestContext.spawnMob(type.wrapperContained,pos.wrapperContained)); }
public void dontExpectBlock(yarnwrap.block.Block block,int x,int y,int z) { wrapperContained.dontExpectBlock(block.wrapperContained,x,y,z); }
// public static void dontExpectBlock(yarnwrap.block.Block block,int x,int y,int z, ) { net.minecraft.test.TestContext.dontExpectBlock(block.wrapperContained,x,y,z); }
public void dontExpectBlock(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos) { wrapperContained.dontExpectBlock(block.wrapperContained,pos.wrapperContained); }
// public static void dontExpectBlock(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.dontExpectBlock(block.wrapperContained,pos.wrapperContained); }
// public boolean method_36013(yarnwrap.util.math.Vec3d entity) { return wrapperContained.method_36013(entity.wrapperContained); }
// public static boolean method_36013(yarnwrap.util.math.Vec3d entity, ) { return net.minecraft.test.TestContext.method_36013(entity.wrapperContained); }
public yarnwrap.block.entity.BlockEntity getBlockEntity(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.getBlockEntity(pos.wrapperContained)); }
// public static yarnwrap.block.entity.BlockEntity getBlockEntity(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.entity.BlockEntity(net.minecraft.test.TestContext.getBlockEntity(pos.wrapperContained)); }
public void expectEntityWithDataEnd(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type,java.util.function.Function entityDataGetter,java.lang.Object data) { wrapperContained.expectEntityWithDataEnd(pos.wrapperContained,type.wrapperContained,entityDataGetter,data); }
// public static void expectEntityWithDataEnd(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type,java.util.function.Function entityDataGetter,java.lang.Object data, ) { net.minecraft.test.TestContext.expectEntityWithDataEnd(pos.wrapperContained,type.wrapperContained,entityDataGetter,data); }
public void checkBlockState(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate,java.util.function.Supplier errorMessageSupplier) { wrapperContained.checkBlockState(pos.wrapperContained,predicate,errorMessageSupplier); }
// public static void checkBlockState(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate,java.util.function.Supplier errorMessageSupplier, ) { net.minecraft.test.TestContext.checkBlockState(pos.wrapperContained,predicate,errorMessageSupplier); }
public void addInstantFinalTask(java.lang.Runnable runnable) { wrapperContained.addInstantFinalTask(runnable); }
// public static void addInstantFinalTask(java.lang.Runnable runnable, ) { net.minecraft.test.TestContext.addInstantFinalTask(runnable); }
// public void method_36019(java.lang.Runnable tick) { wrapperContained.method_36019(tick); }
// public static void method_36019(java.lang.Runnable tick, ) { net.minecraft.test.TestContext.method_36019(tick); }
public yarnwrap.entity.player.PlayerEntity createMockPlayer(yarnwrap.world.GameMode gameMode) { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.createMockPlayer(gameMode.wrapperContained)); }
// public static yarnwrap.entity.player.PlayerEntity createMockPlayer(yarnwrap.world.GameMode gameMode, ) { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.test.TestContext.createMockPlayer(gameMode.wrapperContained)); }
public void expectEntityAt(yarnwrap.entity.EntityType type,int x,int y,int z) { wrapperContained.expectEntityAt(type.wrapperContained,x,y,z); }
// public static void expectEntityAt(yarnwrap.entity.EntityType type,int x,int y,int z, ) { net.minecraft.test.TestContext.expectEntityAt(type.wrapperContained,x,y,z); }
public void expectEntityAt(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos) { wrapperContained.expectEntityAt(type.wrapperContained,pos.wrapperContained); }
// public static void expectEntityAt(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.expectEntityAt(type.wrapperContained,pos.wrapperContained); }
public void expectBlockAtEnd(yarnwrap.block.Block block,int x,int y,int z) { wrapperContained.expectBlockAtEnd(block.wrapperContained,x,y,z); }
// public static void expectBlockAtEnd(yarnwrap.block.Block block,int x,int y,int z, ) { net.minecraft.test.TestContext.expectBlockAtEnd(block.wrapperContained,x,y,z); }
public void expectBlockAtEnd(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos) { wrapperContained.expectBlockAtEnd(block.wrapperContained,pos.wrapperContained); }
// public static void expectBlockAtEnd(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.expectBlockAtEnd(block.wrapperContained,pos.wrapperContained); }
public void pushButton(yarnwrap.util.math.BlockPos pos) { wrapperContained.pushButton(pos.wrapperContained); }
// public static void pushButton(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.pushButton(pos.wrapperContained); }
public void addTask(java.lang.Runnable task) { wrapperContained.addTask(task); }
// public static void addTask(java.lang.Runnable task, ) { net.minecraft.test.TestContext.addTask(task); }
public void useNightTime() { wrapperContained.useNightTime(); }
// public static void useNightTime() { net.minecraft.test.TestContext.useNightTime(); }
public void dontExpectEntityAt(yarnwrap.entity.EntityType type,int x,int y,int z) { wrapperContained.dontExpectEntityAt(type.wrapperContained,x,y,z); }
// public static void dontExpectEntityAt(yarnwrap.entity.EntityType type,int x,int y,int z, ) { net.minecraft.test.TestContext.dontExpectEntityAt(type.wrapperContained,x,y,z); }
public void dontExpectEntityAt(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos) { wrapperContained.dontExpectEntityAt(type.wrapperContained,pos.wrapperContained); }
// public static void dontExpectEntityAt(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.dontExpectEntityAt(type.wrapperContained,pos.wrapperContained); }
public void useBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.useBlock(pos.wrapperContained,player.wrapperContained); }
// public static void useBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.test.TestContext.useBlock(pos.wrapperContained,player.wrapperContained); }
public void runAtEveryTick(java.lang.Runnable task) { wrapperContained.runAtEveryTick(task); }
// public static void runAtEveryTick(java.lang.Runnable task, ) { net.minecraft.test.TestContext.runAtEveryTick(task); }
public void complete() { wrapperContained.complete(); }
// public static void complete() { net.minecraft.test.TestContext.complete(); }
public void expectEntityAtEnd(yarnwrap.entity.EntityType type,int x,int y,int z) { wrapperContained.expectEntityAtEnd(type.wrapperContained,x,y,z); }
// public static void expectEntityAtEnd(yarnwrap.entity.EntityType type,int x,int y,int z, ) { net.minecraft.test.TestContext.expectEntityAtEnd(type.wrapperContained,x,y,z); }
public void expectEntityAtEnd(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos) { wrapperContained.expectEntityAtEnd(type.wrapperContained,pos.wrapperContained); }
// public static void expectEntityAtEnd(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.expectEntityAtEnd(type.wrapperContained,pos.wrapperContained); }
public void toggleLever(yarnwrap.util.math.BlockPos pos) { wrapperContained.toggleLever(pos.wrapperContained); }
// public static void toggleLever(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.toggleLever(pos.wrapperContained); }
public void forEachRemainingTick(java.lang.Runnable runnable) { wrapperContained.forEachRemainingTick(runnable); }
// public static void forEachRemainingTick(java.lang.Runnable runnable, ) { net.minecraft.test.TestContext.forEachRemainingTick(runnable); }
public yarnwrap.test.TimedTaskRunner createTimedTaskRunner() { return new yarnwrap.test.TimedTaskRunner(wrapperContained.createTimedTaskRunner()); }
// public static yarnwrap.test.TimedTaskRunner createTimedTaskRunner() { return new yarnwrap.test.TimedTaskRunner(net.minecraft.test.TestContext.createTimedTaskRunner()); }
public void dontExpectEntityAtEnd(yarnwrap.entity.EntityType type,int x,int y,int z) { wrapperContained.dontExpectEntityAtEnd(type.wrapperContained,x,y,z); }
// public static void dontExpectEntityAtEnd(yarnwrap.entity.EntityType type,int x,int y,int z, ) { net.minecraft.test.TestContext.dontExpectEntityAtEnd(type.wrapperContained,x,y,z); }
public void dontExpectEntityAtEnd(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos) { wrapperContained.dontExpectEntityAtEnd(type.wrapperContained,pos.wrapperContained); }
// public static void dontExpectEntityAtEnd(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.dontExpectEntityAtEnd(type.wrapperContained,pos.wrapperContained); }
public void removeBlock(yarnwrap.util.math.BlockPos pos) { wrapperContained.removeBlock(pos.wrapperContained); }
// public static void removeBlock(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.removeBlock(pos.wrapperContained); }
public long getTick() { return wrapperContained.getTick(); }
// public static long getTick() { return net.minecraft.test.TestContext.getTick(); }
public void expectEmptyContainer(yarnwrap.util.math.BlockPos pos) { wrapperContained.expectEmptyContainer(pos.wrapperContained); }
// public static void expectEmptyContainer(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.expectEmptyContainer(pos.wrapperContained); }
// public void markFinalCause() { wrapperContained.markFinalCause(); }
// public static void markFinalCause() { net.minecraft.test.TestContext.markFinalCause(); }
public void forceRandomTick(yarnwrap.util.math.BlockPos pos) { wrapperContained.forceRandomTick(pos.wrapperContained); }
// public static void forceRandomTick(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.forceRandomTick(pos.wrapperContained); }
public yarnwrap.util.math.Box getTestBox() { return new yarnwrap.util.math.Box(wrapperContained.getTestBox()); }
// public static yarnwrap.util.math.Box getTestBox() { return new yarnwrap.util.math.Box(net.minecraft.test.TestContext.getTestBox()); }
public yarnwrap.util.math.BlockPos getAbsolutePos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getAbsolutePos(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getAbsolutePos(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.test.TestContext.getAbsolutePos(pos.wrapperContained)); }
// public yarnwrap.util.math.Box getRelativeTestBox() { return new yarnwrap.util.math.Box(wrapperContained.getRelativeTestBox()); }
// public static yarnwrap.util.math.Box getRelativeTestBox() { return new yarnwrap.util.math.Box(net.minecraft.test.TestContext.getRelativeTestBox()); }
public yarnwrap.util.math.BlockPos getRelativePos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getRelativePos(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getRelativePos(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.test.TestContext.getRelativePos(pos.wrapperContained)); }
// public int getRelativeTopY(Object heightmap,int x,int z) { return wrapperContained.getRelativeTopY(heightmap,x,z); }
// public static int getRelativeTopY(Object heightmap,int x,int z, ) { return net.minecraft.test.TestContext.getRelativeTopY(heightmap,x,z); }
public void dontExpectItemAt(yarnwrap.item.Item item,yarnwrap.util.math.BlockPos pos,double radius) { wrapperContained.dontExpectItemAt(item.wrapperContained,pos.wrapperContained,radius); }
// public static void dontExpectItemAt(yarnwrap.item.Item item,yarnwrap.util.math.BlockPos pos,double radius, ) { net.minecraft.test.TestContext.dontExpectItemAt(item.wrapperContained,pos.wrapperContained,radius); }
public java.util.List getEntitiesAround(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos,double radius) { return wrapperContained.getEntitiesAround(type.wrapperContained,pos.wrapperContained,radius); }
// public static java.util.List getEntitiesAround(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos,double radius, ) { return net.minecraft.test.TestContext.getEntitiesAround(type.wrapperContained,pos.wrapperContained,radius); }
public void expectEntitiesAround(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos,int amount,double radius) { wrapperContained.expectEntitiesAround(type.wrapperContained,pos.wrapperContained,amount,radius); }
// public static void expectEntitiesAround(yarnwrap.entity.EntityType type,yarnwrap.util.math.BlockPos pos,int amount,double radius, ) { net.minecraft.test.TestContext.expectEntitiesAround(type.wrapperContained,pos.wrapperContained,amount,radius); }
public void expectEntityInside(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos1,yarnwrap.util.math.Vec3d pos2) { wrapperContained.expectEntityInside(type.wrapperContained,pos1.wrapperContained,pos2.wrapperContained); }
// public static void expectEntityInside(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos1,yarnwrap.util.math.Vec3d pos2, ) { net.minecraft.test.TestContext.expectEntityInside(type.wrapperContained,pos1.wrapperContained,pos2.wrapperContained); }
public yarnwrap.entity.ItemEntity spawnItem(yarnwrap.item.Item item,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.ItemEntity(wrapperContained.spawnItem(item.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.ItemEntity spawnItem(yarnwrap.item.Item item,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.test.TestContext.spawnItem(item.wrapperContained,pos.wrapperContained)); }
public void assertTrue(boolean condition,java.lang.String message) { wrapperContained.assertTrue(condition,message); }
// public static void assertTrue(boolean condition,java.lang.String message, ) { net.minecraft.test.TestContext.assertTrue(condition,message); }
public yarnwrap.util.math.Vec3d getRelative(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getRelative(pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getRelative(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.test.TestContext.getRelative(pos.wrapperContained)); }
public void useBlock(yarnwrap.util.math.BlockPos pos) { wrapperContained.useBlock(pos.wrapperContained); }
// public static void useBlock(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.useBlock(pos.wrapperContained); }
public void useStackOnBlock(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { wrapperContained.useStackOnBlock(player.wrapperContained,stack.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static void useStackOnBlock(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { net.minecraft.test.TestContext.useStackOnBlock(player.wrapperContained,stack.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
public void useBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult result) { wrapperContained.useBlock(pos.wrapperContained,player.wrapperContained,result.wrapperContained); }
// public static void useBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult result, ) { net.minecraft.test.TestContext.useBlock(pos.wrapperContained,player.wrapperContained,result.wrapperContained); }
// public boolean method_48000(yarnwrap.item.Item stack) { return wrapperContained.method_48000(stack.wrapperContained); }
// public static boolean method_48000(yarnwrap.item.Item stack, ) { return net.minecraft.test.TestContext.method_48000(stack.wrapperContained); }
public void expectEntityHoldingItem(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType,yarnwrap.item.Item item) { wrapperContained.expectEntityHoldingItem(pos.wrapperContained,entityType.wrapperContained,item.wrapperContained); }
// public static void expectEntityHoldingItem(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType,yarnwrap.item.Item item, ) { net.minecraft.test.TestContext.expectEntityHoldingItem(pos.wrapperContained,entityType.wrapperContained,item.wrapperContained); }
// public boolean method_48002(java.lang.Object entity) { return wrapperContained.method_48002(entity); }
// public static boolean method_48002(java.lang.Object entity, ) { return net.minecraft.test.TestContext.method_48002(entity); }
public void expectEntityWithItem(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType,yarnwrap.item.Item item) { wrapperContained.expectEntityWithItem(pos.wrapperContained,entityType.wrapperContained,item.wrapperContained); }
// public static void expectEntityWithItem(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType,yarnwrap.item.Item item, ) { net.minecraft.test.TestContext.expectEntityWithItem(pos.wrapperContained,entityType.wrapperContained,item.wrapperContained); }
public void assertFalse(boolean condition,java.lang.String message) { wrapperContained.assertFalse(condition,message); }
// public static void assertFalse(boolean condition,java.lang.String message, ) { net.minecraft.test.TestContext.assertFalse(condition,message); }
public yarnwrap.entity.LivingEntity setHealthLow(yarnwrap.entity.LivingEntity entity) { return new yarnwrap.entity.LivingEntity(wrapperContained.setHealthLow(entity.wrapperContained)); }
// public static yarnwrap.entity.LivingEntity setHealthLow(yarnwrap.entity.LivingEntity entity, ) { return new yarnwrap.entity.LivingEntity(net.minecraft.test.TestContext.setHealthLow(entity.wrapperContained)); }
public yarnwrap.server.network.ServerPlayerEntity createMockCreativeServerPlayerInWorld() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.createMockCreativeServerPlayerInWorld()); }
// public static yarnwrap.server.network.ServerPlayerEntity createMockCreativeServerPlayerInWorld() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.test.TestContext.createMockCreativeServerPlayerInWorld()); }
// public boolean method_52206(yarnwrap.entity.Entity entity) { return wrapperContained.method_52206(entity.wrapperContained); }
// public static boolean method_52206(yarnwrap.entity.Entity entity, ) { return net.minecraft.test.TestContext.method_52206(entity.wrapperContained); }
public void killAllEntities(java.lang.Class entityClass) { wrapperContained.killAllEntities(entityClass); }
// public static void killAllEntities(java.lang.Class entityClass, ) { net.minecraft.test.TestContext.killAllEntities(entityClass); }
public void expectRedstonePower(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,java.util.function.IntPredicate powerPredicate,java.util.function.Supplier errorMessage) { wrapperContained.expectRedstonePower(pos.wrapperContained,direction.wrapperContained,powerPredicate,errorMessage); }
// public static void expectRedstonePower(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,java.util.function.IntPredicate powerPredicate,java.util.function.Supplier errorMessage, ) { net.minecraft.test.TestContext.expectRedstonePower(pos.wrapperContained,direction.wrapperContained,powerPredicate,errorMessage); }
public void expectEntityHasEffect(yarnwrap.entity.LivingEntity entity,yarnwrap.registry.entry.RegistryEntry effect,int amplifier) { wrapperContained.expectEntityHasEffect(entity.wrapperContained,effect.wrapperContained,amplifier); }
// public static void expectEntityHasEffect(yarnwrap.entity.LivingEntity entity,yarnwrap.registry.entry.RegistryEntry effect,int amplifier, ) { net.minecraft.test.TestContext.expectEntityHasEffect(entity.wrapperContained,effect.wrapperContained,amplifier); }
public void expectItem(yarnwrap.item.Item item) { wrapperContained.expectItem(item.wrapperContained); }
// public static void expectItem(yarnwrap.item.Item item, ) { net.minecraft.test.TestContext.expectItem(item.wrapperContained); }
public void dontExpectItem(yarnwrap.item.Item item) { wrapperContained.dontExpectItem(item.wrapperContained); }
// public static void dontExpectItem(yarnwrap.item.Item item, ) { net.minecraft.test.TestContext.dontExpectItem(item.wrapperContained); }
public void expectEntities(yarnwrap.entity.EntityType type,int amount) { wrapperContained.expectEntities(type.wrapperContained,amount); }
// public static void expectEntities(yarnwrap.entity.EntityType type,int amount, ) { net.minecraft.test.TestContext.expectEntities(type.wrapperContained,amount); }
public void setBiome(yarnwrap.registry.RegistryKey biome) { wrapperContained.setBiome(biome.wrapperContained); }
// public static void setBiome(yarnwrap.registry.RegistryKey biome, ) { net.minecraft.test.TestContext.setBiome(biome.wrapperContained); }
public void forceTickIceAndSnow() { wrapperContained.forceTickIceAndSnow(); }
// public static void forceTickIceAndSnow() { net.minecraft.test.TestContext.forceTickIceAndSnow(); }
public void forceTickIceAndSnow(yarnwrap.util.math.BlockPos pos) { wrapperContained.forceTickIceAndSnow(pos.wrapperContained); }
// public static void forceTickIceAndSnow(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.test.TestContext.forceTickIceAndSnow(pos.wrapperContained); }
public yarnwrap.entity.Entity expectEntityAtOrigin(yarnwrap.entity.EntityType type) { return new yarnwrap.entity.Entity(wrapperContained.expectEntityAtOrigin(type.wrapperContained)); }
// public static yarnwrap.entity.Entity expectEntityAtOrigin(yarnwrap.entity.EntityType type, ) { return new yarnwrap.entity.Entity(net.minecraft.test.TestContext.expectEntityAtOrigin(type.wrapperContained)); }
public yarnwrap.entity.Entity expectEntity(yarnwrap.entity.EntityType type,int x,int y,int z,double margin) { return new yarnwrap.entity.Entity(wrapperContained.expectEntity(type.wrapperContained,x,y,z,margin)); }
// public static yarnwrap.entity.Entity expectEntity(yarnwrap.entity.EntityType type,int x,int y,int z,double margin, ) { return new yarnwrap.entity.Entity(net.minecraft.test.TestContext.expectEntity(type.wrapperContained,x,y,z,margin)); }
public java.util.List getEntitiesAround(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos,double margin) { return wrapperContained.getEntitiesAround(type.wrapperContained,pos.wrapperContained,margin); }
// public static java.util.List getEntitiesAround(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos,double margin, ) { return net.minecraft.test.TestContext.getEntitiesAround(type.wrapperContained,pos.wrapperContained,margin); }
// public boolean method_56204(yarnwrap.util.math.Box entity) { return wrapperContained.method_56204(entity.wrapperContained); }
// public static boolean method_56204(yarnwrap.util.math.Box entity, ) { return net.minecraft.test.TestContext.method_56204(entity.wrapperContained); }
// public int method_56205(yarnwrap.util.math.Vec3d a,yarnwrap.entity.Entity b) { return wrapperContained.method_56205(a.wrapperContained,b.wrapperContained); }
// public static int method_56205(yarnwrap.util.math.Vec3d a,yarnwrap.entity.Entity b, ) { return net.minecraft.test.TestContext.method_56205(a.wrapperContained,b.wrapperContained); }
public java.util.List getEntitiesAround(yarnwrap.entity.EntityType type,int x,int y,int z,double margin) { return wrapperContained.getEntitiesAround(type.wrapperContained,x,y,z,margin); }
// public static java.util.List getEntitiesAround(yarnwrap.entity.EntityType type,int x,int y,int z,double margin, ) { return net.minecraft.test.TestContext.getEntitiesAround(type.wrapperContained,x,y,z,margin); }
public java.util.List getEntities(yarnwrap.entity.EntityType type) { return wrapperContained.getEntities(type.wrapperContained); }
// public static java.util.List getEntities(yarnwrap.entity.EntityType type, ) { return net.minecraft.test.TestContext.getEntities(type.wrapperContained); }
public void assertEquals(java.lang.Object value,java.lang.Object expected,java.lang.String name) { wrapperContained.assertEquals(value,expected,name); }
// public static void assertEquals(java.lang.Object value,java.lang.Object expected,java.lang.String name, ) { net.minecraft.test.TestContext.assertEquals(value,expected,name); }
public void setEntityPos(yarnwrap.entity.mob.MobEntity entity,float x,float y,float z) { wrapperContained.setEntityPos(entity.wrapperContained,x,y,z); }
// public static void setEntityPos(yarnwrap.entity.mob.MobEntity entity,float x,float y,float z, ) { net.minecraft.test.TestContext.setEntityPos(entity.wrapperContained,x,y,z); }
public yarnwrap.entity.ItemEntity spawnItem(yarnwrap.item.Item item,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.entity.ItemEntity(wrapperContained.spawnItem(item.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.ItemEntity spawnItem(yarnwrap.item.Item item,yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.test.TestContext.spawnItem(item.wrapperContained,pos.wrapperContained)); }
public void dontExpectEntityBetween(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos1,yarnwrap.util.math.Vec3d pos2) { wrapperContained.dontExpectEntityBetween(type.wrapperContained,pos1.wrapperContained,pos2.wrapperContained); }
// public static void dontExpectEntityBetween(yarnwrap.entity.EntityType type,yarnwrap.util.math.Vec3d pos1,yarnwrap.util.math.Vec3d pos2, ) { net.minecraft.test.TestContext.dontExpectEntityBetween(type.wrapperContained,pos1.wrapperContained,pos2.wrapperContained); }
public void checkBlockEntity(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate,java.util.function.Supplier errorMessageSupplier) { wrapperContained.checkBlockEntity(pos.wrapperContained,predicate,errorMessageSupplier); }
// public static void checkBlockEntity(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate,java.util.function.Supplier errorMessageSupplier, ) { net.minecraft.test.TestContext.checkBlockEntity(pos.wrapperContained,predicate,errorMessageSupplier); }
public yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation()); }
// public static yarnwrap.util.BlockRotation getRotation() { return new yarnwrap.util.BlockRotation(net.minecraft.test.TestContext.getRotation()); }
public void expectEntityIn(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box,java.lang.String message) { wrapperContained.expectEntityIn(entity.wrapperContained,box.wrapperContained,message); }
// public static void expectEntityIn(yarnwrap.entity.Entity entity,yarnwrap.util.math.Box box,java.lang.String message, ) { net.minecraft.test.TestContext.expectEntityIn(entity.wrapperContained,box.wrapperContained,message); }

}