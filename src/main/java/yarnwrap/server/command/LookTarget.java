package yarnwrap.server.command;
public class LookTarget { public net.minecraft.server.command.LookTarget wrapperContained; public LookTarget(net.minecraft.server.command.LookTarget wrapperContained) { this.wrapperContained = wrapperContained; }

public void look(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity entity) { wrapperContained.look(source.wrapperContained,entity.wrapperContained); }
// public static void look(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity entity, ) { net.minecraft.server.command.LookTarget.look(source.wrapperContained,entity.wrapperContained); }

}