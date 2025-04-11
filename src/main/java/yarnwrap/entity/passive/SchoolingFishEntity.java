package yarnwrap.entity.passive;
public class SchoolingFishEntity { public net.minecraft.entity.passive.SchoolingFishEntity wrapperContained; public SchoolingFishEntity(net.minecraft.entity.passive.SchoolingFishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int groupSize() { return wrapperContained.groupSize; }
// public void groupSize(int value) { wrapperContained.groupSize = value; }
// public yarnwrap.entity.passive.SchoolingFishEntity leader() { return new yarnwrap.entity.passive.SchoolingFishEntity(wrapperContained.leader); }
// public void leader(yarnwrap.entity.passive.SchoolingFishEntity value) { wrapperContained.leader = value.wrapperContained; }
// public void decreaseGroupSize() { wrapperContained.decreaseGroupSize(); }
public yarnwrap.entity.passive.SchoolingFishEntity joinGroupOf(yarnwrap.entity.passive.SchoolingFishEntity groupLeader) { return new yarnwrap.entity.passive.SchoolingFishEntity(wrapperContained.joinGroupOf(groupLeader.wrapperContained)); }
// public void increaseGroupSize() { wrapperContained.increaseGroupSize(); }
public void moveTowardLeader() { wrapperContained.moveTowardLeader(); }
public boolean isCloseEnoughToLeader() { return wrapperContained.isCloseEnoughToLeader(); }
public int getMaxGroupSize() { return wrapperContained.getMaxGroupSize(); }
public void leaveGroup() { wrapperContained.leaveGroup(); }
public boolean hasOtherFishInGroup() { return wrapperContained.hasOtherFishInGroup(); }
public void pullInOtherFish(java.util.stream.Stream fish) { wrapperContained.pullInOtherFish(fish); }
public boolean canHaveMoreFishInGroup() { return wrapperContained.canHaveMoreFishInGroup(); }
public boolean hasLeader() { return wrapperContained.hasLeader(); }

}