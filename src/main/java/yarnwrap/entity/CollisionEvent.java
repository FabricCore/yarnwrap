package yarnwrap.entity;
public class CollisionEvent { public net.minecraft.entity.CollisionEvent wrapperContained; public CollisionEvent(net.minecraft.entity.CollisionEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer action() { return wrapperContained.action; }
// public void action(java.util.function.Consumer value) { wrapperContained.action = value; }
// public static java.util.function.Consumer action() { return net.minecraft.entity.CollisionEvent.action; }
// public static void action(java.util.function.Consumer value, ) { net.minecraft.entity.CollisionEvent.action = value; }

// // public CollisionEvent(java.lang.String action) { this.wrapperContained = new net.minecraft.entity.CollisionEvent(action); }
public java.util.function.Consumer getAction() { return wrapperContained.getAction(); }
// public static java.util.function.Consumer getAction() { return net.minecraft.entity.CollisionEvent.getAction(); }
// public void method_67647(yarnwrap.entity.Entity entity) { wrapperContained.method_67647(entity.wrapperContained); }
// public static void method_67647(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.CollisionEvent.method_67647(entity.wrapperContained); }

}