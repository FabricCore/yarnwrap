package yarnwrap.command;
public class SteppedCommandAction { public net.minecraft.command.SteppedCommandAction wrapperContained; public SteppedCommandAction(net.minecraft.command.SteppedCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object wrapper() { return wrapperContained.wrapper; }
// // public void wrapper(Object value) { wrapperContained.wrapper = value; }
// // public static Object wrapper() { return net.minecraft.command.SteppedCommandAction.wrapper; }
// // public static void wrapper(Object value, ) { net.minecraft.command.SteppedCommandAction.wrapper = value; }

// public java.util.List actions() { return wrapperContained.actions; }
// public void actions(java.util.List value) { wrapperContained.actions = value; }
// public static java.util.List actions() { return net.minecraft.command.SteppedCommandAction.actions; }
// public static void actions(java.util.List value, ) { net.minecraft.command.SteppedCommandAction.actions = value; }

// public yarnwrap.command.CommandQueueEntry selfCommandQueueEntry() { return new yarnwrap.command.CommandQueueEntry(wrapperContained.selfCommandQueueEntry); }
// public void selfCommandQueueEntry(yarnwrap.command.CommandQueueEntry value) { wrapperContained.selfCommandQueueEntry = value.wrapperContained; }
// public static yarnwrap.command.CommandQueueEntry selfCommandQueueEntry() { return new yarnwrap.command.CommandQueueEntry(net.minecraft.command.SteppedCommandAction.selfCommandQueueEntry); }
// public static void selfCommandQueueEntry(yarnwrap.command.CommandQueueEntry value, ) { net.minecraft.command.SteppedCommandAction.selfCommandQueueEntry = value.wrapperContained; }

// public int nextActionIndex() { return wrapperContained.nextActionIndex; }
// public void nextActionIndex(int value) { wrapperContained.nextActionIndex = value; }
// public static int nextActionIndex() { return net.minecraft.command.SteppedCommandAction.nextActionIndex; }
// public static void nextActionIndex(int value, ) { net.minecraft.command.SteppedCommandAction.nextActionIndex = value; }

// public SteppedCommandAction(Object wrapper,java.util.List actions,yarnwrap.command.Frame frame) { this.wrapperContained = new net.minecraft.command.SteppedCommandAction(wrapper,actions,frame.wrapperContained); }
// public void enqueueCommands(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame,java.util.List actions,Object wrapper) { wrapperContained.enqueueCommands(context.wrapperContained,frame.wrapperContained,actions,wrapper); }
// public static void enqueueCommands(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame,java.util.List actions,Object wrapper, ) { net.minecraft.command.SteppedCommandAction.enqueueCommands(context.wrapperContained,frame.wrapperContained,actions,wrapper); }

}