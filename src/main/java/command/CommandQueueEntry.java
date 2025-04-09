package yarnwrap.command;
public class CommandQueueEntry { public net.minecraft.command.CommandQueueEntry wrapperContained; public CommandQueueEntry(net.minecraft.command.CommandQueueEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public void execute(yarnwrap.command.CommandExecutionContext context) { wrapperContained.execute(context.wrapperContained); }

}