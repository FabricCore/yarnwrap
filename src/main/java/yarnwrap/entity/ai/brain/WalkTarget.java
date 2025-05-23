package yarnwrap.entity.ai.brain;
public class WalkTarget { public net.minecraft.entity.ai.brain.WalkTarget wrapperContained; public WalkTarget(net.minecraft.entity.ai.brain.WalkTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.LookTarget lookTarget() { return new yarnwrap.entity.ai.brain.LookTarget(wrapperContained.lookTarget); }
// public void lookTarget(yarnwrap.entity.ai.brain.LookTarget value) { wrapperContained.lookTarget = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.LookTarget lookTarget() { return new yarnwrap.entity.ai.brain.LookTarget(net.minecraft.entity.ai.brain.WalkTarget.lookTarget); }
// public static void lookTarget(yarnwrap.entity.ai.brain.LookTarget value, ) { net.minecraft.entity.ai.brain.WalkTarget.lookTarget = value.wrapperContained; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.ai.brain.WalkTarget.speed; }
// public static void speed(float value, ) { net.minecraft.entity.ai.brain.WalkTarget.speed = value; }

// public int completionRange() { return wrapperContained.completionRange; }
// public void completionRange(int value) { wrapperContained.completionRange = value; }
// public static int completionRange() { return net.minecraft.entity.ai.brain.WalkTarget.completionRange; }
// public static void completionRange(int value, ) { net.minecraft.entity.ai.brain.WalkTarget.completionRange = value; }

public WalkTarget(yarnwrap.util.math.Vec3d pos,float speed,int completionRange) { this.wrapperContained = new net.minecraft.entity.ai.brain.WalkTarget(pos.wrapperContained,speed,completionRange); }
public WalkTarget(yarnwrap.entity.Entity entity,float speed,int completionRange) { this.wrapperContained = new net.minecraft.entity.ai.brain.WalkTarget(entity.wrapperContained,speed,completionRange); }
public WalkTarget(yarnwrap.util.math.BlockPos pos,float speed,int completionRange) { this.wrapperContained = new net.minecraft.entity.ai.brain.WalkTarget(pos.wrapperContained,speed,completionRange); }
public WalkTarget(yarnwrap.entity.ai.brain.LookTarget lookTarget,float speed,int completionRange) { this.wrapperContained = new net.minecraft.entity.ai.brain.WalkTarget(lookTarget.wrapperContained,speed,completionRange); }
public yarnwrap.entity.ai.brain.LookTarget getLookTarget() { return new yarnwrap.entity.ai.brain.LookTarget(wrapperContained.getLookTarget()); }
// public static yarnwrap.entity.ai.brain.LookTarget getLookTarget() { return new yarnwrap.entity.ai.brain.LookTarget(net.minecraft.entity.ai.brain.WalkTarget.getLookTarget()); }
public float getSpeed() { return wrapperContained.getSpeed(); }
// public static float getSpeed() { return net.minecraft.entity.ai.brain.WalkTarget.getSpeed(); }
public int getCompletionRange() { return wrapperContained.getCompletionRange(); }
// public static int getCompletionRange() { return net.minecraft.entity.ai.brain.WalkTarget.getCompletionRange(); }

}