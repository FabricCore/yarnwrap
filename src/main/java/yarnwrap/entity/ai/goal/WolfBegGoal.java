package yarnwrap.entity.ai.goal;
public class WolfBegGoal { public net.minecraft.entity.ai.goal.WolfBegGoal wrapperContained; public WolfBegGoal(net.minecraft.entity.ai.goal.WolfBegGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate validPlayerPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.validPlayerPredicate); }
// public void validPlayerPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.validPlayerPredicate = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate validPlayerPredicate() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.goal.WolfBegGoal.validPlayerPredicate); }
// public static void validPlayerPredicate(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.goal.WolfBegGoal.validPlayerPredicate = value.wrapperContained; }

// public float begDistance() { return wrapperContained.begDistance; }
// public void begDistance(float value) { wrapperContained.begDistance = value; }
// public static float begDistance() { return net.minecraft.entity.ai.goal.WolfBegGoal.begDistance; }
// public static void begDistance(float value, ) { net.minecraft.entity.ai.goal.WolfBegGoal.begDistance = value; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.entity.ai.goal.WolfBegGoal.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.entity.ai.goal.WolfBegGoal.world = value.wrapperContained; }

// public int timer() { return wrapperContained.timer; }
// public void timer(int value) { wrapperContained.timer = value; }
// public static int timer() { return net.minecraft.entity.ai.goal.WolfBegGoal.timer; }
// public static void timer(int value, ) { net.minecraft.entity.ai.goal.WolfBegGoal.timer = value; }

// public yarnwrap.entity.player.PlayerEntity begFrom() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.begFrom); }
// public void begFrom(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.begFrom = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity begFrom() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.ai.goal.WolfBegGoal.begFrom); }
// public static void begFrom(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.entity.ai.goal.WolfBegGoal.begFrom = value.wrapperContained; }

// public yarnwrap.entity.passive.WolfEntity wolf() { return new yarnwrap.entity.passive.WolfEntity(wrapperContained.wolf); }
// public void wolf(yarnwrap.entity.passive.WolfEntity value) { wrapperContained.wolf = value.wrapperContained; }
// public static yarnwrap.entity.passive.WolfEntity wolf() { return new yarnwrap.entity.passive.WolfEntity(net.minecraft.entity.ai.goal.WolfBegGoal.wolf); }
// public static void wolf(yarnwrap.entity.passive.WolfEntity value, ) { net.minecraft.entity.ai.goal.WolfBegGoal.wolf = value.wrapperContained; }

public WolfBegGoal(yarnwrap.entity.passive.WolfEntity wolf,float begDistance) { this.wrapperContained = new net.minecraft.entity.ai.goal.WolfBegGoal(wolf.wrapperContained,begDistance); }
// public boolean isAttractive(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isAttractive(player.wrapperContained); }
// public static boolean isAttractive(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.ai.goal.WolfBegGoal.isAttractive(player.wrapperContained); }

}