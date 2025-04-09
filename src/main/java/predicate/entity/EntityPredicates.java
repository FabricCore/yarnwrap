package yarnwrap.predicate.entity;
public class EntityPredicates { public net.minecraft.predicate.entity.EntityPredicates wrapperContained; public EntityPredicates(net.minecraft.predicate.entity.EntityPredicates wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate CAN_COLLIDE() { return wrapperContained.CAN_COLLIDE; }
public java.util.function.Predicate VALID_INVENTORIES() { return wrapperContained.VALID_INVENTORIES; }
public java.util.function.Predicate NOT_MOUNTED() { return wrapperContained.NOT_MOUNTED; }
public java.util.function.Predicate VALID_ENTITY() { return wrapperContained.VALID_ENTITY; }
public java.util.function.Predicate EXCEPT_SPECTATOR() { return wrapperContained.EXCEPT_SPECTATOR; }
public java.util.function.Predicate EXCEPT_CREATIVE_OR_SPECTATOR() { return wrapperContained.EXCEPT_CREATIVE_OR_SPECTATOR; }
public java.util.function.Predicate VALID_LIVING_ENTITY() { return wrapperContained.VALID_LIVING_ENTITY; }
public java.util.function.Predicate maxDistance(double x,double y,double z,double max) { return wrapperContained.maxDistance(x,y,z,max); }
public java.util.function.Predicate canBePushedBy(yarnwrap.entity.Entity entity) { return wrapperContained.canBePushedBy(entity.wrapperContained); }
public java.util.function.Predicate rides(yarnwrap.entity.Entity entity) { return wrapperContained.rides(entity.wrapperContained); }

}