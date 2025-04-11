package yarnwrap.server.command;
public class SayCommand { public net.minecraft.server.command.SayCommand wrapperContained; public SayCommand(net.minecraft.server.command.SayCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13563(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13563(context); }
// public boolean method_13564(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13564(source.wrapperContained); }
// public void method_43657(com.mojang.brigadier.context.CommandContext message) { wrapperContained.method_43657(message); }

}