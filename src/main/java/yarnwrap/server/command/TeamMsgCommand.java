package yarnwrap.server.command;
public class TeamMsgCommand { public net.minecraft.server.command.TeamMsgCommand wrapperContained; public TeamMsgCommand(net.minecraft.server.command.TeamMsgCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_TEAM_EXCEPTION() { return wrapperContained.NO_TEAM_EXCEPTION; }
// public void NO_TEAM_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NO_TEAM_EXCEPTION = value; }
// public yarnwrap.text.Style STYLE() { return new yarnwrap.text.Style(wrapperContained.STYLE); }
// public void STYLE(yarnwrap.text.Style value) { wrapperContained.STYLE = value.wrapperContained; }
// public void execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.Entity entity,yarnwrap.scoreboard.Team team,java.util.List recipients,yarnwrap.network.message.SignedMessage message) { wrapperContained.execute(source.wrapperContained,entity.wrapperContained,team.wrapperContained,recipients,message.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_17601(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_17601(context); }
// public boolean method_45154(yarnwrap.entity.Entity player) { return wrapperContained.method_45154(player.wrapperContained); }
// public void method_45155(yarnwrap.server.command.ServerCommandSource message) { wrapperContained.method_45155(message.wrapperContained); }

}