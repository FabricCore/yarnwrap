package yarnwrap.world;
public class RedstoneView { public net.minecraft.world.RedstoneView wrapperContained; public RedstoneView(net.minecraft.world.RedstoneView wrapperContained) { this.wrapperContained = wrapperContained; }

public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
public boolean isReceivingRedstonePower(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isReceivingRedstonePower(pos.wrapperContained); }
public int getReceivedRedstonePower(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getReceivedRedstonePower(pos.wrapperContained); }
public int getStrongRedstonePower(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.getStrongRedstonePower(pos.wrapperContained,direction.wrapperContained); }
public int getEmittedRedstonePower(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,boolean onlyFromGate) { return wrapperContained.getEmittedRedstonePower(pos.wrapperContained,direction.wrapperContained,onlyFromGate); }
public boolean isEmittingRedstonePower(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.isEmittingRedstonePower(pos.wrapperContained,direction.wrapperContained); }
public int getEmittedRedstonePower(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.getEmittedRedstonePower(pos.wrapperContained,direction.wrapperContained); }
public int getReceivedStrongRedstonePower(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getReceivedStrongRedstonePower(pos.wrapperContained); }

}