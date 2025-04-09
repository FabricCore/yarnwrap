package yarnwrap.command;
public class EntityDataObject { public net.minecraft.command.EntityDataObject wrapperContained; public EntityDataObject(net.minecraft.command.EntityDataObject wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ENTITY_EXCEPTION() { return wrapperContained.INVALID_ENTITY_EXCEPTION; }
public java.util.function.Function TYPE_FACTORY() { return wrapperContained.TYPE_FACTORY; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }

}