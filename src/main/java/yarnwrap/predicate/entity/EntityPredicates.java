package yarnwrap.predicate.entity;
public class EntityPredicates { public net.minecraft.predicate.entity.EntityPredicates wrapperContained; public EntityPredicates(net.minecraft.predicate.entity.EntityPredicates wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate CAN_COLLIDE() { return wrapperContained.CAN_COLLIDE; }
// public void CAN_COLLIDE(java.util.function.Predicate value) { wrapperContained.CAN_COLLIDE = value; }
public java.util.function.Predicate VALID_INVENTORIES() { return wrapperContained.VALID_INVENTORIES; }
// public void VALID_INVENTORIES(java.util.function.Predicate value) { wrapperContained.VALID_INVENTORIES = value; }
public java.util.function.Predicate NOT_MOUNTED() { return wrapperContained.NOT_MOUNTED; }
// public void NOT_MOUNTED(java.util.function.Predicate value) { wrapperContained.NOT_MOUNTED = value; }
public java.util.function.Predicate VALID_ENTITY() { return wrapperContained.VALID_ENTITY; }
// public void VALID_ENTITY(java.util.function.Predicate value) { wrapperContained.VALID_ENTITY = value; }
public java.util.function.Predicate EXCEPT_SPECTATOR() { return wrapperContained.EXCEPT_SPECTATOR; }
// public void EXCEPT_SPECTATOR(java.util.function.Predicate value) { wrapperContained.EXCEPT_SPECTATOR = value; }
public java.util.function.Predicate EXCEPT_CREATIVE_OR_SPECTATOR() { return wrapperContained.EXCEPT_CREATIVE_OR_SPECTATOR; }
// public void EXCEPT_CREATIVE_OR_SPECTATOR(java.util.function.Predicate value) { wrapperContained.EXCEPT_CREATIVE_OR_SPECTATOR = value; }
public java.util.function.Predicate VALID_LIVING_ENTITY() { return wrapperContained.VALID_LIVING_ENTITY; }
// public void VALID_LIVING_ENTITY(java.util.function.Predicate value) { wrapperContained.VALID_LIVING_ENTITY = value; }
// public boolean method_24517(yarnwrap.entity.Entity entity) { return wrapperContained.method_24517(entity.wrapperContained); }
// public boolean method_32878(yarnwrap.entity.Entity entity) { return wrapperContained.method_32878(entity.wrapperContained); }
// public boolean method_5906(yarnwrap.entity.Entity testedEntity) { return wrapperContained.method_5906(testedEntity.wrapperContained); }
// public boolean method_5908(yarnwrap.entity.Entity entity) { return wrapperContained.method_5908(entity.wrapperContained); }
public java.util.function.Predicate maxDistance(double x,double y,double z,double max) { return wrapperContained.maxDistance(x,y,z,max); }
// public boolean method_5910(yarnwrap.entity.Entity entity) { return wrapperContained.method_5910(entity.wrapperContained); }
public java.util.function.Predicate canBePushedBy(yarnwrap.entity.Entity entity) { return wrapperContained.canBePushedBy(entity.wrapperContained); }
// public boolean method_5912(double entity) { return wrapperContained.method_5912(entity); }
public java.util.function.Predicate rides(yarnwrap.entity.Entity entity) { return wrapperContained.rides(entity.wrapperContained); }
// public boolean method_5914(yarnwrap.entity.Entity entity) { return wrapperContained.method_5914(entity.wrapperContained); }
// public boolean method_5915(yarnwrap.entity.Entity entityx) { return wrapperContained.method_5915(entityx.wrapperContained); }

}