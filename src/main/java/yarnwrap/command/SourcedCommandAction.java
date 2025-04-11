package yarnwrap.command;
public class SourcedCommandAction { public net.minecraft.command.SourcedCommandAction wrapperContained; public SourcedCommandAction(net.minecraft.command.SourcedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.CommandAction bind(java.lang.Object source) { return new yarnwrap.command.CommandAction(wrapperContained.bind(source)); }
public void execute(java.lang.Object source,yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame) { wrapperContained.execute(source,context.wrapperContained,frame.wrapperContained); }
// public void method_54405(java.lang.Object context,yarnwrap.command.CommandExecutionContext frame) { wrapperContained.method_54405(context,frame.wrapperContained); }

}