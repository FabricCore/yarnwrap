package yarnwrap.command;
public class ExecutionControl { public net.minecraft.command.ExecutionControl wrapperContained; public ExecutionControl(net.minecraft.command.ExecutionControl wrapperContained) { this.wrapperContained = wrapperContained; }

public void enqueueAction(yarnwrap.command.CommandAction action) { wrapperContained.enqueueAction(action.wrapperContained); }
public void setTracer(yarnwrap.server.function.Tracer tracer) { wrapperContained.setTracer(tracer.wrapperContained); }
public yarnwrap.server.function.Tracer getTracer() { return new yarnwrap.server.function.Tracer(wrapperContained.getTracer()); }
// public yarnwrap.command.ExecutionControl of(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.Frame frame) { return new yarnwrap.command.ExecutionControl(wrapperContained.of(context.wrapperContained,frame.wrapperContained)); }
public yarnwrap.command.Frame getFrame() { return new yarnwrap.command.Frame(wrapperContained.getFrame()); }

}