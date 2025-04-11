package yarnwrap.command;
public class ControlFlowAware { public net.minecraft.command.ControlFlowAware wrapperContained; public ControlFlowAware(net.minecraft.command.ControlFlowAware wrapperContained) { this.wrapperContained = wrapperContained; }

public void execute(java.lang.Object source,com.mojang.brigadier.context.ContextChain contextChain,yarnwrap.command.ExecutionFlags flags,yarnwrap.command.ExecutionControl control) { wrapperContained.execute(source,contextChain,flags.wrapperContained,control.wrapperContained); }

}