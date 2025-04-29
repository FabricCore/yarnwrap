package yarnwrap.entity.ai.brain.task;
public class BreedTask { public net.minecraft.entity.ai.brain.task.BreedTask wrapperContained; public BreedTask(net.minecraft.entity.ai.brain.task.BreedTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityType targetType() { return new yarnwrap.entity.EntityType(wrapperContained.targetType); }
// public void targetType(yarnwrap.entity.EntityType value) { wrapperContained.targetType = value.wrapperContained; }
// public static yarnwrap.entity.EntityType targetType() { return new yarnwrap.entity.EntityType(net.minecraft.entity.ai.brain.task.BreedTask.targetType); }
// public static void targetType(yarnwrap.entity.EntityType value, ) { net.minecraft.entity.ai.brain.task.BreedTask.targetType = value.wrapperContained; }

// public long breedTime() { return wrapperContained.breedTime; }
// public void breedTime(long value) { wrapperContained.breedTime = value; }
// public static long breedTime() { return net.minecraft.entity.ai.brain.task.BreedTask.breedTime; }
// public static void breedTime(long value, ) { net.minecraft.entity.ai.brain.task.BreedTask.breedTime = value; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.ai.brain.task.BreedTask.speed; }
// public static void speed(float value, ) { net.minecraft.entity.ai.brain.task.BreedTask.speed = value; }

// public int MAX_RANGE() { return wrapperContained.MAX_RANGE; }
// public void MAX_RANGE(int value) { wrapperContained.MAX_RANGE = value; }
// public static int MAX_RANGE() { return net.minecraft.entity.ai.brain.task.BreedTask.MAX_RANGE; }
// public static void MAX_RANGE(int value, ) { net.minecraft.entity.ai.brain.task.BreedTask.MAX_RANGE = value; }

// public int MIN_BREED_TIME() { return wrapperContained.MIN_BREED_TIME; }
// public void MIN_BREED_TIME(int value) { wrapperContained.MIN_BREED_TIME = value; }
// public static int MIN_BREED_TIME() { return net.minecraft.entity.ai.brain.task.BreedTask.MIN_BREED_TIME; }
// public static void MIN_BREED_TIME(int value, ) { net.minecraft.entity.ai.brain.task.BreedTask.MIN_BREED_TIME = value; }

// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public static int RUN_TIME() { return net.minecraft.entity.ai.brain.task.BreedTask.RUN_TIME; }
// public static void RUN_TIME(int value, ) { net.minecraft.entity.ai.brain.task.BreedTask.RUN_TIME = value; }

// public int approachDistance() { return wrapperContained.approachDistance; }
// public void approachDistance(int value) { wrapperContained.approachDistance = value; }
// public static int approachDistance() { return net.minecraft.entity.ai.brain.task.BreedTask.approachDistance; }
// public static void approachDistance(int value, ) { net.minecraft.entity.ai.brain.task.BreedTask.approachDistance = value; }

// public int DEFAULT_APPROACH_DISTANCE() { return wrapperContained.DEFAULT_APPROACH_DISTANCE; }
// public void DEFAULT_APPROACH_DISTANCE(int value) { wrapperContained.DEFAULT_APPROACH_DISTANCE = value; }
// public static int DEFAULT_APPROACH_DISTANCE() { return net.minecraft.entity.ai.brain.task.BreedTask.DEFAULT_APPROACH_DISTANCE; }
// public static void DEFAULT_APPROACH_DISTANCE(int value, ) { net.minecraft.entity.ai.brain.task.BreedTask.DEFAULT_APPROACH_DISTANCE = value; }

public BreedTask(yarnwrap.entity.EntityType targetType) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.BreedTask(targetType.wrapperContained); }
public BreedTask(yarnwrap.entity.EntityType targetType,float speed,int approachDistance) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.BreedTask(targetType.wrapperContained,speed,approachDistance); }
// public yarnwrap.entity.passive.AnimalEntity getBreedTarget(yarnwrap.entity.passive.AnimalEntity animal) { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.getBreedTarget(animal.wrapperContained)); }
// public static yarnwrap.entity.passive.AnimalEntity getBreedTarget(yarnwrap.entity.passive.AnimalEntity animal, ) { return new yarnwrap.entity.passive.AnimalEntity(net.minecraft.entity.ai.brain.task.BreedTask.getBreedTarget(animal.wrapperContained)); }
// public boolean method_24545(yarnwrap.entity.passive.AnimalEntity entity) { return wrapperContained.method_24545(entity.wrapperContained); }
// public static boolean method_24545(yarnwrap.entity.passive.AnimalEntity entity, ) { return net.minecraft.entity.ai.brain.task.BreedTask.method_24545(entity.wrapperContained); }
// public boolean hasBreedTarget(yarnwrap.entity.passive.AnimalEntity animal) { return wrapperContained.hasBreedTarget(animal.wrapperContained); }
// public static boolean hasBreedTarget(yarnwrap.entity.passive.AnimalEntity animal, ) { return net.minecraft.entity.ai.brain.task.BreedTask.hasBreedTarget(animal.wrapperContained); }
// public java.util.Optional findBreedTarget(yarnwrap.entity.passive.AnimalEntity animal) { return wrapperContained.findBreedTarget(animal.wrapperContained); }
// public static java.util.Optional findBreedTarget(yarnwrap.entity.passive.AnimalEntity animal, ) { return net.minecraft.entity.ai.brain.task.BreedTask.findBreedTarget(animal.wrapperContained); }

}