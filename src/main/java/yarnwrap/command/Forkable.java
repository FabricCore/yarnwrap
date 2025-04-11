package yarnwrap.command;
public class Forkable { public net.minecraft.command.Forkable wrapperContained; public Forkable(net.minecraft.command.Forkable wrapperContained) { this.wrapperContained = wrapperContained; }

public void execute(java.lang.Object baseSource,java.util.List sources,com.mojang.brigadier.context.ContextChain contextChain,yarnwrap.command.ExecutionFlags flags,yarnwrap.command.ExecutionControl control) { wrapperContained.execute(baseSource,sources,contextChain,flags.wrapperContained,control.wrapperContained); }

}