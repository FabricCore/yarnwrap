package yarnwrap.entity.ai.goal;
public class FollowGroupLeaderGoal { public net.minecraft.entity.ai.goal.FollowGroupLeaderGoal wrapperContained; public FollowGroupLeaderGoal(net.minecraft.entity.ai.goal.FollowGroupLeaderGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_SEARCH_DELAY() { return wrapperContained.MIN_SEARCH_DELAY; }
// public void MIN_SEARCH_DELAY(int value) { wrapperContained.MIN_SEARCH_DELAY = value; }
// public static int MIN_SEARCH_DELAY() { return net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.MIN_SEARCH_DELAY; }
// public static void MIN_SEARCH_DELAY(int value, ) { net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.MIN_SEARCH_DELAY = value; }

// public int checkSurroundingDelay() { return wrapperContained.checkSurroundingDelay; }
// public void checkSurroundingDelay(int value) { wrapperContained.checkSurroundingDelay = value; }
// public static int checkSurroundingDelay() { return net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.checkSurroundingDelay; }
// public static void checkSurroundingDelay(int value, ) { net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.checkSurroundingDelay = value; }

// public int moveDelay() { return wrapperContained.moveDelay; }
// public void moveDelay(int value) { wrapperContained.moveDelay = value; }
// public static int moveDelay() { return net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.moveDelay; }
// public static void moveDelay(int value, ) { net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.moveDelay = value; }

// public yarnwrap.entity.passive.SchoolingFishEntity fish() { return new yarnwrap.entity.passive.SchoolingFishEntity(wrapperContained.fish); }
// public void fish(yarnwrap.entity.passive.SchoolingFishEntity value) { wrapperContained.fish = value.wrapperContained; }
// public static yarnwrap.entity.passive.SchoolingFishEntity fish() { return new yarnwrap.entity.passive.SchoolingFishEntity(net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.fish); }
// public static void fish(yarnwrap.entity.passive.SchoolingFishEntity value, ) { net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.fish = value.wrapperContained; }

public FollowGroupLeaderGoal(yarnwrap.entity.passive.SchoolingFishEntity fish) { this.wrapperContained = new net.minecraft.entity.ai.goal.FollowGroupLeaderGoal(fish.wrapperContained); }
// public boolean method_6260(yarnwrap.entity.passive.SchoolingFishEntity fish) { return wrapperContained.method_6260(fish.wrapperContained); }
// public static boolean method_6260(yarnwrap.entity.passive.SchoolingFishEntity fish, ) { return net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.method_6260(fish.wrapperContained); }
// public int getSurroundingSearchDelay(yarnwrap.entity.passive.SchoolingFishEntity fish) { return wrapperContained.getSurroundingSearchDelay(fish.wrapperContained); }
// public static int getSurroundingSearchDelay(yarnwrap.entity.passive.SchoolingFishEntity fish, ) { return net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.getSurroundingSearchDelay(fish.wrapperContained); }
// public boolean method_6262(yarnwrap.entity.passive.SchoolingFishEntity fish) { return wrapperContained.method_6262(fish.wrapperContained); }
// public static boolean method_6262(yarnwrap.entity.passive.SchoolingFishEntity fish, ) { return net.minecraft.entity.ai.goal.FollowGroupLeaderGoal.method_6262(fish.wrapperContained); }

}