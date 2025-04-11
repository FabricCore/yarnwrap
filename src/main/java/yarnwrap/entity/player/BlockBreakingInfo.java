package yarnwrap.entity.player;
public class BlockBreakingInfo { public net.minecraft.entity.player.BlockBreakingInfo wrapperContained; public BlockBreakingInfo(net.minecraft.entity.player.BlockBreakingInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lastUpdateTick() { return wrapperContained.lastUpdateTick; }
// public void lastUpdateTick(int value) { wrapperContained.lastUpdateTick = value; }
// public int stage() { return wrapperContained.stage; }
// public void stage(int value) { wrapperContained.stage = value; }
// public int actorNetworkId() { return wrapperContained.actorNetworkId; }
// public void actorNetworkId(int value) { wrapperContained.actorNetworkId = value; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
public BlockBreakingInfo(int breakingEntityId,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.entity.player.BlockBreakingInfo(breakingEntityId,pos.wrapperContained); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public void setStage(int stage) { wrapperContained.setStage(stage); }
public int getStage() { return wrapperContained.getStage(); }
public void setLastUpdateTick(int lastUpdateTick) { wrapperContained.setLastUpdateTick(lastUpdateTick); }
public int getLastUpdateTick() { return wrapperContained.getLastUpdateTick(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public int getActorId() { return wrapperContained.getActorId(); }

}