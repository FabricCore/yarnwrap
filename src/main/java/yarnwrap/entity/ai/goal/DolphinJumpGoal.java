package yarnwrap.entity.ai.goal;
public class DolphinJumpGoal { public net.minecraft.entity.ai.goal.DolphinJumpGoal wrapperContained; public DolphinJumpGoal(net.minecraft.entity.ai.goal.DolphinJumpGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.DolphinEntity dolphin() { return new yarnwrap.entity.passive.DolphinEntity(wrapperContained.dolphin); }
// public void dolphin(yarnwrap.entity.passive.DolphinEntity value) { wrapperContained.dolphin = value.wrapperContained; }
// public static yarnwrap.entity.passive.DolphinEntity dolphin() { return new yarnwrap.entity.passive.DolphinEntity(net.minecraft.entity.ai.goal.DolphinJumpGoal.dolphin); }
// public static void dolphin(yarnwrap.entity.passive.DolphinEntity value, ) { net.minecraft.entity.ai.goal.DolphinJumpGoal.dolphin = value.wrapperContained; }

// public int chance() { return wrapperContained.chance; }
// public void chance(int value) { wrapperContained.chance = value; }
// public static int chance() { return net.minecraft.entity.ai.goal.DolphinJumpGoal.chance; }
// public static void chance(int value, ) { net.minecraft.entity.ai.goal.DolphinJumpGoal.chance = value; }

// public boolean inWater() { return wrapperContained.inWater; }
// public void inWater(boolean value) { wrapperContained.inWater = value; }
// public static boolean inWater() { return net.minecraft.entity.ai.goal.DolphinJumpGoal.inWater; }
// public static void inWater(boolean value, ) { net.minecraft.entity.ai.goal.DolphinJumpGoal.inWater = value; }

// public int[] OFFSET_MULTIPLIERS() { return wrapperContained.OFFSET_MULTIPLIERS; }
// public void OFFSET_MULTIPLIERS(int[] value) { wrapperContained.OFFSET_MULTIPLIERS = value; }
// public static int[] OFFSET_MULTIPLIERS() { return net.minecraft.entity.ai.goal.DolphinJumpGoal.OFFSET_MULTIPLIERS; }
// public static void OFFSET_MULTIPLIERS(int[] value, ) { net.minecraft.entity.ai.goal.DolphinJumpGoal.OFFSET_MULTIPLIERS = value; }

public DolphinJumpGoal(yarnwrap.entity.passive.DolphinEntity dolphin,int chance) { this.wrapperContained = new net.minecraft.entity.ai.goal.DolphinJumpGoal(dolphin.wrapperContained,chance); }
// public boolean isAirAbove(yarnwrap.util.math.BlockPos pos,int offsetX,int offsetZ,int multiplier) { return wrapperContained.isAirAbove(pos.wrapperContained,offsetX,offsetZ,multiplier); }
// public static boolean isAirAbove(yarnwrap.util.math.BlockPos pos,int offsetX,int offsetZ,int multiplier, ) { return net.minecraft.entity.ai.goal.DolphinJumpGoal.isAirAbove(pos.wrapperContained,offsetX,offsetZ,multiplier); }
// public boolean isWater(yarnwrap.util.math.BlockPos pos,int offsetX,int offsetZ,int multiplier) { return wrapperContained.isWater(pos.wrapperContained,offsetX,offsetZ,multiplier); }
// public static boolean isWater(yarnwrap.util.math.BlockPos pos,int offsetX,int offsetZ,int multiplier, ) { return net.minecraft.entity.ai.goal.DolphinJumpGoal.isWater(pos.wrapperContained,offsetX,offsetZ,multiplier); }

}