package yarnwrap.command;
public class EntityDataObject { public net.minecraft.command.EntityDataObject wrapperContained; public EntityDataObject(net.minecraft.command.EntityDataObject wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ENTITY_EXCEPTION() { return wrapperContained.INVALID_ENTITY_EXCEPTION; }
// public void INVALID_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_ENTITY_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ENTITY_EXCEPTION() { return net.minecraft.command.EntityDataObject.INVALID_ENTITY_EXCEPTION; }
// public static void INVALID_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.EntityDataObject.INVALID_ENTITY_EXCEPTION = value; }

// public java.util.function.Function TYPE_FACTORY() { return wrapperContained.TYPE_FACTORY; }
// public void TYPE_FACTORY(java.util.function.Function value) { wrapperContained.TYPE_FACTORY = value; }
public static java.util.function.Function TYPE_FACTORY() { return net.minecraft.command.EntityDataObject.TYPE_FACTORY; }
// public static void TYPE_FACTORY(java.util.function.Function value, ) { net.minecraft.command.EntityDataObject.TYPE_FACTORY = value; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.command.EntityDataObject.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.command.EntityDataObject.entity = value.wrapperContained; }

public EntityDataObject(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.command.EntityDataObject(entity.wrapperContained); }
// public Object method_13927(java.lang.String argumentName) { return wrapperContained.method_13927(argumentName); }
// public static Object method_13927(java.lang.String argumentName, ) { return net.minecraft.command.EntityDataObject.method_13927(argumentName); }

}