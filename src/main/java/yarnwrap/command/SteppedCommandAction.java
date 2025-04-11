package yarnwrap.command;
public class SteppedCommandAction { public net.minecraft.command.SteppedCommandAction wrapperContained; public SteppedCommandAction(net.minecraft.command.SteppedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object wrapper() { return wrapperContained.wrapper; }
// // public void wrapper(Object value) { wrapperContained.wrapper = value; }
// public java.util.List actions() { return wrapperContained.actions; }
// public void actions(java.util.List value) { wrapperContained.actions = value; }
// public yarnwrap.command.CommandQueueEntry selfCommandQueueEntry() { return new yarnwrap.command.CommandQueueEntry(wrapperContained.selfCommandQueueEntry); }
// public void selfCommandQueueEntry(yarnwrap.command.CommandQueueEntry value) { wrapperContained.selfCommandQueueEntry = value.wrapperContained; }
// public int nextActionIndex() { return wrapperContained.nextActionIndex; }
// public void nextActionIndex(int value) { wrapperContained.nextActionIndex = value; }
// public void enqueueCommands(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame,java.util.List actions,Object wrapper) { wrapperContained.enqueueCommands(context.wrapperContained,frame.wrapperContained,actions,wrapper); }

}