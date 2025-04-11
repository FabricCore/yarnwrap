package yarnwrap.entity.ai.goal;
public class FollowGroupLeaderGoal { public net.minecraft.entity.ai.goal.FollowGroupLeaderGoal wrapperContained; public FollowGroupLeaderGoal(net.minecraft.entity.ai.goal.FollowGroupLeaderGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_SEARCH_DELAY() { return wrapperContained.MIN_SEARCH_DELAY; }
// public void MIN_SEARCH_DELAY(int value) { wrapperContained.MIN_SEARCH_DELAY = value; }
// public int checkSurroundingDelay() { return wrapperContained.checkSurroundingDelay; }
// public void checkSurroundingDelay(int value) { wrapperContained.checkSurroundingDelay = value; }
// public int moveDelay() { return wrapperContained.moveDelay; }
// public void moveDelay(int value) { wrapperContained.moveDelay = value; }
// public yarnwrap.entity.passive.SchoolingFishEntity fish() { return new yarnwrap.entity.passive.SchoolingFishEntity(wrapperContained.fish); }
// public void fish(yarnwrap.entity.passive.SchoolingFishEntity value) { wrapperContained.fish = value.wrapperContained; }
public FollowGroupLeaderGoal(yarnwrap.entity.passive.SchoolingFishEntity fish) { this.wrapperContained = new net.minecraft.entity.ai.goal.FollowGroupLeaderGoal(fish.wrapperContained); }
// public boolean method_6260(yarnwrap.entity.passive.SchoolingFishEntity fish) { return wrapperContained.method_6260(fish.wrapperContained); }
// public int getSurroundingSearchDelay(yarnwrap.entity.passive.SchoolingFishEntity fish) { return wrapperContained.getSurroundingSearchDelay(fish.wrapperContained); }
// public boolean method_6262(yarnwrap.entity.passive.SchoolingFishEntity fish) { return wrapperContained.method_6262(fish.wrapperContained); }

}