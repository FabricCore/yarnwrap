package yarnwrap.entity.passive;
public class SchoolingFishEntity { public net.minecraft.entity.passive.SchoolingFishEntity wrapperContained; public SchoolingFishEntity(net.minecraft.entity.passive.SchoolingFishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int groupSize() { return wrapperContained.groupSize; }
// public void groupSize(int value) { wrapperContained.groupSize = value; }
// public static int groupSize() { return net.minecraft.entity.passive.SchoolingFishEntity.groupSize; }
// public static void groupSize(int value, ) { net.minecraft.entity.passive.SchoolingFishEntity.groupSize = value; }

// public yarnwrap.entity.passive.SchoolingFishEntity leader() { return new yarnwrap.entity.passive.SchoolingFishEntity(wrapperContained.leader); }
// public void leader(yarnwrap.entity.passive.SchoolingFishEntity value) { wrapperContained.leader = value.wrapperContained; }
// public static yarnwrap.entity.passive.SchoolingFishEntity leader() { return new yarnwrap.entity.passive.SchoolingFishEntity(net.minecraft.entity.passive.SchoolingFishEntity.leader); }
// public static void leader(yarnwrap.entity.passive.SchoolingFishEntity value, ) { net.minecraft.entity.passive.SchoolingFishEntity.leader = value.wrapperContained; }

// public void method_6458(yarnwrap.entity.passive.SchoolingFishEntity fishx) { wrapperContained.method_6458(fishx.wrapperContained); }
// public static void method_6458(yarnwrap.entity.passive.SchoolingFishEntity fishx, ) { net.minecraft.entity.passive.SchoolingFishEntity.method_6458(fishx.wrapperContained); }
// public void decreaseGroupSize() { wrapperContained.decreaseGroupSize(); }
// public static void decreaseGroupSize() { net.minecraft.entity.passive.SchoolingFishEntity.decreaseGroupSize(); }
// public boolean method_6460(yarnwrap.entity.passive.SchoolingFishEntity fishx) { return wrapperContained.method_6460(fishx.wrapperContained); }
// public static boolean method_6460(yarnwrap.entity.passive.SchoolingFishEntity fishx, ) { return net.minecraft.entity.passive.SchoolingFishEntity.method_6460(fishx.wrapperContained); }
public yarnwrap.entity.passive.SchoolingFishEntity joinGroupOf(yarnwrap.entity.passive.SchoolingFishEntity groupLeader) { return new yarnwrap.entity.passive.SchoolingFishEntity(wrapperContained.joinGroupOf(groupLeader.wrapperContained)); }
// public static yarnwrap.entity.passive.SchoolingFishEntity joinGroupOf(yarnwrap.entity.passive.SchoolingFishEntity groupLeader, ) { return new yarnwrap.entity.passive.SchoolingFishEntity(net.minecraft.entity.passive.SchoolingFishEntity.joinGroupOf(groupLeader.wrapperContained)); }
// public void increaseGroupSize() { wrapperContained.increaseGroupSize(); }
// public static void increaseGroupSize() { net.minecraft.entity.passive.SchoolingFishEntity.increaseGroupSize(); }
public void moveTowardLeader() { wrapperContained.moveTowardLeader(); }
// public static void moveTowardLeader() { net.minecraft.entity.passive.SchoolingFishEntity.moveTowardLeader(); }
public boolean isCloseEnoughToLeader() { return wrapperContained.isCloseEnoughToLeader(); }
// public static boolean isCloseEnoughToLeader() { return net.minecraft.entity.passive.SchoolingFishEntity.isCloseEnoughToLeader(); }
public int getMaxGroupSize() { return wrapperContained.getMaxGroupSize(); }
// public static int getMaxGroupSize() { return net.minecraft.entity.passive.SchoolingFishEntity.getMaxGroupSize(); }
public void leaveGroup() { wrapperContained.leaveGroup(); }
// public static void leaveGroup() { net.minecraft.entity.passive.SchoolingFishEntity.leaveGroup(); }
public boolean hasOtherFishInGroup() { return wrapperContained.hasOtherFishInGroup(); }
// public static boolean hasOtherFishInGroup() { return net.minecraft.entity.passive.SchoolingFishEntity.hasOtherFishInGroup(); }
public void pullInOtherFish(java.util.stream.Stream fish) { wrapperContained.pullInOtherFish(fish); }
// public static void pullInOtherFish(java.util.stream.Stream fish, ) { net.minecraft.entity.passive.SchoolingFishEntity.pullInOtherFish(fish); }
public boolean canHaveMoreFishInGroup() { return wrapperContained.canHaveMoreFishInGroup(); }
// public static boolean canHaveMoreFishInGroup() { return net.minecraft.entity.passive.SchoolingFishEntity.canHaveMoreFishInGroup(); }
public boolean hasLeader() { return wrapperContained.hasLeader(); }
// public static boolean hasLeader() { return net.minecraft.entity.passive.SchoolingFishEntity.hasLeader(); }

}