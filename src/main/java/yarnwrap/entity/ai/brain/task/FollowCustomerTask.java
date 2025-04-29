package yarnwrap.entity.ai.brain.task;
public class FollowCustomerTask { public net.minecraft.entity.ai.brain.task.FollowCustomerTask wrapperContained; public FollowCustomerTask(net.minecraft.entity.ai.brain.task.FollowCustomerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.ai.brain.task.FollowCustomerTask.speed; }
// public static void speed(float value, ) { net.minecraft.entity.ai.brain.task.FollowCustomerTask.speed = value; }

public FollowCustomerTask(float speed) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.FollowCustomerTask(speed); }
// public void update(yarnwrap.entity.passive.VillagerEntity villager) { wrapperContained.update(villager.wrapperContained); }
// public static void update(yarnwrap.entity.passive.VillagerEntity villager, ) { net.minecraft.entity.ai.brain.task.FollowCustomerTask.update(villager.wrapperContained); }

}