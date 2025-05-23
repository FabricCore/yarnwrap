package yarnwrap.entity.ai.goal;
public class FormCaravanGoal { public net.minecraft.entity.ai.goal.FormCaravanGoal wrapperContained; public FormCaravanGoal(net.minecraft.entity.ai.goal.FormCaravanGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.FormCaravanGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.FormCaravanGoal.speed = value; }

public yarnwrap.entity.passive.LlamaEntity llama() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.llama); }
// public void llama(yarnwrap.entity.passive.LlamaEntity value) { wrapperContained.llama = value.wrapperContained; }
// public static yarnwrap.entity.passive.LlamaEntity llama() { return new yarnwrap.entity.passive.LlamaEntity(net.minecraft.entity.ai.goal.FormCaravanGoal.llama); }
// public static void llama(yarnwrap.entity.passive.LlamaEntity value, ) { net.minecraft.entity.ai.goal.FormCaravanGoal.llama = value.wrapperContained; }

// public int counter() { return wrapperContained.counter; }
// public void counter(int value) { wrapperContained.counter = value; }
// public static int counter() { return net.minecraft.entity.ai.goal.FormCaravanGoal.counter; }
// public static void counter(int value, ) { net.minecraft.entity.ai.goal.FormCaravanGoal.counter = value; }

// public int MAX_CARAVAN_LENGTH() { return wrapperContained.MAX_CARAVAN_LENGTH; }
// public void MAX_CARAVAN_LENGTH(int value) { wrapperContained.MAX_CARAVAN_LENGTH = value; }
// public static int MAX_CARAVAN_LENGTH() { return net.minecraft.entity.ai.goal.FormCaravanGoal.MAX_CARAVAN_LENGTH; }
// public static void MAX_CARAVAN_LENGTH(int value, ) { net.minecraft.entity.ai.goal.FormCaravanGoal.MAX_CARAVAN_LENGTH = value; }

public FormCaravanGoal(yarnwrap.entity.passive.LlamaEntity llama,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.FormCaravanGoal(llama.wrapperContained,speed); }
// public boolean canFollow(yarnwrap.entity.passive.LlamaEntity llama,int length) { return wrapperContained.canFollow(llama.wrapperContained,length); }
// public static boolean canFollow(yarnwrap.entity.passive.LlamaEntity llama,int length, ) { return net.minecraft.entity.ai.goal.FormCaravanGoal.canFollow(llama.wrapperContained,length); }
// public boolean method_19616(yarnwrap.entity.Entity entity) { return wrapperContained.method_19616(entity.wrapperContained); }
// public static boolean method_19616(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.ai.goal.FormCaravanGoal.method_19616(entity.wrapperContained); }

}