package yarnwrap.block.entity;
public class BeehiveBlockEntity { public net.minecraft.block.entity.BeehiveBlockEntity wrapperContained; public BeehiveBlockEntity(net.minecraft.block.entity.BeehiveBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List bees() { return wrapperContained.bees; }
// public void bees(java.util.List value) { wrapperContained.bees = value; }
// public yarnwrap.util.math.BlockPos flowerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.flowerPos); }
// public void flowerPos(yarnwrap.util.math.BlockPos value) { wrapperContained.flowerPos = value.wrapperContained; }
// public java.lang.String FLOWER_POS_KEY() { return wrapperContained.FLOWER_POS_KEY; }
// public void FLOWER_POS_KEY(java.lang.String value) { wrapperContained.FLOWER_POS_KEY = value; }
// public java.lang.String BEES_KEY() { return wrapperContained.BEES_KEY; }
// public void BEES_KEY(java.lang.String value) { wrapperContained.BEES_KEY = value; }
public int MAX_BEE_COUNT() { return wrapperContained.MAX_BEE_COUNT; }
// public void MAX_BEE_COUNT(int value) { wrapperContained.MAX_BEE_COUNT = value; }
public int MIN_OCCUPATION_TICKS_WITHOUT_NECTAR() { return wrapperContained.MIN_OCCUPATION_TICKS_WITHOUT_NECTAR; }
// public void MIN_OCCUPATION_TICKS_WITHOUT_NECTAR(int value) { wrapperContained.MIN_OCCUPATION_TICKS_WITHOUT_NECTAR = value; }
// public int ANGERED_CANNOT_ENTER_HIVE_TICKS() { return wrapperContained.ANGERED_CANNOT_ENTER_HIVE_TICKS; }
// public void ANGERED_CANNOT_ENTER_HIVE_TICKS(int value) { wrapperContained.ANGERED_CANNOT_ENTER_HIVE_TICKS = value; }
// public int MIN_OCCUPATION_TICKS_WITH_NECTAR() { return wrapperContained.MIN_OCCUPATION_TICKS_WITH_NECTAR; }
// public void MIN_OCCUPATION_TICKS_WITH_NECTAR(int value) { wrapperContained.MIN_OCCUPATION_TICKS_WITH_NECTAR = value; }
// public java.util.List IRRELEVANT_BEE_NBT_KEYS() { return wrapperContained.IRRELEVANT_BEE_NBT_KEYS; }
// public void IRRELEVANT_BEE_NBT_KEYS(java.util.List value) { wrapperContained.IRRELEVANT_BEE_NBT_KEYS = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public void tryEnterHive(yarnwrap.entity.Entity entity) { wrapperContained.tryEnterHive(entity.wrapperContained); }
// public void angerBees(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state,Object beeState) { wrapperContained.angerBees(player.wrapperContained,state.wrapperContained,beeState); }
// public java.util.List tryReleaseBee(yarnwrap.block.BlockState state,Object beeState) { return wrapperContained.tryReleaseBee(state.wrapperContained,beeState); }
// public boolean releaseBee(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,Object bee,java.util.List entities,Object beeState,yarnwrap.util.math.BlockPos flowerPos) { return wrapperContained.releaseBee(world.wrapperContained,pos.wrapperContained,state.wrapperContained,bee,entities,beeState,flowerPos.wrapperContained); }
public boolean isFullOfBees() { return wrapperContained.isFullOfBees(); }
// public boolean hasFlowerPos() { return wrapperContained.hasFlowerPos(); }
// public void tickBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.List bees,yarnwrap.util.math.BlockPos flowerPos) { wrapperContained.tickBees(world.wrapperContained,pos.wrapperContained,state.wrapperContained,bees,flowerPos.wrapperContained); }
public boolean hasNoBees() { return wrapperContained.hasNoBees(); }
public boolean isNearFire() { return wrapperContained.isNearFire(); }
public int getHoneyLevel(yarnwrap.block.BlockState state) { return wrapperContained.getHoneyLevel(state.wrapperContained); }
public int getBeeCount() { return wrapperContained.getBeeCount(); }
public boolean isSmoked() { return wrapperContained.isSmoked(); }
public void serverTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BeehiveBlockEntity blockEntity) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void addBee(Object bee) { wrapperContained.addBee(bee); }
// public java.util.List createBeesData() { return wrapperContained.createBeesData(); }

}