package yarnwrap.command;
public class EntityDataObject { public net.minecraft.command.EntityDataObject wrapperContained; public EntityDataObject(net.minecraft.command.EntityDataObject wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_ENTITY_EXCEPTION() { return wrapperContained.INVALID_ENTITY_EXCEPTION; }
// public void INVALID_ENTITY_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_ENTITY_EXCEPTION = value; }
public java.util.function.Function TYPE_FACTORY() { return wrapperContained.TYPE_FACTORY; }
// public void TYPE_FACTORY(java.util.function.Function value) { wrapperContained.TYPE_FACTORY = value; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }

}