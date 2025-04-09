package yarnwrap.command.argument;
public class EntityAnchorArgumentType { public net.minecraft.command.argument.EntityAnchorArgumentType wrapperContained; public EntityAnchorArgumentType(net.minecraft.command.argument.EntityAnchorArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ANCHOR_EXCEPTION() { return wrapperContained.INVALID_ANCHOR_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public Object getEntityAnchor(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getEntityAnchor(context,name); }
public yarnwrap.command.argument.EntityAnchorArgumentType entityAnchor() { return new yarnwrap.command.argument.EntityAnchorArgumentType(wrapperContained.entityAnchor()); }

}