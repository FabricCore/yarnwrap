package yarnwrap.entity.ai.goal;
public class AnimalMateGoal { public net.minecraft.entity.ai.goal.AnimalMateGoal wrapperContained; public AnimalMateGoal(net.minecraft.entity.ai.goal.AnimalMateGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int timer() { return wrapperContained.timer; }
// public void timer(int value) { wrapperContained.timer = value; }
// public static int timer() { return net.minecraft.entity.ai.goal.AnimalMateGoal.timer; }
// public static void timer(int value, ) { net.minecraft.entity.ai.goal.AnimalMateGoal.timer = value; }

// public java.lang.Class entityClass() { return wrapperContained.entityClass; }
// public void entityClass(java.lang.Class value) { wrapperContained.entityClass = value; }
// public static java.lang.Class entityClass() { return net.minecraft.entity.ai.goal.AnimalMateGoal.entityClass; }
// public static void entityClass(java.lang.Class value, ) { net.minecraft.entity.ai.goal.AnimalMateGoal.entityClass = value; }

// public yarnwrap.entity.passive.AnimalEntity animal() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.animal); }
// public void animal(yarnwrap.entity.passive.AnimalEntity value) { wrapperContained.animal = value.wrapperContained; }
// public static yarnwrap.entity.passive.AnimalEntity animal() { return new yarnwrap.entity.passive.AnimalEntity(net.minecraft.entity.ai.goal.AnimalMateGoal.animal); }
// public static void animal(yarnwrap.entity.passive.AnimalEntity value, ) { net.minecraft.entity.ai.goal.AnimalMateGoal.animal = value.wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.entity.ai.goal.AnimalMateGoal.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.entity.ai.goal.AnimalMateGoal.world = value.wrapperContained; }

// public yarnwrap.entity.passive.AnimalEntity mate() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.mate); }
// public void mate(yarnwrap.entity.passive.AnimalEntity value) { wrapperContained.mate = value.wrapperContained; }
// public static yarnwrap.entity.passive.AnimalEntity mate() { return new yarnwrap.entity.passive.AnimalEntity(net.minecraft.entity.ai.goal.AnimalMateGoal.mate); }
// public static void mate(yarnwrap.entity.passive.AnimalEntity value, ) { net.minecraft.entity.ai.goal.AnimalMateGoal.mate = value.wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.AnimalMateGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.AnimalMateGoal.speed = value; }

// public yarnwrap.entity.ai.TargetPredicate VALID_MATE_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.VALID_MATE_PREDICATE); }
// public void VALID_MATE_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.VALID_MATE_PREDICATE = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate VALID_MATE_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.goal.AnimalMateGoal.VALID_MATE_PREDICATE); }
// public static void VALID_MATE_PREDICATE(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.goal.AnimalMateGoal.VALID_MATE_PREDICATE = value.wrapperContained; }

public AnimalMateGoal(yarnwrap.entity.passive.AnimalEntity animal,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.AnimalMateGoal(animal.wrapperContained,speed); }
public AnimalMateGoal(yarnwrap.entity.passive.AnimalEntity animal,double speed,java.lang.Class entityClass) { this.wrapperContained = new net.minecraft.entity.ai.goal.AnimalMateGoal(animal.wrapperContained,speed,entityClass); }
// public void breed() { wrapperContained.breed(); }
// public static void breed() { net.minecraft.entity.ai.goal.AnimalMateGoal.breed(); }
// public yarnwrap.entity.passive.AnimalEntity findMate() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.findMate()); }
// public static yarnwrap.entity.passive.AnimalEntity findMate() { return new yarnwrap.entity.passive.AnimalEntity(net.minecraft.entity.ai.goal.AnimalMateGoal.findMate()); }

}