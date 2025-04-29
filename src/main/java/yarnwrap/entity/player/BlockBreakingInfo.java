package yarnwrap.entity.player;
public class BlockBreakingInfo { public net.minecraft.entity.player.BlockBreakingInfo wrapperContained; public BlockBreakingInfo(net.minecraft.entity.player.BlockBreakingInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lastUpdateTick() { return wrapperContained.lastUpdateTick; }
// public void lastUpdateTick(int value) { wrapperContained.lastUpdateTick = value; }
// public static int lastUpdateTick() { return net.minecraft.entity.player.BlockBreakingInfo.lastUpdateTick; }
// public static void lastUpdateTick(int value, ) { net.minecraft.entity.player.BlockBreakingInfo.lastUpdateTick = value; }

// public int stage() { return wrapperContained.stage; }
// public void stage(int value) { wrapperContained.stage = value; }
// public static int stage() { return net.minecraft.entity.player.BlockBreakingInfo.stage; }
// public static void stage(int value, ) { net.minecraft.entity.player.BlockBreakingInfo.stage = value; }

// public int actorNetworkId() { return wrapperContained.actorNetworkId; }
// public void actorNetworkId(int value) { wrapperContained.actorNetworkId = value; }
// public static int actorNetworkId() { return net.minecraft.entity.player.BlockBreakingInfo.actorNetworkId; }
// public static void actorNetworkId(int value, ) { net.minecraft.entity.player.BlockBreakingInfo.actorNetworkId = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.player.BlockBreakingInfo.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.player.BlockBreakingInfo.pos = value.wrapperContained; }

public BlockBreakingInfo(int breakingEntityId,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.entity.player.BlockBreakingInfo(breakingEntityId,pos.wrapperContained); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
// public static int compareTo(java.lang.Object other, ) { return net.minecraft.entity.player.BlockBreakingInfo.compareTo(other); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.entity.player.BlockBreakingInfo.equals(o); }
public void setStage(int stage) { wrapperContained.setStage(stage); }
// public static void setStage(int stage, ) { net.minecraft.entity.player.BlockBreakingInfo.setStage(stage); }
public int getStage() { return wrapperContained.getStage(); }
// public static int getStage() { return net.minecraft.entity.player.BlockBreakingInfo.getStage(); }
public void setLastUpdateTick(int lastUpdateTick) { wrapperContained.setLastUpdateTick(lastUpdateTick); }
// public static void setLastUpdateTick(int lastUpdateTick, ) { net.minecraft.entity.player.BlockBreakingInfo.setLastUpdateTick(lastUpdateTick); }
public int getLastUpdateTick() { return wrapperContained.getLastUpdateTick(); }
// public static int getLastUpdateTick() { return net.minecraft.entity.player.BlockBreakingInfo.getLastUpdateTick(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.player.BlockBreakingInfo.getPos()); }
public int getActorId() { return wrapperContained.getActorId(); }
// public static int getActorId() { return net.minecraft.entity.player.BlockBreakingInfo.getActorId(); }

}