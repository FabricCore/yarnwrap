package yarnwrap.command;
public class CommandAction { public net.minecraft.command.CommandAction wrapperContained; public CommandAction(net.minecraft.command.CommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

public void execute(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame) { wrapperContained.execute(context.wrapperContained,frame.wrapperContained); }
// public static void execute(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame, ) { net.minecraft.command.CommandAction.execute(context.wrapperContained,frame.wrapperContained); }

}