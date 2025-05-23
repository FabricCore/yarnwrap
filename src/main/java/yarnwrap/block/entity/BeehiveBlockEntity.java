package yarnwrap.block.entity;
public class BeehiveBlockEntity { public net.minecraft.block.entity.BeehiveBlockEntity wrapperContained; public BeehiveBlockEntity(net.minecraft.block.entity.BeehiveBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List bees() { return wrapperContained.bees; }
// public void bees(java.util.List value) { wrapperContained.bees = value; }
// public static java.util.List bees() { return net.minecraft.block.entity.BeehiveBlockEntity.bees; }
// public static void bees(java.util.List value, ) { net.minecraft.block.entity.BeehiveBlockEntity.bees = value; }

// public yarnwrap.util.math.BlockPos flowerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.flowerPos); }
// public void flowerPos(yarnwrap.util.math.BlockPos value) { wrapperContained.flowerPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos flowerPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.BeehiveBlockEntity.flowerPos); }
// public static void flowerPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.block.entity.BeehiveBlockEntity.flowerPos = value.wrapperContained; }

// public java.lang.String FLOWER_POS_KEY() { return wrapperContained.FLOWER_POS_KEY; }
// public void FLOWER_POS_KEY(java.lang.String value) { wrapperContained.FLOWER_POS_KEY = value; }
// public static java.lang.String FLOWER_POS_KEY() { return net.minecraft.block.entity.BeehiveBlockEntity.FLOWER_POS_KEY; }
// public static void FLOWER_POS_KEY(java.lang.String value, ) { net.minecraft.block.entity.BeehiveBlockEntity.FLOWER_POS_KEY = value; }

// public java.lang.String BEES_KEY() { return wrapperContained.BEES_KEY; }
// public void BEES_KEY(java.lang.String value) { wrapperContained.BEES_KEY = value; }
// public static java.lang.String BEES_KEY() { return net.minecraft.block.entity.BeehiveBlockEntity.BEES_KEY; }
// public static void BEES_KEY(java.lang.String value, ) { net.minecraft.block.entity.BeehiveBlockEntity.BEES_KEY = value; }

// public int MAX_BEE_COUNT() { return wrapperContained.MAX_BEE_COUNT; }
// public void MAX_BEE_COUNT(int value) { wrapperContained.MAX_BEE_COUNT = value; }
public static int MAX_BEE_COUNT() { return net.minecraft.block.entity.BeehiveBlockEntity.MAX_BEE_COUNT; }
// public static void MAX_BEE_COUNT(int value, ) { net.minecraft.block.entity.BeehiveBlockEntity.MAX_BEE_COUNT = value; }

// public int MIN_OCCUPATION_TICKS_WITHOUT_NECTAR() { return wrapperContained.MIN_OCCUPATION_TICKS_WITHOUT_NECTAR; }
// public void MIN_OCCUPATION_TICKS_WITHOUT_NECTAR(int value) { wrapperContained.MIN_OCCUPATION_TICKS_WITHOUT_NECTAR = value; }
public static int MIN_OCCUPATION_TICKS_WITHOUT_NECTAR() { return net.minecraft.block.entity.BeehiveBlockEntity.MIN_OCCUPATION_TICKS_WITHOUT_NECTAR; }
// public static void MIN_OCCUPATION_TICKS_WITHOUT_NECTAR(int value, ) { net.minecraft.block.entity.BeehiveBlockEntity.MIN_OCCUPATION_TICKS_WITHOUT_NECTAR = value; }

// public int ANGERED_CANNOT_ENTER_HIVE_TICKS() { return wrapperContained.ANGERED_CANNOT_ENTER_HIVE_TICKS; }
// public void ANGERED_CANNOT_ENTER_HIVE_TICKS(int value) { wrapperContained.ANGERED_CANNOT_ENTER_HIVE_TICKS = value; }
// public static int ANGERED_CANNOT_ENTER_HIVE_TICKS() { return net.minecraft.block.entity.BeehiveBlockEntity.ANGERED_CANNOT_ENTER_HIVE_TICKS; }
// public static void ANGERED_CANNOT_ENTER_HIVE_TICKS(int value, ) { net.minecraft.block.entity.BeehiveBlockEntity.ANGERED_CANNOT_ENTER_HIVE_TICKS = value; }

// public int MIN_OCCUPATION_TICKS_WITH_NECTAR() { return wrapperContained.MIN_OCCUPATION_TICKS_WITH_NECTAR; }
// public void MIN_OCCUPATION_TICKS_WITH_NECTAR(int value) { wrapperContained.MIN_OCCUPATION_TICKS_WITH_NECTAR = value; }
// public static int MIN_OCCUPATION_TICKS_WITH_NECTAR() { return net.minecraft.block.entity.BeehiveBlockEntity.MIN_OCCUPATION_TICKS_WITH_NECTAR; }
// public static void MIN_OCCUPATION_TICKS_WITH_NECTAR(int value, ) { net.minecraft.block.entity.BeehiveBlockEntity.MIN_OCCUPATION_TICKS_WITH_NECTAR = value; }

// public java.util.List IRRELEVANT_BEE_NBT_KEYS() { return wrapperContained.IRRELEVANT_BEE_NBT_KEYS; }
// public void IRRELEVANT_BEE_NBT_KEYS(java.util.List value) { wrapperContained.IRRELEVANT_BEE_NBT_KEYS = value; }
// public static java.util.List IRRELEVANT_BEE_NBT_KEYS() { return net.minecraft.block.entity.BeehiveBlockEntity.IRRELEVANT_BEE_NBT_KEYS; }
// public static void IRRELEVANT_BEE_NBT_KEYS(java.util.List value, ) { net.minecraft.block.entity.BeehiveBlockEntity.IRRELEVANT_BEE_NBT_KEYS = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.BeehiveBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.BeehiveBlockEntity.LOGGER = value; }

public BeehiveBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BeehiveBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void tryEnterHive(yarnwrap.entity.passive.BeeEntity entity) { wrapperContained.tryEnterHive(entity.wrapperContained); }
// public static void tryEnterHive(yarnwrap.entity.passive.BeeEntity entity, ) { net.minecraft.block.entity.BeehiveBlockEntity.tryEnterHive(entity.wrapperContained); }
// public void angerBees(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state,Object beeState) { wrapperContained.angerBees(player.wrapperContained,state.wrapperContained,beeState); }
// public static void angerBees(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state,Object beeState, ) { net.minecraft.block.entity.BeehiveBlockEntity.angerBees(player.wrapperContained,state.wrapperContained,beeState); }
// public java.util.List tryReleaseBee(yarnwrap.block.BlockState state,Object beeState) { return wrapperContained.tryReleaseBee(state.wrapperContained,beeState); }
// public static java.util.List tryReleaseBee(yarnwrap.block.BlockState state,Object beeState, ) { return net.minecraft.block.entity.BeehiveBlockEntity.tryReleaseBee(state.wrapperContained,beeState); }
// public boolean method_21854(yarnwrap.block.BlockState bee) { return wrapperContained.method_21854(bee.wrapperContained); }
// public static boolean method_21854(yarnwrap.block.BlockState bee, ) { return net.minecraft.block.entity.BeehiveBlockEntity.method_21854(bee.wrapperContained); }
// public boolean releaseBee(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,Object bee,java.util.List entities,Object beeState,yarnwrap.util.math.BlockPos flowerPos) { return wrapperContained.releaseBee(world.wrapperContained,pos.wrapperContained,state.wrapperContained,bee,entities,beeState,flowerPos.wrapperContained); }
// public static boolean releaseBee(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,Object bee,java.util.List entities,Object beeState,yarnwrap.util.math.BlockPos flowerPos, ) { return net.minecraft.block.entity.BeehiveBlockEntity.releaseBee(world.wrapperContained,pos.wrapperContained,state.wrapperContained,bee,entities,beeState,flowerPos.wrapperContained); }
public boolean isFullOfBees() { return wrapperContained.isFullOfBees(); }
// public static boolean isFullOfBees() { return net.minecraft.block.entity.BeehiveBlockEntity.isFullOfBees(); }
// public boolean hasFlowerPos() { return wrapperContained.hasFlowerPos(); }
// public static boolean hasFlowerPos() { return net.minecraft.block.entity.BeehiveBlockEntity.hasFlowerPos(); }
// public void tickBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.List bees,yarnwrap.util.math.BlockPos flowerPos) { wrapperContained.tickBees(world.wrapperContained,pos.wrapperContained,state.wrapperContained,bees,flowerPos.wrapperContained); }
// public static void tickBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.List bees,yarnwrap.util.math.BlockPos flowerPos, ) { net.minecraft.block.entity.BeehiveBlockEntity.tickBees(world.wrapperContained,pos.wrapperContained,state.wrapperContained,bees,flowerPos.wrapperContained); }
public boolean hasNoBees() { return wrapperContained.hasNoBees(); }
// public static boolean hasNoBees() { return net.minecraft.block.entity.BeehiveBlockEntity.hasNoBees(); }
public boolean isNearFire() { return wrapperContained.isNearFire(); }
// public static boolean isNearFire() { return net.minecraft.block.entity.BeehiveBlockEntity.isNearFire(); }
// public int getHoneyLevel(yarnwrap.block.BlockState state) { return wrapperContained.getHoneyLevel(state.wrapperContained); }
// public static int getHoneyLevel(yarnwrap.block.BlockState state, ) { return net.minecraft.block.entity.BeehiveBlockEntity.getHoneyLevel(state.wrapperContained); }
public int getBeeCount() { return wrapperContained.getBeeCount(); }
// public static int getBeeCount() { return net.minecraft.block.entity.BeehiveBlockEntity.getBeeCount(); }
public boolean isSmoked() { return wrapperContained.isSmoked(); }
// public static boolean isSmoked() { return net.minecraft.block.entity.BeehiveBlockEntity.isSmoked(); }
// public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BeehiveBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BeehiveBlockEntity blockEntity, ) { net.minecraft.block.entity.BeehiveBlockEntity.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void addBee(Object bee) { wrapperContained.addBee(bee); }
// public static void addBee(Object bee, ) { net.minecraft.block.entity.BeehiveBlockEntity.addBee(bee); }
// public boolean method_40019(Object statex) { return wrapperContained.method_40019(statex); }
// public static boolean method_40019(Object statex, ) { return net.minecraft.block.entity.BeehiveBlockEntity.method_40019(statex); }
// public java.util.List createBeesData() { return wrapperContained.createBeesData(); }
// public static java.util.List createBeesData() { return net.minecraft.block.entity.BeehiveBlockEntity.createBeesData(); }

}