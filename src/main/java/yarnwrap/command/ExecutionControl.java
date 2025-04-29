package yarnwrap.command;
public class ExecutionControl { public net.minecraft.command.ExecutionControl wrapperContained; public ExecutionControl(net.minecraft.command.ExecutionControl wrapperContained) { this.wrapperContained = wrapperContained; }

public void enqueueAction(yarnwrap.command.CommandAction action) { wrapperContained.enqueueAction(action.wrapperContained); }
// public static void enqueueAction(yarnwrap.command.CommandAction action, ) { net.minecraft.command.ExecutionControl.enqueueAction(action.wrapperContained); }
public void setTracer(yarnwrap.server.function.Tracer tracer) { wrapperContained.setTracer(tracer.wrapperContained); }
// public static void setTracer(yarnwrap.server.function.Tracer tracer, ) { net.minecraft.command.ExecutionControl.setTracer(tracer.wrapperContained); }
public yarnwrap.server.function.Tracer getTracer() { return new yarnwrap.server.function.Tracer(wrapperContained.getTracer()); }
// public static yarnwrap.server.function.Tracer getTracer() { return new yarnwrap.server.function.Tracer(net.minecraft.command.ExecutionControl.getTracer()); }
// public yarnwrap.command.ExecutionControl of(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame) { return new yarnwrap.command.ExecutionControl(wrapperContained.of(context.wrapperContained,frame.wrapperContained)); }
// public static yarnwrap.command.ExecutionControl of(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame, ) { return new yarnwrap.command.ExecutionControl(net.minecraft.command.ExecutionControl.of(context.wrapperContained,frame.wrapperContained)); }
public yarnwrap.command.Frame getFrame() { return new yarnwrap.command.Frame(wrapperContained.getFrame()); }
// public static yarnwrap.command.Frame getFrame() { return new yarnwrap.command.Frame(net.minecraft.command.ExecutionControl.getFrame()); }

}