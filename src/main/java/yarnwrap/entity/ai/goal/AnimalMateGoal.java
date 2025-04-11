package yarnwrap.entity.ai.goal;
public class AnimalMateGoal { public net.minecraft.entity.ai.goal.AnimalMateGoal wrapperContained; public AnimalMateGoal(net.minecraft.entity.ai.goal.AnimalMateGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate VALID_MATE_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.VALID_MATE_PREDICATE); }
// public void VALID_MATE_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.VALID_MATE_PREDICATE = value.wrapperContained; }
// public int timer() { return wrapperContained.timer; }
// public void timer(int value) { wrapperContained.timer = value; }
// public java.lang.Class entityClass() { return wrapperContained.entityClass; }
// public void entityClass(java.lang.Class value) { wrapperContained.entityClass = value; }
// public yarnwrap.entity.passive.AnimalEntity animal() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.animal); }
// public void animal(yarnwrap.entity.passive.AnimalEntity value) { wrapperContained.animal = value.wrapperContained; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.entity.passive.AnimalEntity mate() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.mate); }
// public void mate(yarnwrap.entity.passive.AnimalEntity value) { wrapperContained.mate = value.wrapperContained; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
public AnimalMateGoal(yarnwrap.entity.passive.AnimalEntity animal,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.AnimalMateGoal(animal.wrapperContained,speed); }
public AnimalMateGoal(yarnwrap.entity.passive.AnimalEntity animal,double speed,java.lang.Class entityClass) { this.wrapperContained = new net.minecraft.entity.ai.goal.AnimalMateGoal(animal.wrapperContained,speed,entityClass); }
// public void breed() { wrapperContained.breed(); }
// public yarnwrap.entity.passive.AnimalEntity findMate() { return new yarnwrap.entity.passive.AnimalEntity(wrapperContained.findMate()); }

}