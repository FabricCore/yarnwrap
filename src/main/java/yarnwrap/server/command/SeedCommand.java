package yarnwrap.server.command;
public class SeedCommand { public net.minecraft.server.command.SeedCommand wrapperContained; public SeedCommand(net.minecraft.server.command.SeedCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher,boolean dedicated) { wrapperContained.register(dispatcher,dedicated); }

}