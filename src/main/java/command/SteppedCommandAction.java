package yarnwrap.command;
public class SteppedCommandAction { public net.minecraft.command.SteppedCommandAction wrapperContained; public SteppedCommandAction(net.minecraft.command.SteppedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object wrapper() { return wrapperContained.wrapper; }
// public java.util.List actions() { return wrapperContained.actions; }
// public yarnwrap.command.CommandQueueEntry selfCommandQueueEntry() { return new yarnwrap.command.CommandQueueEntry(wrapperContained.selfCommandQueueEntry); }
// public int nextActionIndex() { return wrapperContained.nextActionIndex; }
// public void enqueueCommands(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame,java.util.List actions,Object wrapper) { wrapperContained.enqueueCommands(context.wrapperContained,frame.wrapperContained,actions,wrapper); }

}