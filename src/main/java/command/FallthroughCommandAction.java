package yarnwrap.command;
public class FallthroughCommandAction { public net.minecraft.command.FallthroughCommandAction wrapperContained; public FallthroughCommandAction(net.minecraft.command.FallthroughCommandAction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.command.FallthroughCommandAction INSTANCE() { return new yarnwrap.command.FallthroughCommandAction(wrapperContained.INSTANCE); }
public yarnwrap.command.CommandAction getInstance() { return new yarnwrap.command.CommandAction(wrapperContained.getInstance()); }

}